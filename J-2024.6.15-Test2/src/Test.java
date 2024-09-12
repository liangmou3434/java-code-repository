public class Test {
    public static void main(String[] args) {//给定两个字符串AB 字符串A在一定的旋转调整后得到B
        String A = "abcde";//旋转调整为:字符串的第一个字符依次被放到最右边
        //abcde 变成 bcdea
        String B = "cdeab";
         boolean result = check(A,B);
    }

    public static boolean check(String A,String B){
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            boolean result = A.equals(B);
            if(result == true){
                System.out.println("旋转" + (i+1) +"次后A与B相同");
                return true;
            }
        }
        return false;
    }
    public static String rotate(String str){//旋转字符串
    //1截取 subString进行截取 把最左边的字符拼接到到右边去
        //2 把字符串变成字符数组
        char end = str.charAt(0);//获取到最左侧的字符
        String first = str.substring(1);
        return first + end;
    }
}
