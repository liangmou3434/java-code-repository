package a01HashSetdedemo1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test2 {
    public static void main(String[] args) {
        //1.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //创建集合来添加学生但是要做到数据的去重
        //添加成功返回true 添加失败返回false
        LinkedHashSet<Student> hs = new LinkedHashSet<>();
        System.out.println(hs.add(s1));//true
        System.out.println(hs.add(s2));//true
        System.out.println(hs.add(s3));//true
        System.out.println(hs.add(s4));//false

        System.out.println(hs);//按照添加的顺序打印,LinkedHashSet是有序的
        //[Student{name = zhangsan, age = 23}, Student{name = lisi, age = 24}, Student{name = wangwu, age = 25}]

    }
}
