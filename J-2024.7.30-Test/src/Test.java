import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
//        需求1：爬取版本号为8，11，17的Java文本，但是只要Java，不显示版本号。
//        需求2：爬取版本号为8，11，17的Java文本。正确爬取结果为：Java8Java11Java17Java17
//        需求3：爬取除了版本号为8，11，17的Java文本

       String s ="Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11" +
             "因为这两个是长期支持版本,下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        //需求1:
        String regex1 = "((?i)Java)(?=8|11|17)";
        //?理解为前面的数据 java
        //=表示在java后面跟随的数据
        //在获取的时候,只获取前半部分(java)

        //需求2:
        String regex2 = "((?i)Java)(8|11|17)";
        //或
        String regex3 = "((?i)Java)(?:8|11|17)";

        //需求3:
        String regex4 = "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(s);
        while(m.find()){
//            String ret = m.group();
//            System.out.println(ret);
            System.out.println(m.group());
        }
    }
}
