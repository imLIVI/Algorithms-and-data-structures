import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. Preparing variables
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.println("To output triangular numbers, enter n - the last iteration of calculations(NUMBER): ");

        // 2. Reading input parameter
        try {
            n = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error - " + e + ": invalid input parameters!");
        }

        // 3. Graphical representation of triangular numbers
        System.out.println("\nGraphical representation: ");
        printTriangle(n);

        int resultRecursion = 0, resultCycle = 0;

        // 4. Calculation of the n-th triangular number (RECURSION)
        long startTimeRec = System.nanoTime();
        resultRecursion = triangleRecursion(n);
        long stopTimeRec = System.nanoTime();

        // 5. Calculation of the n-th triangular number (CUCLE)
        long startTimeCyc = System.nanoTime();
        resultCycle = triangleCycle(n);
        long stopTimeCyc = System.nanoTime();

        // 6. Print results
        System.out.format("%-11s %-12s %-9s \n", "", "Recursion", "Cycle");
        System.out.format("%-11s %-12d %-9d \n", "Result", resultRecursion, resultCycle);
        System.out.format("%-11s %-12d %-9d \n", "Time, ns", (stopTimeRec - startTimeRec), (stopTimeCyc - startTimeCyc));
    }

    public static int triangleRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + triangleRecursion(n - 1);
    }

    public static int triangleCycle(int n) {
        int result = 0;
        while (n > 0) {
            result += n;
            n--;
        }
        return result;
    }

    public static void printTriangle(int n) {
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
            n--;
        }
    }
}
