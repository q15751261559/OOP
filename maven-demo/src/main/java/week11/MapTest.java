package week11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>(8);
        map.put("Tom",10);
        map.put("juice",10);
        map.put("banana",8);
        System.out.println(map);
        //for
        Set<String> set=map.keySet();
        for (String key :set)
        {
            System.out.println(key+map.get(key));
        }
        //迭代器
        Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+entry.getValue());
        }
        //
    }
}
