package a01泛型demo1;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");//把元素添加到集合里
        System.out.println(list);//[aaa, bbb, ccc, null, null, null, null, null, null, null]

        //自动装箱:idea编译时自动把基本数据类型转变成包装类
        //自动拆箱:idea编译时自动把包装类转变成基本数据类型

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(123);
        list1.add(456);
        list1.add(789);
        int i = list1.get(0);//自动装箱-把123转变成基本数据类型int
        System.out.println(i);//123
    }
}
