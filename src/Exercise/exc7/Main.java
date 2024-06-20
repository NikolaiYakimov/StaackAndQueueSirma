package Exercise.exc7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("print")) {
                while (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
                break;
            } else if (input.equals("cancel")) {
                if (queue.isEmpty())
                    System.out.println("StandBy");
                else
                    System.out.println("Cancelled " + queue.poll());
            }
            else{
                queue.offer(input);
            }
        }
    }
}
