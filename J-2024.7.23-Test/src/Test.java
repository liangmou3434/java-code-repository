public class Test {
    public static void main(String[] args) {
//        //1) abs(int a) 获取参数的绝对值
        System.out.println(Math.abs(12.34));//12.34
        System.out.println(Math.abs(12.54));//12.54
        System.out.println(Math.abs(-12.34));//12.34
        System.out.println(Math.abs(-12.54));//12.54
        System.out.println("------");
        //2)ceil(double a) 向上取整-向无穷大取整
        System.out.println(Math.ceil(12.34));//13
        System.out.println(Math.ceil(12.54));//13
        System.out.println(Math.ceil(-12.34));//-12
        System.out.println(Math.ceil(-12.54));//-12
        System.out.println("------");
        //3)floor(double a) 向下取整-向无穷小取整
        System.out.println(Math.floor(12.34));//12
        System.out.println(Math.floor(12.54));//12
        System.out.println(Math.floor(-12.34));//-13
        System.out.println(Math.floor(-12.54));//-13
        System.out.println("------");
        //4)round(float a) 四舍五入
        System.out.println(Math.round(12.34));//12
        System.out.println(Math.round(12.54));//13
        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13
        System.out.println("------");
        //5)//        max(int a,int b) 获取两个int值中的较大值
        System.out.println(Math.max(12.34,12.54));//12.54
        System.out.println("------");
        //6)min(int a,int b) 获取两个int值中的较小值
         System.out.println(Math.min(12.34,12.54));//12.34
        System.out.println("------");
        //7)pow(double a,double b) 返回a的b次幂的值
        System.out.println(Math.pow(2,3));//返回2的三次方-8.0
        System.out.println("------");
        //8)random() 返回值为double的随机值，范围[0.0,1.0)
        double ret = Math.random() * 100 + 1;
        //再对ret向下取整,向无穷小靠近
        ret = Math.floor(ret);
        System.out.println(ret);//生成的随机数包括0.0但不包括1.0

        //9)sqrt() 对一个数开平方
        System.out.println(Math.sqrt(4.0));//2.0
    }
}
