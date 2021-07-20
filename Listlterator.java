package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listlterator {
    public static void main(String[] args) {
        //创建List集合
        List<String> list=new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        /**
         * Listlerator迭代器
         * 通过List集合，得到Listlterator()的方法；
         */
        ListIterator<String> lit=list.listIterator();

        /*//正向遍历
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("---------");
        //反向遍历
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }*/

        //add()  该方法是将制定元素插入列表
        while (lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);

    }
}
