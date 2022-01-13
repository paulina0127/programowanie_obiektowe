import java.util.Scanner;
import java.util.Stack;

public class Lab11_2 {
    public static void main(String[] args) {
        // ZAD 5
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.println("Podaj zdanie.");
        String zdanie = scan.nextLine();
        int licz = 0, size = 0;

        for (int i = 0; i < zdanie.length(); i++) {
            if (zdanie.charAt(i) == ' ') {
                stack.push(zdanie.substring(licz, i));
                licz = i + 1;
            }

            if (zdanie.charAt(i) == '.') {
                stack.push(zdanie.substring(licz, i));
                licz = i + 2;
                i++;

                size = stack.size();
                while (stack.empty() != true) {
                    if (stack.size() == size) {
                        System.out.print(stack.peek().substring(0,1).toUpperCase() + stack.peek().substring(1) + " ");
                        stack.pop();
                    }
                    else if (stack.size() == 1) {
                        System.out.print(stack.peek().toLowerCase() + ".");
                        stack.pop();
                    }
                    else {
                        System.out.print(stack.peek().toLowerCase() + " ");
                        stack.pop();
                    }
                }

                System.out.print(" ");
            }
        }
    }
}