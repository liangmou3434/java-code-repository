public class Test {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用方法前: "+number);
        Change(number);//Change方法用完后出栈继续执行下一行代码
        System.out.println("调用方法后: "+number);//number的值依然是100 被修改的是Change方法内部的值
    }
    public static void Change(int number){
        number = 200;//只改变了方法内的number//
    }

    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("调用方法前: "+arr[1]);
        Change(arr);
        System.out.println("调用方法后: "+arr[1]);
    }
    public static void Change(int[] array){//传参传的是数组指向的地址 修改了数组原本的元素 原数组也会随之改变
        array[1] = 100;
    }
}
