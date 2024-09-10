import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liang
 * Date: 2024-04-23
 * Time: 20:27
 */
public class Test {
    public static void main(String[] args) {//打印数组内所有元素的方法
        int[] array = {1,2,3,4};
        int len = array.length;
        //方法1：使用常规的for循环
        for (int i = 0; i <len ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //方法2：使用foreach 冒号左边为数组类型和一个变量，冒号右边为数组名
        for (int x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
        //方法3：使用Array工具,Array工具会将数组转换给String类型 所以要用String类型接受
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4};
        array[1] = 99;//访问下标为1的元素--2 把2改为99
        int len = array.length;
        for (int i = 0; i <len ; i++) {//打印结果为 1 99 3 4
            System.out.print(array[i]+" ");
        }
    }
    public static void main2(String[] args) {
        //计算数组的长度
        int[] array = {1,2,3,4};
        int len = array.length;
        System.out.println(len);//打印结果为4 - 相当于计算数组内有多少个元素
    }
    public static void main1(String[] args) {
        //数组的静态初始化
        int[] array = {1,2,3,4};//最常用
        //数组的动态初始化
        int[] array1 = new int[]{1,2,3,4};
        //静态和动态初始化本质上没有区别
        int[] array2 = new int[10];//只是分配了内存，但没有赋值，只有默认值
        //定义了数组，但没有初始化，系统会设置一个默认值
        // byte--0  //short--0 //int--0
        //long--0   //float--0.0f  double--0.0
        //cha--/u000  boolean--false
    }
}
