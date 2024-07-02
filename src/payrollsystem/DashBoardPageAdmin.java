/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package payrollsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keith
 */
public class DashBoardPageAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    
    private int empcount = 0;
    private LocalTime currentTime;
    private String formattedTime;
    private String formattedDate;
    private String dayOfWeek;
    private String firstname, lastname, ids, bday, phones, sss, phil, tin, pagibig, position, Salary, gross, hourly, empstatus;
    private boolean isAdmin;
    private Color defaultcolor;
    private Color changedcolor;
    private Font fontenter;
    private Font fontleave;
    private double totalHours;
    private int leave_count;
    private int absents;
    public DashBoardPageAdmin(String fname,String lname,String id,String birthday,String phone,
            String SSS,String philhealth,String TIN,String Pagibig,String pos,String salary,
            String grossrate, String hourlyrate,String status) {
        
        initComponents();
        resetData();
        displayTime();
        
        defaultcolor = new Color(255,255,255);
        changedcolor = new Color(190,235,9);
        fontenter = new Font("Segoe UI Emoji",Font.BOLD,15);
        fontleave = new Font("Segoe UI Emoji",Font.BOLD,14);
        
        isAdmin = true;
        emp_countlbl1.setText(String.valueOf(empcount));
        
        
        Welcome_label.setText("Welcome back, "+fname+"!");
        Name_label.setText(fname+" "+lname);
        Status_label1.setText("Status: "+status);
        Emp_number_label.setText("Employee # "+id);
        bday_label2.setText("Birthdate: "+birthday);
        phoneNum_label1.setText("Phone: "+phone);
        SSS_label.setText("SSS: "+SSS);
        Philhealth_label.setText("Philhealth: "+philhealth);
        TIN_label.setText("TIN: "+TIN);
        Pagibig_label.setText("Pagibig: "+Pagibig);
        Pos_label.setText("Position: "+pos);
        Salary_label.setText("Basic Salary: "+salary);
        Hourly_rate_label.setText("Hourly Rate: "+hourlyrate);
        Grossrate_label.setText("Gross semi monthly rate: "+grossrate);
        
        initializevariables(fname,lname,id,birthday,phone,SSS,philhealth,
                TIN,Pagibig,pos,salary,grossrate,hourlyrate,status);
        loadLeaveTable();
        count_total_hours_worked();
        
    }
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new PayrollSystem();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dashboard_panel = new javax.swing.JLabel();
        profile_panel = new javax.swing.JLabel();
        empManagement_panel = new javax.swing.JLabel();
        Payroll_panel = new javax.swing.JLabel();
        Leave_panel = new javax.swing.JLabel();
        Logout_panel = new javax.swing.JLabel();
        jPanel3 = new PayrollSystem();
        title = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Dashboard_Tab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        emp_countlbl = new javax.swing.JLabel();
        Welcome_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        hours_txt = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        leavelbl = new javax.swing.JLabel();
        leave_total = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel10 = new PayrollSystem();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabelemp1 = new javax.swing.JLabel();
        absent_count = new javax.swing.JLabel();
        jPanel18 = new PayrollSystem();
        jLabelemp = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        emp_countlbl1 = new javax.swing.JLabel();
        Profile_tab = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Name_label = new javax.swing.JLabel();
        Grossrate_label = new javax.swing.JLabel();
        Emp_number_label = new javax.swing.JLabel();
        Status_label1 = new javax.swing.JLabel();
        Pos_label = new javax.swing.JLabel();
        jPanel6 = new PayrollSystem();
        phoneNum_label1 = new javax.swing.JLabel();
        SSS_label = new javax.swing.JLabel();
        Philhealth_label = new javax.swing.JLabel();
        Pagibig_label = new javax.swing.JLabel();
        bday_label2 = new javax.swing.JLabel();
        jPanel5 = new PayrollSystem();
        TIN_label = new javax.swing.JLabel();
        Salary_label = new javax.swing.JLabel();
        Hourly_rate_label = new javax.swing.JLabel();
        jPanel7 = new PayrollSystem();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new PayrollSystem();
        jLabel17 = new javax.swing.JLabel();
        editprofile = new javax.swing.JButton();
        Empmanage_tab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employee_Table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        firstname_txtfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastname_txtfield = new javax.swing.JTextField();
        addresstxtfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        birthdate_txtfield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        position_txtfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        delete_btn1 = new javax.swing.JButton();
        jPanel13 = new PayrollSystem();
        jPanel17 = new PayrollSystem();
        jLabel22 = new javax.swing.JLabel();
        Payroll_tab = new javax.swing.JPanel();
        jPanel19 = new PayrollSystem();
        jLabel28 = new javax.swing.JLabel();
        jPanel20 = new PayrollSystem();
        jLabel29 = new javax.swing.JLabel();
        selected_month = new javax.swing.JComboBox<>();
        jPanel21 = new PayrollSystem();
        jScrollPane3 = new javax.swing.JScrollPane();
        attenance_table = new javax.swing.JTable();
        jPanel22 = new PayrollSystem();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        hoursworked_lbl = new javax.swing.JLabel();
        hourlyrate_lbl = new javax.swing.JLabel();
        grosspay_lbl = new javax.swing.JLabel();
        netpay_lbl = new javax.swing.JLabel();
        net_field = new javax.swing.JTextField();
        gross_field = new javax.swing.JTextField();
        hourly_field = new javax.swing.JTextField();
        hoursworked_field = new javax.swing.JTextField();
        SSS_lbl = new javax.swing.JLabel();
        jPanel23 = new PayrollSystem();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        SSS_field = new javax.swing.JTextField();
        phil_field = new javax.swing.JTextField();
        pagibig_field = new javax.swing.JTextField();
        tax_field = new javax.swing.JTextField();
        tax_lbl = new javax.swing.JLabel();
        pagibig_lbl = new javax.swing.JLabel();
        philhealth_lbl = new javax.swing.JLabel();
        Leave_tab = new javax.swing.JPanel();
        Name_label1 = new javax.swing.JLabel();
        jPanel14 = new PayrollSystem();
        leave_type_cmbobox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        start_date = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        end_date = new javax.swing.JTextField();
        reasontxtfield = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Name_label2 = new javax.swing.JLabel();
        jPanel15 = new PayrollSystem();
        jPanel16 = new PayrollSystem();
        req_leave_bttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        leave_table = new javax.swing.JTable();
        manage_requests_bttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(764, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 30, 30));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MotorPH");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 10, 110, 30);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\keith\\Downloads\\finalwa (5).png")); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 50, 180, 80);

        dashboard_panel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        dashboard_panel.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home (2) (1).png"))); // NOI18N
        dashboard_panel.setText("Dashboard");
        dashboard_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboard_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboard_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashboard_panelMousePressed(evt);
            }
        });
        jPanel2.add(dashboard_panel);
        dashboard_panel.setBounds(30, 140, 157, 40);

        profile_panel.setBackground(new java.awt.Color(255, 255, 153));
        profile_panel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        profile_panel.setForeground(new java.awt.Color(255, 255, 255));
        profile_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (2) (1).png"))); // NOI18N
        profile_panel.setText("Profile");
        profile_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profile_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profile_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profile_panelMousePressed(evt);
            }
        });
        jPanel2.add(profile_panel);
        profile_panel.setBounds(30, 190, 151, 40);

        empManagement_panel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        empManagement_panel.setForeground(new java.awt.Color(255, 255, 255));
        empManagement_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employee (1).png"))); // NOI18N
        empManagement_panel.setText("Manage Employees");
        empManagement_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empManagement_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empManagement_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empManagement_panelMousePressed(evt);
            }
        });
        jPanel2.add(empManagement_panel);
        empManagement_panel.setBounds(30, 240, 170, 40);

        Payroll_panel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Payroll_panel.setForeground(new java.awt.Color(255, 255, 255));
        Payroll_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salary (1).png"))); // NOI18N
        Payroll_panel.setText("Payroll");
        Payroll_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Payroll_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Payroll_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Payroll_panelMousePressed(evt);
            }
        });
        jPanel2.add(Payroll_panel);
        Payroll_panel.setBounds(30, 300, 144, 28);

        Leave_panel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Leave_panel.setForeground(new java.awt.Color(255, 255, 255));
        Leave_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit (1).png"))); // NOI18N
        Leave_panel.setText("Leave Requests");
        Leave_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Leave_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Leave_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Leave_panelMousePressed(evt);
            }
        });
        jPanel2.add(Leave_panel);
        Leave_panel.setBounds(30, 350, 144, 28);

        Logout_panel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Logout_panel.setForeground(new java.awt.Color(255, 255, 255));
        Logout_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/turn-off (1).png"))); // NOI18N
        Logout_panel.setText("Log out");
        Logout_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Logout_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Logout_panelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logout_panelMousePressed(evt);
            }
        });
        jPanel2.add(Logout_panel);
        Logout_panel.setBounds(50, 420, 100, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 200, 470);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        title.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Dashboard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(200, 0, 590, 50);

        Dashboard_Tab.setBackground(new java.awt.Color(245, 245, 245));
        Dashboard_Tab.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(1, 30, 30));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel4.setLayout(null);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employees (1) (1).png"))); // NOI18N
        jPanel4.add(jLabel23);
        jLabel23.setBounds(19, 30, 70, 70);

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Total Employees");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(95, 83, 193, 34);

        emp_countlbl.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        emp_countlbl.setForeground(new java.awt.Color(255, 255, 255));
        emp_countlbl.setText("25");
        jPanel4.add(emp_countlbl);
        emp_countlbl.setBounds(319, 11, 28, 34);

        Dashboard_Tab.add(jPanel4);
        jPanel4.setBounds(33, 143, 0, 0);

        Welcome_label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        Welcome_label.setText("  Welcome back, User");
        Dashboard_Tab.add(Welcome_label);
        Welcome_label.setBounds(30, 90, 392, 27);

        jLabel7.setText("Welcome to MotorPh Employee Application!");
        Dashboard_Tab.add(jLabel7);
        jLabel7.setBounds(33, 115, 254, 16);

        jPanel8.setBackground(new java.awt.Color(204, 255, 0));
        jPanel8.setLayout(null);

        jLabel34.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel34.setText("Hours Worked");
        jPanel8.add(jLabel34);
        jLabel34.setBounds(30, 40, 100, 20);

        hours_txt.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        hours_txt.setText("jLabel35");
        jPanel8.add(hours_txt);
        hours_txt.setBounds(130, 10, 30, 20);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clock (1).png"))); // NOI18N
        jPanel8.add(jLabel35);
        jLabel35.setBounds(10, 6, 30, 30);

        Dashboard_Tab.add(jPanel8);
        jPanel8.setBounds(400, 140, 170, 70);

        jPanel9.setBackground(new java.awt.Color(255, 102, 102));

        leavelbl.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        leavelbl.setForeground(new java.awt.Color(0, 0, 0));
        leavelbl.setText("Leave Requests");

        leave_total.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        leave_total.setForeground(new java.awt.Color(0, 0, 0));
        leave_total.setText("jLabel35");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leave (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(leavelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(leave_total, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(leave_total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leavelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        Dashboard_Tab.add(jPanel9);
        jPanel9.setBounds(400, 220, 170, 76);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Time");
        jPanel10.add(jLabel25);
        jLabel25.setBounds(90, 50, 125, 30);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("jLabel26");
        jPanel10.add(jLabel26);
        jLabel26.setBounds(100, 70, 125, 30);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar (1).png"))); // NOI18N
        jPanel10.add(jLabel37);
        jLabel37.setBounds(20, 0, 70, 70);

        Dashboard_Tab.add(jPanel10);
        jPanel10.setBounds(33, 309, 240, 130);

        jPanel11.setBackground(new java.awt.Color(102, 102, 255));
        jPanel11.setLayout(null);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/absence (2).png"))); // NOI18N
        jPanel11.add(jLabel38);
        jLabel38.setBounds(20, 10, 70, 70);

        jLabelemp1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabelemp1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelemp1.setText("Absences");
        jPanel11.add(jLabelemp1);
        jLabelemp1.setBounds(100, 70, 140, 34);

        absent_count.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        absent_count.setForeground(new java.awt.Color(255, 255, 255));
        absent_count.setText("25");
        jPanel11.add(absent_count);
        absent_count.setBounds(240, 10, 28, 34);

        Dashboard_Tab.add(jPanel11);
        jPanel11.setBounds(285, 309, 282, 128);

        jPanel18.setBackground(new java.awt.Color(1, 30, 30));
        jPanel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jLabelemp.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabelemp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelemp.setText("Total Employees");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/employees (1) (1).png"))); // NOI18N

        emp_countlbl1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        emp_countlbl1.setForeground(new java.awt.Color(255, 255, 255));
        emp_countlbl1.setText("25");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelemp, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emp_countlbl1)
                        .addContainerGap())))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emp_countlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabelemp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        Dashboard_Tab.add(jPanel18);
        jPanel18.setBounds(30, 140, 360, 154);

        jTabbedPane1.addTab("tab1", Dashboard_Tab);

        Profile_tab.setBackground(new java.awt.Color(245, 245, 245));
        Profile_tab.setLayout(null);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (4) (2).png"))); // NOI18N
        Profile_tab.add(jLabel14);
        jLabel14.setBounds(20, 80, 150, 150);

        Name_label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        Name_label.setText("Manuel Garcia III");
        Profile_tab.add(Name_label);
        Name_label.setBounds(190, 80, 320, 40);

        Grossrate_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Grossrate_label.setText("Gross semi Monthly:");
        Profile_tab.add(Grossrate_label);
        Grossrate_label.setBounds(310, 370, 270, 20);

        Emp_number_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Emp_number_label.setText("Employee # : ");
        Profile_tab.add(Emp_number_label);
        Emp_number_label.setBounds(190, 120, 350, 20);

        Status_label1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Status_label1.setText("Status:");
        Profile_tab.add(Status_label1);
        Status_label1.setBounds(190, 150, 350, 20);

        Pos_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Pos_label.setText("Position:");
        Profile_tab.add(Pos_label);
        Pos_label.setBounds(190, 210, 360, 20);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Profile_tab.add(jPanel6);
        jPanel6.setBounds(20, 240, 560, 20);

        phoneNum_label1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        phoneNum_label1.setText("Phone:");
        Profile_tab.add(phoneNum_label1);
        phoneNum_label1.setBounds(20, 310, 260, 20);

        SSS_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        SSS_label.setText("SSS:");
        Profile_tab.add(SSS_label);
        SSS_label.setBounds(20, 340, 260, 20);

        Philhealth_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Philhealth_label.setText("Philhealth");
        Profile_tab.add(Philhealth_label);
        Philhealth_label.setBounds(20, 370, 260, 20);

        Pagibig_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Pagibig_label.setText("Pagibig:");
        Profile_tab.add(Pagibig_label);
        Pagibig_label.setBounds(20, 400, 260, 20);

        bday_label2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        bday_label2.setText("Birthdate:");
        Profile_tab.add(bday_label2);
        bday_label2.setBounds(190, 180, 370, 20);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        Profile_tab.add(jPanel5);
        jPanel5.setBounds(290, 270, 10, 190);

        TIN_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        TIN_label.setText("TIN:");
        Profile_tab.add(TIN_label);
        TIN_label.setBounds(20, 430, 260, 20);

        Salary_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Salary_label.setText("Basic Salary:");
        Profile_tab.add(Salary_label);
        Salary_label.setBounds(310, 310, 270, 20);

        Hourly_rate_label.setFont(new java.awt.Font("Segoe UI Emoji", 0, 15)); // NOI18N
        Hourly_rate_label.setText("Hourly Rate:");
        Profile_tab.add(Hourly_rate_label);
        Hourly_rate_label.setBounds(310, 340, 270, 20);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Compensation Details");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
        );

        Profile_tab.add(jPanel7);
        jPanel7.setBounds(310, 270, 270, 30);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Numbers");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Profile_tab.add(jPanel12);
        jPanel12.setBounds(20, 270, 260, 30);

        editprofile.setBackground(new java.awt.Color(245, 245, 245));
        editprofile.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        editprofile.setForeground(new java.awt.Color(255, 255, 255));
        editprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit (2) (1).png"))); // NOI18N
        editprofile.setBorder(null);
        editprofile.setBorderPainted(false);
        editprofile.setFocusPainted(false);
        editprofile.setFocusable(false);
        editprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofileActionPerformed(evt);
            }
        });
        Profile_tab.add(editprofile);
        editprofile.setBounds(540, 70, 40, 40);

        jTabbedPane1.addTab("tab2", Profile_tab);

        Empmanage_tab.setBackground(new java.awt.Color(245, 245, 245));
        Empmanage_tab.setLayout(null);

        employee_Table.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        employee_Table.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        employee_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID number", "Last Name", "First Name", "Address", "Birthdate", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employee_Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        employee_Table.setAutoscrolls(false);
        employee_Table.setFocusable(false);
        employee_Table.setGridColor(new java.awt.Color(0, 0, 0));
        employee_Table.setInheritsPopupMenu(true);
        employee_Table.setSelectionBackground(new java.awt.Color(0, 51, 51));
        employee_Table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        employee_Table.setShowGrid(true);
        employee_Table.getTableHeader().setReorderingAllowed(false);
        employee_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                employee_TableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(employee_Table);
        if (employee_Table.getColumnModel().getColumnCount() > 0) {
            employee_Table.getColumnModel().getColumn(0).setResizable(false);
            employee_Table.getColumnModel().getColumn(1).setResizable(false);
            employee_Table.getColumnModel().getColumn(2).setResizable(false);
            employee_Table.getColumnModel().getColumn(3).setResizable(false);
            employee_Table.getColumnModel().getColumn(3).setPreferredWidth(350);
            employee_Table.getColumnModel().getColumn(4).setResizable(false);
            employee_Table.getColumnModel().getColumn(5).setResizable(false);
            employee_Table.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        Empmanage_tab.add(jScrollPane1);
        jScrollPane1.setBounds(6, 267, 584, 200);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("First Name");
        Empmanage_tab.add(jLabel8);
        jLabel8.setBounds(16, 77, 76, 29);

        firstname_txtfield.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Empmanage_tab.add(firstname_txtfield);
        firstname_txtfield.setBounds(98, 78, 190, 29);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Last Name");
        Empmanage_tab.add(jLabel9);
        jLabel9.setBounds(16, 113, 76, 29);

        lastname_txtfield.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Empmanage_tab.add(lastname_txtfield);
        lastname_txtfield.setBounds(98, 114, 190, 29);

        addresstxtfield.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Empmanage_tab.add(addresstxtfield);
        addresstxtfield.setBounds(98, 150, 190, 29);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Address");
        Empmanage_tab.add(jLabel10);
        jLabel10.setBounds(16, 149, 76, 29);

        birthdate_txtfield.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Empmanage_tab.add(birthdate_txtfield);
        birthdate_txtfield.setBounds(394, 78, 172, 29);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Birthdate");
        Empmanage_tab.add(jLabel11);
        jLabel11.setBounds(312, 77, 76, 29);

        position_txtfield.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Empmanage_tab.add(position_txtfield);
        position_txtfield.setBounds(394, 114, 172, 29);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Position");
        Empmanage_tab.add(jLabel12);
        jLabel12.setBounds(312, 113, 76, 29);

        add_btn.setBackground(new java.awt.Color(102, 204, 0));
        add_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add (1).png"))); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        Empmanage_tab.add(add_btn);
        add_btn.setBounds(240, 220, 78, 40);

        edit_btn.setBackground(new java.awt.Color(0, 102, 204));
        edit_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit (1).png"))); // NOI18N
        edit_btn.setText("Edit");
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        Empmanage_tab.add(edit_btn);
        edit_btn.setBounds(320, 220, 78, 40);

        delete_btn.setBackground(new java.awt.Color(255, 0, 0));
        delete_btn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete (1).png"))); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        Empmanage_tab.add(delete_btn);
        delete_btn.setBounds(400, 220, 89, 40);

        delete_btn1.setBackground(new java.awt.Color(0, 153, 153));
        delete_btn1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        delete_btn1.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rubber (1).png"))); // NOI18N
        delete_btn1.setText("Clear");
        delete_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn1ActionPerformed(evt);
            }
        });
        Empmanage_tab.add(delete_btn1);
        delete_btn1.setBounds(490, 220, 83, 40);

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Empmanage_tab.add(jPanel13);
        jPanel13.setBounds(20, 190, 560, 10);

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Employee List");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Empmanage_tab.add(jPanel17);
        jPanel17.setBounds(20, 220, 210, 40);

        jTabbedPane1.addTab("tab3", Empmanage_tab);

        Payroll_tab.setBackground(new java.awt.Color(245, 245, 245));
        Payroll_tab.setLayout(null);

        jPanel19.setBackground(new java.awt.Color(0, 51, 51));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Pay Period:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Payroll_tab.add(jPanel19);
        jPanel19.setBounds(20, 80, 230, 30);

        jPanel20.setBackground(new java.awt.Color(0, 51, 51));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("PAYSLIP");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Payroll_tab.add(jPanel20);
        jPanel20.setBounds(270, 80, 300, 80);

        selected_month.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selected_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month to calculate", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        selected_month.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selected_monthItemStateChanged(evt);
            }
        });
        Payroll_tab.add(selected_month);
        selected_month.setBounds(20, 120, 230, 40);

        jPanel21.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Payroll_tab.add(jPanel21);
        jPanel21.setBounds(20, 170, 550, 10);

        attenance_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time In", "Time Out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        attenance_table.setShowGrid(true);
        attenance_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(attenance_table);

        Payroll_tab.add(jScrollPane3);
        jScrollPane3.setBounds(20, 190, 550, 130);

        jPanel22.setBackground(new java.awt.Color(0, 51, 51));

        jLabel30.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Amount");

        jLabel31.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Earnings");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Payroll_tab.add(jPanel22);
        jPanel22.setBounds(20, 330, 250, 30);

        hoursworked_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hoursworked_lbl.setText("Hours Worked");
        Payroll_tab.add(hoursworked_lbl);
        hoursworked_lbl.setBounds(20, 370, 120, 20);

        hourlyrate_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hourlyrate_lbl.setText("Hourly Rate");
        Payroll_tab.add(hourlyrate_lbl);
        hourlyrate_lbl.setBounds(20, 390, 100, 20);

        grosspay_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        grosspay_lbl.setText("Gross Pay");
        Payroll_tab.add(grosspay_lbl);
        grosspay_lbl.setBounds(20, 410, 110, 20);

        netpay_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        netpay_lbl.setText("Net Pay");
        Payroll_tab.add(netpay_lbl);
        netpay_lbl.setBounds(20, 430, 110, 20);

        net_field.setEditable(false);
        net_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        net_field.setEnabled(false);
        net_field.setFocusable(false);
        Payroll_tab.add(net_field);
        net_field.setBounds(151, 430, 120, 22);

        gross_field.setEditable(false);
        gross_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        gross_field.setEnabled(false);
        gross_field.setFocusable(false);
        Payroll_tab.add(gross_field);
        gross_field.setBounds(151, 410, 120, 22);

        hourly_field.setEditable(false);
        hourly_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hourly_field.setEnabled(false);
        hourly_field.setFocusable(false);
        Payroll_tab.add(hourly_field);
        hourly_field.setBounds(151, 390, 120, 22);

        hoursworked_field.setEditable(false);
        hoursworked_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hoursworked_field.setEnabled(false);
        hoursworked_field.setFocusable(false);
        Payroll_tab.add(hoursworked_field);
        hoursworked_field.setBounds(151, 370, 120, 22);

        SSS_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SSS_lbl.setText("SSS Deduction");
        Payroll_tab.add(SSS_lbl);
        SSS_lbl.setBounds(310, 370, 120, 20);

        jPanel23.setBackground(new java.awt.Color(0, 51, 51));

        jLabel32.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Deductions");

        jLabel33.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Amount");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Payroll_tab.add(jPanel23);
        jPanel23.setBounds(310, 330, 260, 30);

        SSS_field.setEditable(false);
        SSS_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        SSS_field.setEnabled(false);
        SSS_field.setFocusable(false);
        Payroll_tab.add(SSS_field);
        SSS_field.setBounds(460, 370, 110, 22);

        phil_field.setEditable(false);
        phil_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        phil_field.setEnabled(false);
        phil_field.setFocusable(false);
        Payroll_tab.add(phil_field);
        phil_field.setBounds(460, 390, 110, 22);

        pagibig_field.setEditable(false);
        pagibig_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        pagibig_field.setEnabled(false);
        pagibig_field.setFocusable(false);
        Payroll_tab.add(pagibig_field);
        pagibig_field.setBounds(460, 410, 110, 22);

        tax_field.setEditable(false);
        tax_field.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tax_field.setEnabled(false);
        tax_field.setFocusable(false);
        Payroll_tab.add(tax_field);
        tax_field.setBounds(460, 430, 110, 22);

        tax_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tax_lbl.setText("Withholding Tax");
        Payroll_tab.add(tax_lbl);
        tax_lbl.setBounds(310, 430, 120, 20);

        pagibig_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pagibig_lbl.setText("Pagibig Deduction");
        Payroll_tab.add(pagibig_lbl);
        pagibig_lbl.setBounds(310, 410, 130, 20);

        philhealth_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        philhealth_lbl.setText("Philhealth Deduction");
        Payroll_tab.add(philhealth_lbl);
        philhealth_lbl.setBounds(310, 390, 140, 20);

        jTabbedPane1.addTab("tab4", Payroll_tab);

        Leave_tab.setBackground(new java.awt.Color(245, 245, 245));
        Leave_tab.setLayout(null);

        Name_label1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        Name_label1.setText("Your requests");
        Leave_tab.add(Name_label1);
        Name_label1.setBounds(330, 70, 250, 40);

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Leave_tab.add(jPanel14);
        jPanel14.setBounds(320, 110, 250, 10);

        leave_type_cmbobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacation Leave", "Sick Leave", "Maternity Leave", "Personal Leave", "Medical Leave" }));
        Leave_tab.add(leave_type_cmbobox);
        leave_type_cmbobox.setBounds(30, 160, 240, 40);

        jLabel18.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel18.setText("Start date of Leave*");
        Leave_tab.add(jLabel18);
        jLabel18.setBounds(30, 220, 160, 20);
        Leave_tab.add(start_date);
        start_date.setBounds(30, 240, 240, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel19.setText("Leave type*");
        Leave_tab.add(jLabel19);
        jLabel19.setBounds(30, 140, 80, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel20.setText("Reason of leave*");
        Leave_tab.add(jLabel20);
        jLabel20.setBounds(30, 360, 130, 20);
        Leave_tab.add(end_date);
        end_date.setBounds(30, 310, 240, 30);
        Leave_tab.add(reasontxtfield);
        reasontxtfield.setBounds(30, 380, 240, 80);

        jLabel21.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel21.setText("End date of Leave*");
        Leave_tab.add(jLabel21);
        jLabel21.setBounds(30, 290, 130, 20);

        Name_label2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        Name_label2.setText("Request new leave");
        Leave_tab.add(Name_label2);
        Name_label2.setBounds(20, 70, 250, 40);

        jPanel15.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Leave_tab.add(jPanel15);
        jPanel15.setBounds(20, 110, 250, 10);

        jPanel16.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        Leave_tab.add(jPanel16);
        jPanel16.setBounds(290, 70, 10, 390);

        req_leave_bttn.setBackground(new java.awt.Color(0, 102, 204));
        req_leave_bttn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        req_leave_bttn.setForeground(new java.awt.Color(255, 255, 255));
        req_leave_bttn.setText("Request Leave");
        req_leave_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                req_leave_bttnActionPerformed(evt);
            }
        });
        Leave_tab.add(req_leave_bttn);
        req_leave_bttn.setBounds(450, 410, 130, 40);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        leave_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Leave Type", "Start Date", "End Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leave_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        leave_table.setGridColor(new java.awt.Color(0, 0, 0));
        leave_table.setShowGrid(true);
        jScrollPane2.setViewportView(leave_table);
        if (leave_table.getColumnModel().getColumnCount() > 0) {
            leave_table.getColumnModel().getColumn(0).setResizable(false);
            leave_table.getColumnModel().getColumn(0).setPreferredWidth(100);
            leave_table.getColumnModel().getColumn(1).setResizable(false);
            leave_table.getColumnModel().getColumn(1).setPreferredWidth(130);
            leave_table.getColumnModel().getColumn(2).setResizable(false);
            leave_table.getColumnModel().getColumn(2).setPreferredWidth(130);
            leave_table.getColumnModel().getColumn(3).setResizable(false);
            leave_table.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        Leave_tab.add(jScrollPane2);
        jScrollPane2.setBounds(320, 140, 250, 250);

        manage_requests_bttn.setBackground(new java.awt.Color(0, 51, 51));
        manage_requests_bttn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manage_requests_bttn.setForeground(new java.awt.Color(255, 255, 255));
        manage_requests_bttn.setText("Manage Requests");
        manage_requests_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_requests_bttnActionPerformed(evt);
            }
        });
        Leave_tab.add(manage_requests_bttn);
        manage_requests_bttn.setBounds(310, 410, 130, 40);

        jTabbedPane1.addTab("tab5", Leave_tab);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(194, -40, 590, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void initializevariables(String fname,String lname,String id,String birthday,String phone,
            String SSS,String philhealth,String TIN,String Pagibig,String pos,String salary,
            String grossrate, String hourlyrate,String status){
        
        this.firstname = fname;
        this.lastname = lname;
        this.ids = id;
        this.bday = birthday;
        this.phones = phone;
        this.sss = SSS;
        this.phil = philhealth;
        this.tin = TIN;
        this.pagibig = Pagibig;
        this.position = pos;
        this.Salary = salary;
        this.gross = grossrate;
        this.hourly = hourlyrate;
        this.empstatus = status;
    }
    
    private void displayTime(){
        currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        formattedTime = currentTime.format(formatter);
        jLabel25.setText(formattedTime);
        
        LocalDate currentDate = LocalDate.now();
        
        // Format the date (optional)
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("MMM dd, yyyy");
         formattedDate = currentDate.format(formatters);
        
        // Get the day of the week
        dayOfWeek = currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        jLabel26.setText(formattedDate);
    }
     class PayrollSystem extends JPanel{ //Gradient Color for panels
        
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
    
    private void resetData(){
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(SUrl,SUser,SPass); 
                Statement st = con.createStatement();
                
                query = "SELECT * FROM users";
                ResultSet rs = st.executeQuery(query);
                
                while(rs.next()){
                    String id = String.valueOf(rs.getInt("id"));
                    String Lastname = rs.getString("Last Name");
                    String Firstname = rs.getString("First Name");
                    String Address = rs.getString("Address");
                    String Birthdate = rs.getString("Birthdate");
                    String Position = rs.getString("Position");
                    
                    String tbdata [] = {id,Lastname,Firstname,Address,Birthdate,Position};
                    DefaultTableModel tablemodel = (DefaultTableModel)employee_Table.getModel();
                    
                    tablemodel.addRow(tbdata);
                    empcount++;
                    
                }
            
            
            
            
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        String query = null;
        
        int selected = employee_Table.getSelectedRow();
         if (selected<0){
                showMessageDialog(null,"Please select an employee to remove","Error",JOptionPane.ERROR_MESSAGE);
            }
         else{
        int response = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete?","Confirm",JOptionPane.YES_NO_OPTION);
        int id = Integer.parseInt(employee_Table.getValueAt(employee_Table.getSelectedRow(),0).toString());

             if(response == JOptionPane.YES_OPTION){
        try{    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            query = ("DELETE FROM users where id="+id);
            st.execute(query);
            
            DefaultTableModel tablemodel = (DefaultTableModel)employee_Table.getModel();
            tablemodel.setRowCount(0);   
            resetData();
            
            firstname_txtfield.setText("");
            lastname_txtfield.setText("");
            addresstxtfield.setText("");
            birthdate_txtfield.setText("");
            position_txtfield.setText("");
            
            showMessageDialog(null,"Deleted Successfully","Message",JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
             }else if(response == JOptionPane.NO_OPTION){
            firstname_txtfield.setText("");
            lastname_txtfield.setText("");
            addresstxtfield.setText("");
            birthdate_txtfield.setText("");
            position_txtfield.setText(""); 
             }
             
        
         }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        String query, lastname,firstname,address,birthdate,Position;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            if(firstname_txtfield.getText().isBlank()||lastname_txtfield.getText().isBlank()
                    ||addresstxtfield.getText().isBlank()||birthdate_txtfield.getText().isBlank()
                    ||position_txtfield.getText().isBlank()){
                showMessageDialog(null,"Please fillup all information","Invalid",JOptionPane.ERROR_MESSAGE);
            }
            else{
            firstname = firstname_txtfield.getText();
            lastname= lastname_txtfield.getText();
            address= addresstxtfield.getText();
            birthdate= birthdate_txtfield.getText();
            Position = position_txtfield.getText();
                                                                     
            query = "INSERT INTO users(`Last Name`, `First Name`, Address, Birthdate, Position) " + "VALUES('"+ lastname +"', '"+ firstname +"', '"+ address +"', '"+ birthdate +"', '"+ Position +"')";
                                    
            st.execute(query);
            
            DefaultTableModel tablemodel = (DefaultTableModel)employee_Table.getModel();
            tablemodel.setRowCount(0);            
          
            resetData();
            firstname_txtfield.setText("");
            lastname_txtfield.setText("");
            addresstxtfield.setText("");
            birthdate_txtfield.setText("");
            position_txtfield.setText("");
            
            showMessageDialog(null,"Addedd Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        String query, lastname,firstname,address,birthdate,Position;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        int selected = employee_Table.getSelectedRow();
        if(selected<0){
            showMessageDialog(null,"Please select an employee to update","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
        try{
            int confirm = JOptionPane.showConfirmDialog(null,"Are you sure you want to update?","Confirm",JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
            
            int id = Integer.parseInt(employee_Table.getValueAt(employee_Table.getSelectedRow(),0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            
            firstname = firstname_txtfield.getText();
            lastname= lastname_txtfield.getText();
            address= addresstxtfield.getText();
            birthdate= birthdate_txtfield.getText();
            Position = position_txtfield.getText();
            
            query = ("UPDATE users set `First Name`='"+firstname+"',`Last Name`='"+lastname+"',Address = '"+address+"',Birthdate = '"+birthdate+"',Position ='"+Position+"' where id="+id);
            st.executeUpdate(query);
                         
            DefaultTableModel tablemodel = (DefaultTableModel)employee_Table.getModel();
            tablemodel.setRowCount(0);
            
            resetData();
            
            firstname_txtfield.setText("");
            lastname_txtfield.setText("");
            addresstxtfield.setText("");
            birthdate_txtfield.setText("");
            position_txtfield.setText("");
            showMessageDialog(null,"Update Successful!","Message",JOptionPane.INFORMATION_MESSAGE);
            
            }

            
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void delete_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btn1ActionPerformed
        firstname_txtfield.setText("");
            lastname_txtfield.setText("");
            addresstxtfield.setText("");
            birthdate_txtfield.setText("");
            position_txtfield.setText("");
            
    }//GEN-LAST:event_delete_btn1ActionPerformed

    private void employee_TableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employee_TableMousePressed
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
 
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            int id = Integer.parseInt(employee_Table.getValueAt(employee_Table.getSelectedRow(),0).toString());
            
            query = ("SELECT * from users where id="+id);
            ResultSet rs = st.executeQuery(query);
                        
            while(rs.next()){
                firstname_txtfield.setText(rs.getString("First Name"));
                lastname_txtfield.setText(rs.getString("Last Name"));
                addresstxtfield.setText(rs.getString("Address"));
                birthdate_txtfield.setText(rs.getString("Birthdate"));
                position_txtfield.setText(rs.getString("Position")); 
               
            }
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_employee_TableMousePressed

    private void Logout_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_panelMouseEntered
        Logout_panel.setForeground(changedcolor);
        Logout_panel.setFont(fontenter);
    }//GEN-LAST:event_Logout_panelMouseEntered

    private void Logout_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_panelMouseExited
         Logout_panel.setForeground(defaultcolor);
        Logout_panel.setFont(fontleave);
    }//GEN-LAST:event_Logout_panelMouseExited

    private void Logout_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_panelMousePressed
        int response = JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?","Confirm",JOptionPane.YES_NO_OPTION);
        if(response == JOptionPane.YES_OPTION){
            this.dispose();
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_Logout_panelMousePressed
    private void refreshProfileData(){
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            
            query = "SELECT * FROM users where id="+ids;
            
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                firstname = rs.getString("First Name");
                lastname = rs.getString("Last Name");
                bday = rs.getString("Birthdate");
                phones = rs.getString("Phone_number");
                sss = rs.getString("SSS");
                phil = rs.getString("Philhealth");        
                tin = rs.getString("TIN");      
                pagibig = rs.getString("Pagibig");
                position = rs.getString("Position");
                empstatus = rs.getString("Status");        
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void editprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editprofileActionPerformed
        this.setVisible(false);
        refreshProfileData();
        new UpdateinfoPage(this, firstname,  lastname,  ids,  bday,  phones,
            sss,  phil,  tin,  pagibig, position, empstatus, isAdmin).setVisible(true);
    }//GEN-LAST:event_editprofileActionPerformed

    private void req_leave_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_req_leave_bttnActionPerformed
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        
        try
        {
            if(start_date.getText().isBlank()|| end_date.getText().isBlank()||reasontxtfield.getText().isBlank()){
                JOptionPane.showMessageDialog(this, "Please fillup all information","Invalid",JOptionPane.ERROR_MESSAGE);
            }
            else{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
                Statement st = con.createStatement();

                String leavetype = String.valueOf(leave_type_cmbobox.getSelectedItem());
                String start = start_date.getText();
                String end = end_date.getText();
                String reason = reasontxtfield.getText();
                int empid = Integer.parseInt(ids);
                String empfirstname = firstname;
                String emplastname = lastname;
                String status = "Pending";


                query = "INSERT INTO leave_requests (id, Start_date, End_date, Reason, First_name, Last_name, Leave_type, status) " + " VALUES("+empid+", '"+start+"', '"+end+"', '"+reason+"', '"+empfirstname+"', '"+emplastname+"', '"+leavetype+"', '"+status+"')";
                
                st.execute(query);
                loadData();
                start_date.setText("");
                end_date.setText("");        
                reasontxtfield.setText("");
                        
                JOptionPane.showMessageDialog(this, "Request Sent!","Success",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_req_leave_bttnActionPerformed

    private void manage_requests_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_requests_bttnActionPerformed
        this.setVisible(false);
        ManageLeaveRequests leavepage = new ManageLeaveRequests(this,ids);
        leavepage.setVisible(true);
    }//GEN-LAST:event_manage_requests_bttnActionPerformed

    private void dashboard_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_panelMouseEntered
           dashboard_panel.setForeground(changedcolor);
           dashboard_panel.setFont(fontenter);
    }//GEN-LAST:event_dashboard_panelMouseEntered

    private void dashboard_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_panelMousePressed
        jTabbedPane1.setSelectedIndex(0);
        title.setText("Dashboard");

    }//GEN-LAST:event_dashboard_panelMousePressed

    private void profile_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_panelMousePressed
        jTabbedPane1.setSelectedIndex(1);   
      title.setText("Profile");
    }//GEN-LAST:event_profile_panelMousePressed

    private void empManagement_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empManagement_panelMousePressed
        jTabbedPane1.setSelectedIndex(2);
        title.setText("Employee Management");

    }//GEN-LAST:event_empManagement_panelMousePressed

    private void Payroll_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payroll_panelMousePressed
        jTabbedPane1.setSelectedIndex(3);
        title.setText("Payroll");

    }//GEN-LAST:event_Payroll_panelMousePressed

    private void Leave_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Leave_panelMousePressed
        jTabbedPane1.setSelectedIndex(4);
        title.setText("Leave Requests");

    }//GEN-LAST:event_Leave_panelMousePressed

    private void dashboard_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_panelMouseExited
        dashboard_panel.setForeground(defaultcolor);
        dashboard_panel.setFont(fontleave);
    }//GEN-LAST:event_dashboard_panelMouseExited

    private void profile_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_panelMouseEntered
        profile_panel.setForeground(changedcolor);
        profile_panel.setFont(fontenter);
    }//GEN-LAST:event_profile_panelMouseEntered

    private void profile_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profile_panelMouseExited
        profile_panel.setForeground(defaultcolor);
        profile_panel.setFont(fontleave);
    }//GEN-LAST:event_profile_panelMouseExited

    private void empManagement_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empManagement_panelMouseEntered
       empManagement_panel.setForeground(changedcolor);
        empManagement_panel.setFont(fontenter);
    }//GEN-LAST:event_empManagement_panelMouseEntered

    private void empManagement_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empManagement_panelMouseExited
        empManagement_panel.setForeground(defaultcolor);
        empManagement_panel.setFont(fontleave);
    }//GEN-LAST:event_empManagement_panelMouseExited

    private void Payroll_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payroll_panelMouseEntered
        Payroll_panel.setForeground(changedcolor);
        Payroll_panel.setFont(fontenter);
    }//GEN-LAST:event_Payroll_panelMouseEntered

    private void Leave_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Leave_panelMouseEntered
        Leave_panel.setForeground(changedcolor);
        Leave_panel.setFont(fontenter);
    }//GEN-LAST:event_Leave_panelMouseEntered

    private void Payroll_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payroll_panelMouseExited
        Payroll_panel.setForeground(defaultcolor);
        Payroll_panel.setFont(fontleave);
    }//GEN-LAST:event_Payroll_panelMouseExited

    private void Leave_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Leave_panelMouseExited
         Leave_panel.setForeground(defaultcolor);
        Leave_panel.setFont(fontleave);
    }//GEN-LAST:event_Leave_panelMouseExited

    private void selected_monthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selected_monthItemStateChanged
        //Algorithm to calculate the salary of employee
        if(evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
            DefaultTableModel tablemodel = (DefaultTableModel)attenance_table.getModel();
            tablemodel.setRowCount(0);

            String selectedmonth = String.valueOf(selected_month.getSelectedItem());
            String SUrl, SUser, SPass, query;
            SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
            SUser = "root";
            SPass = "";

            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
                Statement st = con.createStatement();

                query = "SELECT * FROM attendance where id="+ids;

                ResultSet rs = st.executeQuery(query);

                String date;
                String timeIn;
                String timeOut;
                double hourlyrate = Double.parseDouble(hourly);
                double hoursworked = 0;
                double grosspay = 0;
                double SSSdeduction = 0;
                double PhilhealthDeduction = 0;
                double PagibigDeduction = 0;
                double WithholdingTax = 0;
                double total = 0;
                double netpay = 0;
                double finalDeductions = 0;

                while(rs.next()){
                    date = rs.getString("date");
                    timeIn = rs.getString("time_in");
                    timeOut =rs.getString("time_out");

                    if(date.startsWith(getMonthNumber(selectedmonth))){
                        String tbdata [] = {date,timeIn,timeOut};
                        tablemodel.addRow(tbdata);
                        
                        double timein = Double.parseDouble(timeIn.replace(":", "."));
                        double timeout = Double.parseDouble(timeOut.replace(":","."));
                        double hoursWorked = timeout - timein;
                        hoursworked += hoursWorked;
                        
                        

                    }

                }
                grosspay = Math.round(hoursworked * hourlyrate * 100.0)/ 100.0;
                SSSdeduction = getSSSDeduction((grosspay * 100.0)/100);
                PhilhealthDeduction = getPhilhealthDeduction(grosspay);
                PagibigDeduction = getPagibigDeduction((grosspay * 100.0)/100);

                double deductions = SSSdeduction + PhilhealthDeduction + PagibigDeduction;
                total = grosspay - deductions;

                WithholdingTax = getWithholdingTax(grosspay, total);

                finalDeductions = SSSdeduction + PhilhealthDeduction + PagibigDeduction + WithholdingTax;
                netpay = CalculateNetPay(grosspay,finalDeductions);
                String formatted = String.format("%.0f",hoursworked);
                String formattedtax = String.format("%.2f",WithholdingTax);
                
                hoursworked_field.setText(formatted+" Hours");
                hourly_field.setText("₱"+hourly);
                gross_field.setText("₱"+String.valueOf(grosspay));
                SSS_field.setText("₱"+String.valueOf(SSSdeduction));
                phil_field.setText("₱"+String.valueOf(PhilhealthDeduction));
                pagibig_field.setText("₱"+String.valueOf(PagibigDeduction));
                tax_field.setText("₱"+String.valueOf(formattedtax));
                net_field.setText("₱"+String.valueOf(netpay));
                

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_selected_monthItemStateChanged
    private void count_total_hours_worked(){
            String SUrl, SUser, SPass, query;
            SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
            SUser = "root";
            SPass = "";
            String timeIn;
            String timeOut;
            String date;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
                Statement st = con.createStatement();

                query = "SELECT * FROM attendance where id="+ids;

                ResultSet rs = st.executeQuery(query);
                
                while(rs.next()){
                    
                    timeIn = rs.getString("time_in");
                    timeOut =rs.getString("time_out");
                    if(timeIn.startsWith("0")){
                        absents++;
                    }
                    double timein = Double.parseDouble(timeIn.replace(":", "."));
                    double timeout = Double.parseDouble(timeOut.replace(":","."));
                    double workhours = timeout-timein;
                    totalHours += workhours;
                }
                String finale = String.format("%.0f",totalHours);
                hours_txt.setText(finale);
                absent_count.setText(""+absents);
                
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    private String getMonthNumber(String month) {
        switch (month) {
        case "January": return "01";
        case "February": return "02";
        case "March": return "03";
        case "April": return "04";
        case "May": return "05";
        case "June": return "06";
        case "July": return "07";
        case "August": return "08";
        case "September": return "09";
        case "October": return "10";
        case "November": return "11";
        case "December": return "12";
        default: return "a";
        }   
     
    }
    private double CalculateNetPay(double salary, double finalDeductions){
        double netPay = 0;
        netPay = salary - finalDeductions;
        return Math.round((netPay * 100.0)/100.0);

    }
    
    private double getWithholdingTax(double salary, double total){
       double Tax = 0;
	if (salary <= 20832) { 
              Tax = 0;
	}
	else if (salary >= 20833 && salary < 33333) {
		Tax = (total - 20833) * 0.2;
		if (Tax <= 0) {
			Tax = 0;
		}
		else {
			return Tax;
		}
	}
	else if (salary >= 33333 && salary < 66667) {
		Tax = 2500 + (total - 33333) * 0.25;
	} 
	else if (salary >= 66667 && salary < 166667) {
		Tax = 10833 + (total - 66667) * 0.3;
	} 
	else if (salary >= 166667 && salary < 666667) {
		Tax = 40833.33 + (total - 166667) * 0.32;
	}
	else if (salary >= 666667) {
		Tax = 200833.33 + (total - 666667) * 0.35;
	} 
        return Math.round(Tax * 100.0)/100.0;
    }
    
    private double getPagibigDeduction(double salary){
        double pagibig = 0;
	if (salary >= 1000 && salary <= 1500) {
		pagibig = (salary * 0.03);
		if (pagibig >= 100) {
			pagibig = 100.0;
		}else {
			return pagibig;
		}
        }else if (salary > 1500) {
		pagibig = (salary * 0.04);
		if (pagibig >= 100) {
			pagibig = 100.0;
		}

	}
	else if (salary < 1000) {
		pagibig = 0;
	}
        return Math.round((pagibig*100.0)/100.0);
    }
    
    private double getPhilhealthDeduction(double salary){
        double Philhealth = 0;
	if (salary <= 10000) { 
		Philhealth = 300/2;
	}
	else if (salary >= 10000.01 && salary <= 59999.99) {
		Philhealth = salary * 0.03 / 2;
	} 
	else if (salary >= 60000) {
		Philhealth = 1800 / 2;
	}
        return Math.round(Philhealth * 100.0)/100.0;
    }
            
    private double getSSSDeduction(double salary){
        
        double SSS = 0;
	if (salary >= 24750) {
		SSS = 1125.00;
	}
	else if (salary >= 24250 && salary < 24750) {
		SSS = 1102.50;
	}
	else if (salary >= 23750 && salary <= 24250) {
		SSS = 1080.00;
	}
	else if (salary >= 23250 && salary <= 23750) {
		SSS = 1057.50;
	}
	else if (salary >= 22750 && salary <= 23250) {
		SSS = 1035.00;
	}
	else if (salary >= 22250 && salary <= 22750) {
		SSS = 1012.50;
	}
	else if (salary >= 21750 && salary <= 22250) {
		SSS = 990.00;
	}
	else if (salary >= 21250 && salary <= 21750) {
		SSS = 967.50;
	}
	else if (salary >= 20750 && salary <= 21250) {
		SSS = 945.00;
	}
	else if (salary >= 20250 && salary <= 20750) {
		SSS = 922.50;
	}
	else if (salary >= 19750 && salary <= 20250) {
		SSS = 900.00;
	} 
	else if (salary >= 19250 && salary <= 19750) {
		SSS = 877.50;
	}
	else if (salary >= 18750 && salary <= 19250) {
		SSS = 855.00;
	}
	else if (salary >= 18250 && salary <= 18750) {
		SSS = 832.50;
	}
	else if (salary >= 17750 && salary <= 18250) {
		SSS = 810.00;
	}
	else if (salary >= 17250 && salary <= 17750) {
		SSS = 787.50;
	}
	else if (salary >= 16750 && salary <= 17250) {
		SSS = 765.00;
	}
	else if (salary >= 16250 && salary <= 16750) {
		SSS = 742.50;
	}
	else if (salary >= 15750 && salary <= 16250) {
		SSS = 720.00;
	}
	else if (salary >= 15250 && salary <= 15750) {
		SSS = 697.50;
	}
	else if (salary >= 14750 && salary <= 15250) {
		SSS = 675.00;
	}
	else if (salary >= 14250 && salary <= 14750) {
		SSS = 652.50;
	}
	else if (salary >= 13750 && salary <= 14250) {
		SSS = 630.00;
	}
	else if (salary >= 13250 && salary <= 13750) {
		SSS = 607.50;
	}
	else if (salary >= 12750 && salary <= 13250) {
		SSS = 585.00;
	} 
	else if (salary >= 12250 && salary <= 12750) {
		SSS = 562.50;
	}
	else if (salary >= 11750 && salary <= 12250) {
		SSS = 540.00;
	}
	else if (salary >= 11250 && salary <= 11750) {
		SSS = 517.50;
	} 
	else if (salary >= 10750 && salary <= 11250) {
		SSS = 495.00;
	}
	else if (salary >= 10250 && salary <= 10750) {
		SSS = 472.50;
	} 
	else if (salary >= 9750 && salary <= 10250) {
		SSS = 450.00;
	}
	else if (salary >= 9250 && salary <= 9750) {
		SSS = 427.50;
	}
	else if (salary >= 8750 && salary <= 9250) {
		SSS = 405.00;
	}
	else if (salary >= 8250 && salary <= 8750) {
		SSS = 382.50;
	}
	else if (salary >= 7750 && salary <= 8250) {
		SSS = 360.00;
	} 
	else if (salary >= 7250 && salary <= 7750) {
		SSS = 337.50;
	}
	else if (salary >= 6750 && salary <= 7250) {
		SSS = 315.00;
	} 
	else if (salary >= 6250 && salary <= 6750) {
		SSS = 292.50;
	}
	else if (salary >= 5750 && salary <= 6250) {
		SSS = 270.00;
	}
	else if (salary >= 5250 && salary <= 5750) {
		SSS = 247.50;
	}
	else if (salary >= 4750 && salary <= 5250) {
		SSS = 225.00;
	}
	else if (salary >= 4250 && salary <= 4750) {
		SSS = 202.50;
	}
	else if (salary >= 3750 && salary <= 4250) {
		SSS = 180.00;
	}
	else if (salary >= 3250 && salary <= 3750) {
		SSS = 157.50;
	}
	else if (salary < 3250) {
		SSS = 135.00;
	}
        return SSS;
        
    }
    
    private void loadLeaveTable(){
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        int userID = Integer.parseInt(ids);
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            
            
            query  = "SELECT * FROM leave_requests WHERE id="+userID;
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                String type = rs.getString("Leave_type");
                String start = rs.getString("Start_date");
                String end = rs.getString("End_date");
                String stat = rs.getString("status");
                
                String tbdata[] = {type, start, end, stat};
                DefaultTableModel tablemodel = (DefaultTableModel)leave_table.getModel();
                
                tablemodel.addRow(tbdata);
                leave_count++;
            }
            leave_total.setText(""+leave_count);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void loadData(){
        DefaultTableModel tablemodel = (DefaultTableModel)leave_table.getModel();
        tablemodel.setRowCount(0);
                
        String query = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MYSQL://localhost:3306/employee_database";
        SUser = "root";
        SPass = "";
        int userID = Integer.parseInt(ids);
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
            Statement st = con.createStatement();
            
            
            query  = "SELECT * FROM leave_requests WHERE id="+userID;
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                String type = rs.getString("Leave_type");
                String start = rs.getString("Start_date");
                String end = rs.getString("End_date");
                String stat = rs.getString("status");
                
                String tbdata[] = {type, start, end, stat};
                
                
                tablemodel.addRow(tbdata);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard_Tab;
    private javax.swing.JLabel Emp_number_label;
    private javax.swing.JPanel Empmanage_tab;
    private javax.swing.JLabel Grossrate_label;
    private javax.swing.JLabel Hourly_rate_label;
    private javax.swing.JLabel Leave_panel;
    private javax.swing.JPanel Leave_tab;
    private javax.swing.JLabel Logout_panel;
    public static javax.swing.JLabel Name_label;
    private javax.swing.JLabel Name_label1;
    private javax.swing.JLabel Name_label2;
    public static javax.swing.JLabel Pagibig_label;
    private javax.swing.JLabel Payroll_panel;
    private javax.swing.JPanel Payroll_tab;
    public static javax.swing.JLabel Philhealth_label;
    public static javax.swing.JLabel Pos_label;
    private javax.swing.JPanel Profile_tab;
    private javax.swing.JTextField SSS_field;
    public static javax.swing.JLabel SSS_label;
    private javax.swing.JLabel SSS_lbl;
    private javax.swing.JLabel Salary_label;
    public static javax.swing.JLabel Status_label1;
    public static javax.swing.JLabel TIN_label;
    private javax.swing.JLabel Welcome_label;
    private javax.swing.JLabel absent_count;
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField addresstxtfield;
    private javax.swing.JTable attenance_table;
    public static javax.swing.JLabel bday_label2;
    private javax.swing.JTextField birthdate_txtfield;
    private javax.swing.JLabel dashboard_panel;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton delete_btn1;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton editprofile;
    private javax.swing.JLabel empManagement_panel;
    private javax.swing.JLabel emp_countlbl;
    private javax.swing.JLabel emp_countlbl1;
    private javax.swing.JTable employee_Table;
    private javax.swing.JTextField end_date;
    private javax.swing.JTextField firstname_txtfield;
    private javax.swing.JTextField gross_field;
    private javax.swing.JLabel grosspay_lbl;
    private javax.swing.JTextField hourly_field;
    private javax.swing.JLabel hourlyrate_lbl;
    private javax.swing.JLabel hours_txt;
    private javax.swing.JTextField hoursworked_field;
    private javax.swing.JLabel hoursworked_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelemp;
    private javax.swing.JLabel jLabelemp1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastname_txtfield;
    private javax.swing.JTable leave_table;
    private javax.swing.JLabel leave_total;
    private javax.swing.JComboBox<String> leave_type_cmbobox;
    private javax.swing.JLabel leavelbl;
    private javax.swing.JButton manage_requests_bttn;
    private javax.swing.JTextField net_field;
    private javax.swing.JLabel netpay_lbl;
    private javax.swing.JTextField pagibig_field;
    private javax.swing.JLabel pagibig_lbl;
    private javax.swing.JTextField phil_field;
    private javax.swing.JLabel philhealth_lbl;
    public static javax.swing.JLabel phoneNum_label1;
    private javax.swing.JTextField position_txtfield;
    private javax.swing.JLabel profile_panel;
    private javax.swing.JTextField reasontxtfield;
    private javax.swing.JButton req_leave_bttn;
    private javax.swing.JComboBox<String> selected_month;
    private javax.swing.JTextField start_date;
    private javax.swing.JTextField tax_field;
    private javax.swing.JLabel tax_lbl;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
