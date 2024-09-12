import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
//        public static Runtime getRuntime            当前系统的运行环境对象
//        public void exit(int status)                停止虚拟机
//        public int availableProcessors()            获得CPU的线程数 4或者8
//        public long maxMemory()                     JVM能从系统中获取总内存大小（单位byte）
//        public long totalMemory()                   JVM己经从系统中获取总内存大小（单位byte）
//        public long freeMemory()
//        JVM剩余内存大小（单位byte）public Process exec(String command) 运行cmd命令

//      用Runtime的对象来调取Runtime里面的方法
        //1.获取Runtime对象
//        Runtime r = Runtime.getRuntime();

        //2.exit 停止虚拟机
        //0:正常停止虚拟机
        //非0:虚拟机异常停止
//       Runtime.getRuntime().exit(0);

       //3.获取CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//16

        //4.总内存大小,单位为字节byte
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);//两次除1024得到以兆为单位的内存大小-4028

        //5.已经获取的总内存大小,单位为字节byte
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);//以兆为单位的获取的总内存的大小-252

        //6.剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);//以兆为单位剩余的内存大小-249

        //7.执行cmd命令
        //shutdown：关机
        //加上参数才能执行
        //shutdown-s：默认在1分钟之后关机
        //shutdown-s-t指定时间：指定关机时间
        //shutdown-a：取消关机操作
        //shutdown-r:关机并重启
//        Runtime.getRuntime().exec("notepad");//notepad为记事本-可以执行该行代码打开记事本
          Runtime.getRuntime().exec("shutdown - a");
    }
}
