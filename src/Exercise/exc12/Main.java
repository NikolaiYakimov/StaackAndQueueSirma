package Exercise.exc12;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                (a, b) -> {
                    if (a.getPriority() == b.getPriority()) {
                        return 0;
                    }
                    if (a.getPriority() < b.getPriority())
                        return 1;
                    else
                        return -1;
                }
        );

        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");

            switch (input[0]) {

                case "Add":
                    String name = input[1];
                    int prior = Integer.parseInt(input[2]);
                    taskQueue.offer(new Task(name, prior));
                    break;
                case "getNextTask":
                    if (!taskQueue.isEmpty()) {
                        System.out.println(taskQueue.poll());
                    } else {
                        System.out.println("We don't have tasks");
                    }
                    break;
                case "exit":
                    return;
            }
        }

    }
}
