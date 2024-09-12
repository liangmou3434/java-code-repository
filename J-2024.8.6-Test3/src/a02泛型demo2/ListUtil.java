package a02泛型demo2;

import java.util.ArrayList;

public class ListUtil {
//    定义一个工具类：ListUtil
//    类中定义一个静态方法addAll，用来给多种类的集合添加元素。

    public ListUtil() {
    }

    //泛型方法
    public static<E> void addAll(ArrayList<E> list, E e1, E e2, E e3){
        //此时只有一个方法需要泛型,所以写一个泛型方法就可以,不用写泛型类
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

    public static void show(){
        System.out.println("show方法");
    }
}