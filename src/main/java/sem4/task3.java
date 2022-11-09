package sem4;

import java.util.Stack;

public class task3 {

    public String simplifyPath(String path) {
        Stack<String> directory = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] arr = path.split("/");
        for (String token : arr) {
            if ("".equals(token) || ".".equals(token)) {
                continue;
            }
            if ("..".equals(token)) {
                if (!directory.isEmpty()) {
                    directory.pop();
                }
            } else {
                directory.push(token);
            }
        }
        if (directory.isEmpty()) return "/";
        while (!directory.isEmpty()) {
            sb.insert(0, directory.pop());
            sb.insert(0, '/');
        }
        return sb.toString();
    }
}
