public class Factorial {
    public static int calculatefactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact1 = calculatefactorial(n - 1);
        int factn = n * fact1;
        return factn;

    }

    public static void main(String args[]) {
        int n = 5;
        int ans = calculatefactorial(n);
        System.out.println(ans);
    }
}
