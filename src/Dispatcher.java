import models.Agent;
import models.Client;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dispatcher {
    private Queue<Agent> agents;
    private Queue<Client> clients;

    public Dispatcher() {
        this.agents = new PriorityQueue<>(new AgentComparator());
        this.clients = new LinkedList<>();
    }

    public void addClient(Client client){
        clients.add(client);
        attend(client.getBankOperation());
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }

    public void attend(int bankOperation){
        Iterator itr = agents.iterator();
        while (itr.hasNext()){
            System.out.println((Agent)itr.next());
        }
    }
}
