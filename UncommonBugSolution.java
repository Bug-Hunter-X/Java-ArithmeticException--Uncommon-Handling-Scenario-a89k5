public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: Division by zero.");
            //Handle appropriately, e.g., using a default value, logging, or alternative calculation
            z = Integer.MAX_VALUE; // Example: Using a default value
        }
        System.out.println(z);
    }
}