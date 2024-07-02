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
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keith
 */
public class ManageLeaveRequests extends javax.swing.JFrame {

    DashBoardPageAdmin db;
    String user_id;
    
    public ManageLeaveRequests(DashBoardPageAdmin dbadmin, String user_id) {
        initComponents();
        loadTable();
        db = dbadmin;
        this.user_id = user_id;
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PayrollSystem();
        jScrollPane1 = new javax.swing.JScrollPane();
        leave_table = new javax.swing.JTable();
        decline_btn = new javax.swing.JButton();
        approve_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(580, 391));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 391));

        leave_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request #", "ID", "First Name", "Last Name", "Leave Type", "Start Date", "End Date", "Reason", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leave_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        leave_table.setAutoscrolls(false);
        leave_table.setShowGrid(true);
        leave_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(leave_table);
        if (leave_table.getColumnModel().getColumnCount() > 0) {
            leave_table.getColumnModel().getColumn(0).setResizable(false);
            leave_table.getColumnModel().getColumn(1).setResizable(false);
            leave_table.getColumnModel().getColumn(2).setResizable(false);
            leave_table.getColumnModel().getColumn(2).setPreferredWidth(100);
            leave_table.getColumnModel().getColumn(3).setResizable(false);
            leave_table.getColumnModel().getColumn(3).setPreferredWidth(100);
            leave_table.getColumnModel().getColumn(4).setResizable(false);
            leave_table.getColumnModel().getColumn(4).setPreferredWidth(100);
            leave_table.getColumnModel().getColumn(5).setResizable(false);
            leave_table.getColumnModel().getColumn(5).setPreferredWidth(130);
            leave_table.getColumnModel().getColumn(6).setResizable(false);
            leave_table.getColumnModel().getColumn(6).setPreferredWidth(130);
            leave_table.getColumnModel().getColumn(7).setResizable(false);
            leave_table.getColumnModel().getColumn(7).setPreferredWidth(190);
            leave_table.getColumnModel().getColumn(8).setResizable(false);
            leave_table.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        decline_btn.setBackground(new java.awt.Color(255, 0, 0));
        decline_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        decline_btn.setForeground(new java.awt.Color(255, 255, 255));
        decline_btn.setText("Decline");
        decline_btn.setBorder(null);
        decline_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decline_btnActionPerformed(evt);
            }
        });

        approve_btn.setBackground(new java.awt.Color(0, 153, 51));
        approve_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        approve_btn.setForeground(new java.awt.Color(255, 255, 255));
        approve_btn.setText("Approve");
        approve_btn.setBorder(null);
        approve_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approve_btnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Employees' Leave Requests");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.setBorder(null);
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(decline_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(approve_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decline_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approve_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        this.dispose();
        db.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void approve_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approve_btnActionPerformed
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        String approved = "Approved";
        int selected = leave_table.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(null,"Please select an employee","Message",JOptionPane.ERROR_MESSAGE);
        }else{
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
        Statement st = con.createStatement();
        int id = Integer.parseInt(user_id);
        int reqnum = Integer.parseInt(leave_table.getValueAt(leave_table.getSelectedRow(),0).toString());
        int emp_id = Integer.parseInt(leave_table.getValueAt(leave_table.getSelectedRow(),1).toString());
        if(emp_id == id){
            JOptionPane.showMessageDialog(null, "You cannot Approve your own request","Invalid",JOptionPane.ERROR_MESSAGE);
        }else{
        
        query = "UPDATE leave_requests SET status = '"+approved+"' WHERE Request_number ="+reqnum;
        st.executeUpdate(query);
        
        DefaultTableModel tablemodel = (DefaultTableModel)leave_table.getModel();
        tablemodel.setRowCount(0);
        loadTable();
        
        JOptionPane.showMessageDialog(null, "Request Approved!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
        
    }//GEN-LAST:event_approve_btnActionPerformed

    private void decline_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decline_btnActionPerformed
            String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        String declined = "Declined";
        int selected = leave_table.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(null,"Please select an employee","Message",JOptionPane.ERROR_MESSAGE);
        }else{
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
        Statement st = con.createStatement();
        
        int id = Integer.parseInt(user_id);
        int reqnum = Integer.parseInt(leave_table.getValueAt(leave_table.getSelectedRow(),0).toString());
        int emp_id = Integer.parseInt(leave_table.getValueAt(leave_table.getSelectedRow(),1).toString());
        
        if(id == emp_id){
            JOptionPane.showMessageDialog(null, "You cannot decline your own request","Invalid",JOptionPane.ERROR_MESSAGE);
        }else{
        
        query = "UPDATE leave_requests SET status = '"+declined+"' WHERE Request_number ="+reqnum;
        st.executeUpdate(query);
        
        DefaultTableModel tablemodel = (DefaultTableModel)leave_table.getModel();
        tablemodel.setRowCount(0);
        loadTable();
        
        JOptionPane.showMessageDialog(null, "Request Declined!","Message",JOptionPane.INFORMATION_MESSAGE);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_decline_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        String query = null;
        
        int selected = leave_table.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(null,"Please select a request to delete","Error",JOptionPane.ERROR_MESSAGE);
        }else{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            int reqnum = Integer.parseInt(leave_table.getValueAt(leave_table.getSelectedRow(),0).toString());
            query = ("DELETE FROM leave_requests where Request_number="+reqnum);
            st.execute(query);
            DefaultTableModel tablemodel = (DefaultTableModel)leave_table.getModel();
            tablemodel.setRowCount(0);
            loadTable();
            JOptionPane.showMessageDialog(null,"Request Deleted","Deleted",JOptionPane.INFORMATION_MESSAGE);

            

            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadTable(){
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
        Statement st = con.createStatement();
        
        query = "SELECT * FROM leave_requests";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            String reqnum = rs.getString("Request_number");
            String id = String.valueOf(rs.getString("id"));
            String Start = rs.getString("Start_date");
            String end = rs.getString("End_date");
            String reason = rs.getString("Reason");
            String fname = rs.getString("First_name");
            String lname = rs.getString("Last_name");
            String type = rs.getString("Leave_type");
            String stat = rs.getString("status");
            
            String tbdata [] = {reqnum, id, fname, lname, type, Start, end, reason, stat};
            DefaultTableModel tablemodel = (DefaultTableModel)leave_table.getModel();
            
            tablemodel.addRow(tbdata);
        }
        
        
        
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
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
//            java.util.logging.Logger.getLogger(ManageLeaveRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManageLeaveRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManageLeaveRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManageLeaveRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageLeaveRequests().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton decline_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leave_table;
    // End of variables declaration//GEN-END:variables
}
