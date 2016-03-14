/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

Example
Given encoded message 12, it could be decoded as AB (1 2) or L (12).
The number of ways decoding 12 is 2.
 */
public class DecodeWays {

    /**
     * @param s a string,  encoded message
     * @return an integer, the number of ways decoding
     */
    public int numDecodings(String s) {
        int prev = 1;
        int cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            int tmp = cur;
            if (s.charAt(i) > '0') {
                cur += prev;
            }
            if (i > 0 && (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') && 
                    10 <= Integer.parseInt(s.substring(i - 1, i + 1)) && 
                    Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) {
                cur += prev;
            }
            prev = cur;
        }
        return cur;
    }


    public int numDecodings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) > '0') {
                dp[i + 1] += dp[i];
            }
            if (i > 0 && (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') && 
                    10 <= Integer.parseInt(s.substring(i - 1, i + 1)) && 
                    Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) {
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[s.length()];
    }

}