package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Student02 {
    public static void main(String[] args) {
        //创建集合
        List<List_Student> list=new ArrayList<List_Student>();
        //创建一个学生对象
        List_Student stu1=new List_Student("法外狂徒张三",27);
        List_Student stu2=new List_Student("王祖贤",43);
        List_Student stu3=new List_Student("钻石王老五",68);

        //将学生对象添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //使用for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------");

        //使用增强的for循环
        for (List_Student s : list){
            System.out.println(s);
        }
        System.out.println("--------");

        //使用迭代器遍历
        Iterator<List_Student> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
