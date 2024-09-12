public class Test2 {
    public static void main(String[] args) {
//        自己实现parselnt方法的效果，将字符串形式的数据转成整数。
//        要求：
//        字符串中只能是数字不能有其他字符
//        最少一位，最多10位
//        0不能开头-梁某版
        String str = "123456789";
        int num = 0;
        if(Replace(str)){//函数返回true进入if语句将字符串转换成整型
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);//得到字符串的每个数字
                num += (c - '0') * Math.pow(10,(str.length() - i - 1));//将字符转成数字
            }
        }
        System.out.println(num);
    }

    private static boolean Replace(String str) {
        int leng = str.length();
        if(leng < 1 || leng > 10){
            return false;
        }
        if(str.startsWith("0")){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//获取字符串中的每一个字符
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
