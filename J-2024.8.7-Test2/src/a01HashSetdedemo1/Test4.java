package a01HashSetdedemo1;

import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {
    public static void main(String[] args) {
//        需求：请自行选择比较器排序和自然排序两种方式；
//        要求：存入四个字符串，“c”"，“ab”，“df”，“gwer”
//        按照长度排序，如果一样长则按照首字母排序

        //1.创建集合
        //o1表示当前要添加的元素
        //o2表示已经在红黑树存在的元素
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
                //按照长度的升序顺序来排序
                int i = o1.length() - o2.length();
                //如果字符串的长度一样,则按照首字母顺序进行排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
        });

        //2.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("gwer");
        System.out.println(ts);//[c, ab, df, gwer]

//        System.out.println(ts);//按照c语言中strcmp函数的规则来进行升序排序
        //[ab, c, df, gwer]
    }

}
