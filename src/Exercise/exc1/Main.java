package Exercise.exc1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int[] arr= Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> reverseArr=new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            reverseArr.push(arr[i]);
        }
        System.out.println(reverseArr);

        while (!reverseArr.isEmpty()){
            System.out.println(reverseArr.pop());
        }
    }
}
