import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        stat(2, 3, 4, 5544, 34);
    }

    static void stat(int... v) {

        System.out.println(Arrays.toString(v));
    }
}