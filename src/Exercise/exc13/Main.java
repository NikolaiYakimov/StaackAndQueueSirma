package Exercise.exc13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deque<String> undoStack = new ArrayDeque<>();
        Deque<String> redoStack = new ArrayDeque<>();
        ArrayDeque<String> printQueue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();
            if (command.startsWith("Insert(\"")) {
                String text = command.substring(8, command.length() - 2);
                redoStack.addLast(text);


                for (String el : redoStack) {
                    printQueue.push(redoStack.pop());
                }
                for (String el : printQueue) {
                    System.out.print(el + " ");
                }
                for (String el : printQueue) {
                    redoStack.push(printQueue.poll());
                }
                System.out.println();

                undoStack.clear();

            } else if (command.equals("Undo()")) {
                if (!redoStack.isEmpty()) {
                    String text = redoStack.removeLast();
                    undoStack.push(text);
                }
                for (String el : redoStack) {
                    printQueue.push(redoStack.pop());
                }
                for (String el : printQueue) {
                    System.out.print(el + " ");
                }
                for (String el : printQueue) {
                    redoStack.push(printQueue.poll());
                }
                System.out.println();


            } else if (command.equals("Redo()")) {
                if (!undoStack.isEmpty()) {
                    String text = undoStack.pop();
                    redoStack.push(text);
                }
                for (var String : redoStack) {
                    printQueue.push(redoStack.pop());
                }
                for (String el : printQueue) {
                    System.out.print(el + " ");
                }
                for (String el : printQueue) {
                    redoStack.push(printQueue.poll());
                }
                System.out.println();

            } else if (command.equals("End")) {
                for (var el : redoStack) {
                    System.out.print(el + " ");
                }
                break;
            }
        }
    }
}
