public class Q1 {
    private static Q1 instance;

    private Q1() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static Q1 getInstance() {
        if (instance == null) {
            instance = new Q1();
        }
        return instance;
    }

    public void displayMessage() {
        System.out.println("This is a singleton class.");
    }
}
