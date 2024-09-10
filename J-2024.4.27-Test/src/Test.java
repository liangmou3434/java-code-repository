import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-27
 * Time: 23:03
 */
public class Test {
    //数组名是数组首元素的地址
    //在java中可以返回数组
    public static int[] func3(){//返回类型为数组
        int[] tmp = {1,2,3,4};
        return tmp;
    }
    public static void main(String[] args) {
        int[] ret = func3();//把tmp数组在栈上的地址返回给ret->ret接受数组
        System.out.println(Arrays.toString(ret));//打印数组
    }
}
