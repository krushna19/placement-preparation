import java.util.Scanner;

public class krish4 {
    public static int average(int a, int b, int c) {
        int average = (a + b + c) / 3;
        return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a, b, c);
        System.out.println(average(a, b, c));
    }
}