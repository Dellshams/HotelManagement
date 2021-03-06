/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Shams
 */
public class RestaurantPage extends javax.swing.JFrame {

    /**
     * Creates new form RestaurantPage
     */
    public RestaurantPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bknwbtn = new javax.swing.JButton();
        rstrntbtn = new javax.swing.JButton();
        edtdtbtn = new javax.swing.JButton();
        hsekpnbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        homebtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setMinimumSize(new java.awt.Dimension(710, 510));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer ID:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 70, 170, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(320, 70, 170, 30);

        jButton3.setBackground(new java.awt.Color(141, 108, 92));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("CHECK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(540, 70, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Room Number:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(80, 170, 190, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "SD101", "SD102", "SD103", "SD104", "SD105", "PR101", "PR102", "PR103", "PR104", "PR105", "EX101", "EX102", "EX103", "EX104", "EX105", "RS101", "RS102", "RS103", "RS104", "RS105" }));
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(320, 170, 280, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Meal Type:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(80, 260, 180, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Cost:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(80, 390, 150, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Spaghetti", "Burger", "Toast", "Salad", "Noodles", "Rice" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(320, 270, 220, 30);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField11);
        jTextField11.setBounds(320, 390, 140, 30);

        jButton1.setBackground(new java.awt.Color(141, 108, 92));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setText("ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(320, 470, 140, 40);

        jButton2.setBackground(new java.awt.Color(141, 108, 92));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("COST");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(500, 390, 80, 30);

        jLabel1.setBackground(new java.awt.Color(141, 108, 92));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEAL SELECTION");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(230, 10, 220, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagement/cover2.jpeg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 710, 530);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(290, 40, 710, 530);

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 40));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ShamsHotels.ng");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 0, 170, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1000, 40);

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));

        bknwbtn.setBackground(new java.awt.Color(141, 108, 92));
        bknwbtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        bknwbtn.setText("book now");
        bknwbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bknwbtnActionPerformed(evt);
            }
        });

        rstrntbtn.setBackground(new java.awt.Color(141, 108, 92));
        rstrntbtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        rstrntbtn.setText("restaurant");
        rstrntbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstrntbtnActionPerformed(evt);
            }
        });

        edtdtbtn.setBackground(new java.awt.Color(141, 108, 92));
        edtdtbtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        edtdtbtn.setText("edit details");
        edtdtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtdtbtnActionPerformed(evt);
            }
        });

        hsekpnbtn.setBackground(new java.awt.Color(141, 108, 92));
        hsekpnbtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        hsekpnbtn.setText("LAUNDRY");
        hsekpnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsekpnbtnActionPerformed(evt);
            }
        });

        logoutbtn.setBackground(new java.awt.Color(141, 108, 92));
        logoutbtn.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        logoutbtn.setText("Log out");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        homebtn1.setBackground(new java.awt.Color(141, 108, 92));
        homebtn1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        homebtn1.setText("home");
        homebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bknwbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rstrntbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hsekpnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtdtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(homebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bknwbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(rstrntbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(hsekpnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(edtdtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 40, 290, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int Spaghetti = 500;
         int Burger = 700;
         int Toast = 300;
         int Salad = 300;
         int Noodles = 500;
         int Rice = 500;
         
         if(jComboBox1.getSelectedItem().equals("Spaghetti"))
         {
             jTextField11.setText(Integer.toString(Spaghetti));
             double st = Double.parseDouble(jTextField11.getText());
             st=(st );
             String total = String.format(("# %.2f"), st);
             jTextField11.setText(total);
        }
         if (jComboBox1.getSelectedItem().equals("Burger"))
         {
             jTextField11.setText(Integer.toString(Burger));
              double st = Double.parseDouble(jTextField11.getText());
            st=(st );
            String total = String.format(("# %.2f"), st);
            jTextField11.setText(total);
         }
         
         if(jComboBox1.getSelectedItem().equals("Toast"))
         {
             jTextField11.setText(Integer.toString(Toast));
             double st = Double.parseDouble(jTextField11.getText());
             st=(st );
             String total = String.format(("# %.2f"), st);
             jTextField11.setText(total);
        }
         if(jComboBox1.getSelectedItem().equals("Salad"))
         {
             jTextField11.setText(Integer.toString(Salad));
             double st = Double.parseDouble(jTextField11.getText());
             st=(st );
             String total = String.format(("# %.2f"), st);
             jTextField11.setText(total);
        }
         if(jComboBox1.getSelectedItem().equals("Noodles"))
         {
             jTextField11.setText(Integer.toString(Noodles));
             double st = Double.parseDouble(jTextField11.getText());
             st=(st );
             String total = String.format(("# %.2f"), st);
             jTextField11.setText(total);
        }
         if(jComboBox1.getSelectedItem().equals("Rice"))
         {
             jTextField11.setText(Integer.toString(Rice));
             double st = Double.parseDouble(jTextField11.getText());
             st=(st );
             String total = String.format(("# %.2f"), st);
             jTextField11.setText(total);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String Cus_ID, Room_No, Meal_Type, Total_Cost;
        Cus_ID = jTextField2.getText();
        Room_No = (String) jComboBox3.getSelectedItem();
        Meal_Type = (String) jComboBox1.getSelectedItem();
        Total_Cost= jTextField11.getText();
        
        try{ 
        Connection con;
        Class.forName("com.mysql.jdbc.Driver"); 
        String url = "jdbc:mysql://localhost:3306/shamshotel";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
            Statement stmt = null; stmt = con.createStatement(); 
            String query="INSERT INTO Restaurant(Cus_ID, Room_No, Meal_Type, Total_Cost) "
                    + "VALUES('"+Cus_ID+"', '"+Room_No+"', '"+Meal_Type+"', '"+Total_Cost+"');";
            stmt.executeUpdate(query);
            String query2="INSERT INTO AdminRestaurant(Cus_ID, Room_No, Meal_Type, Total_Cost) "
                    + "VALUES('"+Cus_ID+"', '"+Room_No+"', '"+Meal_Type+"', '"+Total_Cost+"');";
            stmt.executeUpdate(query2);
        JOptionPane.showMessageDialog(this, "Your Order has been made");
        
    } 
    catch (Exception e) 
    {
        JOptionPane.showMessageDialog(this, e.getMessage()); 
    }
         WelcomePage wlcp = new WelcomePage();
        this.dispose();
        wlcp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{ 
        Connection con;
        Class.forName("com.mysql.jdbc.Driver"); 
        String url = "jdbc:mysql://localhost:3306/shamshotel";
        String user = "root";
        String password = "";
        con = DriverManager.getConnection(url, user, password);
            Statement stmt = null; 
            stmt = con.createStatement();
            ResultSet rs = null;
        String q2 = "Select * from customer_table where Cus_ID=" + "'"+jTextField2.getText()+ "'"+ " limit 1;";
        rs=stmt.executeQuery(q2);
        if(rs.next())
        {
            JOptionPane.showMessageDialog(null, "Customer ID found!");
        } else 
        {
            JOptionPane.showMessageDialog(null, "Incorrect Customer ID!");
            //jButton1.setEnabled(false);
        }
        }
         catch (Exception e) 
         { 
             JOptionPane.showMessageDialog(this, e.getMessage());
         } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void bknwbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bknwbtnActionPerformed
        BookingPage bkn = new BookingPage ();
        this.dispose();
        bkn.setVisible(true);
        bkn.jButton1.setEnabled(false);
    }//GEN-LAST:event_bknwbtnActionPerformed

    private void rstrntbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstrntbtnActionPerformed
        RestaurantPage restp = new RestaurantPage();
        this.dispose();
        restp.setVisible(true);
    }//GEN-LAST:event_rstrntbtnActionPerformed

    private void edtdtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtdtbtnActionPerformed
        EditDetails edtd = new EditDetails();
        this.dispose();
        edtd.setVisible(true);
    }//GEN-LAST:event_edtdtbtnActionPerformed

    private void hsekpnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsekpnbtnActionPerformed
        Laundry lunp = new Laundry();
        this.dispose();
        lunp.setVisible(true);
    }//GEN-LAST:event_hsekpnbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        logIn lgn = new logIn();
        this.dispose();
        lgn.setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void homebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtn1ActionPerformed
        // TODO add your handling code here:
        WelcomePage wlcp = new WelcomePage();
        this.dispose();
        wlcp.setVisible(true);
    }//GEN-LAST:event_homebtn1ActionPerformed
private JFrame frame1;private JFrame frame;
                                          

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
            java.util.logging.Logger.getLogger(RestaurantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bknwbtn;
    private javax.swing.JButton edtdtbtn;
    private javax.swing.JButton homebtn1;
    private javax.swing.JButton hsekpnbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton rstrntbtn;
    // End of variables declaration//GEN-END:variables
}
