public class Test3 {
    public static void main(String[] args) {
        //自己实现parselnt方法的效果，将字符串形式的数据转成整数。
//        要求：
//        字符串中只能是数字不能有其他字符
//        最少一位，最多10位
//        0不能开头-优化版
        String str = "123456789";
        int num = 0;
        //使用正则表达式
        if (str.matches("[1~9]\\d{1,9}")) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);//得到字符串的每个数字
                num += (c - '0') * Math.pow(10, (str.length() - i - 1));//将字符转成数字
            }
        } else {
            System.out.println("数据格式有误!");
        }
        System.out.println(num);
    }
}
