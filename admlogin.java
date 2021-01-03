package ums;
import java.awt.EventQueue;
import ums.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class admlogin {

	private JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admlogin window = new admlogin();
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
	public admlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel headline = new JLabel("Administrator Login");
		headline.setFont(new Font("Tahoma", Font.BOLD, 21));
		headline.setBounds(97, 3, 231, 35);
		panel.add(headline);
		
		JLabel user = new JLabel("User");
		user.setFont(new Font("Tahoma", Font.BOLD, 17));
		user.setBounds(51, 52, 43, 32);
		panel.add(user);
		
		JLabel pass = new JLabel("Pass");
		pass.setFont(new Font("Tahoma", Font.BOLD, 17));
		pass.setBounds(48, 98, 43, 26);
		panel.add(pass);
		
		username = new JTextField();
		username.setBounds(109, 54, 206, 32);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(109, 95, 207, 33);
		panel.add(password);
		password.setColumns(10);
		
		JButton loginbtn = new JButton("login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					getCon con = new getCon();
					String u = username.getText();
					String v = password.getText();
					String sql = "select * from admlogin where name ='"+u+"' and pass = '"+v+"'";
					ResultSet rs = con.s.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Welcome  "+ u);
						frame.setVisible(false);
						new umsHome().main(null);
					
						
					}
					else
						JOptionPane.showMessageDialog(null, "Invalid Login");
					    frame.setVisible(false);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginbtn.setBounds(156, 146, 113, 32);
		panel.add(loginbtn);
	}
}
