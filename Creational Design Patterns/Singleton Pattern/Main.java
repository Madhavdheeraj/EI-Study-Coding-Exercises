// Main.java (Testing)
public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        connection1.connect();

        // Verify that both connections are the same instance
        System.out.println(connection1 == connection2); // Output: true

        connection1.disconnect();
    }
}
