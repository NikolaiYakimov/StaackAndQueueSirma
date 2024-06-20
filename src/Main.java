import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        int value=stack.pop();
//        System.out.println("Value from peek: "+stack.peek());
//        System.out.println(value);
//        System.out.println(stack);

        ArrayDeque<Integer> stack=new ArrayDeque<>();
//        stack.push(1);
//        stack.push(2);
//        stack.add(3);
//        stack.add(4);
//        stack.add(5);
//        stack.offer(10);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack);
////        System.out.println(stack.peek());
////        System.out.println(stack.pop());
////        System.out.println(stack.pop());
//
//        stack.pop();
//        stack.poll();
//        int[] arr={1,2,3,4,5,6,7,8};
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            stack.offer(arr[i]);
//        }
//
//
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.size());

        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.push(1);
        arrayDeque.push(2);
        arrayDeque.push(3);
        arrayDeque.push(4);
        System.out.println(arrayDeque);
        arrayDeque.offer(5);
        arrayDeque.offer(6);
        arrayDeque.offer(7);
        arrayDeque.offer(8);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
        arrayDeque.poll();
        System.out.println(arrayDeque);
//        Integer[] arrFromStack=(Integer [])stack.toArray();
    }

}