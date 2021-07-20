package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //创建List集合对象
        List<String> ls = new ArrayList<String>();
        ls.add("hallo");
        ls.add("world");
        ls.add("java");
        ls.add("hallo");

        //用迭代器的方法遍历List
        Iterator<String> it = ls.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
    }
}
