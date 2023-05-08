package homework.homework_java_3;

import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("("));
    }

    public static boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character tempChar = s.charAt(i);
            
            if (tempChar == '(' || tempChar == '[' || tempChar == '{') {
                list.add(tempChar);
            }

            if (tempChar == ')') {
                if (!list.isEmpty() && list.peek() == '(') list.pop();
                else return false;
            }
            if (tempChar == ']') {
                if (!list.isEmpty() && list.peek() == '[') list.pop();
                else return false;
            }
            if (tempChar == '}') {
                if (!list.isEmpty() && list.peek() == '{') list.pop();
                else return false;
            }
        }
        return list.isEmpty();
    }
}
