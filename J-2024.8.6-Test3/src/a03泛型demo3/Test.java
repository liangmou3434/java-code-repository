package a03泛型demo3;

public class Test {
    public static void main(String[] args) {
//        泛型接口的两种使用方式：
//        1.实现类给出具体的类型
//        2.实现类延续泛型，创建实现类对象时再确定类型

        //实现类给出具体类型后创建对象就不需要确定类型了
        MyArrayList2 list = new MyArrayList2();
        list.add("abc");//add方法通过实现类确定的数据类型String来添加指定的数据类型-String

        //实现类延续泛型,创建实现类对象的时候要确定数据类型
        MyArrayLisst3<String> list1 = new MyArrayLisst3<>();
        list1.add("bcd");//add通过创建对象时确定的数据类型String来指定添加的数据类型-String
    }
}
