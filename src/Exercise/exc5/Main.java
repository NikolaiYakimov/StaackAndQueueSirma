package Exercise.exc5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binaryNum=new ArrayDeque<>();
        while(number>0){
            binaryNum.push(number%2);
            number/=2;
        }
        StringBuilder sb=new StringBuilder();
        while(!binaryNum.isEmpty()){
            sb.append(binaryNum.pop());
        }
        System.out.println(sb);
    }
}
