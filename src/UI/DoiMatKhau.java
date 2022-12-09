/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import DAO.NhanVienDAO;
import Helper.Auth;
import Helper.XImage;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyen vu
 */
public class DoiMatKhau extends javax.swing.JDialog {

    /**
     * Creates new form DoiMatKhau_1
     */
    public DoiMatKhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtUsername.setText(Auth.user.getMaNV());
        txtUsername.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblCurrentPass = new javax.swing.JLabel();
        txtCurrentPass = new javax.swing.JPasswordField();
        lblNewPass = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        lblConfirmPass = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đổi mật khẩu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setText("Username");
        pnlMain.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 111, -1));
        pnlMain.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 204, -1));

        lblCurrentPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCurrentPass.setText("Current Password");
        pnlMain.add(lblCurrentPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 130, -1));
        pnlMain.add(txtCurrentPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 204, -1));

        lblNewPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNewPass.setText("New Password");
        pnlMain.add(lblNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 111, -1));
        pnlMain.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 204, -1));

        txtConfirmPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPassKeyPressed(evt);
            }
        });
        pnlMain.add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 204, -1));

        lblConfirmPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmPass.setText("Confirm Password");
        pnlMain.add(lblConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 140, -1));

        btnChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/replace_42px.png"))); // NOI18N
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        pnlMain.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 130, 40));

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/close_40px.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlMain.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 120, 40));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CHANGE PASSWORD");
        jPanel4.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 275, 50));

        pnlMain.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.huyBo();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        this.doiMatKhau();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void txtConfirmPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPassKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            doiMatKhau();
        }
    }//GEN-LAST:event_txtConfirmPassKeyPressed

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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhau dialog = new DoiMatKhau(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChange;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblCurrentPass;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JPasswordField txtCurrentPass;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
    NhanVienDAO dao = new NhanVienDAO();
    void doiMatKhau(){
        String manv = txtUsername.getText();
        String matKhau = new String(txtCurrentPass.getPassword());
        String matKhauMoi = new String(txtNewPass.getPassword());
        String matKhauMoi2 = new String(txtConfirmPass.getPassword());
        if(!manv.equalsIgnoreCase(Auth.user.getMaNV())){
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập!");
        }
        else if(!matKhau.equals(Auth.user.getMatKhau())){
            JOptionPane.showMessageDialog(this, "Mật khẩu cũ không đúng!");
        }
        else if(!matKhauMoi.equals(matKhauMoi2)){
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không đúng!");
        }
        else{
            Auth.user.setMatKhau(matKhauMoi);
            dao.update(Auth.user);
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
            this.dispose();
        }
    }
    
    void huyBo(){
        this.dispose();
    }
}
