package a01HashSetdedemo1;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
//重写hashCode方法 alt+insert 直接next到finish
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        //指定排序的规则,按照年龄的升序进行排列
        return this.getAge() - o.getAge();
        //this:表示要添加的元素
        //o:表示已经在红黑树存在的元素

        //返回值:
        //负数:认为要添加的元素是小的,存左边
        //正数:认为要添加的元素是大的,存右边
        //0:认为要添加的元素已经存在,舍弃
    }
}
