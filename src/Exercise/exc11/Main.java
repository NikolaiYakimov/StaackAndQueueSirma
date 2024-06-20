package Exercise.exc11;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int s = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);

        String[] inputArr = scanner.nextLine().split(" ");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(inputArr[i]));
        }

        for (int i = 0; i < s; i++) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }

        if (queue.contains(x)) {
            System.out.println(true);
        } else {
            if (queue.isEmpty())
                System.out.println(0);
            else {
                int min = queue.peek();
                for (var el : queue) {
                    if (min > el)
                        min = el;

                }
                System.out.println(min);
            }
        }
    }
}
