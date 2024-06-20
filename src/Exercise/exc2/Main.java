package Exercise.exc2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        String[] inputArr = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(inputArr[i]));
        }

        for (int i = 0; i < s; i++) {
            if (!stack.isEmpty())
                stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty())
                System.out.println(0);
            else {
                int min = stack.peek();
                for (var num : stack) {
                    if (min > num) {
                        min = num;
                    }
                }
                System.out.println(min);
            }
        }

    }
}
