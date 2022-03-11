package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ticket_Booking {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table;
	double tax=50;
	double amount;
	double total;
	double ticno=0;
	double price=0;
	String Kasargod,Kannur,Wayanad,Kozhikode,Malappuram,Palakkad,Thrissur,Eranakulam,Idukki,Kottayam,Pathanamthitta,Alappuzha,Kollam,Thiruvananthapuram;
	
	String std="",sing="",a="",fst="",snd="",slp="";
	private JTextField textField_16;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
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
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 916, 771);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBackground(new Color(218, 112, 214));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(387, 11, 159, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(219, 112, 147));
		panel.setBounds(10, 63, 439, 384);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Details");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(175, 11, 54, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField.setBounds(100, 56, 191, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(27, 58, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Date");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(27, 102, 46, 14);
		panel.add(lblNewLabel_2_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(100, 98, 64, 22);
		panel.add(comboBox);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_1.setBounds(174, 98, 102, 22);
		panel.add(comboBox_1);
		
		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Year", "2022", "2023", "2024", "2025", "2026", "2027", "2028"}));
		comboBox_2.setBounds(286, 98, 64, 22);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setBounds(27, 145, 46, 14);
		panel.add(lblNewLabel_3);
		
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Kasargod", "Kannur", "Wayanad", "Kozhikode", "Malppuram", "Thrissur", "Palakkad", "Eranakulam", "Idukki", "Kottayam", "Alappuzha", "Pathanamthitta", "Kollam", "Thiruvananthapuram"}));
		comboBox_3.setBounds(100, 141, 145, 22);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("To");
		lblNewLabel_3_1.setBounds(257, 145, 19, 14);
		panel.add(lblNewLabel_3_1);
		
		final JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] {"Kasargod", "Kannur", "Wayanad", "Kozhikode", "Malppuram", "Thrissur", "Palakkad", "Eranakulam", "Idukki", "Kottayam", "Alappuzha", "Pathanamthitta", "Kollam", "Thiruvananthapuram"}));
		comboBox_3_1.setBounds(282, 141, 145, 22);
		panel.add(comboBox_3_1);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setBounds(27, 182, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBounds(138, 182, 109, 23);
		panel.add(rdbtnSingleTicket);
		
		final JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		panel.add(rdbtnFirstClass);
		rdbtnFirstClass.setBounds(27, 208, 109, 23);
		panel.add(rdbtnFirstClass);
		
		final JRadioButton rdbtnSecondClass = new JRadioButton("Second Class");
		panel.add(rdbtnSecondClass);
		rdbtnSecondClass.setBounds(138, 208, 109, 23);
		panel.add(rdbtnSecondClass);
		
		final JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(257, 182, 72, 23);
		panel.add(rdbtnAc);
		
		final JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(257, 208, 72, 23);
		panel.add(rdbtnSleeper);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 291, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 322, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(138, 353, 86, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tax");
		lblNewLabel_4.setBounds(27, 303, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Amount");
		lblNewLabel_4_1.setBounds(27, 328, 46, 14);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Total");
		lblNewLabel_4_2.setBounds(27, 359, 46, 14);
		panel.add(lblNewLabel_4_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(120, 249, 46, 20);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(325, 249, 46, 20);
		panel.add(textField_14);
		
		JLabel lblNewLabel_4_3 = new JLabel("No.of Adult");
		lblNewLabel_4_3.setBounds(44, 252, 102, 14);
		panel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("No.Children");
		lblNewLabel_4_4.setBounds(248, 252, 102, 14);
		panel.add(lblNewLabel_4_4);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		int ad=Integer.parseInt(textField_13.getText());
		int ch=Integer.parseInt(textField_14.getText());
		int seats=ad+ch;

		int standard=0,single=0,ac=0,first=0,second=0,sleep=0;
		
		
		if(rdbtnNewRadioButton.isSelected()){    
			standard=20;
			std="Standard";
		}    
		if(rdbtnSingleTicket.isSelected()){    
		single=10;
		sing="Single";
		} if(rdbtnAc.isSelected()) {
			ac=150;
			a="AC";
		}
		if(rdbtnFirstClass.isSelected()) {
			first=50;
			fst="First Class";
		
		}

		if( rdbtnSecondClass.isSelected()){
			second=10;
			snd="Second Class";
		}
	    if(rdbtnSleeper.isSelected() ) {
				sleep=75;
				slp="Sleeper";
				}
				amount=seats*(standard+single+ac+first+second+sleep);
				String am=String.format("%2f", amount);
				String tx=String.format("%2f", tax);
		        price = tax+amount;
		        
         
				ticno++;
				//String seatno=String.format("%2f", seats);
				
			
				
		String name=textField.getText();
		String day=(String) comboBox.getSelectedItem();		
		String month=(String)comboBox_1.getSelectedItem();
		String year=(String)comboBox_2.getSelectedItem();
		String from=(String)comboBox_3.getSelectedItem();		
		String to=(String)comboBox_3_1.getSelectedItem();		
		Calendar timer=Calendar.getInstance();
		timer.getTime();
		SimpleDateFormat btime=new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat bdate=new SimpleDateFormat("dd-MMM-yyy");
		
		String adult=textField_13.getText();
		String child=textField_14.getText();
		double dist=0;
		
		
		if(from=="Kasargod"&&to=="Kannur"||from=="Kannur"&&to=="Kasargod") {
		
		 dist = price+50;
		 
		}		
		if(from==Kasargod&&to==Wayanad||from==Wayanad&&to==Kasargod) {
			
			dist=price+60;
		}
		if(from==Kasargod&&to==Kozhikode||from==Kozhikode&&to==Kasargod) {
			
			dist=price+70;
		}

		if(from==Kasargod&&to==Malappuram||from==Malappuram&&to==Kasargod) {
			
			dist=price+80;
		}
		
		if(from==Kasargod&&to==Palakkad||from==Palakkad&&to==Kasargod) {
			
			dist=price+90;
		}
		
		if(from==Kasargod&&to==Thrissur||from==Thrissur&&to==Kasargod) {
			
			dist=price+100;
		}
		
		if(from==Kasargod&&to==Eranakulam||from==Eranakulam&&to==Kasargod) {
			
			dist=price+110;
		}
		
			
		if(from==Kasargod&&to==Idukki||from==Idukki&&to==Kasargod) {
			
			dist=price+120;
		}
		
		if(from==Kasargod&&to==Kottayam||from==Kottayam&&to==Kasargod) {
			
			dist=price+130;
		}
		
		if(from==Kasargod&&to==Alappuzha||from==Alappuzha&&to==Kasargod) {
			
			dist=price+140;
		}
		
		if(from==Kasargod&&to==Pathanamthitta||from==Pathanamthitta&&to==Kasargod) {
			
			dist=price+150;
		}
		
		if(from==Kasargod&&to==Kollam||from==Kollam&&to==Kasargod) {
			
			dist=price+160;
		}
		
		if(from==Kasargod&&to==Thiruvananthapuram||from==Thiruvananthapuram&&to==Kasargod) {
			
			dist=price+170;
		}
		
		String tot=String.format("%2f", dist);

			 textField_1.setText(tx);
              textField_2.setText(am);
               textField_3.setText(tot);
               textField_15.setText(tot);
               textField_10.setText(String.format("%s", ticno));
                textField_4.setText(name);
              textField_5.setText(day+"-"+month+"-"+year);
              textField_7.setText(from);
              textField_8.setText(to);
              textField_11.setText(adult);
              textField_12.setText(child);
              textField_6.setText(btime.format(timer.getTime()));
              textField_9.setText(bdate.format(timer.getTime()));
              textField_16.setText(String.format("%s", seats));
				
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 0));
		btnNewButton.setBounds(34, 472, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(255, 255, 0));
		btnReset.setBackground(new Color(0, 0, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   textField.setText(" ");
                   textField_1.setText(" ");
                   textField_2.setText(" ");
                   

                  comboBox_1.setSelectedItem(null);
                  comboBox_2.setSelectedItem(null);
                  comboBox_3.setSelectedItem(null);
                  comboBox_3_1.setSelectedItem(null);
                   comboBox.setSelectedItem(null);
             
                   
                  
                  textField_3.setText(" ");
                  textField_4.setText(" ");
                  textField_5.setText(" ");
                
                  textField_6.setText(" ");   
                  textField_7.setText(" ");
                  textField_8.setText(" ");
                
                  textField_9.setText(" ");
                   textField_10.setText(" ");   
                   textField_11.setText(" ");
                   textField_12.setText(" ");
                  
                   textField_13.setText(" ");  
                   textField_14.setText(" ");
                   textField_15.setText(" ");
                   textField_16.setText(" ");
                  
				
			}
		});
		btnReset.setBounds(174, 472, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setForeground(new Color(255, 255, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(323, 472, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(459, 60, 431, 384);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Train Ticket");
		lblNewLabel_5.setBounds(171, 11, 115, 30);
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Name");
		lblNewLabel_6.setBounds(10, 99, 67, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Booking date");
		lblNewLabel_7.setBounds(10, 185, 67, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Departure date");
		lblNewLabel_8.setBounds(10, 124, 80, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("From");
		lblNewLabel_9.setBounds(10, 155, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("To");
		lblNewLabel_10.setBounds(216, 155, 46, 14);
		panel_1.add(lblNewLabel_10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(121, 96, 165, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(121, 121, 165, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(121, 182, 165, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(41, 152, 165, 20);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(240, 152, 165, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(121, 213, 165, 20);
		panel_1.add(textField_9);
		
		JLabel lblNewLabel_7_1 = new JLabel("Time");
		lblNewLabel_7_1.setBounds(10, 216, 67, 14);
		panel_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Ticket Number");
		lblNewLabel_7_2.setBounds(10, 74, 80, 14);
		panel_1.add(lblNewLabel_7_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(121, 71, 165, 20);
		panel_1.add(textField_10);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Adult");
		lblNewLabel_7_1_1.setBounds(10, 255, 67, 14);
		panel_1.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Children");
		lblNewLabel_7_1_2.setBounds(202, 255, 67, 14);
		panel_1.add(lblNewLabel_7_1_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(70, 252, 85, 20);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(278, 252, 85, 20);
		panel_1.add(textField_12);
		
		JLabel lblNewLabel_4_5 = new JLabel("Price");
		lblNewLabel_4_5.setBounds(10, 321, 46, 14);
		panel_1.add(lblNewLabel_4_5);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(69, 318, 86, 20);
		panel_1.add(textField_15);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				{
					model.addRow(new String[] {
                         textField_10.getText(),
                         textField_4.getText(),
                         textField_7.getText(),
                         textField_8.getText(),
                         textField_16.getText(),
                         textField_5.getText(),
                         textField_6.getText(),
                         textField_9.getText(),
                         textField_3.getText(),
					});
					
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(185, 350, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4_5_1 = new JLabel("No.of seats");
		lblNewLabel_4_5_1.setBounds(10, 290, 67, 14);
		panel_1.add(lblNewLabel_4_5_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(87, 287, 86, 20);
		panel_1.add(textField_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(0, 542, 900, 165);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Ticket No.", "Name", "From", "To", "No.of.seats", "Date", "Booking date", "Booking Time", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 880, 143);
		panel_2.add(table);
	}
}




//	if(from==Kasargod&&to==Kannur||from==Kannur&&to==Kasargod) {
//		
//		total=price+180;
//	}


