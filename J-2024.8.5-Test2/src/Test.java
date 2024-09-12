import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
//        定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
//        要求：
//        按照字符串的长度进行排序，短的在前面，长的在后面。
//        (暂时不比较字符串里面的内容)

        //lambda的省略规则：
        //1.参数类型可以省略不写。
        //2.如果只有一个参数，参数类型可以省略，同时()也可以省略。
        //3.如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略。
        String[] arr = {"liangmou","123","guangzhou","limou3434"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());//用省略规则1 3

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  //123 liangmou guangzhou limou3434
        }

    }
}
