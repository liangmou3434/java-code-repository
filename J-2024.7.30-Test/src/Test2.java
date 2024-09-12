import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        //贪婪爬取:在爬取数据的时候尽可能多获取数据
        //非贪婪爬取:在爬取数据的时候尽量少爬取数据

//        ab+:
        //贪婪爬取 :abbbbbbbbbbbb
        //非贪婪爬取:ab
        //在java中默认的就是贪婪爬取
        //在数量词(获取一次或多次)后加上? 就是非贪婪爬取

        String s = "abbbbbbbbbbbaaaaaaaaaaaaaaaaaa";
//        String regex1 = "ab+";//abbbbbbbbbbb
          String regex2 = "ab+?";//ab
        Pattern p = Pattern.compile(regex2);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }

    }
}
