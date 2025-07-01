package Collection;

import org.omg.CORBA.INTERNAL;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str ="java is programming language i love java";
        Map<Character, Integer> map = new HashMap<>();
        int max =Integer.MIN_VALUE;
        for(char c : str.toCharArray())
        {
            if(c!=' ')
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(int temp : map.values())
        {
            max = Math.max(max,temp);
        }
        System.out.println(map);
        List<Integer> collect = map.values().stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Integer second_highest = collect.get(1);
        for(Map.Entry<Character,Integer> temp : map.entrySet())
        {
            if(second_highest == temp.getValue())
            {
                System.out.println("key :'"+temp.getKey()+"' value : '"+temp.getValue()+"'");
            }
        }

    }
}
