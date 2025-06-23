package Collection;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "naveen");
        map.put("address", "Indore");
        map.put("mobile no", "9876547333");
        map.put("profession", "software developer");

        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get("address"));
        System.out.println(map.getOrDefault("name1",null));
        System.out.println(map.putIfAbsent("hometown","mumbai"));
        System.out.println(map);

        for(Map.Entry<String , String> temp : map.entrySet() )
        {
            System.out.println(temp.getKey()+"-----"+ temp.getValue());
        }

    }
}
