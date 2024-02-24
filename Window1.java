
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.*;
import javax.swing.*;


public class Wendow1 extends JFrame {
        

    // Variables declaration - do not modify   
    private JMenuBar menuBar; 
    private JMenu fileMenu;
    private JMenu textMenu; 
    private JMenuItem exitItem;
    private JMenuItem Read;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private boolean FirstName=false;
    private boolean LastName=false;
    private boolean ID=false;
    private boolean PhoneNumber=false;
    private boolean Email=false;
    private Account account=new Account();
 
    
    public Wendow1() {
        
        
      setTitle("OOP2 Project");
      setSize(636, 400);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     BulidComponent();
     
     setVisible(true);
     
    
     
     
     
}

    private void BulidComponent() {
        // Reference objects to address
        jPanel4 = new JPanel();
        jLabel7 = new JLabel();
        jLabel1 = new JLabel();
        jLabel5 = new JLabel();
        jTextField3 = new JTextField(10);
        jLabel6 = new JLabel();
        jTextField4 = new JTextField(10);
        jButton1 = new JButton();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField(10);
        jLabel3 = new JLabel();
        jTextField2 = new JTextField(10);
        jLabel4 = new JLabel();
        jTextField5 = new JTextField(10);
        jLabel9 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel10 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jLabel8 = new JLabel();
        
        
        
        // Create Frame background by using Label
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final_project_oop2/Image.gif.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 60, 100, 16);


        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 60, 130, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 60, 90, 16);

        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTextField2);
        jTextField2.setBounds(410, 60, 120, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Natoinal ID :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 100, 120, 16);

        jTextField5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTextField5);
        jTextField5.setBounds(230, 100, 290, 20);
        
        // Set frame layout to null 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Design label
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // set font
        jLabel1.setForeground(new java.awt.Color(255, 255, 255)); // set foreground color 
        jLabel1.setText("Welcome to Jeddah Season ."); // set text 
        getContentPane().add(jLabel1); // add it ro frame
        jLabel1.setBounds(20, 10, 380, 25); // place it 

        // Design  label
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // set font
        jLabel5.setForeground(new java.awt.Color(255, 255, 255)); // set foreground color 
        jLabel5.setText("Phone Number: "); // set text 
        getContentPane().add(jLabel5); // add it to frame
        jLabel5.setBounds(70, 180, 130, 16); // place it 

        // Design text field
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder()); // create EtchedBorde
        getContentPane().add(jTextField3); // add it to frame
        jTextField3.setBounds(230, 180, 290, 20); // place it

        // Design label
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // set font
        jLabel6.setForeground(new java.awt.Color(255, 255, 255)); // set foreground color 
        jLabel6.setText("Email : "); // set text
        getContentPane().add(jLabel6); // add it to frame
        jLabel6.setBounds(70, 220, 90, 16); // place it 

        // Design text field
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder()); // create EtchedBorde
        getContentPane().add(jTextField4); // add it to frame
        jTextField4.setBounds(230, 220, 290, 20); // place it
 
        // Design Button
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Enter");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
        // Design label
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 140, 80, 16);
        
        // Design ComboBox
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alsamer", "Abhar", "Alsafa", "Almanar", "Albalad",
        "Buraiman"}));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 140, 61, 22);
        
        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 140, 60, 16);

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male"}));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(400, 140, 61, 22);
        
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final_project_oop2/Image.gif.jpg"))); // NOI18N
        jLabel8.setText("");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 640, 360);
        
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jButton1.setText("Enter");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jButton1);
        jButton1.setBackground(Color.WHITE);
        jButton1.setBounds(210, 270, 180, 60);
        
        
        buildMenuBar();
        setJMenuBar(menuBar);
        
        jButton1.addActionListener(new Test());
        
    }
        private void buildMenuBar()
 {
// Create the menu bar.
menuBar = new JMenuBar();
// Create the file and text menus.
buildFileMenu();
buildTextMenu();

// Add the file and text menus to the menu bar.
 menuBar.add(fileMenu);
 menuBar.add(textMenu);
 
 add(menuBar);
 }
        private void buildFileMenu()
{
// Create an Exit menu item.
 exitItem = new JMenuItem("Exit");
 exitItem.setMnemonic(KeyEvent.VK_X);
 exitItem.addActionListener(new ExitListener());

// Create a JMenu object for the File menu.
fileMenu = new JMenu("File");
fileMenu.setMnemonic(KeyEvent.VK_F);

// Add the Exit menu item to the File menu.
fileMenu.add(exitItem);
}

    private void buildTextMenu() {
       Read=new JMenuItem("Read Costumer Information");
        Read.setMnemonic(KeyEvent.VK_X);
        Read.addActionListener(new ReadListener());
        textMenu=new JMenu("Print");
        textMenu.add(Read);
        
    }
   public class ExitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    
}
   public class ReadListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String password="Chr210@", input;
            input=JOptionPane.showInputDialog("Enter Password: ");
           
            
            
            while(!input.equals(password)) {
                input=JOptionPane.showInputDialog("Retry\nEnter Password: ");
            }
            

            try {
                account.readAccount();
            } catch (IOException ex) {
               System.exit(0);
            }

        }
   }
    
    private class Test implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            try {
                FirstName=account.isNameValid(jTextField1.getText());
                
            } catch (Exception ex) {
                jTextField1.setBackground(Color.red);
                jTextField1.setText("Name should be more then 1 letter , and doesn't conatian numbers.");
            }
            
            
            try {
                LastName=account.isNameValid(jTextField2.getText());
                
            } catch (Exception ex) {
                jTextField2.setBackground(Color.red);
                jTextField2.setText("Name should be more then 1 letter , and doesn't conatian numbers.");
            }
            
            try {
                PhoneNumber=account.isPhoneNumberValid(jTextField3.getText());
                
            } catch (Exception ex) {
                jTextField3.setBackground(Color.red);
                jTextField3.setText("Phone number should in 10 digits and only contain numbers.");
            }
            
             try {
                ID=account.isIDValid(jTextField5.getText());
                
            } catch (Exception ex) {
                jTextField5.setBackground(Color.red);
                jTextField5.setText("ID should be in 10 digits and only contain numbers.");
            }
            
             try {
                Email=account.isEmailValid(jTextField4.getText());
                
            } catch (Exception ex) {
                jTextField4.setBackground(Color.red);
                jTextField4.setText("Invalid email.");
            }
             
 
       if(ID && FirstName && LastName && Email && PhoneNumber) {
           
          account.setEmail(jTextField4.getText());
          account.setFirstName(jTextField1.getText());
          account.setLastName(jTextField2.getText());
          account.setID(jTextField5.getText());
          account.setPhoneNumber(jTextField3.getText());
          account.setAddress((String)jComboBox1.getSelectedItem());
          account.setGender((String)jComboBox2.getSelectedItem());
                try {
                    account.writeAccount();
                } catch (IOException ex) {
                   System.exit(0);
                }
          
                
         new Wendow3(account);
         
          }
        }
}
    
    
    
}
 
