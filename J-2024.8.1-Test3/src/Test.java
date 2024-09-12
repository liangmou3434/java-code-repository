import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        //10 - 1010
        //除基取余法 例十进制数字6 6/2=3余0 3/2=1余1 1/2=0余1
        //将余数倒过来排序则为6的二进制数字 110 此处需要反转容器的内容,可以用StringBuilder类
       StringBuilder sb = new StringBuilder();
        int ret = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        int num = sc.nextInt();
        while(num != 0){
            ret = num % 2;//把余数赋值给ret
            sb.append(ret);//再把ret添加到容器里
            num /= 2;
        }
        //while循环结束后,整数取余结束,再把容器内的内容进行反转 再转换成字符串并打印
        System.out.println(sb.reverse().toString());//
    }
}
