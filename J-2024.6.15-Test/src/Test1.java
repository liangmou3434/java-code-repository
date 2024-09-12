import java.util.Scanner;

public class Test1 {//键盘录入一个字符串-字符串只能是数字 -字符串长度小于等于9
    //将阿拉伯数字变成罗马数字
    //如果输入的字符串有0 可以变成长度为0的字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.next();
        boolean result = checkStr(str);
        if(result == true){//输入的字符串满足两个要求 字符串只能是数字 字符串的长度小于等于9
        //先判断字符串中是否有零
            if(Checkzero(str) == ""){//字符串中有0
                System.out.println("");
            }else{//字符串中没有0
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    //将字符转成数字下标
//                    System.out.println('0'- 0 -48);将字符0转成数字0
                   String number = Changstr(c - 0 - 48);//将数字转成罗马数字
                    System.out.print(number);
                }
            }
        }
    }
    public static boolean checkStr(String str){
     if(str.length() > 9){
         System.out.println("输入的字符串长度大于9!");
         return false;
     }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c >'9'){//'0'~''9'--48-57
                System.out.println("输入的字符串数字不在0~9之间!");
                return false;
            }
        }
        return true;
    }
    public static String Checkzero(String str){//判断字符串中是否有零 如果有则返一个长度为0的字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '0'){
                return "";//长度为0的字符串
            }
        }
         return str;//没有0 返回原字符串
    }
    public static String Changstr(int number){//把传过来的数字转换成罗马数字
        String[] arr = {" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];
    }
}
