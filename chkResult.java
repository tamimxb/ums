/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ums;

import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author SHAHID
 */
public class chkResult extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form chkResult
     */
    public chkResult() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Dept", "Age", "Mail"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        b2.setText("clear");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        btnNewButton = new JButton("Delete");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        			try {
        			String id = (String)t1.getText();
        			//String name = t2.getText();
        			//String age = (String)t3.getText();
        			getCon n = new getCon();
					String sql = "Delete  from student  where roll = '"+id+"'";
					n.s.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "Delete Successfull");
        			
        			
        		}catch(Exception e) {
        			System.out.println(""+e);
        			
        		}
        		
        	}
        });
        
        b4 = new JButton("Update");
        b4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
        			
        			String id = (String)t1.getText();
        			String name = t2.getText();
        			String age = (String)t3.getText();
        			getCon n = new getCon();
					String sql = "Update student set name ='"+name+"',age = '"+age+"' where Roll = '"+id+"'";
					n.s.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "Update Successfull");
        			
        			
        		}catch(Exception e) {
        			System.out.println(""+e);
        			
        		}
        	}
        });
        
        t1 = new JTextField();
        t1.setColumns(10);
        
        t2 = new JTextField();
        t2.setColumns(10);
        
        t3 = new JTextField();
        t3.setColumns(10);
        
        lblNewLabel = new JLabel("ID");
        
        lblNewLabel_1 = new JLabel("Name");
        
        lblNewLabel_2 = new JLabel("Age");
        
        JButton b5 = new JButton("Add");
        b5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
				new addStudent().frame.setVisible(true);   		
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        						.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(t2)
        						.addComponent(t1, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        						.addComponent(t3)))
        				.addComponent(b4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        				.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        				.addComponent(b2, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        				.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        				.addComponent(b5, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(t1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(t2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblNewLabel_1))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(t3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
        						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
        					.addComponent(b5)
        					.addGap(16)
        					.addComponent(b4)
        					.addGap(18)
        					.addComponent(btnNewButton)
        					.addGap(18)
        					.addComponent(jButton1)
        					.addGap(18)
        					.addComponent(b2)))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

                // TODO add your handling code here:
                 try {
                
		   getCon n = new getCon();
		   String sql = "select Roll,name,dept,age,eid from student ";
		   ResultSet rs = n.s.executeQuery(sql);
		   while (rs.next()) {
			   String id = String.valueOf( rs.getInt("Roll"));
			   String name = rs.getString("name");
			   String dept = rs.getString("dept");
			   String age = String.valueOf(rs.getString("age"));
			   String mail = rs.getString("eid");
			   
			   String tblData[] = {id,name,dept,age,mail};
			   DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
			   //tbModel.setRowCount(0); 
			   tbModel.addRow(tblData);
			   
		   }
		   
		   
	   }catch(Exception e) {
		   
	   }
                
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
  		tbModel.setRowCount(0); 
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chkResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chkResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chkResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chkResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chkResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton b2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private JButton btnNewButton;
    private JButton b4;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
}
