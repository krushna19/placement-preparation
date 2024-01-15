import java.util.*;

public class krish2 {
    public static void checknum(int n) {
        if (n % 2 == 0 && n == 0) {
            System.out.println("even");
            return;
        } else {
            System.out.println("odd");
            return;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checknum(n);
    }
}
