public class Test {
    public static void main(String[] args) {
//        public String toString()               返回对象的字符串表示形式
//        public boolean equals（object obj)      比较两个对象是否相等
//        protected object clone(int a)           对象克隆

        //1.toString 返回对象字符串的表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//打印-java.lang.Object@4eec7777包名+类名+对象的地址值

        Student stu = new Student();
        String str2 = stu.toString();
        System.out.println(str2);//Student@41629346 z src包下类名+对象所在的地址值

        //打印语句 System.out.println();
        //println():方法,传递是需要打印的内容
        //核心逻辑:当我们打印一个对象时,底层会调用对象的toString方法,把对象变成字符串,然后打印在控制台上

        //默认情况下,因为Object类中的toString方法返回的是地址值
        //默认情况下,打印一个对象打印的就是地址值
        //想要看到对象内部的属性值,应该重写object类里的toString方法
        //在重写的方法中,把对象的属性进行拼凑
        System.out.println(stu);
    }
}
