public class recursion15 {
    public static int placetiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertplacements = placetiles(n - m, m);
        int horplacements = placetiles(n - 1, m);
        return vertplacements + horplacements;
    }

    public static void main(String args[]) {
        int n = 12, m = 3;
        System.out.println(placetiles(n, m));
    }
}
