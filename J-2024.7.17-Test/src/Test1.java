public class Test1 {
    public static void main(String[] args) {
        Test t = new Test();
        Inter1.method1();//1)静态方法只能通过接口名调用,不能通过实现类或对象名调用
    }
}
