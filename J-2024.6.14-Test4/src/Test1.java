public class Test1 {
    public static void main(String[] args) {//调用方法输出结果为[1,2,3]
        int[] arr = {1,2,3};
        Change(arr);
    }
    public static void Change(int[] arr){
        String ret = "";
        StringBuilder sb = new StringBuilder();//创建一个空的StringBuilder类
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
              ret = sb.append(arr[i] + "]").toString();
            }else{
              sb.append(arr[i] + ",");
            }
        }
        System.out.println(ret);
    }
}
