package Stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        Set<String> operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("/");
        operators.add("*");

        for (String s : tokens) {
            if (operators.contains(s)) {
                stack.push(operate(stack.pop(), stack.pop(), s));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public static int operate(int first, int second, String operator) {
        return switch (operator) {
            case "+" -> add(first, second);
            case "-" -> sub(second, first);
            case "*" -> mult(first, second);
            case "/" -> div(second, first);
            default -> 0;
        };
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static int sub(int first, int second) {
        return first - second;
    }

    public static int mult(int first, int second) {
        return first * second;
    }

    public static int div(int first, int second) {
        try {
            return first / second;
        } catch (Exception e) {
            return 0;
        }
    }
}
