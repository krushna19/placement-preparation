import javax.swing.plaf.synth.SynthSpinnerUI;

public class recursion2 {
    public static void printfab(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfab(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfab(a, b, n - 2);
    }
}
