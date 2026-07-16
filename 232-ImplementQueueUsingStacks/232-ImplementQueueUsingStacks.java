// Last updated: 7/16/2026, 7:58:19 PM
import java.util.*;
class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    public void push(int x) {
        inStack.push(x);
    }
    private void move() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
    public int pop() {
        move();
        return outStack.pop();
    }
    public int peek() {
        move();
        return outStack.peek();
    }
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}