import java.util.*;
import java.util.LinkedList;

public class Par30 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        HashSet<Integer> H1 = new HashSet<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.addAll(2,l2);
//        l1.clone();
        System.out.println(l1.lastIndexOf(13));
        for (int i = 0; i < l1.size() ; i++) {
            System.out.print(" "+l1.get(i));
        }
    }
}
