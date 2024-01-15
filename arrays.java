import java.util.*;

public class arrays {
    public static void main(String args[]) {
        int[] marks = new int[3];

        // marks[0] = 123;
        // marks[1] = 124;
        // marks[2] = 134;
        // System.out.println(Arrays.toString(marks));
        // System.out.println(marks[1]);
        // System.out.println(marks[0]);
        // System.out.println(marks[2]);
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }
        // int score[] = { 1, 2, 3, 4, 5, 6 };
        // for (int i = 0; i < 6; i++) {
        // System.out.println(score[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}