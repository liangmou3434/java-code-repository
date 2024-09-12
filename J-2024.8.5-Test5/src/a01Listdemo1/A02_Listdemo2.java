package a01Listdemo1;

import java.util.ArrayList;
import java.util.List;

public class A02_Listdemo2 {
    public static void main(String[] args) {
        //List系列集合中两个删除的方法
        //1.直接删除元素
        //2.通过索引删除

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //在调用方法时,如果出现了方法重载现象,优先调用实参和形参一致的方法
        list.remove(1);//删除1索引的元素2
        System.out.println(list);//[1, 3]

        //如果想通过索引删除元素1,就需要把1变成int类型的包装类
        Integer i = Integer.valueOf(1);
        list.remove(i);//此时删除的就是元素1
        System.out.println(list);//[3]
    }
}
