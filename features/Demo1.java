package features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(17);
        list.add(101);
        list.add(187);
        list.add(210);
        list.add(510);
        List<Integer> l2 =list.stream().filter(num ->
        {
            int x = num;
            while(x >1)
            {
                x=x/10;
            }
            if(x ==1)return true;
            return false;
        }).collect(Collectors.toList());
        System.out.println(l2);
    }
}
