
package project1;

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.*;

/**
 * 
 * @author mahmoud wageeh
 */
public class blood_bank1 extends JFrame {
     private static String selectedGender;
    
    public blood_bank1() {
        initComponents();
         Toolkit toolkit=getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);
      bg.add(MALE);
      bg.add(FEMAL);
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FNAME = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LNAME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CITY = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        AGE = new javax.swing.JTextField();
        MALE = new javax.swing.JRadioButton();
        FEMAL = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EMAIL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        D_SSN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TYPE = new javax.swing.JComboBox<String>();
        D_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<String>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(915, 1050));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/hims-blood-bank-management.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 910, 280);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMinimumSize(new java.awt.Dimension(910, 550));
        jPanel2.setPreferredSize(new java.awt.Dimension(930, 500));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FIRST NAME");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 50, 110, 30);

        FNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNAMEActionPerformed(evt);
            }
        });
        jPanel2.add(FNAME);
        FNAME.setBounds(170, 50, 240, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LAST NAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 100, 100, 20);
        jPanel2.add(LNAME);
        LNAME.setBounds(170, 90, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CITY");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 140, 50, 20);
        jPanel2.add(CITY);
        CITY.setBounds(170, 130, 240, 30);
        jPanel2.add(PHONE);
        PHONE.setBounds(170, 170, 240, 30);
        jPanel2.add(AGE);
        AGE.setBounds(170, 210, 240, 30);

        MALE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MALE.setForeground(new java.awt.Color(255, 255, 255));
        MALE.setText("MALE");
        MALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MALEActionPerformed(evt);
            }
        });
        jPanel2.add(MALE);
        MALE.setBounds(170, 380, 110, 30);

        FEMAL.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FEMAL.setForeground(new java.awt.Color(255, 255, 255));
        FEMAL.setText("FEMALE");
        FEMAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEMALActionPerformed(evt);
            }
        });
        jPanel2.add(FEMAL);
        FEMAL.setBounds(300, 380, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PHONE");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 180, 70, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AGE");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 220, 41, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GENDER");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 380, 70, 20);
        jPanel2.add(EMAIL);
        EMAIL.setBounds(170, 250, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("E-MAIL");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 260, 60, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BLOOD_TYPE");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 340, 110, 20);

        search.setBackground(new java.awt.Color(74, 111, 102));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search);
        search.setBounds(600, 60, 120, 40);

        insert.setBackground(new java.awt.Color(74, 111, 102));
        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel2.add(insert);
        insert.setBounds(600, 120, 120, 40);

        update.setBackground(new java.awt.Color(74, 111, 102));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(600, 180, 120, 40);

        delete.setBackground(new java.awt.Color(74, 111, 102));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete);
        delete.setBounds(600, 240, 120, 40);

        exit.setBackground(new java.awt.Color(74, 111, 102));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(600, 310, 120, 40);
        jPanel2.add(D_SSN);
        D_SSN.setBounds(170, 290, 240, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DONOR_SSN");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 300, 110, 20);

        TYPE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O", "A", "B", "AB", "O+", "A+" }));
        TYPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TYPEActionPerformed(evt);
            }
        });
        jPanel2.add(TYPE);
        TYPE.setBounds(280, 330, 130, 30);
        jPanel2.add(D_ID);
        D_ID.setBounds(170, 10, 240, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 20, 50, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 450, 30, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FNAME");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(50, 450, 60, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LNAME");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(120, 450, 60, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("B-TYPE");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(200, 450, 70, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CITY");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(280, 450, 36, 20);

        jLabel18.setFont(jLabel18.getFont().deriveFont(jLabel18.getFont().getSize()+3f));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("AGE");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(350, 450, 31, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("GENDER");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(410, 450, 70, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("D_SSN");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(500, 450, 50, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PHONE");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(590, 450, 60, 20);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("E-MAIL");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(720, 450, 60, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 280, 912, 480);

        list.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        list.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        list.setMaximumSize(new java.awt.Dimension(900, 600));
        list.setMinimumSize(new java.awt.Dimension(800, 500));
        jScrollPane2.setViewportView(list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 760, 910, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

         try {
             Class.forName("com.mysql.jdbc.Driver");
              Connection  con=  DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           Statement st ;
           st= (Statement) con.createStatement();
           String btype=TYPE.getSelectedItem().toString();
           ResultSet result =st.executeQuery("select * from blood_bank1 where blood_type='"+btype+"'");
                  
              
              Vector vector=new Vector();
             
           int i=0;
            while(result.next()){
            vector.add(i, result.getString(1)+"     "+result.getString(2)+"    "+result.getString(3)+"             "+result.getString(4)+"         "+result.getString(5)+"        "+result.getString(6)+"           "+result.getString(7)+"       "+result.getString(8)+"       "+result.getString(9)+"        "+result.getString(10));
          i++;
          
            }
            
            list.setListData(vector);
            con.close();
         } 
         catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
    }//GEN-LAST:event_searchActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
       try{ 
           int id=Integer.parseInt(D_ID.getText());
        String fname=FNAME.getText();
        String lname=LNAME.getText();
        String phone=PHONE.getText();
        String email=EMAIL.getText();
        String btype=TYPE.getSelectedItem().toString();
        int dssn=Integer.parseInt(D_SSN.getText());
        int  age=Integer.parseInt(AGE.getText());
       String gender=selectedGender;
        String city=CITY.getText();
        insert(id,fname,lname,btype,city,age,gender,dssn,phone,email);
        JOptionPane.showMessageDialog(null, "Information Inserting successfully");}
       catch(NumberFormatException ex){
             JOptionPane.showMessageDialog(null, "please enter all data");
         }
    }//GEN-LAST:event_insertActionPerformed

    private void MALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MALEActionPerformed
        selectedGender="male";
    }//GEN-LAST:event_MALEActionPerformed

    private void FEMALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEMALActionPerformed
        selectedGender="female";
    }//GEN-LAST:event_FEMALActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void FNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNAMEActionPerformed

    private void TYPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TYPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TYPEActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection  con=  DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           Statement st ;
           st= (Statement) con.createStatement();   
            String gender=selectedGender;
           st.executeUpdate("update blood_bank1 set city = '"+CITY.getText()+"' , age = '"+AGE.getText()+"' where donor_id = '"+D_ID.getText()+"'");
           JOptionPane.showMessageDialog(null, "Information Updating Successfully");
          con.close(); 
         } 
         catch(NumberFormatException ex){
             System.out.println("PLEASE ENTER CORRECTED DATA"+"\n"+ex.getMessage());
         }
         catch (ClassNotFoundException ex) {
             System.out.println("No Class Found");
         } catch (SQLException ex) {
             System.out.println("ERROR");
         }
          
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         try {
             Class.forName("com.mysql.jdbc.Driver");
               Connection  con=  DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           Statement st ;
           st= (Statement) con.createStatement();
           int id=Integer.parseInt(D_ID.getText());
           //int dssn=Integer.parseInt(D_SSN.getText());
          // String btype=TYPE.getSelectedItem().toString();
           st.executeUpdate("delete from blood_bank1 where donor_id="+id+"");
          JOptionPane.showMessageDialog(null,"Information Deleting Successfully");
           con.close();
         } catch(NumberFormatException ex){
             System.out.println(ex.getMessage());
         }
         
         catch (ClassNotFoundException ex) {
             System.out.println(ex.getMessage());
         } catch (SQLException ex) {
             System.out.println(ex.getMessage());
         }
          
    }//GEN-LAST:event_deleteActionPerformed

     public static void main(String args[]) throws SQLException {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(blood_bank1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(blood_bank1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(blood_bank1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(blood_bank1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                project p=new project();
                p.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGE;
    private javax.swing.JTextField CITY;
    private javax.swing.JTextField D_ID;
    private javax.swing.JTextField D_SSN;
    private javax.swing.JTextField EMAIL;
    private javax.swing.JRadioButton FEMAL;
    private javax.swing.JTextField FNAME;
    private javax.swing.JTextField LNAME;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JTextField PHONE;
    private javax.swing.JComboBox<String> TYPE;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup bg=new ButtonGroup();
    private static void insert(int id,String fname,String lname,String btype,String dcity,int age,String dgender,int dssn,String dphone,String email){
             try {
                   
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection  con=  DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
            PreparedStatement st;
            st= con.prepareStatement("insert into blood_bank1 values(?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1, id);
            st.setString(2,fname);
            st.setString(3,lname);
            st.setString(4, btype);
            st.setString(5, dcity);
            st.setInt(6, age);
            st.setString(7, dgender);
            st.setInt(8, dssn);
            st.setString(9, dphone);
            st.setString(10, email);
            st.executeUpdate();
            con.close();
    } 
          catch(NumberFormatException ex){
             System.out.println("PLEASE ENTER CORRECTED DATA");
         }
         catch (Exception ex) {
            System.out.println(ex.getMessage());
           
        }
    }
   
}

