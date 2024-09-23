package screen.demo1;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //跟注册相关的代码写在这个类中
   public RegisterJFrame(){
       this.setSize(488,500);
       this.setVisible(true);
       //设置界面的标题
       this.setTitle("拼图 注册");
       //设置界面置顶
       this.setAlwaysOnTop(true);//表示标题一直在界面的最上方
       //设置界面显示时位于中间位置
       this.setLocationRelativeTo(null);//只需要传一个空指针即可
       //设置关闭模式
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


   }

}
