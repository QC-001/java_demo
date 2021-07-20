package List;

import java.util.ArrayList;
import java.util.List;

/**
 * list集合的操作是带索引的，索引不能越界
 */

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        list.add("java");
        list.add("hallo");
        list.add("world");
        list.add("java");
        //输出集合的数据
        System.out.println(list);

        //add(3,"lqv"),在指定的3下标位置添加数据lqv
        System.out.println("在三号下标处添加元素lqv");
        list.add(3,"lqv");
        System.out.println(list);

        //remove(1) ,删除指定索引处的元素，并显示出来
        System.out.println("删除指定索引处的元素，并显示出来");
        String jj=list.remove(1);
        System.out.println(list);
        System.out.println("返回发元素是："+jj);

        //set(需要修改元素的位置，修改后的元素)   修改指定索引处的元素，返回被修改的元素；
        System.out.println("修改指定索引处的元素，返回被修改的元素");
        String dd=list.set(2,"lisi");
        System.out.println(list);
        System.out.println("修改的元素是："+dd);

        //get()   返回指定索引处的元素

        System.out.println("返回三号下标的元素");
        String s = list.get(3);
        System.out.println(s);
        System.out.println("--------");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
