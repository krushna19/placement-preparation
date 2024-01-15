public class recursion16 {
    public static int callguests(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways1 = callguests(n - 1);
        int ways2 = (n - 1) * callguests(n - 2);
        return ways1 + ways2;

    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(callguests(n));
    }
}
