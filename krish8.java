import java.util.Scanner;

public class krish8 {

    public static void main(String args[]) {
        System.out.println("Enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int result = 1;
        while (n > 0) {
            result = result * x;
            n--;
        }

        System.out.println("x to the power n is : " + result);
    }
}
