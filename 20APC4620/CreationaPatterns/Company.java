package CreationaPatterns;

public class Company {
    public static void main(String[] args) {
        // Get the only object available
        CEO ceo1 = CEO.getInstance();
        ceo1.makeDecision("Expand into new markets.");

        // Trying to get another instance of CEO
        CEO ceo2 = CEO.getInstance();
        ceo2.makeDecision("Launch new product line.");

        // Verify both references point to the same instance
        if (ceo1 == ceo2) {
            System.out.println("Both ceo1 and ceo2 point to the same CEO instance.");
        }
    }
}


