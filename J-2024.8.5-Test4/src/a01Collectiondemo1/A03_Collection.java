package a01Collectiondemo1;

import java.util.ArrayList;
import java.util.Collection;

public class A03_Collection {
    public static void main(String[] args) {
        //增强for遍历
        //增强的格式:
        //for(数据类型 变量名:数组/集合){
        //}

        //1.创建集合并添加对象
        Collection<String> coll = new ArrayList<>();
        coll.add("liangmou");
        coll.add("3434");
        coll.add("guangzhou");

        //2.用增强for遍历集合
        //s其实就是一个第三方的变量,在循环的过程中一次表示集合中的每一个数据
        for(String s : coll){
            System.out.print(s + "  ");//liangmou  3434  guangzhou
        }
        //快速生成 coll.for+回车
        //修改for增强中的s变量 集合中的变量不会改变
     }
}
