/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import DAO.NhanVienDAO;
import ENTITY.NhanVien;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import Helper.ResetPassword;

/**
 *
 * @author 
 */
public class XacNhanPassword extends javax.swing.JDialog {
    NhanVienDAO dao = new NhanVienDAO();
    /**
     * Creates new form VerifyJDialog
     */
    public XacNhanPassword(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    private void changePassword() {
        String manv = ResetPassword.userName;
        String password = new String(txtNewPass.getPassword());
        String conPassword = new String(txtConfirmPass.getPassword());
        String code = new String(txtCode.getPassword());
//        User us = LoginController.getUser(manv);
        NhanVien nv = dao.selectById(manv);
        if (nv == null) {
            JOptionPane.showMessageDialog(this, "Lỗi");
        } else {
            if (nv.getCode().equals(code)) {
//                LoginController.resetPassword(password, manv);
                dao.resetPassword(password, manv);
                this.dispose();
                new LoginForm(null,true).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Code sai");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewPass = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        lblConfirmPass = new javax.swing.JLabel();
        txtConfirmPass = new javax.swing.JPasswordField();
        lblConfirmPass1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNewPass.setText("New Password");
        getContentPane().add(lblNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 111, -1));
        getContentPane().add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 382, -1));

        lblConfirmPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmPass.setText("Confirm Password");
        getContentPane().add(lblConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 129, 130, -1));
        getContentPane().add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 382, -1));

        lblConfirmPass1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmPass1.setText("Verify Code");
        getContentPane().add(lblConfirmPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 187, 111, -1));
        getContentPane().add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, 382, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Verify Code");
        jPanel4.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 275, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        changePassword();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(XacNhanPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XacNhanPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XacNhanPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XacNhanPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                XacNhanPassword dialog = new XacNhanPassword(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblConfirmPass1;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPasswordField txtCode;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JPasswordField txtNewPass;
    // End of variables declaration//GEN-END:variables
}
