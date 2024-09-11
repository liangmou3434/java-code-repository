import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        //通过id删除学生信息 如果存在则删除 如果不存在则提示输入错误
        //删除完毕后要遍历学生信息
        Student s1 = new Student(1,"大乔",19);
        Student s2 = new Student(2,"小乔",20);
        Student s3 = new Student(3,"鲁班",18);//创建三个学生对象
        Student[] arr = new Student[3];//创建一个学生对象数组
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;//把三个学生对象放进数组里
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要删除的学生id：");
        int id = sc.nextInt();//输入需要删除的学生的id
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(id == stu.getId()){//id存在
             arr[i] = null;//把该元素变成空指针
            }
        }
         boolean result = GetCount(arr);
        if(result == true){
            Showinfo(arr);//遍历学生的信息
        }else{//返回值是false 数组中没有空指针
            System.out.println("删除学生信息失败，输入了错误的id");
        }
        //查找某个id的学生 如果id的学生存在 则他的年龄+1 如果不存在 输出该id不存在
        System.out.print("输入你要查找的学生id： ");
      int id1 = sc.nextInt();//输入要查找的学生id
      boolean ret =  Find(arr,id1);
      if(ret != true){
          System.out.println("输入id错误，该id不存在");
      }
    }
     public static void Showinfo(Student[] arr){//遍历学生信息
         for (int i = 0; i < arr.length; i++) {
             Student stu = arr[i];
             if(stu != null) {//如果元素位置不为空指针，则打印他 如果为空指针则不打印
                 System.out.println("学生的id是：" + stu.getId() + " 学生的姓名是：" + stu.getName() + " 学生的年龄是：" +
                         stu.getAge());
             }
         }
     }
     public static boolean GetCount(Student[] arr){//判断数组中是否有空指针 有的话返回true没有的话返回false
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] == null){
                 return true;
             }
         }
         return false;
     }
     public static boolean Find(Student[] arr,int id1){//如果该id存在 返回true并令学生的年龄+1
         for (int i = 0; i < arr.length; i++) {
             Student stu = arr[i];
             if(arr[i] != null) {
                 if (id1 == stu.getId()) {
                     int newAge = stu.getAge() + 1;//原年龄+1得到新年龄
                     stu.setAge(newAge);//把新年龄赋值给学生
                     System.out.println("学生的id是：" + stu.getId() + " 学生的姓名是：" + stu.getName()
                             + " 学生的新年龄是：" + stu.getAge());
                     return true;
                 }
             }
         }
         return false;
     }
}
