package Exercise.exc10;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> maxStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 1:
                    int num = Integer.parseInt(scanner.nextLine());
                    stack.push(num);
                    if (maxStack.isEmpty() || num >= maxStack.peek()) {
                        maxStack.push(num);
                    }
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int removedNum = stack.pop();
                        if (removedNum == maxStack.peek())
                            maxStack.pop();
                    }
                    break;
                case 3:
                    if (!maxStack.isEmpty())
                        System.out.println(maxStack.peek());
                    break;
                default:
                    break;
            }

        }
    }
}
