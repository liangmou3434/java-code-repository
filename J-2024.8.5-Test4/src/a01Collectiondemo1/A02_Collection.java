package a01Collectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A02_Collection {
    public static void main(String[] args) {
//        Collection系列集合三种通用的遍历方式：
//        1.迭代器遍历
//        2.增强for遍历
//        3.Lambda表达式遍历

        //选代器遍历相关的三个方法：
        //Iterator<E>iterator() 获取一个迭代器对象
        //boolean hasNext()     判断当前指向的位置是否有元素
        //E next()              获取当前指向的元素并移动指针

        //迭代器遍历在迭代中只能删除元素,不能添加元素

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //2.获取迭代器对象
        Iterator<String> it = coll.iterator();
        //3.使用循环
        while(it.hasNext()){//此处迭代器对象.hasnext()为指针 指向集合的首元素-判断集合中是否有元素
            String str = it.next();//next()反复噶的作用 获取元素并移动指针
            System.out.print(str + " ");//aaa bbb ccc
        }
        //迭代器遍历完毕,指针不会复位
        //循环中只能使用一次next方法
        //迭代器遍历时,不能用集合的方法进行增加或者删除
    }
}
