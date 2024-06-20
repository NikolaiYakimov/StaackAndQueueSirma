package Exercise.exc3;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        String currentUrl = "Home";
        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Home")) {
                break;
            }
            else if (command.equals("back")) {
                if (history.isEmpty())
                    System.out.println("no previous URL");
                else {
                    forwardHistory.push(currentUrl);
                    currentUrl = history.pop();
                    System.out.println(currentUrl);
                }

            }
            else if (command.equals("forward")) {
                if (forwardHistory.isEmpty())
                    System.out.println("no forward URLs");
                else{
                    history.push(currentUrl);
                    currentUrl=forwardHistory.pop();
                    System.out.println(currentUrl);
                }
            }
            else {
                if (currentUrl!=null) {
                    history.push(currentUrl);
                    currentUrl=command;
                    forwardHistory.clear();
                    System.out.println(currentUrl);
                }
            }



        }
    }
}
