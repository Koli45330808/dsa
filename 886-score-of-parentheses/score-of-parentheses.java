class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        // Starting score
        stack.push(0);

        for (char ch : s.toCharArray()) {

            // Opening bracket
            if (ch == '(') {
                stack.push(0);
            }

            // Closing bracket
            else {

                // Get inside score
                int current = stack.pop();

                // If nothing was inside: ()
                if (current == 0) {
                    current = 1;
                }

                // Something was inside: (A)
                else {
                    current = 2 * current;
                }

                // Add current score to previous level
                int previous = stack.pop();
                stack.push(previous + current);
            }
        }

        return stack.pop();
    }
}