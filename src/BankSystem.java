import models.Agent;
import models.Client;
import models.Director;

public class BankSystem {

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();


        Agent a = new Director("d1", 1.0);
        dispatcher.addAgent(a);
        a = new Director("d2", 2.0);
        dispatcher.addAgent(a);
        a = new Director("d3", 3.0);
        dispatcher.addAgent(a);
        a = new Director("d4", 4.0);
        dispatcher.addAgent(a);
        a = new Director("d5", 5.0);
        dispatcher.addAgent(a);

        Client client1 = new Client("Camila", 1.0);
        dispatcher.addClient(client1);




        //R1.start();

        //Client R2 = new Client("Thread-2", 2.0);
        //R2.start();
    }
}
