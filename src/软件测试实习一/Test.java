package �������ʵϰһ;

import static org.junit.Assert.assertEquals;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
 
import java.awt.event.*;
public class Test extends JFrame {
    private JPanel jPane;//������
    private JTextField textField;//�ı���
    public JComboBox comboBox;//����ѡ���
    public static String a =null;
    public static void main(String[] args) {
    	Ren r=new Ren();
		r.setChengkezhonglei("��ռ��Ӥ��");
		r.setJicang("���ò�");
		r.setShifa("�й�");
		r.setDaoda("����");
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
//      EXIT_ON_CLOSE�൱��ִ��System.exit(0);�Ķ��������˳�Ӧ�ó��򣬹رս���
//      �����д��仰���X����Ҳ�ܹرմ��ڣ������ں�̨�����������ǻᷢ�����ǵĽ�������������
        setBounds(200, 200, 400, 400);//�״ε㿪�����־�����Ļ���,�Ϸ�200�������Ϊ400
        jPane = new JPanel();
        jPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(jPane);
        jPane.setLayout(null);
//���չ涨��λ����ʾ��������Ĭ�ϵ�FlowLayout��ÿ��JPanel�����ʼ��ʱ��ʹ��FlowLayout���֣���������ʾ��
          
        comboBox = new JComboBox();
        String[] select = {"ѡ��һ","ѡ���","ѡ����"};
//        ���ѡ��ֵ
        comboBox.setModel(new DefaultComboBoxModel(select));
        comboBox.setBounds(15, 15, 100, 25);
        jPane.add(comboBox);
      
        textField = new JTextField();
        textField.setBounds(150, 15, 76, 22);
        jPane.add(textField);
        textField.setText("ѡ��һ");
    
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
