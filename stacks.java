import java.util.Stack;

public class stacks {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(23);
        s.push(12);
        s.push(13);
        s.push(18);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}