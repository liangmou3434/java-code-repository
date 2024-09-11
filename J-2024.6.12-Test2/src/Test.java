import java.util.Scanner;

public class Test {
    public static void main(String[] args) {//键盘输入字符串 并统计大写字母和小写字母和数字共有多少个
        Scanner sc = new Scanner(System.in);
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        System.out.println("请输入一个字符串： ");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c<='z'){
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c >= '0' && c <= '9'){
                numberCount++;
            }
        }
        System.out.println("这组字符串的大写字母有"+bigCount+"个");
        System.out.println("这组字符串的小写字母有"+smallCount+"个");
        System.out.println("这组字符串的数字有"+numberCount+"个");
    }
}
