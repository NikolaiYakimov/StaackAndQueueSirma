package Exercise.exc13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deque<String> undoStack = new ArrayDeque<>();
        Deque<String> redoStack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String command = scanner.nextLine().trim();
            if (command.startsWith("Insert(\"")) {
                String text = command.substring(8, command.length() - 2);
                redoStack.addLast(text);
                printTheStack(redoStack);


            } else if (command.equals("Undo()")) {
                if (!redoStack.isEmpty()) {
                    String text = redoStack.removeLast();
                    undoStack.push(text);
                }

                printTheStack(redoStack);


            } else if (command.equals("Redo()")) {
                if (!undoStack.isEmpty()) {
                    String text = undoStack.pop();
                    redoStack.addLast(text);
                }
                printTheStack(redoStack);

            } else if (command.equals("End")) {
                printTheStack(redoStack);
                break;
            }
        }

    }
        public static void printTheStack(Deque<String> stack){
            for(String el:stack){
                System.out.print(el+" ");
            }
            System.out.println();
        }
}
