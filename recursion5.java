//public class recursion5 {
//    public static void printrev(String str, int idx) {
//        if (idx == 0) {
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printrev(str, idx - 1);
//    }
//
//    public static void main(String args[]) {
//        String str = "abcd";
//        printrev(str, str.length() - 1);
//
//    }
//}
public class recursion5 {
    public static void main(String args[]) {
        String s = "kendralust";
        recursiveString(s);
        System.out.println(recursiveString(s));
    }

    public static String recursiveString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return recursiveString(s.substring(1)) + s.charAt(0);

    }
}