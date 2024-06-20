package Exercise.exc13again;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> mainDeque = new ArrayDeque<>();
        Deque<String> undoDeque = new ArrayDeque<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();

            if (input.startsWith("Insert(\"")) {
                String text = input.substring(8, input.length() - 2);
                mainDeque.addLast(text);
                printCurrentState(mainDeque);
                // Clear the undo deque after new insertion
                undoDeque.clear();
            } else if (input.equals("Undo()")) {
                if (!mainDeque.isEmpty()) {
                    String undone = mainDeque.removeLast();
                    undoDeque.addLast(undone);
                }
                printCurrentState(mainDeque);
            } else if (input.equals("Redo()")) {
                if (!undoDeque.isEmpty()) {
                    String redone = undoDeque.removeLast();
                    mainDeque.addLast(redone);
                }
                printCurrentState(mainDeque);
            } else if (input.equals("End")) {
                printCurrentState(mainDeque);
                break;
            }
        }

        scanner.close();
    }

    private static void printCurrentState(Deque<String> deque) {
        for (String s : deque) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
