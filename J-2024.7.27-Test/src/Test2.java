public class Test2 {
    public static void main(String[] args) {
        //预定义字符

        //. 表示任意一个字符
        System.out.println("----------1-----------");
        System.out.println("你".matches(".."));//false 两个.表示两个任意的字符
        System.out.println("你".matches("."));//true
        System.out.println("你a".matches(".."));//true

        // \\d只能是任意的一位数字
        System.out.println("----------2-----------");
        System.out.println("a".matches("\\d"));//false
        System.out.println("3".matches("\\d"));//true
        System.out.println("333".matches("\\d"));//false-只能有任意的一位数字

        //\\w只能是一位单词字符[a-zA-Z_0-9] a到z A到Z 下划线_ 或者数字0-9
        System.out.println("----------3-----------");
        System.out.println("z".matches("\\w"));//true
        System.out.println("2".matches("\\w"));//true
        System.out.println("21".matches("\\w"));//false
        System.out.println("你".matches("\\w"));//false
        System.out.println("_".matches("\\w"));//true

        //\\D非单词字符
        System.out.println("----------4-----------");
        System.out.println("你".matches("\\D"));//true

//        //必须是数字 字母 下划线 至少6位
        System.out.println("2442fsfsf".matches("\\w{6,}"));//true
        System.out.println("244f".matches("\\w{6,}"));//false

        //必须是数字和字符 必须是4位
        System.out.println("23dF".matches("[a-zA-z0-9]{4}"));//true
        System.out.println("23_F".matches("[a-zA-z0-9]{4}"));//false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));//true
        //\\w只能是一位单词字符[a-zA-Z_0-9] a到z A到Z 下划线_ 或者数字0-9 且不能有下划线_
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));//false

    }
}
