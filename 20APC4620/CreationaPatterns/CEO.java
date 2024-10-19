package CreationaPatterns;

public class CEO {
    // Step 1: Create a private static variable to hold the single instance of the class.
    private static CEO instance;


    private CEO() {
        // Private constructor to prevent instantiation
        System.out.println("A CEO is appointed.");
    }

    // Step 3: Provide a public static method to get the instance of the class.
    public static CEO getInstance() {
        if (instance == null) {
            instance = new CEO();
        }
        return instance;
    }


    public void makeDecision(String decision) {
        System.out.println("CEO decision: " + decision);
    }
}

