public class Test {//找质数 素数 只能被1和它本身整除 找101~200之间的质数

    //若是素数 则跳过,若是质数则打印
    public static void main(String[] args) {
        for (int i = 100; i < 200; i++) {
            int n = 1;
             for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    n = 0;//将n修改 并结束内循环
                    break;
                }
             }
          if(n == 1){//结束内循环后 n仍然等于1 没有进入内循环被整除
              System.out.println(i);//打印该没有被整除的数字
          }
        }
    }
}
