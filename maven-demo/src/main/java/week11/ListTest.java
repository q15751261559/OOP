package week11;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class ListTest {
    public static void main(String[] args) {
        String[] s={"system","b","c"};
        List<String> list= Arrays.asList(s);
        System.out.println(list.get(1));
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)+" ");
        }
        //增强型遍历
        for (String str:list)
        {
            System.out.print(str+ " ");
        }
        //迭代器遍历
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        //lambda表达式遍历
        list.forEach(s1 ->
            System.out.println(s1.toUpperCase())
        );
        //方法引用遍历
        list.forEach(System.out::println);
    }
}
