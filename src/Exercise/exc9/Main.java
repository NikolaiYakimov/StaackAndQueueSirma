package Exercise.exc9;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        ArrayDeque<String> queue=new ArrayDeque<>();
        int nRemove=Integer.parseInt(scanner.nextLine());

        String[] arrOfPeople=input.split(" ");
        for (int i = 0; i < arrOfPeople.length; i++) {
            queue.offer(arrOfPeople[i]);
        }


        while (queue.size()>1){

            for (int i = 0; i < nRemove-1; i++) {
                queue.offer(queue.poll());
            }

           String removedPerson= queue.poll();
            System.out.println("Remove "+removedPerson);
        }

        System.out.println("Last is "+queue.poll());
    }
}
