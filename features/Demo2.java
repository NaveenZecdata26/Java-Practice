package features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(16);
        list.add(17);
        list.add(19);
        list.add(11);
        list.add(122);
        list.add(145);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n -> n % 2 != 0));
        System.out.println("odd numbers");
        collect.get(true).forEach(System.out :: println);
        System.out.println("even number");
        collect.get(false).forEach(System.out::println);

    }
}
