package 软件测试实习一;

import static org.junit.Assert.assertEquals;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
 
import java.awt.event.*;
public class Test extends JFrame {
    private JPanel jPane;//大的面板
    private JTextField textField;//文本框
    public JComboBox comboBox;//下拉选择框
    public static String a =null;
    public static void main(String[] args) {
    	Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("经济舱");
		r.setShifa("中国");
		r.setDaoda("美洲");
		r.Setxingli(9, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
    }
  
    /**
     * Create the frame.
     */
    public Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      EXIT_ON_CLOSE相当于执行System.exit(0);的动作方法退出应用程序，关闭进程
//      如果不写这句话点击X我们也能关闭窗口，但是在后台进程里面我们会发现我们的进程数并不减少
        setBounds(200, 200, 400, 400);//首次点开，发现距离屏幕左边,上方200，长宽均为400
        jPane = new JPanel();
        jPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(jPane);
        jPane.setLayout(null);
//按照规定的位置显示，否则按照默认的FlowLayout（每个JPanel对象初始化时都使用FlowLayout布局，）布局显示的
          
        comboBox = new JComboBox();
        String[] select = {"选项一","选项二","选项三"};
//        添加选项值
        comboBox.setModel(new DefaultComboBoxModel(select));
        comboBox.setBounds(15, 15, 100, 25);
        jPane.add(comboBox);
      
        textField = new JTextField();
        textField.setBounds(150, 15, 76, 22);
        jPane.add(textField);
        textField.setText("选项一");
    
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                     textField.setText(comboBox.getSelectedItem().toString());
                     a = textField.getText();
                     System.out.print(a);
                }
            }  
        });
    }
}
