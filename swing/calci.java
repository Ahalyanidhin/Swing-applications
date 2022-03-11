package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class calci {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtRs;
double n1,n2,r;

	String op,res;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 895, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 628, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(648, 11, 221, 285);
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 201, 40);
		panel.add(lblNewLabel);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"China", "England", "Australia", "USA", "UK"}));
		comboBox.setBounds(42, 62, 139, 22);
		panel.add(comboBox);
		
		txtRs = new JTextField();
		txtRs.setText("Rs.");
		txtRs.setBounds(10, 119, 201, 40);
		panel.add(txtRs);
		txtRs.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("Convert");
		final Double China=11.9 ;
		Double England=102.38, Australia=53.84, USA=75.61, UK=102.36;
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double rs=Double.parseDouble(txtRs.getText());	
				if(comboBox.getSelectedItem().equals("China")) {
					String c=String.format("Cny.%.2f",rs*China);
					textField_1.setText(c);
					}
				
				
			}
		});
		btnNewButton_15.setBounds(10, 234, 77, 33);
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_15_1 = new JButton("Clear");
		btnNewButton_15_1.setBounds(134, 234, 77, 33);
		panel.add(btnNewButton_15_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(71, 185, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("/");
		btnNewButton_5.setBounds(193, 114, 55, 28);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="/";
			}
		});
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					b=str.toString();
					textField.setText(b);
				}
				
				
			}
		});
		btnNewButton.setBounds(10, 81, 55, 28);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
			
		});
		btnCe.setBounds(75, 81, 55, 28);
		frame.getContentPane().add(btnCe);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setBounds(492, 81, 68, 28);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                n1=Double.parseDouble(textField.getText());
                r=Math.sinh(n1);
            	textField.setText(String.valueOf(r));
			}
		});
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				
			}
		});
		btnC.setBounds(130, 81, 55, 28);
		frame.getContentPane().add(btnC);
		
		JButton btnNewButton_1 = new JButton("+/-");
		btnNewButton_1.setBounds(193, 81, 55, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.sqrt(n1);
				textField.setText(String.valueOf(r));
			}
		});
		btnSqrt.setBounds(258, 81, 68, 28);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.log(n1);
				textField.setText(String.valueOf(r));
			}
		});
		btnL.setBounds(336, 81, 68, 28);
		frame.getContentPane().add(btnL);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.sin(n1);
				textField.setText(String.valueOf(r));
			}
		});
		btnSin.setBounds(414, 81, 68, 28);
		frame.getContentPane().add(btnSin);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="%";
			}
		});
		btnMod.setBounds(570, 81, 68, 28);
		frame.getContentPane().add(btnMod);
		
		final JButton btn7 = new JButton("7");
		btn7.setBounds(10, 114, 55, 28);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn7.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.setBounds(75, 114, 55, 28);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn8.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.setBounds(130, 114, 55, 28);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn9.getText();
			textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("%");
		btnNewButton_5_1.setBounds(258, 114, 68, 28);
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="%";
			}
		});
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("pi");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=n1*3.14;
				textField.setText(String.valueOf(r));
				
			}
		});
		btnNewButton_5_2.setBounds(336, 114, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2);
		
		JButton btnNewButton_5_2_1 = new JButton("Cos");
		btnNewButton_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.cos(n1);
				textField.setText(String.valueOf(r));
			}
		});
		btnNewButton_5_2_1.setBounds(414, 114, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_1);
		
		final JButton btn4 = new JButton("4");
		btn4.setBounds(10, 147, 55, 28);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn4.getText();
				textField.setText(Number);
			}
		});
		
		JButton btnNewButton_5_2_2 = new JButton("Cosh");
		btnNewButton_5_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.cosh(n1);
				textField.setText(String.valueOf(r));
			}
		});
		btnNewButton_5_2_2.setBounds(492, 114, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_2);
		
		JButton btnNewButton_5_2_3 = new JButton("Inx");
		btnNewButton_5_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.log10(n1);
				textField.setText(String.valueOf(r));
						
			}
		});
		btnNewButton_5_2_3.setBounds(570, 114, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_3);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.setBounds(75, 147, 55, 28);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn5.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn5);
		
		JButton btnNewButton_9 = new JButton("*");
		btnNewButton_9.setBounds(193, 147, 55, 28);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="*";
			}
		});
		
		final JButton btn6 = new JButton("6");
		btn6.setBounds(130, 147, 55, 28);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn6.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_5_1_1 = new JButton("1/x");
		btnNewButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=1/n1;
				textField.setText(String.valueOf(r));
			}
		});
		btnNewButton_5_1_1.setBounds(258, 147, 68, 28);
		frame.getContentPane().add(btnNewButton_5_1_1);
		
		JButton btnNewButton_5_2_4 = new JButton("x^y");
		btnNewButton_5_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
			}
		});
		btnNewButton_5_2_4.setBounds(336, 147, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_4);
		
		JButton btnNewButton_5_2_5 = new JButton("Tan");
		btnNewButton_5_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.tan(n1);
				textField.setText(String.valueOf(r));
			}
		});
		btnNewButton_5_2_5.setBounds(414, 147, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_5);
		
		JButton btnNewButton_5_2_6 = new JButton("Tanh");
		btnNewButton_5_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.tanh(n1);
				textField.setText(String.valueOf(r));
			}
		});
		btnNewButton_5_2_6.setBounds(492, 147, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_6);
		
		JButton btnNewButton_5_2_7 = new JButton("C");
		btnNewButton_5_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
			}
		});
		btnNewButton_5_2_7.setBounds(570, 147, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_7);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setBounds(193, 182, 55, 28);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="-";
			}
		});
		frame.getContentPane().add(btnNewButton_13);
		
		final JButton btn1 = new JButton("1");
		btn1.setBounds(10, 182, 55, 28);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn1.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn1);
		
		final JButton btn3 = new JButton("3");
		btn3.setBounds(130, 182, 55, 28);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn3.getText();
				textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn3);
		
		final JButton btn2 = new JButton("2");
		btn2.setBounds(75, 182, 55, 28);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btn2.getText();
			textField.setText(Number);
			}
		});
		frame.getContentPane().add(btn2);
		
		
		
		JButton btnNewButton_5_1_1_1 = new JButton("=");
		btnNewButton_5_1_1_1.setBounds(258, 184, 68, 66);
		btnNewButton_5_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2=Double.parseDouble(textField.getText());
				if(op=="+") {
					r=n1+n2;
					res=String.format("%.2f", r);
					textField.setText(res);
				}if(op=="-") {
					r=n1-n2;
					res=String.format("%.2f", r);
					textField.setText(res);
				}if(op=="*") {
					r=n1*n2;
					res=String.format("%.2f", r);
					textField.setText(res);
					}
				if(op=="/") {
					r=n1/n2;
					res=String.format("%.2f", r);
					textField.setText(res);
			}
				if(op=="%") {
				r=n1%n2;
				res=String.format("%.2f", r);
				textField.setText(res);
				}
				if(op=="x^y") {
					r=Math.pow(n1, n2);
					res=String.format("%.2f", r);
					textField.setText(res);
				}
				if(op=="cbr") {
				n1=Double.parseDouble(textField.getText());
				r=(n1/n2)*100;
				textField.setText(String.valueOf(r));
					
				}
			}
		});
		frame.getContentPane().add(btnNewButton_5_1_1_1);
		
		JButton btnNewButton_5_2_8 = new JButton("x^2");
		btnNewButton_5_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.pow(n1, 2);
				textField.setText(String.valueOf(r));
			}
		});
		btnNewButton_5_2_8.setBounds(336, 182, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_8);
		
		JButton btnNewButton_5_2_9 = new JButton("Cbr");
		btnNewButton_5_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="cbr";
			}
		});
		btnNewButton_5_2_9.setBounds(414, 182, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_9);
		
		JButton btnNewButton_5_2_10 = new JButton("Rund");
		btnNewButton_5_2_10.setBounds(492, 182, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_10);
		
		JButton btnNewButton_5_2_11 = new JButton("2pi");
		btnNewButton_5_2_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=n1*3.14*3.14;
				textField.setText(String.valueOf(r));
			}
		});
		btnNewButton_5_2_11.setBounds(570, 182, 68, 28);
		frame.getContentPane().add(btnNewButton_5_2_11);
		
		JButton btnNewButton_12_2 = new JButton("+");
		btnNewButton_12_2.setBounds(193, 217, 55, 33);
		btnNewButton_12_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				textField.setText(" ");
				op="+";
				
			}
			
		});
		
		JButton btnNewButton_12_1 = new JButton(".");
		btnNewButton_12_1.setBounds(140, 217, 45, 33);
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		final JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.setBounds(9, 217, 121, 33);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_14.getText();
				textField.setText(Number);
				
			}
		});
		frame.getContentPane().add(btnNewButton_14);
		frame.getContentPane().add(btnNewButton_12_1);
		frame.getContentPane().add(btnNewButton_12_2);
		
		JButton btnNewButton_5_2_12 = new JButton("x^3");
		btnNewButton_5_2_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1=Double.parseDouble(textField.getText());
				r=Math.pow(n1, 3);
				textField.setText(String.valueOf(r));
			}
			
		});
		btnNewButton_5_2_12.setBounds(336, 217, 68, 33);
		frame.getContentPane().add(btnNewButton_5_2_12);
		
		JButton btnNewButton_5_2_13 = new JButton("Bin");
		btnNewButton_5_2_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//n1=Double.parseDouble(textField.getText());
				int r1=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(r1));
			}
		});
		btnNewButton_5_2_13.setBounds(414, 217, 68, 33);
		frame.getContentPane().add(btnNewButton_5_2_13);
		
		JButton btnNewButton_5_2_14 = new JButton("Hex");
		btnNewButton_5_2_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r1=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(r1));
			}
		});
		btnNewButton_5_2_14.setBounds(492, 217, 68, 33);
		frame.getContentPane().add(btnNewButton_5_2_14);
		
		JButton btnNewButton_5_2_15 = new JButton("Oct");
		btnNewButton_5_2_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r1=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(r1));
			}
		});
		btnNewButton_5_2_15.setBounds(570, 217, 68, 33);
		frame.getContentPane().add(btnNewButton_5_2_15);
	}
}
