/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_project_oop2;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 * The purpose of this wendow is to test if the user are human
 * @author reem
 * @author Layan
 */
public class Wendow3 extends JFrame{

    private JButton jButton1=new JButton("Verify");
    private JCheckBox jCheckBox1=new JCheckBox();
    private JCheckBox jCheckBox10=new JCheckBox();
    private JCheckBox jCheckBox2=new JCheckBox();
    private JCheckBox jCheckBox3=new JCheckBox();
    private JCheckBox jCheckBox4=new JCheckBox();
    private JCheckBox jCheckBox5=new JCheckBox();
    private JCheckBox jCheckBox6=new JCheckBox();
    private JCheckBox jCheckBox7=new JCheckBox();
    private JCheckBox jCheckBox8=new JCheckBox();
    private JCheckBox jCheckBox9=new JCheckBox();
    private JLabel jLabel1=new JLabel();
    private JLabel jLabel10=new JLabel();
    private JLabel jLabel11=new JLabel();
    private JLabel jLabel12=new JLabel();
    private JLabel jLabel13=new JLabel();
    private JLabel jLabel14=new JLabel();
    private JLabel jLabel2=new JLabel();
    private JLabel jLabel3=new JLabel();
    private JLabel jLabel4=new JLabel();
    private JLabel jLabel5=new JLabel();
    private JLabel jLabel6=new JLabel();
    private JLabel jLabel7=new JLabel();
    private JLabel jLabel8=new JLabel();
    private JLabel jLabel9=new JLabel();
    private JPanel jPanel1=new JPanel();
    private JPanel jPanel2=new JPanel();
    private JPanel jPanel3=new JPanel();
    private JPanel jPanel4=new JPanel();
    private JPanel jPanel5=new JPanel();
    private JPanel jPanel6=new JPanel();
    private JPanel jPanel7=new JPanel();
    private JPanel jPanel8=new JPanel();
    private JPanel jPanel9=new JPanel();
    private JPanel jPanel10=new JPanel();
    private JPanel jPanel11=new JPanel();
    
   private Account account=new Account();
    
    public Wendow3(Account account) {
        this.account=account;
      setTitle("CAPTCHA");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      bulidFrame();
      jButton1.addActionListener(new verify());
      
      pack();
      setVisible(true);
        
        
        
        
        
        
        
        
        
    }

    private void bulidFrame() {
        
        bulidFirstPanel();
        add(jPanel1, BorderLayout.NORTH);
        bulidSecondPanel();
        add(jPanel2,BorderLayout.CENTER);
        bulidThirdPanel();
        add(jButton1,BorderLayout.SOUTH);
        
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
         p1.setBackground(new Color(51, 102, 255));
         p2.setBackground(new Color(51, 102, 255));
         
         add(p1,BorderLayout.WEST);
         add(p2,BorderLayout.EAST);
    }

    private void bulidFirstPanel() {
        jPanel1.setBackground(new Color(51, 102, 255));

        jLabel1.setBackground(new Color(51, 102, 255));
        jLabel1.setFont(new Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Select all images with a");

        jLabel3.setBackground(new Color(51, 102, 255));
        jLabel3.setFont(new Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Cat");

        jLabel4.setBackground(new Color(51, 102, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Click verify once there are none left.");
        
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel4);
        
    }

    private void bulidSecondPanel() {
        
         jPanel2.setLayout(new GridLayout(3,3));
         jPanel2.setBackground(Color.WHITE);
        
        
        jPanel3.setBackground(new Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R1.png"))); // NOI18N
        jPanel3.add(jLabel5);
        jCheckBox1.setToolTipText("Click here to select");
        jPanel3.add(jCheckBox1);
        
        
        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R2.png"))); // NOI18N
        jPanel4.add(jLabel6);
        jCheckBox2.setToolTipText("Click here to select");
        jPanel4.add(jCheckBox2);
        
        jPanel5.setBackground(new Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R3.png"))); // NOI18N
        jPanel5.add(jLabel7);
        jCheckBox3.setToolTipText("Click here to select");
        jPanel5.add(jCheckBox3);
        
        jPanel6.setBackground(new Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R4.png"))); // NOI18N
        jPanel6.add(jLabel8);
        jCheckBox4.setToolTipText("Click here to select");
        jPanel6.add(jCheckBox4);
        
        jPanel7.setBackground(new Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R5.png"))); // NOI18N
        jPanel7.add(jLabel9);
        jCheckBox5.setToolTipText("Click here to select");
        jPanel7.add(jCheckBox5);
        
        jPanel8.setBackground(new Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R6.png"))); // NOI18N
        jPanel8.add(jLabel10);
        jCheckBox6.setToolTipText("Click here to select");
        jPanel8.add(jCheckBox6);
        
        jPanel9.setBackground(new Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel11.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R7.png"))); // NOI18N
        jPanel9.add(jLabel11);
        jCheckBox7.setToolTipText("Click here to select");
        jPanel9.add(jCheckBox7);
        
        jPanel10.setBackground(new Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel12.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R8.png"))); // NOI18N
        jPanel10.add(jLabel12);
        jCheckBox8.setToolTipText("Click here to select");
        jPanel10.add(jCheckBox8);
        
        jPanel11.setBackground(new Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jLabel13.setIcon(new ImageIcon(getClass().getResource("/final_project_oop2/R9.png"))); // NOI18N
        jPanel11.add(jLabel13);
        jCheckBox9.setToolTipText("Click here to select");
        jPanel11.add(jCheckBox9);
        
        

        jPanel2.add(jPanel3);
        jPanel2.add(jPanel4);
        jPanel2.add(jPanel5);
        jPanel2.add(jPanel6);
        jPanel2.add(jPanel7);
        jPanel2.add(jPanel8);
        jPanel2.add(jPanel9);
        jPanel2.add(jPanel10);
        jPanel2.add(jPanel11);
       
    }

    private void bulidThirdPanel() {
       jButton1.setBackground(new Color(51, 102, 255));
       jButton1.setMnemonic(KeyEvent.VK_V);
       jButton1.setToolTipText("Click here to verify");
       jButton1.setFont(new Font("Segoe UI", 3, 12)); // NOI18N
       jButton1.setForeground(new Color(255, 255, 255));
    }
        public boolean isUserRight() throws Exception {
           
            if(jCheckBox1.isSelected())
               throw new Exception();
            
            if(jCheckBox2.isSelected())
               throw new Exception();
            
            if(jCheckBox4.isSelected())
               throw new Exception();
            
            if(jCheckBox7.isSelected())
               throw new Exception();
            
            if(!(jCheckBox3.isSelected() && jCheckBox5.isSelected() && jCheckBox6.isSelected() 
                    && jCheckBox8.isSelected() && jCheckBox9.isSelected()))
                throw new Exception();
            
        
        return true;
    }
    
        private class verify implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            
            boolean flage=false;
            
            try {
                flage=isUserRight();
            } catch (Exception ex) {
                WrongSelection();
            }
            
            
            if(flage)
                new Wendow2(account);
            
         }
        }
        private void WrongSelection() {
        jPanel1.setBackground(Color.RED);

        jLabel1.setBackground(Color.RED);
        jLabel1.setFont(new Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Wrong Selection, please select all images with a");

        jLabel3.setBackground(Color.RED);
        jLabel3.setFont(new Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Cat");

        jLabel4.setBackground(Color.RED);
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Click verify once there are none left.");
        }
            
        }
        
