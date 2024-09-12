public class Test2 {
    //        protected object clone(int a)           对象克隆
    public static void main(String[] args) throws CloneNotSupportedException {
        //重写Object类中的clone方法
        //让javabean类实现Cloneable接口
//        创建对象并调用clone
        Student s = new Student("张三",19);
        Student s1 = new Student();

        //创建Object类对象
        Object obj = s.clone();
        s1 = (Student)s.clone();//实际s.clone是Object引用数据类型,要强转成Student类

        System.out.println(s.getName() + "," + s.getAge());
        System.out.println(s1.getName() + "," + s1.getAge());
    }
}
