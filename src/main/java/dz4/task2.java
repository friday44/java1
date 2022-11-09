package dz4;

import java.util.Stack;

public class task2 {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                st.push(st.pop() + st.pop());
            }
            else if (token.equals("*")) {
                st.push(st.pop() * st.pop());
            }
            else if (token.equals("-")) {
                int a = st.pop();
                st.push(st.pop() - a);
            }
            else if (token.equals("/")) {
                int a = st.pop();
                st.push(st.pop() / a);
            }
            else {
                st.push(Integer.valueOf(token));
            }
        }
        return st.pop();
    }
}
