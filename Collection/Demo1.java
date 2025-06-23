package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.contains(10));
        System.out.println(list.set(2,50));
        System.out.println("updated list"+ list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(4));
        System.out.println(list);
        System.out.println(list.removeAll(list2));
        System.out.println(list);
        System.out.println(list.size());
        Integer[] i = new Integer[list.size()];
        list.toArray(i);
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j]+" ");
        }
    }
}
