import java.util.*;

class JavaStack {

    public static void main(String[] argh) {
        String parentheses = "[{()}]";
        System.out.println(isBalanced(parentheses));
    }

    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        char[] chars = parentheses.toCharArray();
        for (char character : chars) {
            if (character == '{' || character == '(' || character == '[') {
                stack.push(character);
            } else if (character == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            } else if (character == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            } else if (character == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}