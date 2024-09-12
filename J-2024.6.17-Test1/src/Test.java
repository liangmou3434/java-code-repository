public class Test {//给一个字符串 字符串由多个单词组成,单词之间用空格间隔开
    //返回单词中最后一个字符串长度
    public static void main(String[] args) {
        String str = "liang mou 3434";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(str.length() - i - 1);//倒着遍历,遇到空格停止
         if(c == ' '){
             break;
         }
            count ++;
        }
        System.out.println(count);
    }
}
