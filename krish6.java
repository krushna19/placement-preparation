import java.util.*;

public class krish6 {
    public static void printgreatest(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        printgreatest(n1, n2);
    }
}
