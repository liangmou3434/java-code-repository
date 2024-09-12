public class Test1 {
    public static void main(String[] args) {//给定两个以字符串形式表e示的非负整数num1和num2 返回num1和num2的乘积
        //返回的乘积也以字符串形式返回
      String num1 = "3";
      String num2 = "4";
//        System.out.println('0' - 0 - 48);//字符0转成数字0
       String str =  Division(num1,num2);
        System.out.println(str);
    }
    public static String Division(String num1,String num2){
       char c1 = num1.charAt(0);
       char c2 = num2.charAt(0);//将字符串转成字符得到每个字符
        int number1 = c1 - 0 - 48;
        int number2 = c2 - 0 - 48;//将字符转成数字
        int number3 = number1 * number2;
        String str = String.valueOf(number3);//将数字转成字符串返回
        return str;
    }

}
