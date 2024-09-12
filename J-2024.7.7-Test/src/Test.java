public class Test {
    //final关键字-最终的 不可改变的
    //final修饰方法--表明该方法是最终方法,不能被重写
    //final修饰类--表明该类是最终类,不能被继承
    //final修饰变量--叫作常量,只能赋值一次

    //final修饰基本数据类型,储存的数据值不能改变
    //final修饰引用数据类型,引用数据类型地址值不能改变,对象内部可以改变
    public static void main(String[] args) {
        final int a = 10;
//        a = 20; //基本数据类型不能改变,会报错

        final Student s = new Student("张三",19);
        System.out.println(s.getName() + "," + s.getAge()) ;
        s.setName("李四");
        s.setAge(20);//更改引用数据类型的内部
        System.out.println(s.getName() + "," + s.getAge()) ;
//        s = new Student();//改变引用数据类型的地址值,会报错

        final int[] arr = {1,2,3,4,5};
        arr[0] = 6;
        arr[1] = 7;//更改引用数据类型的内部
//        arr = new int[5];//更改数据类型的地址值,会报错
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
