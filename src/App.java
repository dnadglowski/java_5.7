public class App {
    public static void main(String[] args) {
        System.out.println("Tuition Cost         Year");

        double tuition = 10000; //declares the tuition
        for (int i = 0; i < 10; i++) {
            tuition *= 1.05; // Apply 5% annual growth
            int year = i + 1; 
            System.out.printf("$%-20d%d%n", (int) tuition, year);
        }

        double totalCost = 0; //declares totalcost
        for (int j = 0; j < 4; j++) {
            tuition *= 1.05; // Continue tuition growth
            totalCost += tuition; //finds the total cost of tuition for 4 years
        }

        System.out.println("The four-year cost after 10 years is $" + (int) totalCost);
    }
}
