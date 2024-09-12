package a01泛型通配符demo1;

import javax.swing.plaf.FileChooserUI;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
         ArrayList<Ye> list1 = new ArrayList<>();
         ArrayList<Fu> list2 = new ArrayList<>();
         ArrayList<Zi> list3 = new ArrayList<>();

         //泛型不具备继承性
         method(list1);
//         method(list2);//报错
//         method(list3);//报错 - 泛型不具备继承性,method方法中形参中的类型是Ye Ye的子类也不可以作为实参传递过去

       //数据具备继承性
       list1.add(new Ye());
       list1.add(new Fu());
       list1.add(new Zi());//可以往集合里面添加Ye的子类对象-数据具有继承性

    }
   //泛型里面传的是什么类型,就只能传递什么类型,类型的子类也不可以
    public static void method(ArrayList<Ye> list){
    }
}

class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}