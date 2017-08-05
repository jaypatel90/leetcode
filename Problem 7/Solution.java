public class Solution {
    public int reverse(int x) {
        boolean neg = x < 0 ? true: false;

        if (neg) {
            x = Math.abs(x);
        }

        long rev = 0;

        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x/10;
        }

        if (rev > Integer.MAX_VALUE) {
            return 0;
        }

        return neg ? -1 * (int)rev: (int)rev;
    }

    public static void main(String[] args) {
        System.out.print(new Solution().reverse(123));
    }
}