public class recursion13 {

    public static void printperm(String str, String permu) {
        if (str.length() == 0) {
            System.out.println(permu);
        }
        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printperm(newstr, permu + currchar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printperm(str, "");
    }
}