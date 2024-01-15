//print all the subsequences of a string

public class recursion10 {
    public static void subsequences(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }
        char currchar = str.charAt(idx);

        // to be
        subsequences(str, idx + 1, newstring + currchar);

        // or not to be
        subsequences(str, idx + 1, newstring);
    }

    public static void main(String args[]) {
        String str = "abc";
        subsequences(str, 0, "");

    }
}
