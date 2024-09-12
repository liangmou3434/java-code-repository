public class Test {
    public static void main(String[] args) {
        //public String replaceAll(String regex,String newStr)按照正则表达式的规则进行替换
        //public String[] split(String regex):按照正则表达式的规则切割字符串

//        有一段字符串：小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
//        要求1：把字符串中三个姓名之间的字母替换为vs
//        要求2：把字符串中的三个姓名切割出来

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String result1 = s.replaceAll("[\\w&&[^_]]+","vs");
        System.out.println(result1);//小诗诗vs小丹丹vs小惠惠

//        String s1 = "小诗诗a小丹丹a小惠惠";
//        String[] result2 = s1.split("a");//按照字符串内容进行切割
        String[] result3 = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]+" ");
        }

    }
}
