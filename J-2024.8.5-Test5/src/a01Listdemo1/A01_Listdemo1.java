package a01Listdemo1;

import java.util.ArrayList;
import java.util.List;

public class A01_Listdemo1 {
    public static void main(String[] args) {
//        Void add(int index,E element)    在此集合中的指定位置插入指定的元素
//        E remove(int index)              删除指定索引处的元素，返回被删除的元素
//        E set（int index,E element)      修改指定索引处的元素，返回被修改的元素
//        E get(int index)                 返回指定索引处的元素

        //1.创建List对象,同样的List也是一个接口,需要用实现类对象来创建对象
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");//把aaa,bbb,ccc添加到集合中

        System.out.println(list);//[aaa, bbb, ccc]

        //2.在此集合的指定位置插入指定的元素-原来的索引的元素会依次向后移动
        list.add(1,"fff");
        System.out.println(list);//[aaa, fff, bbb, ccc]

        //3.删除指定索引处的元素，返回被删除的元素
        String str = list.remove(0);//删除0索引位置的元素aaa 会返回删除的元素aaa
        System.out.println(list);//[fff, bbb, ccc]

        //4.修改指定索引处的元素,返回被修改的元素
        String ret = list.set(0, "aaa");//把0索引处的fff改成aaa,返回被修改的元素-fff
        System.out.println(ret);//fff
        System.out.println(list);//[fff, bbb, ccc]修改成[aaa, bbb, ccc]

        //5.返回指定索引处的元素
        String str1 = list.get(0);//返回0索引上的aaa
        System.out.println(str1);//aaa
    }
}
