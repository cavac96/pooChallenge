import models.Agent;
import models.Client;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dispatcher {
    private final static Logger LOGGER = Logger.getLogger("bank.dispatcher");
    private Queue<Agent> agents;
    private Queue<Client> clients;
    private static Dispatcher dispatcher;

    private Dispatcher() {
        this.agents = new PriorityQueue<>(new AgentComparator());
        this.clients = new LinkedList<>();
    }

    public static Dispatcher getDispatcherInstance(){
        if(dispatcher == null){
            dispatcher = new Dispatcher();
        }
        return dispatcher;
    }

    public void addClient(Client client){
        clients.add(client);
        try {
            attend(client);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }

    public void attend(Client client) throws InterruptedException {
        Agent agent = agents.poll();
        String message = "Agent: "+agent.getName()+" BUSSY";
        writeOnLog(message);
        agent.attend(client);
        agents.add(agent);
        message = "Agent: "+agent.getName()+" FREE";
        writeOnLog(message);
    }

    public void writeOnLog(String message){
        LOGGER.log(Level.INFO, "\n"+message);
    }
}
