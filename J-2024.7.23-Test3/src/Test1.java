public class Test1 {
    public static void main(String[] args) {
        //如果数据源数组和目的地数组都是基本数据类型,那么两者的类型必须保持一致,数据源数组和目的地数组都是一样的基本数据类型
        //数据源数组和目的地数组的长度必须一致
        //如果数据源数组和目的地数组都是引用数据类型,那么子类型可赋值给父类型
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",20);
        Student s3 = new Student("wangwu",23);
//        Student[] arr1 = {s1,s2,s3};
//        Student[] arr2 = new Student[3];
//        System.arraycopy(arr1,0,arr2,0,3);
//        for (int i = 0; i < arr1.length; i++) {
//            Student stu = arr1[i];
//            System.out.println(stu.getName() + "," + stu.getAge());
//        }

        //将子类赋值给父类类型
        Student[] arr1 = {s1,s2,s3};
        Person[] arr2 = new Person[3];
        System.arraycopy(arr1,0,arr2,0,3);
        for (int i = 0; i < arr1.length; i++) {
            Person p = arr1[i];
            System.out.println(p.getName() + "," + p.getAge());
        }
    }
}
