package ums;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class resultIN {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resultIN window = new resultIN();
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
	public resultIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 485, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel L0 = new JLabel("Marks of the student");
		L0.setFont(new Font("Tahoma", Font.BOLD, 25));
		L0.setBounds(86, 41, 338, 58);
		frame.getContentPane().add(L0);
		
		JLabel l1 = new JLabel("ID");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(49, 135, 56, 27);
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(115, 133, 237, 29);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("Subjects");
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		l2.setBounds(55, 247, 86, 29);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Marks");
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		l3.setBounds(338, 247, 86, 29);
		frame.getContentPane().add(l3);
		
		t2 = new JTextField();
		t2.setBounds(326, 287, 74, 25);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		String c[] = {"CSE101","EEE101","CSE205","CSE109","CSE305"};
		JComboBox c1 = new JComboBox(c);
		c1.setBounds(29, 287, 130, 25);
		frame.getContentPane().add(c1);
		
		String d[] = {"CSE101","EEE101","CSE205","CSE109","CSE305"};
		JComboBox c2 = new JComboBox(d);
		c2.setBounds(29, 337, 130, 25);
		frame.getContentPane().add(c2);
		
		String e[] = {"CSE101","EEE101","CSE205","CSE109","CSE305"};
		JComboBox c3 = new JComboBox(e);
		c3.setBounds(29, 384, 130, 25);
		frame.getContentPane().add(c3);
		
		String f[] = {"CSE101","EEE101","CSE205","CSE109","CSE305"};
		JComboBox c4 = new JComboBox(f);
		c4.setBounds(29, 431, 130, 25);
		frame.getContentPane().add(c4);
		
		t3 = new JTextField();
		t3.setBounds(326, 337, 74, 25);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(326, 384, 74, 25);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(326, 431, 74, 25);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					String c = (String)c1.getSelectedItem();
					String d = (String)c2.getSelectedItem();
					String e = (String)c3.getSelectedItem();
					String f = (String)c4.getSelectedItem();
					getCon n = new getCon();
					String sql = "Insert into sub values('"+t1.getText()+"','"+c+"','"+d+"','"+e+"','"+f+"')";
					String sql1 = "Insert into mrk values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
					System.out.println(sql);
					n.s.executeUpdate(sql);
					n.s.executeUpdate(sql1);
					JOptionPane.showMessageDialog(null, "Upload Successfull");
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Error is : "+e);
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 16));
		b1.setBounds(76, 504, 138, 46);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Cancle");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				new umsHome().main(null);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 16));
		b2.setBounds(262, 504, 138, 46);
		frame.getContentPane().add(b2);
	}

}
