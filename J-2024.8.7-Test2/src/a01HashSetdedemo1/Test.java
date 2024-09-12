package a01HashSetdedemo1;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
//        需求：创建一个存储学生对象的集合，存储多个学生对象。
//        使用程序实现在控制台遍历该集合。
//        要求：学生对象的成员变量值相同，我们就认为是同一个对象

        //1.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //创建集合来添加学生但是要做到数据的去重
        //添加成功返回true 添加失败返回false
        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));//true
        System.out.println(hs.add(s2));//true
        System.out.println(hs.add(s3));//true
        System.out.println(hs.add(s4));//false

        System.out.println(hs);
        //[Student{name = wangwu, age = 25}, Student{name = lisi, age = 24}, Student{name = zhangsan, age = 23}]
    }
}
