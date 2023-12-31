/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.studentregistration.views;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import com.studentregistration.controllers.StudentController;
import com.studentregistration.models.Student;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cpe
 */
public class RegistrationForm extends javax.swing.JFrame {
    private boolean isEdit = false;
    private String studentIdNo = null;
    String userS;
    String idS;
    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm(String user, String id) {
        
        initComponents();
        LoadStudents();
        Reset();
        lblWelcome.setText("Welcome, " + user);
        this.userS = user;
        lblgetID.setText(id);
        lblgetID.setFont(new java.awt.Font("Lucida Grande", 1, 0));
        this.idS = id;
        
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
        jLabel2 = new javax.swing.JLabel();
        txtIDNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLN = new javax.swing.JTextField();
        txtFN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMI = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable();
        cmbGender = new javax.swing.JComboBox<>();
        dtDoB = new com.toedter.calendar.JDateChooser();
        lblWelcome = new javax.swing.JLabel();
        txtSearchString = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblgetID = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuStudent = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuManageProfile = new javax.swing.JMenuItem();
        menuDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("Student Details");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setText("ID Number:");

        txtIDNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setText("Lastname:");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setText("Firstname:");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setText("Middle Initial:");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel6.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel7.setText("Gender:");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel8.setText("Date of Birth:");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel9.setText("Address:");

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Firstname", "Lastname", "MI", "Age", "Gender", "Birth", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblStudentList.getTableHeader().setReorderingAllowed(false);
        tblStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudentList);
        if (tblStudentList.getColumnModel().getColumnCount() > 0) {
            tblStudentList.getColumnModel().getColumn(0).setResizable(false);
            tblStudentList.getColumnModel().getColumn(0).setPreferredWidth(120);
            tblStudentList.getColumnModel().getColumn(1).setResizable(false);
            tblStudentList.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblStudentList.getColumnModel().getColumn(2).setResizable(false);
            tblStudentList.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblStudentList.getColumnModel().getColumn(3).setResizable(false);
            tblStudentList.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblStudentList.getColumnModel().getColumn(4).setResizable(false);
            tblStudentList.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblStudentList.getColumnModel().getColumn(5).setResizable(false);
            tblStudentList.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblStudentList.getColumnModel().getColumn(6).setResizable(false);
            tblStudentList.getColumnModel().getColumn(6).setPreferredWidth(130);
            tblStudentList.getColumnModel().getColumn(7).setResizable(false);
            tblStudentList.getColumnModel().getColumn(7).setPreferredWidth(250);
        }

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        dtDoB.setDateFormatString("yyyy-MM-dd");

        lblWelcome.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        lblWelcome.setText("Welcome, ");

        txtSearchString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStringActionPerformed(evt);
            }
        });
        txtSearchString.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchStringKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel11.setText("Search:");

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        menuStudent.setText("Student Dashboard");
        menuStudent.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuStudentMenuSelected(evt);
            }
        });
        jMenuBar1.add(menuStudent);

        menuUser.setText("User Dashboard");
        menuUser.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuUserMenuSelected(evt);
            }
        });
        menuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUserActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuUser);

        jMenu4.setText("Settings");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        menuManageProfile.setText("Manage Profile");
        menuManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageProfileActionPerformed(evt);
            }
        });
        jMenu4.add(menuManageProfile);

        menuDarkMode.setText("Dark Mode");
        menuDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDarkModeActionPerformed(evt);
            }
        });
        jMenu4.add(menuDarkMode);

        menuLogout.setText("Log out");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu4.add(menuLogout);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dtDoB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(cmbGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFN, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIDNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtLN, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMI, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAddress))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblgetID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 909, Short.MAX_VALUE)
                        .addComponent(lblWelcome)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchString, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblWelcome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIDNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dtDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(9, 9, 9)
                        .addComponent(lblgetID)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyy-MM-dd");
        String idno = txtIDNo.getText();
        String ln = txtLN.getText();
        String fn = txtFN.getText();
        String mi = txtMI.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = cmbGender.getItemAt(cmbGender.getSelectedIndex());
        String dob = dateFormatter.format(dtDoB.getDate());
        String address = txtAddress.getText();
        
        Student student = new Student();
        student.setIdno(idno);
        student.setFirstname(fn);
        student.setLastname(ln);
        student.setMiddle(mi);
        student.setAge(age);
        student.setGender(gender);
        student.setDob(dob);
        student.setAddress(address);
        
        StudentController studController = new StudentController();
        if (!isEdit) {
        studController.saveStudent(student);
        } else {
        studController.updateStudent(student);
        }
        LoadStudents();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIDNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNoActionPerformed

    private void tblStudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentListMouseClicked
        if (evt.getClickCount() == 2) { //trigger double click
            try {
            int selRow = tblStudentList.getSelectedRow();
            String idno = tblStudentList.getValueAt(selRow, 0).toString();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
            StudentController studController = new StudentController();
            Student student = studController.getStudent(idno);
            txtIDNo.setEditable(false);
            txtIDNo.setText(student.getIdno());
            txtLN.setText(student.getLastname());
            txtFN.setText(student.getFirstname());
            txtMI.setText(student.getMiddle());
            txtAge.setText(student.getAge()+"");
            cmbGender.setSelectedItem(student.getGender());
            dtDoB.setDate(dateFormatter.parse(student.getDob()));
            txtAddress.setText(student.getAddress());
            jButton1.setText("UPDATE"); // save button
            jButton2.setText("CANCEL"); //reset button
            isEdit = true;
            jButton3.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else { // select record for deletion
            int selRow = tblStudentList.getSelectedRow();
            studentIdNo = tblStudentList.getValueAt(selRow, 0).toString();
            jButton3.setEnabled(true);
        }
    }//GEN-LAST:event_tblStudentListMouseClicked

    private void txtSearchStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStringActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int response = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to delete this record?", "Confirm Delete",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
        StudentController studController = new StudentController();
        studController.deleteStudent(studentIdNo);
        LoadStudents();
        jButton3.setEnabled(false);
        studentIdNo = null;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSearchStringKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchStringKeyPressed
        StudentController studController = new StudentController();
        List<Student> list = studController.searchStudent(null, txtSearchString.getText());
        DefaultTableModel model = (DefaultTableModel) tblStudentList.getModel();
        model.setRowCount(0);
        for (Student student: list) {
        String idno = student.getIdno();
        String ln = student.getLastname();
        String fn = student.getFirstname();
        String mn = student.getMiddle();
        int age = student.getAge();
        String gender = student.getGender();
        String dob = student.getDob();
        String address = student.getAddress();
        model.addRow(new Object[]{idno, ln, fn, mn, age, gender, dob, address});
        }
    }//GEN-LAST:event_txtSearchStringKeyPressed

    private void menuDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDarkModeActionPerformed
        if(menuDarkMode.isSelected()){
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatAtomOneDarkIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                }
            });
        }else{
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FlatAnimatedLafChange.showSnapshot();
                    FlatAtomOneLightIJTheme.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                }
            });
        }
    }//GEN-LAST:event_menuDarkModeActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed

    }//GEN-LAST:event_menuUserActionPerformed

    private void menuUserMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuUserMenuSelected

            new RegistrationFormForUser(userS, idS).setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_menuUserMenuSelected

    private void menuManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageProfileActionPerformed
            new ManageProfile(userS, idS).setVisible(true);
            this.setVisible(false);
            
    }//GEN-LAST:event_menuManageProfileActionPerformed

    private void menuStudentMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuStudentMenuSelected
        new RegistrationForm(userS, idS).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuStudentMenuSelected

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
         dispose();
         LoginForm login = new LoginForm();
         login.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatIntelliJLaf.setup();
        try {
        FlatAtomOneLightIJTheme.setup();
        } catch( Exception e ) {
        e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm(null,null).setVisible(true);
            }
        });
    }

private void LoadStudents() {
    StudentController studController = new StudentController();
    List<Student> list = studController.studentList();
    DefaultTableModel model = (DefaultTableModel) tblStudentList.getModel();
    model.setRowCount(0);
    for (Student student: list) {
    String idno = student.getIdno();
    String ln = student.getLastname();
    String fn = student.getFirstname();
    String mn = student.getMiddle();
    int age = student.getAge();
    String gender = student.getGender();
    String dob = student.getDob();
    String address = student.getAddress();
    model.addRow(new Object[]{idno, ln, fn, mn, age, gender, dob, address});
    }
}    

private void Reset() {
    txtIDNo.setText("");
    txtLN.setText("");
    txtFN.setText("");
    txtMI.setText("");
    txtAge.setText("");
    cmbGender.setSelectedItem("");
    dtDoB.setDate(null);
    txtAddress.setText("");
    jButton1.setText("SAVE"); // save button
    jButton2.setText("RESET"); //reset button
    jButton3.setEnabled(false);
    txtIDNo.setEditable(true);
    txtIDNo.requestFocus();
    isEdit = false;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbGender;
    private com.toedter.calendar.JDateChooser dtDoB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblgetID;
    private javax.swing.JCheckBoxMenuItem menuDarkMode;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuManageProfile;
    private javax.swing.JMenu menuStudent;
    private javax.swing.JMenu menuUser;
    private javax.swing.JTable tblStudentList;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtIDNo;
    private javax.swing.JTextField txtLN;
    private javax.swing.JTextField txtMI;
    private javax.swing.JTextField txtSearchString;
    // End of variables declaration//GEN-END:variables
}
