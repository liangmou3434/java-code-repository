package screen.demo1;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GameJFrame extends JFrame implements KeyListener {
    //JFrame表示一个窗体
    //JFrame的子类GameJFrame也表示一个窗体
    //与游戏相关的所有逻辑都写在GameJFrame中

    //创建二维数组
    //目的,用来管理图片,加载图片时会根据二维数组中的数据进行加载达到一个打乱图片的效果
    int[][] tempBr = new int[4][4];//四行四列的二维数组-将二维数组放在成员位置
    //定义一个正确顺序的数组,如果被打乱的数组顺序已经与正确顺序的数组相同,则表示游戏胜利
    int[][] win = new int[][]{
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0}
    };
    int x = 0;
    int y = 0;//记录空白方块的位置
    String path = "image\\animal\\animal1\\";
    public GameJFrame() {
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //初始化数据(打乱)
        initData();
        //初始化图片
        initImage();//使用alt和回车一键生成代码

        //设置游戏界面是否显示,写在代码的最后
        this.setVisible(true);
    }

    private void initData() {
        int[] tempAr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r1 = new Random();
        for (int i = 0; i < 5; i++) {//交换五次(
            int number1 = r1.nextInt(15 + 1);
            int number2 = r1.nextInt(15 + 1);//生成两个随机数
            if(number1 == number2){
                continue;
            }
            int temp = tempAr[number1];
            tempAr[number1] = tempAr[number2];
            tempAr[number2] = temp;//交换两个元素
        }
        //将一维数组按照4个一组的方式添加到而且数组中
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(tempAr[index] == 0){
                    x = i;
                    y = j;//把空白方块的位置记录下来
                }else{
                    tempBr[i][j] = tempAr[index];
                }
                index++;
            }
        }
    }

    //初始化图片
    private void initImage() {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

//        //创建一个图片ImageIcon的对象
//        ImageIcon icon1 = new ImageIcon("D:\\Github\\Github代码仓\\java-code-repository\\J-2024.9.13Test\\image\\animal\\animal1\\1.jpg");
//        //创建一个JLabel对象(管理容器)
//        JLabel jLabel1 = new JLabel(icon1);//管理icon图片
//        jLabel2.setBounds(0,0,105,105);
//        //把管理容器添加到界面当中-图片默认添加到界面的正中央
//        //获取到JFrame中的隐藏容器,把图片添加到隐藏容器中
//        this.getContentPane().add(jLabel1);

        if(victory()){//进入if语句表示游戏已经胜利
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        //先加载的图片在上面,后加载的图片在下面
       //外循环--添加四行图片
        //按照打乱后的二维数组下标添加图片(顺序已经打乱)
        for (int i = 0; i < 4; i++) {
            //内循环,添加一行图片
            for (int j = 0; j < 4; j++) {
                int num = tempBr[i][j];
                //创建一个JLabel对象
                JLabel jLabel = new JLabel(new ImageIcon(path + num +".jpg"));
                //指定图片的位置
                jLabel.setBounds(105 * j + 83,105 * i + 134,105,105);
                //把管理容器添加到界面当中-图片默认添加到界面的正中央
                //获取到JFrame中的隐藏容器,把图片添加到隐藏容器中
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(1));
                //0:表示让图片凸起来
                //1:表示让图片凹下去
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40,40,508,560);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }


    public void initJFrame(){//初始化界面
        //设置界面的宽高
        this.setSize(603,680);//设置游戏界面的宽和高分别为多少个像素
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);//表示标题一直在界面的最上方
        //设置界面显示时位于中间位置
        this.setLocationRelativeTo(null);//只需要传一个空指针即可
        //设置关闭模式
//        this.setDefaultCloseOperation(3);//3-关闭一个界面后虚拟机停止
        //两次Ctrl+b进入原码找到接口,找到第三种模式对应的变量名
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消居中放置,只有取消了才会按照x,y轴的形式添加组件
        this.setLayout(null);//传一个空指针即可

        //给键盘加上事件监听
        this.addKeyListener(this);
    }

    public void initJMenuBar(){
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上两个选项对象(功能,关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将每一个选项下面的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将菜单的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个页面设置菜单
        this.setJMenuBar(jMenuBar);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按住不动-按住A键不懂显示完整的图片
    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
     //对上下左右进行判断
        //左:37,上38,右39,下40
        int code = e.getKeyCode();
        if(code == 37){
            System.out.println("向左移动");
            if(y == 3){
                //空白方块在最右边,已经无法移动了
                return;
            }
            //把图片向左移动,空白方块向右移动
            tempBr[x][y] = tempBr[x][y + 1];
            tempBr[x][y + 1] = 0;
            y++;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if(code == 38){
            System.out.println("向上移动");
            if(x == 3){
                return;
            }
            //把空白方块下方的数字向上移动
            //x,y表示空白方块
            //x+1,y表示空白方块下方的数字
            tempBr[x][y] = tempBr[x + 1][y];
            tempBr[x + 1][y] = 0;
            x++;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if(code == 39){
            System.out.println("向右移动");
            if(y == 0){
                return;
            }
            //空白方块向右移动-左边的数字右移
            tempBr[x][y] = tempBr[x][y - 1];
            tempBr[x][y - 1] = 0;
            y--;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if(code == 40){
            System.out.println("向下移动");
            if(x == 0){
                return;
            }
            //把空白方块向下移动
            tempBr[x][y] = tempBr[x - 1][y];
            tempBr[x - 1][y] = 0;
            x--;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if(code == 87){//按下w,直接胜利
            tempBr = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }

    //判断游戏是否胜利的方法
    public boolean victory(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(tempBr[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
