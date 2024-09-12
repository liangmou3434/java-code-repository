

public class Test {
    public static void main(String[] args) {
        //正则表达式练习
        //验证手机号码 13112345678  13712345667 13945679027 139456790271
        //验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
        //验证邮箱号码 3232323@qq.com  zhangsan@itcast.cnn  dlei0009@163.com  dlei0009@pci.com.cn

        //用一个正确的数据举例,从左往右衣服去写
        //13112345678
        String regex1 = "1[3-9]\\d{9}";
        //第一部分:1 表示手机号码只能以1开头
        //第二部分:[3-9]手机号码的第二个数据只能从3~9之间选择
        //第三部分:\\d{9} 任意数字可以出现9次

        System.out.println("13112345678".matches(regex1));//true
        System.out.println("13712345667".matches(regex1));//true
        System.out.println("13945679027".matches(regex1));//true
        System.out.println("139456790271".matches(regex1));//false
        System.out.println("-------------------");

        //座机号码 020-2324242 02122442 027-42424 0712-3242434
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        //第一部分:区号以0开头,0后面是两到三位任意数字
        //第二部分,-有可能出现有可能不出现 ?表示出现一次或0次
        //第三部分,后面的号码不能以0开头[1-9]任意数字
        //第四部分:后面的号码除第一位之外其他为任意数字,人为规定成长度为5~10位
        System.out.println("020-2324242".matches(regex2));//true
        System.out.println("02122442".matches(regex2));//true
        System.out.println("027-42424".matches(regex2));//true
        System.out.println("0712-3242434".matches(regex2));//true
        System.out.println("-------------------");

        //邮箱号码 3232323@qq.com  zhangsan@itcast.cnn  dlei0009@163.com1  dlei0009@pci.com.cn
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
       //第一部分: @的左边 \\w+至少出现一次
        // 能出现数字,和字符还有下划线,至少出现一次就够了

        //第二部分:@的右边的第一个 .之前 能出现数字和字符但不能出现下划线至少2次最多六次
        //(.之后出现字母两到三次)这部分出现1-2次
        System.out.println("3232323@qq.com".matches(regex3));//true
        System.out.println("zhangsan@itcast.cnn".matches(regex3));//true
        System.out.println("dlei0009@163.com".matches(regex3));//true
        System.out.println("dlei0009@pci.com.cn".matches(regex3));//true
        System.out.println("-------------------");

        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
      //[01]\d|2[0-3])    |表示表达式满足[01]\d或2[0-3]就可以了
        System.out.println("23:11:11".matches(regex4));//true
        System.out.println("03:56:21".matches(regex4));//true
        System.out.println("-------------------");

        String regex5 = "([01]\\d|2[0-3]):[0-5]\\d:{2}";
        System.out.println("23:11:11".matches(regex4));//true
        System.out.println("03:56:21".matches(regex4));//true
    }
}
