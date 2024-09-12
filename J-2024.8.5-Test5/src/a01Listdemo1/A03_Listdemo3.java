package a01Listdemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_Listdemo3{
    public static void main(String[] args) {
//        List系列集合的五种遍历方式：
//        1.迭代器
//        2.列表迭代器
//        3.强for
//        4.Lambda表达式
//        5.普通for循环

        //创建对象并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str1 = it.next();
            System.out.print(str1 + " ");//aaa bbb ccc
        }
        System.out.println();
        //2.增强for遍历
        //变量s其实只是一个第三方的变量
        //在循环的过程中,依次表示集合中的每一个元素
        for (String s : list) {
            System.out.print(s + " ");//aaa bbb ccc
        }
        System.out.println();
        //3.Lambda表达式
        //forEach方法的底层其实就是一个循环遍历,依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s,依次表示集合中的每一个元素
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.print(s + " ");
//            }
//        });
        list.forEach( s-> System.out.print(s + " "));
        System.out.println();

        //4.普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.print(str + " ");//aaa bbb ccc
        }
        System.out.println();

        //5.列表迭代器
//        ListIterator<String> it1 = list.listIterator();
//        while(it1.hasNext()){
//            String ret = it1.next();
//            System.out.print(ret + " ");//aaa bbb ccc
//        }
        //在列表迭代器中添加额外添加了一个方法在遍历的过程中可以添加元素
        ListIterator<String> it1 = list.listIterator();
        while(it1.hasNext()){
            String ret = it1.next();
            if("bbb".equals(ret)){//当指针指向集合中的bbb元素时
                it1.add("fff");//把fff添加到集合里
            }
            System.out.print(ret + " ");//aaa bbb ccc
        }
    }
}
