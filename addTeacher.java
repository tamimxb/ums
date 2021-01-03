package ums;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class addTeacher {

	public JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addTeacher window = new addTeacher();
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
	public addTeacher() {
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
		
		JLabel l0 = new JLabel("UMS Faculty From");
		l0.setBounds(307, 28, 224, 29);
		l0.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(l0);
		
		JLabel l1 = new JLabel("Name");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(69, 109, 78, 29);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Father's Name");
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		l2.setBounds(450, 109, 117, 29);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Age");
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		l3.setBounds(69, 181, 78, 29);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("DOB");
		l4.setFont(new Font("Tahoma", Font.BOLD, 16));
		l4.setBounds(489, 183, 78, 29);
		frame.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("Email");
		l5.setFont(new Font("Tahoma", Font.BOLD, 16));
		l5.setBounds(69, 244, 78, 29);
		frame.getContentPane().add(l5);
		
		JLabel l6 = new JLabel("Address");
		l6.setFont(new Font("Tahoma", Font.BOLD, 16));
		l6.setBounds(489, 244, 78, 29);
		frame.getContentPane().add(l6);
		
		JLabel l7 = new JLabel("Emp ID");
		l7.setFont(new Font("Tahoma", Font.BOLD, 16));
		l7.setBounds(69, 311, 78, 29);
		frame.getContentPane().add(l7);
		
		JLabel l8 = new JLabel("Dept.");
		l8.setFont(new Font("Tahoma", Font.BOLD, 16));
		l8.setBounds(489, 316, 78, 29);
		frame.getContentPane().add(l8);
		
		JLabel l9 = new JLabel("Education");
		l9.setFont(new Font("Tahoma", Font.BOLD, 16));
		l9.setBounds(69, 375, 86, 29);
		frame.getContentPane().add(l9);
		
		t1 = new JTextField();
		t1.setBounds(168, 111, 166, 29);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(577, 111, 166, 29);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(168, 183, 166, 29);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(577, 183, 166, 29);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(168, 246, 166, 29);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(577, 246, 166, 29);
		frame.getContentPane().add(t6);
		t6.setColumns(10);
		
		t7 = new JTextField();
		t7.setBounds(168, 313, 166, 29);
		frame.getContentPane().add(t7);
		t7.setColumns(10);
		
		String d[] = {"B.TECH","M.TECH","M.SC","B.SC","HONS"};
		JComboBox c1 = new JComboBox(d);
		c1.setBounds(577, 316, 166, 29);
		frame.getContentPane().add(c1);
		
		String c[] = {"CSE","EEE","LAW","BBA","TEX","ENG"};
		JComboBox c2 = new JComboBox(c);
		c2.setBounds(168, 377, 166, 29);
		frame.getContentPane().add(c2);
		
		
		
		
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
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String name  = t1.getText();
					String fname = t2.getText();
					String age   = t3.getText();
					String dob   = t4.getText();
					String mail  = t5.getText();
					String add   = t6.getText();
					String eid   = t7.getText();
					String c = (String)c1.getSelectedItem();
					String r = (String)c2.getSelectedItem();
					getCon n = new getCon();
					String sql = "Insert into teacher values('"+eid+"','"+name+"','"+fname+"','"+age+"','"+dob+"','"+c+"','"+r+"','"+mail+"','"+add+"')";
					System.out.println(sql);
					n.s.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "Register Successfull");
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Error is : "+e);
				}
			}
				
			
				
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 16));
		b1.setBounds(222, 485, 138, 46);
		frame.getContentPane().add(b1);
		
	
		
	
	}
}
