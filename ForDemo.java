package List;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        //普通的int数组
        int[] arr={1,2,3,4,5};
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println("---------");
        //String类型的数组
        String[] str={"java","hello","world"};
        for(String s : str){
            System.out.println(s);
        }
        System.out.println("--------");

        //集合
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("hello");
        list.add("world");
        for(String l:list ){
            System.out.println(l);
        }
    }
}
