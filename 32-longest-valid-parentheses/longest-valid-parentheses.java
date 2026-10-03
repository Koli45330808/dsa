class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> sc = new Stack<>();
        sc.push(-1);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                sc.push(i);
            } 
            else {
                sc.pop();

                if (sc.empty()) {
                    sc.push(i);
                } 
                else {
                    int length = i - sc.peek();
                    res = Math.max(res, length);
                }
            }
        }

        return res;
    }
}