package a01泛型通配符demo1;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

         method(list1);
         method(list2);
         method(list3);//method方法中可以传递Ye和Ye所有的子类类型作为实参

    }
    //弊端:把形参改成泛型后可以添加任意的数据类型
//    public static<E> void method(ArrayList<E> list){
//    }

        //? extends E: 表示可以传递E或者E所有的子类类型
        //? super E: 表示可以传递E或者E所有的父类类型
    public static void method(ArrayList<? extends Ye> list){//此时可以传递Ye和Ye所有的子类类型
    }
}
