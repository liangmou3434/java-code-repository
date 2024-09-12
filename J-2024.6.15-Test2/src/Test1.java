public class Test1 {
    public static void main(String[] args) {//给定两个字符串AB 字符串A在一定的旋转调整后得到B
        String strA = "abcde";
        String strB = "cdeab";

    }
    public static boolean rotate(String strA,String strB){
        char[] arr = strA.toCharArray();//把字符串A变成字符数组
        for (int i = 1; i < arr.length; i++) {//把字符数组除了零索引之外的元素全部往前挪
            arr[i - 1] = arr[i];
        }
        //把零索引的字符放到最后
        arr[arr.length - 1] = arr[0];
        String str = new String(arr);//把字符串变回成字符数组
        boolean result = strA.equals(strB);
        if(result == true){
            return true;
        }
        return false;
    }
}
