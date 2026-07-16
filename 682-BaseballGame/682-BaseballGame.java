// Last updated: 7/16/2026, 7:56:42 PM
import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "+":
                    int top = stack.pop();
                    int newScore = top + stack.peek();
                    stack.push(top);
                    stack.push(newScore);
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}