import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame extends JFrame implements MouseListener {
    //创建一个按钮对象
    JButton jtb1 = new JButton("请点我!");

    //构造方法
    public MyJFrame(){
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
        //给按钮设置位置和宽高
        jtb1.setBounds(0,0,100,50);
        jtb1.addMouseListener(this);
        //this-执行本类由于实现接口重写的方法

        //将按钮添加到整个界面当中
        this.getContentPane().add(jtb1);

        //让界面显示
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
