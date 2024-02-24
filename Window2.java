


import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.JScrollBar;

import javax.swing.JScrollPane;

import javax.swing.JSpinner;

import javax.swing.JTextField;

import java.lang.String;

import javax.swing.ButtonGroup;

import javax.swing.DefaultListModel;

import javax.swing.JButton;

import javax.swing.JList;
import javax.swing.JOptionPane;

/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
/**
 *
 * This wendow will display the events and culclate price
 *
 * @author LAYAN
 * @author Reeam
 */
public class Wendow2 extends JFrame implements ActionListener {

    private javax.swing.ButtonGroup buttonGroup1 = new ButtonGroup();

    private javax.swing.JLabel jLabel1 = new JLabel();

    private javax.swing.JLabel jLabel3 = new JLabel();

    private javax.swing.JList jList1 = new JList();

    private javax.swing.JPanel jPanel1 = new JPanel();

    private javax.swing.JPanel jPanel2 = new JPanel();

    private javax.swing.JPanel jPanel4 = new JPanel();

    private javax.swing.JPanel jPanel5 = new JPanel();

    private javax.swing.JRadioButton jRadioButton1 = new JRadioButton();

    private javax.swing.JRadioButton jRadioButton2 = new JRadioButton();

    private javax.swing.JRadioButton jRadioButton3 = new JRadioButton();

    private javax.swing.JScrollPane jScrollPane1 = new JScrollPane();

    private javax.swing.JTextField jTextField1 = new JTextField(10);

    private javax.swing.JButton jButton1 = new JButton();

    private javax.swing.JButton jButton2 = new JButton();

    DefaultListModel listModel = new DefaultListModel();

    private javax.swing.JScrollPane jScrollPane2 = new JScrollPane();

    private javax.swing.JList jList2 = new JList(listModel);
    private Account account=new Account();

    private double total = 0.0;

    public Wendow2(Account account) {
    this.account=account;
        setTitle("OOP2 Project");

        setSize(636, 400);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();

        setVisible(true);

    }



    private void initComponents() {
        
        
        
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ticket class",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 3, 12),
                new java.awt.Color(153, 0, 153))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jTextField1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jLabel1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setText("total :");

        jList1.setBackground(new java.awt.Color(153, 0, 153));

        jList1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jList1.setForeground(new java.awt.Color(255, 255, 255));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {

            String[] strings = {"CityWalk", "WinterWonderLand", "Safari", "Aqueruam", "MDL Beast", "Spring Festival", "Formula 1", " The Saudi Cup "};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }

        });

        jScrollPane1.setViewportView(jList1);

        jList1.setVisibleRowCount(5);

        jList2.setBackground(new java.awt.Color(153, 0, 153));

        jList2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jList2.setForeground(new java.awt.Color(255, 255, 255));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {

            String[] strings = {"                                    ", "                                  ", "                             ",
                "                                            ", "                                         ",
                "                                           ", "                                           ", "                                      "};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }

        });

        jScrollPane2.setViewportView(jList2);

        jList2.setVisibleRowCount(4);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Event",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(153, 0, 153))); // NOI18N

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ticket info",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(153, 0, 153))); // NOI18N

        jPanel5.setForeground(new java.awt.Color(204, 204, 204));

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jRadioButton2.setForeground(new java.awt.Color(153, 0, 153));

        jRadioButton2.setText("Silver");

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jRadioButton1.setForeground(new java.awt.Color(153, 0, 153));

        jRadioButton1.setText("Standard");

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        jRadioButton3.setForeground(new java.awt.Color(153, 0, 153));

        jRadioButton3.setText("Gold");

        jTextField1.setEditable(false);
        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Done");
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Add");
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        
        jButton1.addActionListener(new DoneButton());

        jButton2.addActionListener(new AddButton());

        setLayout(new FlowLayout(FlowLayout.CENTER, 100, 5));

        setBackground(Color.WHITE);

        jPanel5.setBackground(Color.WHITE);

        jPanel1.setBackground(Color.WHITE);

        jPanel2.setBackground(Color.WHITE);

        jPanel1.add(jScrollPane1);

        add(jPanel1);

        buttonGroup1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton1);

        jRadioButton1.setBackground(Color.WHITE);

        jRadioButton2.setBackground(Color.WHITE);

        jRadioButton3.setBackground(Color.WHITE);

        jPanel2.setLayout(new GridLayout(3, 1));

        jPanel2.add(jRadioButton1);

        jPanel2.add(jRadioButton2);

        jPanel2.add(jRadioButton3);

        add(jPanel2);

        jPanel5.add(jScrollPane2);

        jPanel5.add(jButton2);

        add(jPanel5);

        jPanel4.add(jLabel1);

        jPanel4.add(jTextField1);

        jPanel4.add(jButton1);

        add(jPanel4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   


    private class DoneButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            JOptionPane.showMessageDialog(null,"Thank you, "+account.getFirstName()+" "+account.getLastName()+"\n"+
            "Your tota price is: "+total+"\n" +"More information will be sent on: \n"+"Email: "+account.getEmail()+"\nPhone"
                    + " Number: "+account.getPhoneNumber());
            
            System.exit(0);

        }

    }

    private class AddButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            double price = 0.0;
            
            String ticket;

            String[] ticketData = {"", "", "", "", "", "", "", "", "", ""};

            ticket = (String) jList1.getSelectedValue();

            int i = 0;

            if (jRadioButton1.isSelected()) {

                price = 50;

                ticketData[i] = ticket + " price= "
                        + String.valueOf(price);

                listModel.addElement(ticketData[i]);

                jList2.setModel(listModel);

                total = total + price;

                i++;

            } else if (jRadioButton2.isSelected()) {

                price = 80;

                ticketData[i] = ticket + " price= "
                        + String.valueOf(price);

                listModel.addElement(ticketData[i]);

                jList2.setModel(listModel);

                total = total + price;

                i++;

            } else if (jRadioButton3.isSelected()) {

                price = 100;

                ticketData[i] = ticket + " price= "
                        + String.valueOf(price);

                listModel.addElement(ticketData[i]);

                jList2.setModel(listModel);

                total = total + price;

                i++;

            }

            jTextField1.setText(String.valueOf(total));

        }

    }



}
