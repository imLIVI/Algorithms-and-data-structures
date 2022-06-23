import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Anagrams {
    private static int length;
    public static char[] word;
    static int count;

    public static void main(String[] args) throws IOException {
        // 1. Preparing variables
        Scanner input = new Scanner(System.in);
        String inputStr = null;

        System.out.println("Enter the word: ");

        // 2. Reading input parameter
        try {
            inputStr = input.next();
            length = inputStr.length();
            word = new char[length];
        } catch (Exception e) {
            System.out.println("Error - " + e + ": invalid input parameters!");
        }

        // 3. Filling array
        fillingArray(inputStr);

        // 4. Creating anagrams
        doAnagram(length);

        // 5. Check. Expected number of words = factorial(lenOfWorld)
        int sizeOfResArr = Factorial.factorialRecursion(length);
        if (count != Factorial.factorialRecursion(length))
            System.out.println("Expected number of words: " + sizeOfResArr);
    }

    public static void fillingArray(String str){
        for (int i = 0; i < length; i++) {
            word[i] = str.charAt(i);
        }
    }

    public static void doAnagram(int newSize)
    {
        if(newSize == 1)
            return;

        for(int j=0; j<newSize; j++)
        {
            doAnagram(newSize-1);
            if(newSize==2)
                displayWord();
            rotate(newSize);
        }
    }

    public static void rotate(int newSize)
    {
        int j;
        int position = length - newSize;
        char temp = word[position]; // Save first letter
        for(j=position+1; j<length; j++) // Shifting other letters
            word[j-1] = word[j];
        word[j-1] = temp; // Moving the first letter
    }

    public static void displayWord()
    {
        if(count < 99)
            System.out.print(" ");
        if(count < 9)
            System.out.print(" ");
        System.out.print(++count + " ");
        for(int j=0; j<length; j++)
            System.out.print( word[j] );
        System.out.print(" ");
        System.out.flush();
        if(count%6 == 0)
            System.out.println("");
    }
}
