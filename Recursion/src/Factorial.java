import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // 1. Preparing variables
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.println("Enter n (NUMBER): ");

        // 2. Reading input parameter
        try {
            n = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error - " + e + ": invalid input parameters!");
        }

        int resultRecursion = 0, resultCycle = 0;

        // 3. Calculation of the n-th triangular number (RECURSION)
        long startTimeRec = System.nanoTime();
        resultRecursion = factorialRecursion(n);
        long stopTimeRec = System.nanoTime();

        // 5. Calculation of the n-th triangular number (CUCLE)
        long startTimeCyc = System.nanoTime();
        resultCycle = factorialCycle(n);
        long stopTimeCyc = System.nanoTime();

        // 6. Print results
        System.out.format("%-11s %-12s %-9s \n", "", "Recursion", "Cycle");
        System.out.format("%-11s %-12d %-9d \n", "Result", resultRecursion, resultCycle);
        System.out.format("%-11s %-12d %-9d \n", "Time, ns", (stopTimeRec - startTimeRec), (stopTimeCyc - startTimeCyc));
    }

    public static int factorialRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    public static int factorialCycle(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

}
