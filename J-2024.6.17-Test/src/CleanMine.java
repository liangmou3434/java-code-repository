import java.util.Random;
import java.util.Scanner;

public class CleanMine {
    public static void main(String[] args) {
        menu();//设置游戏菜单
        test();//进入游戏后选择玩游戏或者退出游戏
    }
    public static void menu(){//菜单
        System.out.println("*****************************");
        System.out.println("***********1.Play************");
        System.out.println("***********0.exit************");
        System.out.println("*****************************");
    }
    public static void test(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你选择的数字: ");
        int number = sc.nextInt();//输入数字1进入游戏，数字0退出游戏
        switch (number) {
            case 1:
                game();
                break;
            case 0:
                System.out.println("你已经退出游戏!!!");
                break;
            default:
                System.out.println("你选择了错误的数字,请重新选择!!!");
                break;
        }
    }
    public static void game() {
        char mine[][] = new char[12][12];//先初始化两个数组 mine用来放置雷
        char show[][] = new char[12][12];//show用来计算排查的位置周边雷的个数
        //给放置雷的数组初赋值为字符0，排查周边雷的个数的数组赋值为字符*
        IntiallAssignment(mine, 12, 12, '0');
        IntiallAssignment(show, 12, 12, '*');
        //打印数组
        Display(show,10, 10);//打印show数组
        //随机放置10个雷
        SetMine(mine, 10, 10);//随机放置雷的函数
//        Display(mine, 10, 10);//打印mine数组
        //排查雷
        FineMine(mine,show,10,10);
    }
    public static void IntiallAssignment(char arr[][],int row, int col, char set){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = set;//将数组初始赋值 用多个形参防止代码过多过杂
            }
        }
    }
    public static void Display(char[][] arr,int row,int col){
        System.out.println("--------扫雷游戏------");
        int i = 0;
        System.out.print("  ");
        for (i = 1; i <= row; i++) {
            System.out.print(" "+i);//打印数组的纵坐标
        }
        System.out.println();
        for (i = 1 ; i <= col; i++)
        {
            System.out.print(" "+i);//打印数组的纵坐标
            for (int j = 1; j <= col; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }

    public  static void SetMine(char arr[][], int row, int col) {
        int count = 0;
        Random r = new Random();
        while (count <= 10)//放置10个雷
        {
            int x = r.nextInt(10 + 1);
            int y = r.nextInt(10+ 1);
            if (arr[x][y] == '0')//如果该位置不是雷，则放置雷
            {
                arr[x][y] = '1';
                count++;
            }

        }
    }
    public static int GetMineCount(char mine[][],char show[][], int x, int y){//排查不是雷的坐标周围有几个雷
        int number = 0;//排查（x,y)周围的八个坐标
        for (int i = x - 1; i <= x + 1; i++){
            for (int j = y - 1; j <= y + 1; j++) {
                if (mine[i][j] == '1') {
                    number ++;//'1'-'0'->字符1减去字符0=数字\
                    //number = number + '1 -'0'
                }
            }
        }
        return number;
    }
    public static void FineMine(char mine[][],char show[][], int row, int col)
    {
        int win = 0;
        int x = 0;
        int y = 0;//10x10雷盘中有90个位置不是雷 把雷排查完后结束游戏
        while (win<row*col- 10)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入你要排查的坐标：> ");
            x = sc.nextInt();
            y = sc.nextInt();
            if ((x >= 1 && x <= row) && (y >= 1 && y <= col))//输入坐标时必须先判断坐标的有效性
            {
                if (mine[x][y] == '1')
                {
                    System.out.println("很抱歉，你已经被雷炸死了!!!");
                    System.out.println("-------------------------");
                    System.out.println("雷的位置如下所示：     ");
                    Display(mine, 10, 10);//被炸死后游戏结束，打印雷的位置信息
                    break;//break用于跳出循环
                }
                else if (mine[x][y] == '0') {
                    if (show[x][y] == '*') {
                        int number = GetMineCount(mine, show, x, y);//排查不是雷的坐标周围有几个雷
                        String numberString = String.valueOf(number);//将数字转化成字符串
                        char c = numberString.charAt(0);//取变成字符的数字 数字重新转化成字符
                        show[x][y] = c ;
                        Display(show, 10, 10);
                        win++;
                    }
                    else {
                        System.out.println("该坐标已经被排查过了！！！请重新输入新坐标");
                    }
                }
            }
            else {
                System.out.println("你输入了错误的坐标，请重新输入：>  ");
            }
            if (win == row * col - 10)
            {
                System.out.println("恭喜你 排雷成功！！！");
                System.out.println("-------------------------");
                System.out.println("雷的位置如下所示：     ");
                Display(mine, 10, 10);
            }
        }

    }
}

