/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package payrollsystem;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author keith
 */
public class UpdateinfoPage extends javax.swing.JFrame {

    private DashBoardPageEmployee dbpage;
    private DashBoardPageAdmin dbpage2;
    private String fname, lname, id, birthday, phone, SSS, PHIL, TIN, PAGIBIG, POSITION, stat;
    private boolean isAdmin;
    
    public UpdateinfoPage(DashBoardPageEmployee dbpage,String firstname, String lastname, String ids, String bday, String phones,
        String sss, String phil, String tin, String pagibig, String position, String status, Boolean isAdmin) {
        initComponents();
        this.dbpage = dbpage;
        this.isAdmin = isAdmin;
        initVariables(firstname, lastname, ids, bday, phones,
        sss, phil, tin, pagibig, position, status);
        insertdataToTextFields();
    }
    
    public UpdateinfoPage(DashBoardPageAdmin dbpage2,String firstname, String lastname, String ids, String bday, String phones,
        String sss, String phil, String tin, String pagibig, String position, String status, Boolean isAdmin) {
        initComponents();
        this.dbpage2 = dbpage2;
        this.isAdmin = isAdmin;
        initVariables(firstname, lastname, ids, bday, phones,
        sss, phil, tin, pagibig, position, status);
        insertdataToTextFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fnametxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lnametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        statustxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bdaytxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        postext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ssstxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        philhealthtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pagibigtxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tintxt = new javax.swing.JTextField();
        Savebttn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new PayrollSystem();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(456, 436));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel3.setText("Status");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel4.setText("Birthdate");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel5.setText("Position");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel6.setText("Phone num");

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel7.setText("SSS");

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel8.setText("Philhealth");

        pagibigtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagibigtxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel9.setText("Pagibig");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel10.setText("TIN");

        Savebttn.setBackground(new java.awt.Color(0, 51, 51));
        Savebttn.setForeground(new java.awt.Color(255, 255, 255));
        Savebttn.setText("Save");
        Savebttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebttnActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edit Profile");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Savebttn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(statustxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bdaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(postext, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ssstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(philhealthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pagibigtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statustxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(philhealthtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagibigtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebttn)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void insertdataToTextFields(){
        fnametxt.setText(fname);
        lnametxt.setText(lname);
        statustxt.setText(stat);        
        bdaytxt.setText(birthday);        
        postext.setText(POSITION);        
        phonetxt.setText(phone);        
        ssstxt.setText(SSS);        
        philhealthtxt.setText(PHIL);        
        pagibigtxt.setText(PAGIBIG);        
        tintxt.setText(TIN);        
    }
    
    private void initVariables(String firstname, String lastname, String ids, String bday, String phones,
        String sss, String phil, String tin, String pagibig, String position,String status){
        fname = firstname;
        lname = lastname;    
        id = ids;
        birthday = bday;   
        phone = phones;
        SSS = sss;  
        PHIL = phil;
        TIN  = tin;
        PAGIBIG  = pagibig;
        POSITION  = position;
        stat = status;
}
    class PayrollSystem extends JPanel{
        
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color Color1 = new Color(1,30,30);
            Color Color2 = new Color(0,102,102);
            GradientPaint gp = new GradientPaint(0,0,Color1,180,height,Color2);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
            
        }
    }
    private void pagibigtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagibigtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagibigtxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        if(isAdmin == true){
            dbpage2.setVisible(true);
        }else{
            dbpage.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SavebttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebttnActionPerformed
        String query,firstname,lastname,status,birthdate,position,phonenum,sss,philhealth,pagibig,tin;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        try
        {
            if(fnametxt.getText().isBlank()||fnametxt.getText().isBlank()||statustxt.getText().isBlank()||
                    bdaytxt.getText().isBlank()||postext.getText().isBlank()||phonetxt.getText().isBlank()||
                    ssstxt.getText().isBlank()||philhealthtxt.getText().isBlank()||tintxt.getText().isBlank()||
                    pagibigtxt.getText().isBlank()){
                JOptionPane.showMessageDialog(this,"Please fill up all information","Invalid",JOptionPane.ERROR_MESSAGE);
            }else{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            
            int empid = Integer.parseInt(id);
            firstname = fnametxt.getText();
            lastname =  lnametxt.getText();      
            status = statustxt.getText();
            birthdate = bdaytxt.getText();      
            position =  postext.getText();     
            phonenum =  phonetxt.getText();     
            sss =  ssstxt.getText();     
            philhealth = philhealthtxt.getText();      
            pagibig = tintxt.getText();
            tin = pagibigtxt.getText();      
                    
                    
            query = ("UPDATE users SET `First Name` = '"+firstname+"', `Last Name` = '"+lastname+"', Status = '"+status+"', Birthdate = '"+birthdate+"', Position = '"+position+"',"
                    + " Phone_number = '"+phonenum+"', SSS = '"+sss+"', Philhealth = '"+philhealth+"', TIN = '"+tin+"', Pagibig = '"+pagibig+"' WHERE id ="+empid);
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(this,"Updated Sucessfully","Success",JOptionPane.INFORMATION_MESSAGE);        
            dispose();
            if(isAdmin == true){
                DashBoardPageAdmin.Name_label.setText(firstname+" "+ lastname);
                DashBoardPageAdmin.Status_label1.setText("Status: "+status);        
                DashBoardPageAdmin.bday_label2.setText("Birthdate: "+birthdate);        
                DashBoardPageAdmin.Pos_label.setText("Position: "+position);        
                DashBoardPageAdmin.phoneNum_label1.setText("Phone: "+phonenum);        
                DashBoardPageAdmin.SSS_label.setText("SSS: "+sss);        
                DashBoardPageAdmin.Philhealth_label.setText("Philhealth: "+philhealth);        
                DashBoardPageAdmin.Pagibig_label.setText("Pagibig: "+pagibig);        
                DashBoardPageAdmin.TIN_label.setText("TIN: "+tin);       
                        
                dbpage2.setVisible(true);
            }else{
               DashBoardPageEmployee.fullname.setText(firstname+" "+ lastname);
               DashBoardPageEmployee.status_label.setText("Status: "+status);
               DashBoardPageEmployee.bdaylabel.setText("Birthdate: "+birthdate);
               DashBoardPageEmployee.positionlabel.setText("Position: "+position);      
               DashBoardPageEmployee.phonelabel.setText("Phone: "+phonenum);
               DashBoardPageEmployee.ssslabel.setText("SSS: "+sss);       
               DashBoardPageEmployee.philhealthlabbel.setText("Philhealth: "+philhealth);        
               DashBoardPageEmployee.pagibiglabel.setText("Pagibig: "+pagibig);        
               DashBoardPageEmployee.tinlabel.setText("TIN: "+tin);
                       
                       
            dbpage.setVisible(true);
            }
            }
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_SavebttnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UpdateinfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UpdateinfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UpdateinfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UpdateinfoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UpdateinfoPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Savebttn;
    private javax.swing.JTextField bdaytxt;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JTextField pagibigtxt;
    private javax.swing.JTextField philhealthtxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JTextField postext;
    private javax.swing.JTextField ssstxt;
    private javax.swing.JTextField statustxt;
    private javax.swing.JTextField tintxt;
    // End of variables declaration//GEN-END:variables
}
