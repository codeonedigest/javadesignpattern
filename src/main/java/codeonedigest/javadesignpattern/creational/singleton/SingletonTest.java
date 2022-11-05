package codeonedigest.javadesignpattern.creational.singleton;

public class SingletonTest {

    public static void main(String args[]) {

        ConnectionManager connectionManager1 = ConnectionManager.getSingletonConnectionManager();

        System.out.println("ConnectionManager1 - " + connectionManager1.hashCode());

        ConnectionManager connectionManager2 = ConnectionManager.getSingletonConnectionManager();

        System.out.println("ConnectionManager2 - " + connectionManager2.hashCode());
    }
}
