class Solution {
    public int maximumLengthSubstring(String s) {

        char[] ch = s.toCharArray();
        int ask = 0;

        for (int i = 0; i < ch.length; i++) {

            for (int j = i; j < ch.length; j++) {

                char[] temp = Arrays.copyOfRange(ch, i, j + 1);

                Arrays.sort(temp);

                boolean valid = true;

                for (int k = 0; k < temp.length - 2; k++) {

                    if (temp[k] == temp[k + 2]) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    ask = Math.max(ask, j - i + 1);
                }
            }
        }

        return ask;
    }
}