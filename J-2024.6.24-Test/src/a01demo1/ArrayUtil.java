package a01demo1;

public class ArrayUtil {//此类为工具类-工具类帮助我们做一些事情 不描述对象
    //类名--需要见名只意
    //私有化构造方法-无法创建对象
    //方法定义为静态的-方便其他类调用

    private ArrayUtil(){
    }
    //提供一个工具类方法printArr 用于返回整型数组内容字符串类型 (只考虑一维数组,只考虑整型数组)如[1,2,3]
    //提供一个getAerage方法 用于返回平均分,只考虑浮点型数组,只考虑一维数组
    public static String printArr(int[] arr){
    StringBuilder sb = new StringBuilder();//创建一个StringBuilder类来放置数组
    sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i] + "]");
            }else{
                sb.append(arr[i] + ",");
            }
        }
     return sb.toString();
    }
    public static double getAerage(double[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
      return sum / arr.length;
    }
}

