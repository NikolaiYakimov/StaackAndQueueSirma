package Exercise.exc8;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> brackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                brackets.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (brackets.isEmpty()) {
                    System.out.println("False");
                    break;
                }

                char top = brackets.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    System.out.println("False");
                    break;
                }
            }
        }
        if (brackets.isEmpty())
            System.out.println("True");
    }
}
