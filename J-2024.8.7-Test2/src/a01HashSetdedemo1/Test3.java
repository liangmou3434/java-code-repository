package a01HashSetdedemo1;

import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args) {
        //需求：利用TreeSet存储整数并进行排序

        //1.创建TreeSet对象
        TreeSet<Integer> ts = new TreeSet<>();

        //2.添加元素
        ts.add(4);
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(5);

        System.out.println(ts);//[1, 2, 3, 4, 5]

        //创建学生对象
        TreeSet<Student> ts1 = new TreeSet<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",25);
        Student s3 = new Student("wangwu",24);

        //把学生对象添加到Tree集合内并进行排序
       ts1.add(s1);
       ts1.add(s2);
       ts1.add(s3);

        System.out.println(ts1);
        //[Student{name = zhangsan, age = 23}, Student{name = wangwu, age = 24}, Student{name = lisi, age = 25}]
    }
}
