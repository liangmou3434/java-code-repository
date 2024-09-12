public class Test3 {
    public static void main(String[] args) {
//        需求：
//            将字符串：我要学学编编编编程程程程程程
//            替换为：我要学编程

        String s = "我要学学编编编编程程程程程程";
        String result = s.replaceAll("(.)\\1+","$1");//把赘余的内容替换成第一组的内容
        System.out.println(result);
    }
}
