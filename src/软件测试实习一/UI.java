package �������ʵϰһ;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UI {
	public void UI(){
		Ren re=new Ren();
		final JFrame jFrame =new JFrame("��������");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth()) / 2-150, ((int)dimension.getHeight())/8, 800, 600);
		jFrame.setResizable(false);
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComboBox<String> shifa = new JComboBox<String>();
        String[] shifazhan = {"�й�","�ձ�","����","����","����˹","�ϰ�","�¼���","������","���ޱ�","����","����"};
//        ���ѡ��ֵ
        shifa.setModel(new DefaultComboBoxModel<String>(shifazhan));
        shifa.setBounds(180, 60, 200, 40);
        shifa.setFont(new java.awt.Font("����", 1, 20));
        jFrame.add(shifa);
       
        /*shifa.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                     re.setShifa(shifa.getSelectedItem().toString());
                }
            }  
        });*/
		
		JLabel label1=new JLabel("ʼ��վ��");
		label1.setBounds(40,60 , 180, 40);
		label1.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(label1);
		
		
		JLabel xingl=new JLabel("�˿�����");
		xingl.setBounds(440,60 , 180, 40);
		xingl.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(xingl);
		
		JLabel xingl1=new JLabel("<html> </html>");
		xingl1.setBounds(440,80 , 300, 400);
		xingl1.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(xingl1);
		
		JComboBox<String> Daoda = new JComboBox<String>();
        String[] Daodazhan = {"�й�","�ձ�","����","����","����˹","�ϰ�","�¼���","������","���ޱ�","����","����"};
//        ���ѡ��ֵ
        Daoda.setModel(new DefaultComboBoxModel<String>(Daodazhan));
        Daoda.setBounds(180, 120, 200, 40);
        Daoda.setFont(new java.awt.Font("����", 1, 20));
        jFrame.add(Daoda);
        
		
		JLabel label2=new JLabel("�յ�վ��");
		label2.setBounds(40,120 , 180, 40);
		label2.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(label2);
		
		/*Daoda.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                     re.setDaoda(Daoda.getSelectedItem().toString());
                }
            }  
        });*/
		
		JComboBox jicang = new JComboBox();
        String[] jicangw = {"ͷ�Ȳ�","�����","���ò�","���龭�ò�"};
//        ���ѡ��ֵ
        jicang.setModel(new DefaultComboBoxModel(jicangw));
        jicang.setBounds(180, 180, 200, 40);
        jicang.setFont(new java.awt.Font("����", 1, 20));
        jFrame.add(jicang);
        
		
		JLabel label3=new JLabel("���գ�");
		label3.setBounds(40,180 , 180, 40);
		label3.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(label3);
		
		/*jicang.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                     re.setJicang(jicang.getSelectedItem().toString());
                }
            }  
        });*/
		
		JComboBox<String> chengke = new JComboBox<String>();
        String[] chengkezhonglei = {"��ͯ","��ͨ����","ռ��Ӥ��","��ռ��Ӥ��","�Ϻ�����𿨻�Ա"
        		,"������˳�����Ӣ","�Ϻ�����������Ա","������˾�Ӣ","��ѧ��","����","��Ա"};
//        ���ѡ��ֵ
        chengke.setModel(new DefaultComboBoxModel<String>(chengkezhonglei));
        chengke.setBounds(180, 240, 200, 40);
        chengke.setFont(new java.awt.Font("����", 1, 20));
        jFrame.add(chengke);
		
		JLabel label4=new JLabel("�˿ͣ�");
		label4.setBounds(40,240 , 180, 40);
		label4.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(label4);
		
		/*chengke.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                     re.setChengkezhonglei(chengke.getSelectedItem().toString());
                }
            }  
        });*/
		
		JLabel label5=new JLabel("Ʊ�ۣ�");
		label5.setBounds(40,300 , 180, 40);
		label5.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(label5);
		
		
		final JTextField text4 = new JTextField();
		text4.setFont(new java.awt.Font("����", 1, 20));
		text4.setBounds(180, 300, 200, 40);
		jFrame.add(text4);
		
		JButton button = new JButton("�������");
		button.setBounds(110,360 , 180, 40);
		button.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				final JFrame jFrame =new JFrame("�������");
				Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
				jFrame.setBounds(((int)dimension.getWidth()) / 2-100, ((int)dimension.getHeight()) / 8+100, 300, 500);
				jFrame.setResizable(false);
				jFrame.setLayout(null);
				
				JLabel label1=new JLabel("������");
				label1.setBounds(60,50 , 180, 40);
				label1.setFont(new java.awt.Font("����", 1, 20));
				jFrame.add(label1);
				
				final JTextField text1 = new JTextField();
				text1.setFont(new java.awt.Font("����", 1, 20));
				text1.setBounds(150, 50, 100, 40);
				jFrame.add(text1);
				
				JLabel label2=new JLabel("���ȣ�");
				label2.setBounds(60,100 , 180, 40);
				label2.setFont(new java.awt.Font("����", 1, 20));
				jFrame.add(label2);
				
				final JTextField text2 = new JTextField();
				text2.setFont(new java.awt.Font("����", 1, 20));
				text2.setBounds(150, 100, 100, 40);
				jFrame.add(text2);
				
				JLabel label3=new JLabel("��ȣ�");
				label3.setBounds(60,150 , 180, 40);
				label3.setFont(new java.awt.Font("����", 1, 20));
				jFrame.add(label3);
				
				final JTextField text3 = new JTextField();
				text3.setFont(new java.awt.Font("����", 1, 20));
				text3.setBounds(150, 150, 100, 40);
				jFrame.add(text3);
				
				JLabel label4=new JLabel("�߶ȣ�");
				label4.setBounds(60,200 , 180, 40);
				label4.setFont(new java.awt.Font("����", 1, 20));
				jFrame.add(label4);
				
				final JTextField text4 = new JTextField();
				text4.setFont(new java.awt.Font("����", 1, 20));
				text4.setBounds(150, 200, 100, 40);
				jFrame.add(text4);
				
				JButton button1 = new JButton("���");
				button1.setBounds(100, 250, 100, 40);
				button1.setFont(new java.awt.Font("����", 1, 20));
				jFrame.add(button1);
				
				button1.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						try{
							   Integer.parseInt(text1.getText());
							   Integer.parseInt(text2.getText());
							   Integer.parseInt(text3.getText());
							   Integer.parseInt(text4.getText());
							  }catch(NumberFormatException e1)
							  {
								  JOptionPane.showMessageDialog(null, "�������������ȡ���ȡ��߶�������", "����",JOptionPane.WARNING_MESSAGE);
								  text1.setText("");
								  text2.setText("");
								  text3.setText("");
								  text4.setText("");
								  return;
							  }
						if(Integer.parseInt(text1.getText())<0|| Integer.parseInt(text2.getText())<0|| 
								Integer.parseInt(text3.getText())<0|| Integer.parseInt(text4.getText())<0)
						{
							JOptionPane.showMessageDialog(null, "������Ϣ����", "����",JOptionPane.WARNING_MESSAGE);  
							text1.setText("");
							text2.setText("");
							text3.setText("");
							text4.setText("");
						}
						else 
						{
							re.Setxingli(Integer.parseInt(text1.getText()), Integer.parseInt(text2.getText()), 
									Integer.parseInt(text3.getText()), Integer.parseInt(text4.getText()));
							JOptionPane.showMessageDialog(null, "��ӳɹ�", "����",JOptionPane.WARNING_MESSAGE);  
							jFrame.dispose();
							xingl1.setText(xingl1.getText().substring(0,xingl1.getText().length()-7)+
									"����"+re.xingli.size()+"������"+text1.getText()+"����"+text2.getText()+"���"+text3.getText()
									+"�߶�"+text4.getText()+"<br/><html/>");
						}
					}
				});
				jFrame.setVisible(true);
			}
		});
		
		JButton button1 = new JButton("����Ӧ���۸�");
		button1.setBounds(110,420 , 180, 40);
		button1.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(button1);
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				/*if(label5.getText()>=0) {
					JOptionPane.showMessageDialog(null, "Ӧ��"+dou, "����",JOptionPane.WARNING_MESSAGE);  
				}*/
				try{
				   Integer.parseInt(text4.getText());
				  }catch(NumberFormatException e1)
				  {
					  JOptionPane.showMessageDialog(null, "Ʊ�۲����Ϲ涨", "����",JOptionPane.WARNING_MESSAGE);
					  text4.setText("");
					  return;
				  }
				Xinglijiance X=new Xinglijiance();
				re.setShifa(shifa.getSelectedItem().toString());
				re.setJicang(jicang.getSelectedItem().toString());
				re.setDaoda(Daoda.getSelectedItem().toString());
				re.setChengkezhonglei(chengke.getSelectedItem().toString());
				double dou=X.xinglijiance(re, Integer.parseInt(text4.getText()));
				if(dou>=0) {
					JOptionPane.showMessageDialog(null, "Ӧ��"+dou, "����",JOptionPane.WARNING_MESSAGE);  
				}
				else {
					JOptionPane.showMessageDialog(null, "������Ϲ涨", "����",JOptionPane.WARNING_MESSAGE);  
				}
			}
		});
		JButton button2 = new JButton("���");
		button2.setBounds(110,480 , 180, 40);
		button2.setFont(new java.awt.Font("����", 1, 20));
		jFrame.add(button2);
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				text4.setText("");
				xingl1.setText("<html> </html>");
				shifa.setSelectedIndex(0);
				Daoda.setSelectedIndex(0);
				jicang.setSelectedIndex(0);
				chengke.setSelectedIndex(0);
				re.clearxingli();
			}
		});
		jFrame.setVisible(true);
		
	}
	public static void main(String[] args)
    {	
		UI ui=new UI();
		ui.UI();
    }
}


