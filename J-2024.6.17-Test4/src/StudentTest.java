import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void startStudentSystem() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();//创建一个空集合来放学生类
        loop: while (true) {
            menu();
            System.out.print("请输入你的选择: ");
            int number = sc.nextInt();
            if (number < 0 || number > 4) {
                System.out.println("你输入了错误的数字,请重新输入!");
            } else {
                switch (number) {
                    case 1:
                        list = Add(list);//把更改后的集合对象继续赋值给集合
                        break;
                    case 2:
                        list = Delete(list);
                        break;
                    case 4: Enquiries(list);
                        break;
                    case 3:Revise(list);
                        break;
                    case 0:
                        System.out.println("你已经退出学生管理系统!");
                        break loop;//跳出外循环
//                    System.exit(0);//使虚拟机停止运行
                    default:
                        System.out.println("你输入了错误的数字,请重新输入!!");
                        break;
                }
            }
        }
    }
    public static void menu() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("0.退出系统");
    }
    //添加学生信息 键盘录入 id是唯一的
    public static ArrayList<Student> Add(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();//创建一个新的学生对象,并把键盘录入的信息赋值给学生对象里
       while(true){
           System.out.print("请输入学生的id: ");
           String id = sc.next();
           boolean result = Judgment(id,list);//判断学生id是否重复
           if(result == true){//方法返回true证明id有重复
               System.out.print("你输入的id重复!请重新输入: ");
           }else{
               stu.setId(id);
               break;
           }
       }
        System.out.print("请输入学生的姓名: ");
        String name = sc.next();
        stu.setName(name);
        System.out.print("请输入学生的年龄: ");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.print("请输入学生的家庭住址: ");
        String address = sc.next();
        stu.setAddress(address);
        list.add(stu);//把创建好的学生对象天机进集合里
        System.out.println("添加成功!!!");
        return list;
    }
    public static boolean Judgment(String id,ArrayList<Student> list){//判断学生的学号是否唯一
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);//得到集合里的每一个对象
//            if(id.equals(stu.getId())){
//                return true;
//            }
//        }
//        return false;
        return Judgment1(id,list) >= 0;//提高代码的复用性,同样的如果id存在会返回大于0的元素对应的下标,如果id不存在就会返回-1
        //如果Judgement1返回的结果大于0 则id存在 return true 如果返回的结果小于0则id不存在,return false
    }

    public static ArrayList<Student> Delete(ArrayList<Student> list) {//通过学生id删除学生信息
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你要删除的学生id: ");
        String id = sc.next();
        int result = Judgment1(id,list);
        if(result == -1){//学生id不存在
            System.out.println("你需要删除的学生id不存在!删除失败");
        }else{//学生id存在
            list.remove(list.get(result));
            System.out.println("id为"+id+"的学生删除成功");
        }
        return list;
    }
    public static int Judgment1(String id,ArrayList<Student> list){//判断需要删除的id是否存在
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);//得到集合内的每个元素
            if(id.equals(stu.getId())){
              return i;
            }
        }
          return -1;
    }
    public static void Enquiries(ArrayList<Student> list) {//查询学生
          if(list.size() == 0){
              System.out.println("当前无学生信息,请添加后再查询");
              return;//结束当前方法
          }
        System.out.println("id\t姓名\t年龄\t家庭住址");//打印表头信息
        //遍历集合内所有学生的信息
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+" "+stu.getAge()+"\t"+stu.getAddress());
        }
    }
    public static void Revise(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要修改的学生id: ");
        String id = sc.next();
       int result =  Judgment1(id,list);
       if(result == -1){
           System.out.println("该学生id不存在, 请重新输入!");
           return;//结束当前方法
       }else{
           Student stu = list.get(result);
           System.out.print("请输入需要修改的学生姓名: ");
           String newName = sc.next();
           stu.setName(newName);
           System.out.print("请输入需要修改的学生年龄: ");
           int newAge = sc.nextInt();
           stu.setAge(newAge);
           System.out.print("请输入需要修改的学生家庭住址: ");
           String newAddress = sc.next();
           stu.setAddress(newAddress);
           System.out.println("学生信息修改成功!");
       }
    }
}

