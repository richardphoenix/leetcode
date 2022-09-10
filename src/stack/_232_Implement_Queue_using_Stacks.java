package stack;

import java.util.Stack;

/**
 * @author Richard Phoenix
 */
public class _232_Implement_Queue_using_Stacks {
    private Stack<Integer> inStack, outStack;
    public _232_Implement_Queue_using_Stacks() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        checkStack();
        return outStack.pop();
    }

    public int peek() {
        checkStack();
        return outStack.peek();
    }

    private void checkStack() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.empty();
    }
}
