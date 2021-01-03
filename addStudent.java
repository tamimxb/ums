package ums;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addStudent {

	JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JLabel l3;
	private JLabel l4;
	private JTextField t3;
	private JTextField t4;
	private JLabel l5;
	private JTextField t5;
	private JLabel l7;
	private JTextField t7;
	private JLabel l6;
	private JTextField t6;
	private JLabel l8;
	private JTextField t8;
	private JComboBox cb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addStudent window = new addStudent();
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
	public addStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 830, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l0 = new JLabel("Student Addmission Form");
		l0.setFont(new Font("Tahoma", Font.BOLD, 23));
		l0.setBounds(265, 11, 315, 39);
		frame.getContentPane().add(l0);
		
		JLabel l1 = new JLabel("Name");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(67, 92, 57, 39);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Age");
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		l2.setBounds(77, 150, 57, 39);
		frame.getContentPane().add(l2);
		
		l3 = new JLabel("Father's Name");
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		l3.setBounds(418, 92, 138, 39);
		frame.getContentPane().add(l3);
		
		l4 = new JLabel("DOB");
		l4.setFont(new Font("Tahoma", Font.BOLD, 16));
		l4.setBounds(499, 155, 57, 29);
		frame.getContentPane().add(l4);
		
		l5 = new JLabel("Roll ID");
		l5.setFont(new Font("Tahoma", Font.BOLD, 16));
		l5.setBounds(70, 219, 64, 29);
		frame.getContentPane().add(l5);
		
		l6 = new JLabel("Email");
		l6.setFont(new Font("Tahoma", Font.BOLD, 16));
		l6.setBounds(70, 279, 64, 29);
		frame.getContentPane().add(l6);
		
		l7 = new JLabel("Phone Number");
		l7.setFont(new Font("Tahoma", Font.BOLD, 16));
		l7.setBounds(418, 219, 139, 29);
		frame.getContentPane().add(l7);
		
		l8 = new JLabel("Address");
		l8.setFont(new Font("Tahoma", Font.BOLD, 16));
		l8.setBounds(485, 281, 71, 29);
		frame.getContentPane().add(l8);
		
		JLabel l9 = new JLabel("Course");
		l9.setFont(new Font("Tahoma", Font.BOLD, 16));
		l9.setBounds(67, 333, 64, 29);
		frame.getContentPane().add(l9);
		
		JLabel l10 = new JLabel("Religion");
		l10.setFont(new Font("Tahoma", Font.BOLD, 16));
		l10.setBounds(485, 338, 71, 29);
		frame.getContentPane().add(l10);
		
		t1 = new JTextField();
		t1.setBounds(134, 99, 166, 29);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(134, 157, 166, 29);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(566, 99, 166, 29);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(566, 157, 166, 29);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(134, 221, 166, 29);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBackground(new Color(255, 255, 255));
		t6.setBounds(134, 281, 166, 29);
		frame.getContentPane().add(t6);
		t6.setColumns(10);
		
		t7 = new JTextField();
		t7.setBounds(566, 221, 166, 29);
		frame.getContentPane().add(t7);
		t7.setColumns(10);
		
		t8 = new JTextField();
		t8.setBounds(566, 281, 166, 29);
		frame.getContentPane().add(t8);
		t8.setColumns(10);
		
		String c[] = {"CSE","EEE","LAW","BBA","TEX","ENG"};
		JComboBox jComboBox = new JComboBox(c);
		JComboBox cb1 = jComboBox;
		cb1.setBounds(134, 335, 166, 29);
		frame.getContentPane().add(cb1);
		
		String d[] = {"Islam","Hindu","Cristan","Others"};
		cb2 = new JComboBox(d);
		cb2.setBounds(566, 338, 166, 29);
		frame.getContentPane().add(cb2);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String name  = t1.getText();
					String fname = t3.getText();
					String age   = t2.getText();
					String dob   = t4.getText();
					String rid   = t5.getText();
					String phone = t7.getText();
					String eid   = t6.getText();
					String addr  = t8.getText();
					String c = (String)cb1.getSelectedItem();
					String r = (String)cb2.getSelectedItem();
					getCon n = new getCon();
					String sql = "Insert into student values('"+rid+"','"+name+"','"+fname+"','"+dob+"','"+eid+"','"+age+"','"+addr+"','"+phone+"','"+c+"','"+r+"')";
					System.out.println(sql);
					n.s.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "Register Successfull");
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Error is : "+e);
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 16));
		b1.setBounds(259, 485, 138, 46);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Cancle");
		b2.setFont(new Font("Tahoma", Font.BOLD, 16));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new umsHome().main(null);
				
			}
		});
		b2.setBounds(442, 485, 138, 46);
		frame.getContentPane().add(b2);
		
		
	}
}
