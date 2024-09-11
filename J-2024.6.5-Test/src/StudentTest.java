import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建数组储存三个学生对象
        Student[] arr = new Student[3];
        Student s1 = new Student(1, "小乔", 19);
        Student s2 = new Student(2, "大乔", 20);
        Student s3 = new Student(3, "鲁班", 20);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;//把创建的学生对象放进数组里
        //再次添加一个学生对象并对学号的唯一性进行判断
        //唯一性 数组里面学号已经存在 不用添加
        
        Student s4 = new Student(4, "鲁班", 20);
        boolean flag = Contains(arr, s4.getId());
        if (flag){//数组里面没有这个学号-把新的学生对象添加进去
            //把新的学生对象添加到数组时需要判断数组是否已满
            //数组存满 --创建新的数组
            //数组未满-- 直接存进数组里
            int ret = GetCount(arr);//接收数组有几个元素的结果
            if(ret == arr.length){
                Student[] arr1 = new Student[arr.length + 1];//数组已满--创建一个新的数组来接收
                //把所有元素先放进新的数组里
                for (int i = 0; i < arr.length; i++) {
                    arr1[i] = arr[i];
                }
                //再把新的学生对象放进数组里
                arr1[ret] = s4;
                Showinfo(arr1);//添加完毕后遍历学生的信息
            }else{//数组未满 直接将新的学生对象存进数组里
                //已经知道数组内数组内有多少的元素 直接把新的元素放到元素个数的下标下
                arr[ret] = s4;
                Showinfo(arr);//添加完毕后遍历学生的信息
            }
        }else{
            System.out.println("当前id重复，请修改id后再进行添加");
        }

}
    public static void Showinfo(Student[] arr){//遍历学生的信息
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];//获取到数组的每个元素
            System.out.println("学生id是："+stu.getId()+" 学生的姓名是："
                    +stu.getName()+" 学生的年龄是："+stu.getAge());
        }
    }
    public static boolean Contains(Student[] arr,int id){//判断学号的唯一性
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];//依次获取到数组里的每个学生对象
            if (stu != null) {
                int stuid = stu.getId();//把学生对象的id赋给stuid
                if (id == stuid) {
                    return false;
                }
            }
        }
        return true;//for循环结束后数组内没有学号和新的学生对象的学号相同
    }
    
    public static int GetCount(Student[] arr){//用于判断数组内有几个元素
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){//数组内元素为非空 已经有元素
                count++;
            }
        }
      return count;
    }
}
