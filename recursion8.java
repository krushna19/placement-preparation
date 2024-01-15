public class recursion8 {
    public static void movex(String str, int idx, int count, String newstring) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }

        char currchar = str.charAt(idx);
        if (currchar == 'x') {
            count++;
            movex(str, idx + 1, count, newstring);
        } else {
            newstring += currchar;
            movex(str, idx + 1, count, newstring);
        }
    }

    public static void main(String args[]) {
        String str = "axbcxxxxxdxxw";

        movex(str, 0, 0, "");
    }
}