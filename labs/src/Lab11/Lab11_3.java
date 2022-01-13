import java.util.Scanner;
import java.util.Stack;

public class Lab11_3 {
    public static void main(String[] args) {
        // ZAD 6
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Podaj liczbę.");
        int n = scan.nextInt();
        String liczba = Integer.toString(n);

        for (int i = 0; i < liczba.length(); i++)
            stack.push(liczba.charAt(i));

        while (stack.empty() != true) {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
