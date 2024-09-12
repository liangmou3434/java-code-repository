import java.util.StringJoiner;

public class Test {//StringJoiner类型
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");//括号内为间隔符号
        sj.add("abc").add("efg");//add(添加内容)
        System.out.println(sj);//打印结果为abc,def

        StringJoiner sj1 = new StringJoiner(",","[","]");//括号内容顺序为-间隔符号,开头符号,结尾符号
        sj1.add("aaa").add("bbb").add("ccc");
        System.out.println(sj1);//打印结果为[aaa,bbb,ccc]
        int leng = sj1.length();//计算sj1的字符串长度 包括间隔符号开头和结尾符号

        StringJoiner sj2 = new StringJoiner(",","(",")");//括号内容顺序为-间隔符号,开头符号,结尾符号
        sj2.add("123").add("456").add("789");
        String str =  sj2.toString();//将sj2从StringJoiner类型转成字符创
        System.out.println(str);//打印结果为(123,456,789)
    }
}
