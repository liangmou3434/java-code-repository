import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {//事件演示
    public static void main(String[] args) {
        //创建一个JFrame对象
        JFrame jFrame = new JFrame();
        //设置界面的宽高
        jFrame.setSize(603,680);
        //设置界面的标题
        jFrame.setTitle("事件演示");
        //设置标题置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,只有取消了才会按照xy轴的形式添加组件
        jFrame.setLayout(null);



        //创建一个按钮对象
        JButton jtb = new JButton("请点我");
        //设置按钮的位置和宽高
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //addActionListener:表示要给组件添加的时间监听(动作监听包括鼠标左键点击,空格)
        //ActionListener-接口,调用接口时需要调用它的实现类对象-创建一个实现类并实现接口
        //参数:表示事件被触发后需要执行的代码
//        jtb.addActionListener(new MyActionListener());

        //使用匿名内部类的方式实现接口实现类的使用(在实现类只需要使用一次的前提下)
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了!");
            }
        });
        //把界面添加到按钮中
        jFrame.getContentPane().add(jtb);
        //界面默认是隐藏的,设置界面显示
        jFrame.setVisible(true);
    }
}
