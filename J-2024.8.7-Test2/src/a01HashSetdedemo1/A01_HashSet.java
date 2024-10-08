package a01HashSetdedemo1;

public class A01_HashSet {
    public static void main(String[] args) {
//        哈希值：对象的整数表现形式
//        1.如果没有重写hashcode方法，计算出的哈希值是不同的
//        2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
//        3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）
        //1.创建对象
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("zhangsan",18);

        //2.没有重写hashCode方法-计算出的哈希值是不同的
        System.out.println(s1.hashCode());//990368553
        System.out.println(s2.hashCode());//1096979270

        //3.重写了hashCode方法-不同的对象属性值相同计算出的哈希值就是一样的
        System.out.println(s1.hashCode());//-1461067297
        System.out.println(s2.hashCode());//-1461067297
    }
}
