package week11;
import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String[] s={"TS","JAVA","JAVA"};
        Set<String> set=new TreeSet<>(Arrays.asList(s));
        System.out.println(set);
        for (String str:set)
        {
            System.out.println(str);
        }
        set.forEach(System.out::println);
        //TreeSet对两个无序整形数组进行去重并求中值
        Integer[] num1={9,7,3,3,2,4,6};
        Integer[] num2={8,6,5,5,1,2,2,10};
        Set<Integer> num11=new TreeSet<>(Arrays.asList(num1));
        Set<Integer> num22=new TreeSet<>(Arrays.asList(num2));
        num11.addAll(num22);
        System.out.println(num11.size());
        //遍历
        int i=0,j=0;
        for (Integer num:num11)
        {
            i++;
            if (num11.size()%2==1&&i==num11.size()/2+1)
            {
                System.out.println("中位数为："+num);
                break;
            }
            if (num11.size()%2==0&&i==num11.size()/2)
            {
                j=num;
            }
            if (num11.size()%2==0&&i==num11.size()/2+1)
            {
                System.out.println("中位数为："+(num+j)/2.0);
                break;
            }
        }
        //转List
        List<Integer> list1=new ArrayList<>(num11);
        double median=0;
        median=(list1.size()%2==1)?list1.get(list1.size()/2+1):(list1.get(list1.size()/2-1)+list1.get(list1.size()/2))/2.0;
        System.out.println("中位数为:"+median);
    }
}
