public class recursion3 {
    public static int calculatepower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPowernm1 = calculatepower(x, n - 1);
        int xpown = x * xPowernm1;
        return xpown;
    }

    public static void main(String args[]) {
        int x = 2, n = 4;
        int ans = calculatepower(x, n);
        System.out.println(ans);

    }
}
