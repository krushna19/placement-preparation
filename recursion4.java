public class recursion4 {
    public static void towerofhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
        towerofhanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        towerofhanoi(n, "A", "B", "C");
    }
}

// Q1. Tower of Hanoi - Transfer n disks from source to destination over 3
// towers.
// public class recursion4 {
// public static void towerOfHanoi(int n, String src, String helper, String
// dest) {
// if (n == 1) {
// System.out.println("transfer disk " + n + " from " + src + " to " + dest);
// return;
// }
// // transfer top n-1 from src to helper using dest as 'helper'
// towerOfHanoi(n - 1, src, dest, helper);
// // transfer nth from src to dest
// System.out.println("transfer disk " + n + " from " + src + " to " + helper);
// // transfer n-1 from helper to dest using src as 'helper'
// towerOfHanoi(n - 1, helper, src, dest);
// }
//
// public static void main(String args[]) {
// int n = 4;
// towerOfHanoi(n, "A", "B", "C");
// }
// }