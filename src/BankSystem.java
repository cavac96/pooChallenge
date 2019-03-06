import models.*;

public class BankSystem {

    public static void main(String[] args) {
        Dispatcher dispatcher = Dispatcher.getDispatcherInstance();


        Agent a = new Director("d1", 1.0);
        dispatcher.addAgent(a);
        a = new Director("d2", 2.0);
        dispatcher.addAgent(a);
        a = new Cashier("c1", 3.0);
        dispatcher.addAgent(a);
        a = new Supervisor("s4", 4.0);
        dispatcher.addAgent(a);
        a = new Supervisor("s5", 5.0);
        dispatcher.addAgent(a);

        Client client1 = new Client("Camila", 1.0);
        dispatcher.addClient(client1);

        client1 = new Client("Camila2", 1.0);
        dispatcher.addClient(client1);

        client1 = new Client("Camila3", 1.0);
        dispatcher.addClient(client1);

        client1 = new Client("Camila4", 1.0);
        dispatcher.addClient(client1);

        client1 = new Client("Camila5", 1.0);
        dispatcher.addClient(client1);


        //R1.start();

        //Client R2 = new Client("Thread-2", 2.0);
        //R2.start();
    }
}
