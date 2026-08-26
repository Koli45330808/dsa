class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        char ch[] = s.toCharArray();
        int res = Integer.MAX_VALUE;
        String str = "";

        for (int i = 0; i < ch.length; i++) {

            for (int j = i; j < ch.length; j++) {

                int count = 0;

                for (int l = i; l <= j; l++) {
                    if (ch[l] == '1') {
                        count++;
                    }
                }

                if (count == k) {

                    String ask = s.substring(i, j + 1);

                    if (ask.length() < res ||
                       (ask.length() == res && ask.compareTo(str) < 0)) {

                        res = ask.length();
                        str = ask;
                    }
                }
            }
        }

        return str;
    }
}