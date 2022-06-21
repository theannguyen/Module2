package BaiTap11;

import java.util.Stack;

public class wStack {
    private static void stackOfIntegers() {
        Integer[] integers = new Integer[]{1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (int i = 0; i < 5; i++) {
            integers[i] = stack.pop();
        }
        for (Integer integer : integers) {
            System.out.println(integer + "");
        }
    }

    private static void stackOfString() {
        Stack<Character> wStack = new Stack<>();
        String wWord = "Hello World";

        for (int i = 0; i < wWord.length(); i++) {
            wStack.push(wWord.charAt(i));
        }

        for (int i = 0; i < wWord.length(); i++) {
            char ch = wStack.pop();
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        stackOfIntegers();
        stackOfString();
    }
    }