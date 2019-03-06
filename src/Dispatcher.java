import models.Agent;
import models.Client;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dispatcher {
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
        attend(client);
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }

    public void attend(Client client) {
        agents.poll().attend(client);

//        while (!agents.isEmpty()) {
//            System.out.println(agents.poll().getName());
//        }
    }
}
