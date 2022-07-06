import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner input = new Scanner(System.in);
        String inputStr = null;
        String[] partsOfStr = null;

        System.out.println("Работа с программой:");
        System.out.println(" - добавление в стек:            'Добавим [число]'");
        System.out.println(" - извлечение значения со стека: 'Снимем со стека'");
        System.out.println(" - разворот стека:               'Ревёрс!'");
        System.out.println(" - выход из программы:           'end'");
        System.out.println(" ------------------------------------------------ \n");

        stack.printme();
        while (true) {
            inputStr = input.nextLine();

            if (inputStr.equals("end")) {
                break;
            }
            if (inputStr.contains("Снимем со стека")) {
                System.out.println(stack.pop());
            } else if (inputStr.contains("Добавим")) {
                partsOfStr = inputStr.split(" ");
                stack.push(Integer.parseInt(partsOfStr[1]));
            } else if (inputStr.equals("Ревёрс!") || inputStr.equals("Реверс!")) {
                stack.reverse();
            } else {
                System.out.println("The input is incorrect!");
            }
            stack.printme();
        }
    }
}
