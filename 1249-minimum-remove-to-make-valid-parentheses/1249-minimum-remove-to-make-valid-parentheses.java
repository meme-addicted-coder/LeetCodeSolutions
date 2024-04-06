class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(sb.length());
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            sb.deleteCharAt(index);
        }
        return sb.toString();
    }
}