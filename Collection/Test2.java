package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String str = "aaaaaaabbbbcccaaadddd";
        for (char c : str.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int temp : map.values())
        {
            max = Math.max(max,temp);
        }
        for(Map.Entry<Character,Integer> temp : map.entrySet())
        {
            if(temp.getValue() == max)
            {
                System.out.println("key: '"+temp.getKey()+"' value : '"+temp.getValue()+"'");
            }
        }
//List.of(10,20,30);
    }

}
