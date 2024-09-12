import java.util.Scanner;

public class Test {
    public static void main2(String[] args) {//键盘输入一个字符串 判断字符串是否对称
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);//先将字符串转成StringBuilder类型
        //普通程序写法
//        sb.reverse();//将sb的内容进行反转
//        String str1 = sb.toString();//再将sb变回成字符串
//        boolean ret = str.equals(str1);//再将反转前和反转后的字符串进行比较

         boolean ret = sb.reverse().toString().equals(str);//链式编程写法
        System.out.println(ret);
    }

    public static void main1(String[] args) {//键盘输入一个字符串 判断字符串是否对称-字符长度只能是偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.next();
        String str1 = str.substring(0,(str.length()/2));//取字符串的前半段
        String s = "";
        for (int i = (str.length()/2); i < str.length(); i++) {//获取后半段 并将后半段逆序排序
            char c = str.charAt(i);
            s = c + s;
        }
        boolean result = str1.equals(s);//将分成两段的字符串进行比较
        System.out.println(result);
    }
}
