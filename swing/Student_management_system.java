package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Student_management_system {

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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_management_system window = new Student_management_system();
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
	public Student_management_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(420, 0, 221, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new TitledBorder(null, "Student Details", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(40, 42, 376, 370);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setBounds(20, 26, 79, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First name");
		lblNewLabel_1_1.setBounds(20, 51, 79, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last name");
		lblNewLabel_1_2.setBounds(20, 77, 79, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Course code");
		lblNewLabel_1_3.setBounds(20, 102, 79, 14);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Marks");
		lblNewLabel_1_4.setBounds(140, 131, 68, 14);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("English");
		lblNewLabel_1_5.setBounds(10, 163, 68, 14);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Malayalam");
		lblNewLabel_1_6.setBounds(10, 188, 68, 14);
		panel.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Hindi");
		lblNewLabel_1_7.setBounds(10, 213, 68, 14);
		panel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Physics");
		lblNewLabel_1_8.setBounds(10, 238, 68, 14);
		panel.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Chemistry");
		lblNewLabel_1_9.setBounds(191, 163, 68, 14);
		panel.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Biology");
		lblNewLabel_1_10.setBounds(191, 188, 68, 14);
		panel.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("Computer");
		lblNewLabel_1_11.setBounds(191, 213, 68, 14);
		panel.add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_12 = new JLabel("Maths");
		lblNewLabel_1_12.setBounds(191, 238, 68, 14);
		panel.add(lblNewLabel_1_12);
		
		textField = new JTextField();
		textField.setBounds(141, 23, 181, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 49, 181, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 74, 181, 20);
		panel.add(textField_2);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1101A", "1102B", "1103C", "1102C"}));
		comboBox.setBounds(141, 98, 181, 22);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 160, 53, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(97, 185, 53, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(97, 210, 53, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(97, 235, 53, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(269, 160, 53, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(269, 185, 53, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(269, 210, 53, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(269, 235, 53, 20);
		panel.add(textField_10);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Total Score");
		lblNewLabel_1_6_1.setBounds(66, 286, 111, 14);
		panel.add(lblNewLabel_1_6_1);
		
		JLabel lblNewLabel_1_6_2 = new JLabel("Average Score");
		lblNewLabel_1_6_2.setBounds(66, 311, 111, 14);
		panel.add(lblNewLabel_1_6_2);
		
		JLabel lblNewLabel_1_6_2_1 = new JLabel("Ranking");
		lblNewLabel_1_6_2_1.setBounds(66, 336, 111, 14);
		panel.add(lblNewLabel_1_6_2_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(183, 283, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(183, 308, 86, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(183, 336, 86, 20);
		panel.add(textField_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(147, 112, 219));
		panel_1.setBounds(537, 42, 573, 370);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 24, 553, 300);
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				}
		});
		btnNewButton.setBounds(264, 335, 89, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(10, 450, 1137, 105);
		frame.getContentPane().add(panel_2);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student ID", "First name", "Last name", "Course code", "English", "Malayalam", "Hindi", "Physics", "Chemistry", "Biology", "Computer", "Maths", "Total", "Average", "Rank"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_2.add(table);
		
		JButton btnNewButton_1 = new JButton("Add Report");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int eng=Integer.parseInt(textField_3.getText());
				int mal=Integer.parseInt(textField_4.getText());
				int hin=Integer.parseInt(textField_5.getText());
				int phy=Integer.parseInt(textField_6.getText());
				int che=Integer.parseInt(textField_7.getText());
				int bio=Integer.parseInt(textField_8.getText());
				int comp=Integer.parseInt(textField_9.getText());
				int mth=Integer.parseInt(textField_10.getText());
				
				double tot=eng+mal+hin+phy+che+bio+comp+mth;
				String total=String.format("%.2f", tot);
				textField_11.setText(total);
				
		     	double avg=tot/8;
		     	String average=String.format("%.2f", avg);
				textField_12.setText(average);
				
				
				if(tot>=700) {
					textField_13.setText("1");
				}
				else if(tot>600&&tot<700) {
					textField_13.setText("2");
			}else if(tot>500&&tot<400) {
				textField_13.setText("3");
			}else if(tot>300&&tot<200) {
				textField_13.setText("4");
			}else {
				textField_13.setText("Failed");
			}
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				{
					model.addRow(new String[] {
                         textField.getText(),
                         textField_1.getText(),
                         textField_2.getText(),
                         (String) comboBox.getSelectedItem(),
                         textField_3.getText(),
                         textField_4.getText(),
                         textField_5.getText(),
                         textField_6.getText(),
                         textField_7.getText(),
                         textField_8.getText(),
                         textField_9.getText(),
                         textField_10.getText(),
                         textField_11.getText(),
                         textField_12.getText(),
                         textField_13.getText(),
					});
					
				}
				
         }
		});
		btnNewButton_1.setBounds(95, 566, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(r);
				
				
			}
		});
		btnNewButton_1_1.setBackground(Color.MAGENTA);
		btnNewButton_1_1.setBounds(307, 566, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Show Report");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.append("\t\t\tMark List"+"\n"+
						"Student ID\t"+	textField.getText()+"\n"+
						"Name\t"+textField_1.getText()+textField_2.getText()+"\n"+
						"\t\t\t  Marks\n"+"\t\t\t********"+"\n"+
						"English\t"+textField_3.getText()+"\n"+
						"Malayalam\t"+textField_4.getText()+"\n"+
						"Hindi\t"+textField_5.getText()+"\n"+
						"Physics\t"+textField_6.getText()+"\n"+
						"Chemistry\t"+textField_7.getText()+"\n"+
						"Biology\t"+textField_8.getText()+"\n"+
						"Computer\t"+textField_9.getText()+"\n"+
						"Maths\t"+textField_10.getText()+"\n"+
						"**************************************************************************************************************"+"\n"+
						"Total\t"+textField_11.getText()+"\n"+
						"Average\t"+textField_12.getText()+"\n"+
						"Rank\t"+textField_13.getText()+""
			
			);
				
				
			}
		});
		btnNewButton_1_2.setBackground(Color.MAGENTA);
		btnNewButton_1_2.setBounds(517, 566, 111, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Exit");
		btnNewButton_1_3.setBackground(Color.MAGENTA);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
				
			}
		});
		btnNewButton_1_3.setBounds(742, 566, 89, 23);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Reset");
		btnNewButton_1_4.setBackground(Color.MAGENTA);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
                         textField.setText(" ");
                         textField_1.setText(" ");
                         textField_2.setText(" ");
                        comboBox.setSelectedItem(" ");
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
					
					
				}
			
		});
		btnNewButton_1_4.setBounds(952, 566, 89, 23);
		frame.getContentPane().add(btnNewButton_1_4);
		frame.setBounds(100, 100, 1173, 688);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
