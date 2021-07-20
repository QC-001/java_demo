package List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo03 {
    public static void main(String[] args) {
        //创建List集合
        List<List_Student> lsit =new ArrayList<List_Student>();

        //创建学生对象
        List_Student student1=new List_Student("法外狂徒——张三",27);
        List_Student student2=new List_Student("吴亦凡",29);
        List_Student student3=new List_Student("张学友",43);
        lsit.add(student1);
        lsit.add(student2);
        lsit.add(student3);

        for (int i = 0; i < lsit.size(); i++) {
            System.out.println(lsit.get(i));
        }
    }
}
