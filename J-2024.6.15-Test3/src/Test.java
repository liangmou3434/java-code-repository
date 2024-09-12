import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {//键盘输入一个字符串 字符串的长度为5 且只有一个数字四个字母 数字可以是任何位置
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.next();
        if(str.length() > 5){
            System.out.println("你输入的字符串长度超过5");
        }else{
            boolean result = Count(str);
            System.out.println(result);
        }
    }
    public static boolean Count(String str){//统计字符串内有多少个数字和字母
        int lettersNumber = 0;
        int figureNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                lettersNumber++;
            }else if(c >= '0' && c <= '9'){
                figureNumber++;
            }
        }
          if(lettersNumber == 4 && figureNumber == 1){
              return true;
          }
          return false;
    }
}
