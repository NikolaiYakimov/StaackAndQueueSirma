package Exercise.exc4;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        int num=0;
        int sign='+';

        for (int i = 0; i < expression.length(); i++) {
            char ch=expression.charAt(i);

            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            if(!Character.isDigit(ch)&&ch!=' '||i==expression.length()-1){
                if(sign=='+')
                    stack.push(num);
                else if(sign=='-')
                    stack.push(-num);
                sign=ch;
                num=0;
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}
