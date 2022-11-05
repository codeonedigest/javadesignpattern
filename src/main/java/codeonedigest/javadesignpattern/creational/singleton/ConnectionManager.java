package codeonedigest.javadesignpattern.creational.singleton;

public class ConnectionManager {

    private static ConnectionManager connectionManager; // using private to restrict direct access


    // Keeping constructor private so that instance can't be created from outside
    private ConnectionManager() {

    }

    // Only method to provide instance of ConnectionManager and it will always return same instance.
    public static ConnectionManager getSingletonConnectionManager() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }

        return connectionManager;
    }
}
