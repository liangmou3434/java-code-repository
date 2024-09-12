public interface Inter1 {
    public default void show(){
        System.out.println("接口1");
    }
    public default void method(){
        System.out.println("接口1和接口2的重名方法");
    }

    public static void method1(){
        System.out.println("接口1中的静态方法");
    }
}
