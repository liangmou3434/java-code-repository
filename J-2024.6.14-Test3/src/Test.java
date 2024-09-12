public class Test {
    public static void main(String[] args) {//对StringBuilder类型的一些使用方法
        StringBuilder sb = new StringBuilder();//空参构造
        StringBuilder sb1 = new StringBuilder("abc");//有参构造
        sb1.append(10);//append(可添加任意类型)--相当于拼接在abc后面
        System.out.println(sb1);//打印结果为abc10

        StringBuilder sb2 = new StringBuilder("abc");
        sb2.reverse();//对sb2的内容进行反转
        System.out.println(sb2);//结果为cba

        StringBuilder sb3 = new StringBuilder("abc");
        int length = sb3.length();//计算sb3的长度
        System.out.println(length);//结果为3

        StringBuilder sb4 = new StringBuilder("abc");
        String SB = sb4.toString();//将StringBuilder类型转为字符串类型
        System.out.println(SB);//结果为abc
    }
}

