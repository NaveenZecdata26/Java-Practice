package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(10);
        System.out.println(set.size());
        System.out.println(set.addAll(list));
        System.out.println(set);
        System.out.println(set.remove(11));
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.removeAll(list));
        System.out.println(set.retainAll(list));
        System.out.println(set);
        System.out.println(set);
        System.out.println(set.isEmpty());


    }
}
