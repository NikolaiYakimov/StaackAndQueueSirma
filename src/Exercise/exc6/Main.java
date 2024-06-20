package Exercise.exc6;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expresion = scanner.nextLine();
        ArrayDeque<Integer> stackIndexOfBrackets = new ArrayDeque<>();
        ArrayDeque<String> expressions=new ArrayDeque<>();

        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);
            if (ch == '(')
                stackIndexOfBrackets.push(i);
            else if (ch == ')') {
                int startIndex = stackIndexOfBrackets.pop();
                expressions.offer(expresion.substring(startIndex , i+1));
            }
        }

        while(!expressions.isEmpty()){
            System.out.println(expressions.poll());
        }
    }
}
