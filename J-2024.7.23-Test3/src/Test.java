import java.util.jar.JarOutputStream;

public class Test {
    public static void main(String[] args) {
//        public static void exit(int status)-终止当前运行的 Java 虚拟机
        //0:表示当前虚拟机是正常停止
        //非0:表示当前虚拟机是异常停止
//        System.exit(0);


//        public static long currentTimeMillis()-返回当前系统的时间毫秒值形式
        //从c语言的生日1970年1月1日到执行代码的时间一共过了多少毫秒,返回数据为long类型
        //用于判断程序执行完毕用了多少时间
//        long l = System.currentTimeMillis();
//        System.out.println(l);

//        public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)-数组拷贝
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[10];
        //把arr数组拷贝到arr1中
//     System.arraycopy(arr,0,arr1,0,10);
        //数据源数组-要拷贝的数组
        //起始索引:要拷贝的数组从哪个索引开始
        //目的地数组:要把数组拷贝到哪个数组上
        //起始索引:目的地数组的索引
        //拷贝个数:要拷贝的元素有多少个

        //检验拷贝是否成功
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }

        //课堂练习:将arr1数组元素换成:0 0 0 0 1 2 3 0 0 0
        System.arraycopy(arr,0,arr1,4,3);
        //检验是否拷贝成功
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
