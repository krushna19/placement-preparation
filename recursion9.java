// Remove duplicates in a string

public class recursion9 {
    public static boolean[] map = new boolean[26];

    public static void removedup(String str, int idx, String newstring) {
        if (idx == str.length()) {
            System.out.println(newstring);
            return;
        }

        char currchar = str.charAt(idx);
        if (map[currchar - 'a']) {
            removedup(str, idx + 1, newstring);
        } else {
            newstring += currchar;
            map[currchar - 'a'] = true;
            removedup(str, idx + 1, newstring);
        }
    }

    public static void main(String args[]) {
        String str = "abbcccdccdd";
        removedup(str, 0, "");
    }

}
