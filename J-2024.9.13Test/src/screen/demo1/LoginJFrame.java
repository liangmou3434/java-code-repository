package screen.demo1;

import javax.swing.*;

public class LoginJFrame extends JFrame{
    //登录界面,用来放与登录有关的所有代码

    public LoginJFrame(){//登录界面的空参构造
        //在创建登录界面时,同时给界面设置信息
        //由于创建对象的时候就会调用类里的空参构造,所以可以把代码直接写在空参构造里
        this.setSize(488,430);
        this.setVisible(true);
        //设置界面的标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);//表示标题一直在界面的最上方
        //设置界面显示时位于中间位置
        this.setLocationRelativeTo(null);//只需要传一个空指针即可
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
