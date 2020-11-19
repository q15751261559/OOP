package week11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<String,String> teachers=new HashMap<>(10);
        teachers.put("Tom","CoreJava");
        teachers.put("John","Oracle");
        teachers.put("Susan","Oracle");
        teachers.put("Jerry","JDBC");
        teachers.put("Jim","Unix");
        teachers.put("Kevin","JSP");
        teachers.put("Lucy","JSP");
        System.out.println(teachers);
        //增加一位新老师Allen教JDBC
        teachers.put("Allen","JDBC");
        //Lucy改为教CoreJava
        teachers.put("Lucy","CoreJava");
        Set<String> set=teachers.keySet();
        //转为set并用for循环遍历
        for (String key :set)
        {
            System.out.println("老师："+key+" "+"课程"+teachers.get(key));
        }
        //迭代器遍历
        Iterator<Map.Entry<String,String>> iterator=teachers.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,String> entry=iterator.next();
            System.out.println("老师："+entry.getKey()+" "+"课程"+entry.getValue());
        }
        //输出所有教JDBC的讲师
        Set<String> set1=teachers.keySet();
        System.out.print("教JDBC的讲师有"+" ");
        for (String key :set)
        {
            if (teachers.get(key)=="JDBC")
                System.out.print(key+" ");
        }
    }
}
