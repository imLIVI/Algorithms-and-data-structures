import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner input = new Scanner(System.in);
        String inputStr = null;
        String[] partsOfStr = null;

        System.out.println("Work with program:");
        System.out.println(" - add to stack:      'Add [number]'");
        System.out.println(" - remove from stack: 'Remove from the stack'");
        System.out.println(" - stack rotation:    'Reverse!'");
        System.out.println(" - exit:              'end'");
        System.out.println(" ------------------------------------------------ \n");

        stack.printme();
        while (true) {
            inputStr = input.nextLine();

            if (inputStr.equals("end")) {
                break;
            }
            if (inputStr.contains("Remove from the stack")) {
                System.out.println(stack.pop());
            } else if (inputStr.contains("Add")) {
                partsOfStr = inputStr.split(" ");
                stack.push(Integer.parseInt(partsOfStr[1]));
            } else if (inputStr.equals("Reverse!") || inputStr.equals("reverse!") || inputStr.equals("reverse")) {
                stack.reverse();
            } else {
                System.out.println("The input is incorrect!");
            }
            stack.printme();
        }
    }
}
