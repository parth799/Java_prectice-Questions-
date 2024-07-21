import java.util.*;

public class Par29 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
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
        for (int i = 0; i < l1.size() ; i++) {
            System.out.print(" "+l1.get(i));
        }
    }
}
