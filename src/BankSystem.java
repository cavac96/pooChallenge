import builders.ClientBuilder;
import models.*;
import utils.Utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BankSystem {
    private final static Logger LOGGER = Logger.getLogger("bank.system");
    private static Dispatcher dispatcher = Dispatcher.getDispatcherInstance();
    private static AgentFactory agentFactory = new AgentFactory();

    public static void main(String[] args) {
        generateRandomAgents();
        generateRandomClients();
    }

    public static void generateRandomAgents(){
        Agent agent = null;
        for (int i = 0; i < Utils.generateRandomInt(1, 5); i++){
            int agentType = Utils.generateRandomInt(1, 3);
            if( agentType == 1){
                agent = agentFactory.getAgent("cashier")
                        .addName("Cashier"+i).addCc(i).build();
            }else if(agentType == 2) {
                agent = agentFactory.getAgent("supervisor")
                        .addName("Supervisor"+i).addCc(i).build();
            }else if(agentType == 3){
                agent = agentFactory.getAgent("director")
                        .addName("Director"+i).addCc(i).build();
            }
            writeOnLog(agent.getName());
            dispatcher.addAgent(agent);
        }
    }

    public static void generateRandomClients(){
        Client client;
        int nClients = Utils.generateRandomInt(1, 10);
        writeOnLog("Number of clients: "+nClients);
        for(int i = 0; i < nClients; i++){
            client = new ClientBuilder().addName("Camila"+i).addCc(i).build();
            dispatcher.addClient(client);
        }
    }

    public static void hardCodeExampleData(){
        Agent a = agentFactory.getAgent("director")
                .addName("d1").addCc(1.0).build();
        dispatcher.addAgent(a);
        a = agentFactory.getAgent("cashier")
                .addName("c2").addCc(2.0).build();
        dispatcher.addAgent(a);
        a = agentFactory.getAgent("cashier")
                .addName("c1").addCc(3.0).build();
        dispatcher.addAgent(a);
        a = agentFactory.getAgent("supervisor")
                .addName("s1").addCc(3.0).build();
        dispatcher.addAgent(a);

        Client c = new ClientBuilder().addName("Camila").addCc(1.0).build();
        dispatcher.addClient(c);
        c = new ClientBuilder().addName("Camila2").addCc(1.0).build();
        dispatcher.addClient(c);
        c = new ClientBuilder().addName("Camila3").addCc(1.0).build();
        dispatcher.addClient(c);
        c = new ClientBuilder().addName("Camila3").addCc(1.0).build();
        dispatcher.addClient(c);
        c = new ClientBuilder().addName("Camila4").addCc(1.0).build();
        dispatcher.addClient(c);
        c = new ClientBuilder().addName("Camila5").addCc(1.0).build();
        dispatcher.addClient(c);
    }

    public static void writeOnLog(String message){
        LOGGER.log(Level.INFO, "\n"+message);
    }
}
