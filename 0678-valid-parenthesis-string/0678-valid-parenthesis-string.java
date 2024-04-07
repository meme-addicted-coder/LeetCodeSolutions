class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == '*') {
                starStack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }
        
        while (!stack.isEmpty() && !starStack.isEmpty()) {
            if (stack.peek() > starStack.peek()) {
                return false;
            }
            stack.pop();
            starStack.pop();
        }
        
        return stack.isEmpty();
    }
}