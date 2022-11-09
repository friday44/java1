package sem4;

import java.util.Stack;

class task1 {
    Stack<Integer> in;
    Stack<Integer> out;

    public void MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();


    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}

