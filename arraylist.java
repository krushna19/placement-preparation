import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add(0);
        list.add(11);
        list.add(2);
        list.add(2, 34);

        System.out.println(list);
        list.set(0, 23);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
    }
}