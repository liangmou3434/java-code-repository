import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {//接上接口,重写接口的方法
        System.out.println("按钮被点击了!");

    }
}
