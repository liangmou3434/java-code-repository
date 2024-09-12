import java.util.ArrayList;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
//        String str1 = "abc";
//        String str2 = "abc";
//        boolean result1 = str1.equals(str2);
//        System.out.println(result1);//true 判断两个字符串是否相等
//
//        String str3 = "abc";
//        String str4 = "Abc";
//        boolean result2 = str1.equalsIgnoreCase(str2);
//        System.out.println(result2);//ture equalsIgnoreCase方法会忽略两个字符串中的大小写
/*
        String str5 = "abc";
        int leng = str5.length();//计算字符串的长度
        System.out.println(leng);//3*/

//        String str6 = "abc";
//        char a = str6.charAt(0);//返回str6中索引为0的字符
//        System.out.println(a);//a

//        String str7 = "liangmou3434";
//        String s1 = str7.substring(0,5);//截取str7中索引为0到索引为4的字符-liang
//        System.out.println(s1);//liang

//        String str7 = "liangmou3434";
//        String s2 = str7.substring(5);//从索引为5的字符开始截取到最后
//        System.out.println(s2);//mou3434
//
//        String str8 = "abcd";
//        String s3 = str8.replace("a","e");//把a换成e
//        System.out.println(s3);//ebcd

//        StringBuilder sb1 = new StringBuilder();
//        sb1.append(1);//把1添加进sb1变量里
//        sb1.append("abc");//把abc添加进sb1变量里
//        System.out.println(sb1);//1abc

//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("abc");//把abc添加进容器里
//        sb2.reverse();//反转容器中所有的内容
//        System.out.println(sb2);//cba

//        StringBuilder sb3 = new StringBuilder();
//        sb3.append("abc");
//        int leng = sb3.length();//计算sb3的长度
//        System.out.println(leng);//

//        StringBuilder sb4 = new StringBuilder();
//        sb4.append("abc");
//        String s1 = sb4.toString();//将sb4变量转变成字符串类型
//        System.out.println(s1);//abc
//
//        StringJoiner sj1 = new StringJoiner(",");//用逗号间隔
//        sj1.add("aaa");//添加字符串变量
//        sj1.add("bbb");
//        sj1.add("ccc");
//        System.out.println(sj1);//aaa,bbb,ccc

//
//        StringJoiner sj2 = new StringJoiner(",","[","]");//逗号间隔,[为开始符号,]为结尾符号
//        sj2.add("aaa");//添加字符串变量
//        sj2.add("bbb");
//        sj2.add("ccc");
//        System.out.println(sj2);//[aaa,bbb,ccc]

//        StringJoiner sj3 = new StringJoiner(",");
//        sj3.add("abc");
//        sj3.add("efg");
//        int leng = sj3.length();//计算sj3变量的长度
//        System.out.println(leng);//sj3内的内容 "abc,efg"-长度为7

//        StringJoiner sj4 = new StringJoiner(",");
//        sj4.add("abc");
//        sj4.add("efg");
//        String s2 = sj4.toString();//把sj4从StringJoiner变量转变成String类型
//        System.out.println(sj4);//abc,efg

//        String str = "abc";
//        char[] arr = str.toCharArray();//把字符串变量str变成字符数组arr
//        String str1 = new String(arr);//把字符数组arr再转变成字符串

//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("abc");//把abc添加到list集合内
//        System.out.println(list1);//[abc]

//        ArrayList<String> list2 = new ArrayList<String>();
//        list2.add("abc");
//        list2.add("efg");
//        list2.remove(0); // 删除索引为0的元素"abc"
//        System.out.println(list2);//[efg]

//       ArrayList<String> list3 = new ArrayList<String>();
//        list3.add("aaa");
//        list3.add("ccc");
//        list3.set(1,"bbb");//将下标为1的元素"ccc"改为"bbb"
//        System.out.println(list3);//[aaa,bbb]

//        ArrayList<String> list4 = new ArrayList<String>();
//        list4.add("aaa");
//        list4.add("bbb");
//        String s3 = list4.get(0);//获取索引为0的元素
//        System.out.println(s3);//aaa

        ArrayList<String> list5 = new ArrayList<String>();
        list5.add("aaa");
        list5.add("bbb");
        int leng = list5.size();//计算集合的长度
        System.out.println(leng);//2

    }
}
