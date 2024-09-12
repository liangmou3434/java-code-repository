public class Test {
    public static void main(String[] args) {
//        需求：假如现在要求校验一个qq号码是否正确。
//        规则：6位及20位之内，0不能在开头，必须全部是数字
        String qq = "123456789";
//        boolean result = CheckQq(qq);
//        System.out.println(result);

        boolean ret = qq.matches("[1-9]\\d{5,19}");//正则表达式
        System.out.println(ret);//true
    }
//    public static boolean CheckQq(String qq){//检验qq是否合理
//        //用反逻辑检验
//        int leng = qq.length();
//        if(leng < 6 || leng > 20){
//            return false;
//        }
//        if(qq.startsWith("0")){//检验字符串是否以0开头 如果是则返回false
//            return false;
//        }
//        for (int i = 0; i < qq.length(); i++) {
//            char c = qq.charAt(i);//获取字符串的每一个字符
//            if(c < '0' || c > '9'){
//                return false;
//            }
//        }
//        return true;
//    }
}
