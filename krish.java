import java.util.*;

public class krish {
    public static void printtable(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + i * n);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printtable(n);
    }
}
