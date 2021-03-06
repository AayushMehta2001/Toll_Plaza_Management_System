/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tollmanagement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author aashita
 */
public class Calculate extends javax.swing.JFrame {
    static Calculate frame;
    int fare_amt=0;
    /**
     * Creates new form calculate
     */
    public Calculate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numberplate1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vtype1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtype1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        station1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        owner1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        aadhaar1 = new javax.swing.JTextField();
        date1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        addnextstation = new javax.swing.JButton();
        fare = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 36)); // NOI18N
        jLabel1.setText("CALCULATE TOLL");

        cal.setText("Calculate (Current Charges)");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });

        jLabel2.setText("Vehicle Number :");

        jLabel3.setText("Choose Vehicle Type :");

        vtype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "3 Wheeler", "Car/jeep", "LCV", "Bus", "Truck", "MAV" }));

        jLabel4.setText("Choose Journey Type :");

        jtype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Single", "Return" }));

        jLabel5.setText("Select Poll Station :");

        station1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Jaipur", "Delhi", "Ajmer" }));

        jLabel7.setText("Enter Date(dd/mm/yyyy) :");

        jLabel6.setText("Owner's Name :");

        jLabel8.setText("Aadhaar Number :");

        jButton1.setText("generate bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        addnextstation.setText("Add next Toll Station");
        addnextstation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnextstationActionPerformed(evt);
            }
        });

        fare.setFont(new java.awt.Font("Ubuntu Light", 1, 23)); // NOI18N
        fare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aadhaar1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(owner1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numberplate1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(fare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(vtype1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jtype1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(station1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(44, 44, 44)))
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addnextstation))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(numberplate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(owner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(aadhaar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(vtype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(fare)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtype1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(station1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addnextstation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> s = new ArrayList<>();
        s.add(numberplate1.getText());
        s.add(owner1.getText());
        s.add(aadhaar1.getText());
        s.add((String) vtype1.getSelectedItem());
        s.add(Integer.toString(fare_amt));
        
        fare_amt=0;
        new Billing(s).setVisible(true);
	frame.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
        
        String dateString = date1.getText();
        java.sql.Date sqlDate = null;
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        Date date = null;
        try {
            date = formatter.parse(dateString);
        } catch (ParseException ex) {
            Logger.getLogger(Calculate.class.getName()).log(Level.SEVERE, null, ex);
        }
        sqlDate = new java.sql.Date(date.getTime());
        
        String aadhaar=aadhaar1.getText();
        String numberplate=numberplate1.getText();
        String owner=owner1.getText();
        String vtype=(String) vtype1.getSelectedItem();
        String jtype=(String) jtype1.getSelectedItem();
        String station=(String) station1.getSelectedItem();
        
        int fareid = 0,boothid = 0,fare_cur = 0;
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");//aa872002 is the password
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT fareid,fare_amt FROM fare WHERE vehicletype='"+vtype+"' AND journeytype='"+jtype+"';";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                fareid = Integer.parseInt(rs.getString("fareid"));
                fare_cur = Integer.parseInt(rs.getString("fare_amt"));
                fare_amt+=fare_cur;
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT boothid FROM booth WHERE location='"+station+"';";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                boothid = Integer.parseInt(rs.getString("boothid"));
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        boolean flag1=false,flag2=false;
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT vehicle_no FROM details WHERE vehicle_no='"+numberplate+"';";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                flag1=true;
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        if(flag1==false) 
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
                Statement stmt= (Statement) con.createStatement();
                String query="INSERT INTO details VALUES ('"+numberplate+"','"+vtype+"','"+owner+"','"+aadhaar+"');";
                stmt.executeUpdate(query);
            }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
        
        if(jtype=="Single")
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
                Statement stmt= (Statement) con.createStatement();
                String query="SELECT visitdate FROM transactions WHERE vehicle_no='"+numberplate+"' AND journeytype='Return' AND visitdate='"+sqlDate+"';";
                ResultSet rs = stmt.executeQuery(query);
                if(rs.next())
                {
                    flag2=true;
                }
            }
            catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
        
        if(flag2==true)
        {
            fare_amt -= fare_cur;
            fare_cur = 0;
        }
        
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/tollmanagement","root","aa872002");
            Statement stmt= (Statement) con.createStatement();
            String query = "insert into transactions(vehicle_no,boothid,journeytype,fareid,visitdate) values ( ? , ? , ? , ? , ?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, numberplate);
            ps.setInt(2, boothid);
            ps.setString(3, jtype);
            ps.setInt(4, fareid);
            ps.setDate(5,sqlDate);
            ps.executeUpdate();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        fare.setText("Rs. "+Integer.toString(fare_cur));
    }//GEN-LAST:event_calActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fare_amt=0;
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addnextstationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnextstationActionPerformed
        date1.setText("");
        jtype1.setSelectedIndex(0);
        station1.setSelectedIndex(0);
        fare.setText("");
    }//GEN-LAST:event_addnextstationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                frame = new Calculate();
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhaar1;
    private javax.swing.JButton addnextstation;
    private javax.swing.JButton cal;
    private javax.swing.JTextField date1;
    private javax.swing.JLabel fare;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jtype1;
    private javax.swing.JTextField numberplate1;
    private javax.swing.JTextField owner1;
    private javax.swing.JComboBox<String> station1;
    private javax.swing.JComboBox<String> vtype1;
    // End of variables declaration//GEN-END:variables
}
