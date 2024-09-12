package a01Collectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A04_Collection {
    public static void main(String[] args) {
        //Lambda表达式遍历集合
        //lambda表达式遍历： default void forEach(Consumer<? super T>action):

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("liangmou");
        coll.add("3434");
        coll.add("guangzhou");

        //2.用匿名内部类的形式遍历集合
        //底层原理:其实也会自己遍历集合,依次得到每一个元素
        //把得到的每一个元素,传递给下面的accept方法
        //s一次表示集合中的每一个数据
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.print(s + " ");//liangmou  3434  guangzhou
//            }
//        });

        //Lambda表达式进一步省略的规则
        //1)参数类型可以省略不写
        //2)如果只有一个参数,参数类型可以省略,同时()也可以省略
        //3)如果Lambda表达式的方法体只有一行,大括号,分号,return可以省略不写,需要同时省略

        //用lambda表达式遍历集合
        coll.forEach(s -> System.out.print(s + " "));//liangmou  3434  guangzhou
    }
}
