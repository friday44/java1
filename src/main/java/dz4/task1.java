package dz4;

import java.util.Stack;

public class task1 {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                st.push(s.charAt(i));
            } else {
                if (st.empty()) return false;
                if ((s.charAt(i) == ')') && (st.peek() != '(')) return false;
                if ((s.charAt(i) == ']') && (st.peek() != '[')) return false;
                if ((s.charAt(i) == '}') && (st.peek() != '{')) return false;
                st.pop();
            }
        }
        return st.empty();
    }
}