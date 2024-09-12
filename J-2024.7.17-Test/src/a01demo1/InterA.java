package a01demo1;

public interface InterA {
//    public default void show1(){
//        System.out.println("show1方法开始执行");
    //     show3();
////        System.out.println("执行细节");
//    }
//
//    public default void show2(){
//        System.out.println("show2方法开始执行");
//            show3();
////        System.out.println("执行细节");
//    }
//
//    private void show3(){//方法放两个默认方法中重复的代码,并将方法私有
//        System.out.println("执行细节");
//    }

    public static  void show1(){
        System.out.println("show1方法开始执行");
        show3();
//        System.out.println("执行细节");
    }

    public static void show2(){
        System.out.println("show2方法开始执行");
        show3();
//        System.out.println("执行细节");
    }

    private static void show3(){//方法放两个静态方法中重复的代码,并将方法私有
        System.out.println("执行细节");//两种类型的私有方法都不加default关键字
    }
}
