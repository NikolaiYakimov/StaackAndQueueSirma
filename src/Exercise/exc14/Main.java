package Exercise.exc14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        if(n>1&&n<50)
            System.out.println(fibonachhi(n));
        else {
            System.out.println("Enter valid number!");
        }

    }

    public static int fibonachhi(int num){
        if(num==0){
            return 0;
        }
        else if(num==1)
            return 1;
        else
            return fibonachhi(num-1)+fibonachhi(num-2);
    }
}
