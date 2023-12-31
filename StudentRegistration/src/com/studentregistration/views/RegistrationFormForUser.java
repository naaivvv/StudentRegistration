/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.studentregistration.views;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import com.studentregistration.controllers.UserController;
import com.studentregistration.models.User;
import java.awt.EventQueue;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cpe
 */
public class RegistrationFormForUser extends javax.swing.JFrame {
    private boolean isEdit = false;
    private boolean isUser = false;
    private String userIdNo = null;
    String userS;
    String idS;
    /**
     * Creates new form RegistrationForm
     */
    public RegistrationFormForUser(String user, String id) {
        initComponents();
        LoadUsers();
        Reset();
        RegistrationForm regformS = new RegistrationForm(user, id);
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
        txtUN = new javax.swing.JTextField();
        txtPW = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFN = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserList = new javax.swing.JTable();
        lblWelcome = new javax.swing.JLabel();
        txtSearchString = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblgetID = new javax.swing.JLabel();
        lblCompID = new javax.swing.JLabel();
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
        jLabel1.setText("User Details");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setText("ID Number:");

        txtIDNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDNoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setText("Fullname:");

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

        tblUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Password", "Fullname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblUserList.getTableHeader().setReorderingAllowed(false);
        tblUserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUserList);
        if (tblUserList.getColumnModel().getColumnCount() > 0) {
            tblUserList.getColumnModel().getColumn(0).setResizable(false);
            tblUserList.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblUserList.getColumnModel().getColumn(1).setResizable(false);
            tblUserList.getColumnModel().getColumn(1).setPreferredWidth(180);
            tblUserList.getColumnModel().getColumn(2).setResizable(false);
            tblUserList.getColumnModel().getColumn(2).setPreferredWidth(180);
            tblUserList.getColumnModel().getColumn(3).setResizable(false);
            tblUserList.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUN)
                            .addComponent(txtPW)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIDNo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblCompID))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblWelcome)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchString, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblgetID)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                        .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(207, 207, 207)
                        .addComponent(lblCompID)
                        .addGap(0, 225, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblgetID)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idno = txtIDNo.getText();
        String un = txtUN.getText();
        String pw = txtPW.getText();
        String fn = txtFN.getText();
        User user = new User();
        user.setIdno(idno);
        user.setUname(un);
        user.setPwd(pw);
        user.setFullname(fn);
        UserController userController = new UserController();
        if (!isEdit) {
        userController.saveUser(user);
        } else {
        userController.updateUser(user);
        }
        LoadUsers();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIDNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDNoActionPerformed

    private void tblUserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserListMouseClicked
        if (evt.getClickCount() == 2) { //trigger double click
            int selRow = tblUserList.getSelectedRow();
            String idno = tblUserList.getValueAt(selRow, 0).toString();
            UserController userController = new UserController();
            User user = userController.getUser(idno);
            txtIDNo.setEditable(false);
            txtIDNo.setText(user.getIdno());
            txtUN.setText(user.getUname());
            txtPW.setText(user.getPwd());
            txtFN.setText(user.getFullname());
            jButton1.setText("UPDATE"); // save button
            jButton2.setText("CANCEL"); //reset button
            isEdit = true;
            jButton3.setEnabled(false);
       
        } else { // select record for deletion
            int selRow = tblUserList.getSelectedRow();
            userIdNo = tblUserList.getValueAt(selRow, 0).toString();
            if(userIdNo.equalsIgnoreCase(idS)){
                isUser = true;
            }else{
                isUser = false;
            }
            jButton3.setEnabled(true);
        }
    }//GEN-LAST:event_tblUserListMouseClicked

    private void txtSearchStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStringActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!isUser){
            int response = JOptionPane.showConfirmDialog(null,
        "Are you sure you want to delete this record?", "Confirm Delete",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
        UserController userController = new UserController();
        userController.deleteUser(userIdNo);
        LoadUsers();
        jButton3.setEnabled(false);
        userIdNo = null;
        }
        }else{
            JOptionPane.showMessageDialog(null,
        "Error in deleting user, currently logged on.", " Delete Eror"
                    , JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSearchStringKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchStringKeyPressed
        UserController userController = new UserController();
        List<User> list = userController.searchUser(null, txtSearchString.getText());
        DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
        model.setRowCount(0);
        for (User user: list) {
        String idno = user.getIdno();
        String un = user.getUname();
        String pw = user.getPwd();
        String fn = user.getFullname();
        user.setIdno(idno);
        user.setUname(un);
        user.setPwd(pw);
        user.setFullname(fn);
        model.addRow(new Object[]{idno, un, pw, fn});
        }
    }//GEN-LAST:event_txtSearchStringKeyPressed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        dispose();
        LoginForm login = new LoginForm();
        login.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

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

    private void menuManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageProfileActionPerformed
        new ManageProfile(userS, idS).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuManageProfileActionPerformed

    private void menuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUserActionPerformed

    }//GEN-LAST:event_menuUserActionPerformed

    private void menuUserMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuUserMenuSelected
        new RegistrationFormForUser(userS, idS).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuUserMenuSelected

    private void menuStudentMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuStudentMenuSelected
        new RegistrationForm(userS, idS).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuStudentMenuSelected

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
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

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationFormForUser(null, null).setVisible(true);
            }
        });
    }

public void LoadUsers() {
    UserController userController = new UserController();
    List<User> list = userController.userList();
    DefaultTableModel model = (DefaultTableModel) tblUserList.getModel();
    model.setRowCount(0);
    for (User user: list) {
    String idno = user.getIdno();
    String un = user.getUname();
    String ps = user.getPwd();
    String fn = user.getFullname();
    model.addRow(new Object[]{idno, un, ps, fn});
    }
}    

private void Reset() {
    txtIDNo.setText("");
    txtUN.setText("");
    txtPW.setText("");
    txtFN.setText("");
    jButton1.setText("SAVE"); // save button
    jButton2.setText("RESET"); //reset button
    jButton3.setEnabled(false);
    txtIDNo.setEditable(true);
    txtIDNo.requestFocus();
    isEdit = false;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompID;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblgetID;
    private javax.swing.JCheckBoxMenuItem menuDarkMode;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuManageProfile;
    private javax.swing.JMenu menuStudent;
    private javax.swing.JMenu menuUser;
    private javax.swing.JTable tblUserList;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtIDNo;
    private javax.swing.JTextField txtPW;
    private javax.swing.JTextField txtSearchString;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}
