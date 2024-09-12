public class Test1 {
    public static void main(String[] args) {
        //public boolean mathches(String regex):判断是都与正则表达式匹配,匹配返回true
        //返回的结果为boolean类型
        //字符类

        // [abc]只能是a,b或c
        System.out.println("----------1-----------");
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false
//        System.out.println("ab".matches("[abc]"));//false-( a b c 中只能有一个)
        System.out.println("ab".matches("[abc][abc]"));//true

        //[^abc] 不能出现a b c
        System.out.println("----------2-----------");
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true
        System.out.println("zz".matches("[^abc]"));//false-只能出现一个除了a b c之外的字符
        System.out.println("zz".matches("[^abc][^abc]"));//true

        //[a-zA-Z]a到z A到Z(包括头尾的范围)
        System.out.println("----------3-----------");
        System.out.println("a".matches("[a-zA-Z]"));//true
        System.out.println("z".matches("[a-zA-Z]"));//true
        System.out.println("aa".matches("[a-zA-Z]"));//false-(只能有一个a到z或者A到Z范围的字符)
        System.out.println("aa".matches("[a-zA-Z][a-zA-Z]"));//true
        System.out.println("0".matches("[a-zA-Z]"));//false

        //[a-d[m-p]] a到d或者m到p(包括头尾的范围)
        System.out.println("----------4-----------");
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("d".matches("[a-d[m-p]]"));//true
        System.out.println("m".matches("[a-d[m-p]]"));//true
        System.out.println("p".matches("[a-d[m-p]]"));//true
        System.out.println("e".matches("[a-d[m-p]]"));//false
        System.out.println("0".matches("[a-d[m-p]]"));//false

        //[a-z&&[def]] a-z和def的交集为def
        //如果要求两个范围的交集,则需要写&&
        //如果写一个&,此时表示的不是交集,仅仅是一个符号
        System.out.println("----------5-----------");
        System.out.println("a".matches("[a-z&[def]]"));//true
        //[a-z&[def]]:正则表达式的意思为"a"字符是否在a到z的范围内,是否为&符号,是否在def中,如果是返回true
        System.out.println("&".matches("[a-z&[def]]"));//true
        System.out.println("&".matches("[a-z&&[def]]"));//false
        System.out.println("d".matches("[a-z&&[def]]"));//true
        System.out.println("0".matches("[a-z&&[def]]"));//false

        //[a-z&&[^bc]] a-z和非bc的交集等同于[ad-z]a和d到z的范围,没有bc
        System.out.println("----------6-----------");
        System.out.println("a".matches("[a-z&&[^bc]]"));//true
        System.out.println("b".matches("[a-z&&[^bc]]"));//false
        System.out.println("0".matches("[a-z&&[^bc]]"));//false

        //[a-z&&[^m-p]] a到z除了m到p的交集 等同于[a-lq-z]
        System.out.println("----------7-----------");
        System.out.println("a".matches("[a-z&&[^m-p]]"));//true
        System.out.println("m".matches("[a-z&&[^m-p]]"));//false
        System.out.println("0".matches("[a-z&&[^m-p]]"));//fasle

    }

}
