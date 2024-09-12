package a02Set系列demo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_Set {
    public static void main(String[] args) {
        //1.创建一个Set集合的对象,因为Set集合是一个接口不能直接创建对象,需要通过Set的实现类来创建对象
        Set<String> s = new HashSet<>();

        //2.添加元素
        boolean ret1 = s.add("zhangsan");//true
        boolean ret2 = s.add("zhangsan");//false-相同的数据不能重复添加
//        添加成功返回true,添加失败返回false
        s.add("lisi");
        s.add("wangwu");

        System.out.println(s);//[lisi, zhangsan, wangwu] - 存和取的顺序不一致

        //遍历方式: 迭代器,增强for Lambda表达式

        //1.迭代器遍历
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.print(str + " ");//lisi, zhangsan, wangwu
        }
        System.out.println();

        //2.增强for遍历
        for (String s1 : s) {
            System.out.print(s1 + " ");//lisi zhangsan wangwu
        }
        System.out.println();

        //3.Lambda表达式遍历
       s.forEach( s1 -> System.out.print(s + " "));//lisi zhangsan wangwu

    }
}
