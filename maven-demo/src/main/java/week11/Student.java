package week11;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class Student implements Comparable<Student> {
    private Integer ID;
    private String name;
    private String sex;
    private Integer age;
    public Student(Integer ID,String name,String sex,Integer age) {
        this.ID=ID;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public Student() {
        this.ID=null;
        this.name=null;
        this.sex=null;
        this.age=null;
    }
    public void StuPush(Integer ID,String name,String sex,Integer age){
        this.ID=ID;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public String toString()
    {
        return "学号："+this.ID.toString()+" "+"姓名"+this.name.toString()+" "+"性别"+this.sex.toString()+" "+"年龄"+this.age.toString();
    }
    public int getAge()
    {
        return age;
    }
    public int compareTo(Student student)
    {
        return this.age-student.age;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"a","男",18));
        list.add(new Student(2,"b","男",19));
        list.add(new Student(3,"c","女",20));
        list.add(new Student(4,"d","女",21));
        list.add(new Student(5,"e","女",22));
        list.add(new Student(6,"f","男",23));
        Set<Student> result=new TreeSet(list);
//        将学生分成男生和女生两组数据，并按年龄排序
        Set<Student> setBoy=new TreeSet<>();
        Set<Student> setGirl=new TreeSet<>();
        for (Student stu : result) {
            if (stu.sex=="男")
            {
                setBoy.add(stu);
            }else
            {
                setGirl.add(stu);
            }
        }
//        定义Map<String,Set<Student>>，将全班分为两组，key“男生”,"女生“
        Map<String,Set<Student>> map=new HashMap<>(8);
        map.put("男生信息：",setBoy);
        map.put("女生信息：",setGirl);
//        遍历输出男生组和女生组的信息
        Iterator<Map.Entry<String,Set<Student>>> iterator=map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Set<Student>> entry=iterator.next();
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
