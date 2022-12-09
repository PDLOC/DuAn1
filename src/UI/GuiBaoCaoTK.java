/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Helper.Auth;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author huyhoai
 */
public class GuiBaoCaoTK extends javax.swing.JFrame {

    File file = null;
    String from = null;
    String to = null;
    String host = null;
    String subject = null;
    String body = null;
    MimeMultipart multipart;
    FileDataSource fds;
    MimeBodyPart filePart;
    String nv = " ";
    String tt = " ";
    String shd = " ";
    String ssp = " ";
    String sl = " ";

    /**
     * Creates new form GuiBaoCaoTK
     */
    public GuiBaoCaoTK() {
        initComponents();
        this.setLocationRelativeTo(null);
        checkThongtin();
        txtgmailnv.setText("hoaidao17102003@gmail.com");
        txtpassnv.setText("00000000000");
        txtgmailquanly.setText("hoaidthps21446@fpt.edu.vn");
        txtsubject.setText("báo cáo");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void checkThongtin() {
        ThongKeForm tkf = new ThongKeForm();
        if (tkf.ListTKHD.size()== 0) {
            nv = "0";
            tt = "0";
            shd = "0";
            ssp = "0";
            sl = "0";
            taconten.setText("Ngày: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + "\n" + "Nhân Viên: " + nv + "\n"
                    + "Tổng tiền hôm nay: " + tt + " VND" + "\n"
                    + "Số hóa đơn: " + shd + "\n"
                    + "Số khách hàng: " + ssp + "\n"
                    + "Số sản phẩm: " + sl);
        } else {
            if (!Auth.user.getTenNV().equalsIgnoreCase(" ")) {
                nv = Auth.user.getTenNV();
            }
            if (!String.valueOf(tkf.ListTKHD.get(0).getTongtien()).equalsIgnoreCase(" ")) {
                tt = String.valueOf(tkf.ListTKHD.get(0).getTongtien());
            }
            if (!String.valueOf(tkf.ListTKHD.get(0).getMahd()).equalsIgnoreCase(" ")) {
                shd = String.valueOf(tkf.ListTKHD.get(0).getMahd());
            }
            if (!String.valueOf(tkf.ListTKHD.get(0).getMasp()).equalsIgnoreCase(" ")) {
                ssp = String.valueOf(tkf.ListTKHD.get(0).getMasp());
            }
            if (!String.valueOf(tkf.ListTKHD.get(0).getSoluong()).equalsIgnoreCase(" ")) {
                sl = String.valueOf(tkf.ListTKHD.get(0).getSoluong());
            }
            taconten.setText("Ngày: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + "\n" + "Nhân Viên: " + nv + "\n"
                    + "Tổng tiền hôm nay: " + tt + "VND" + "\n"
                    + "Số hóa đơn: " + shd + "\n"
                    + "Số khách hàng: " + ssp + "\n"
                    + "Số sản phẩm: " + sl);
        }

    }

//    public void check() {
//        ThongKeForm tkf = new ThongKeForm();
//        if (String.valueOf(tkf.ListTKHD.get(0).getMahd()).equalsIgnoreCase("")) {
//            nv = "0";
//            tt = "0";
//            shd = "0";
//            ssp = "0";
//            sl = "0";
//            taconten.setText("Ngày: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + "\n" + "Nhân Viên: " + nv + "\n"
//                    + "Tổng tiền hôm nay: " + tt + "VND" + "\n"
//                    + "Số hóa đơn: " + shd + "\n"
//                    + "Số sản phẩm: " + ssp + "\n"
//                    + "Số lượng: " + sl);
//        } else {
//            taconten.setText("Ngày: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + "\n" + "Nhân Viên: " + nv + "\n"
//                    + "Tổng tiền hôm nay: " + tt + "VND" + "\n"
//                    + "Số hóa đơn: " + shd + "\n"
//                    + "Số sản phẩm: " + ssp + "\n"
//                    + "Số lượng: " + sl);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtgmailnv = new javax.swing.JTextField();
        txtpassnv = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtgmailquanly = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taconten = new javax.swing.JTextArea();
        txtsubject = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();
        btnfile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gửi Báo Cáo Thống Kê");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("NHÂN VIÊN"));

        jLabel2.setText("Gmail Nhân Viên:");

        jLabel3.setText("Mật Khẩu Nhân Viên:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtgmailnv)
                    .addComponent(txtpassnv, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtgmailnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 388, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("QUẢN LÝ"));

        jLabel4.setText("Gmail Quản Lý:");

        jLabel5.setText("Subject:");

        taconten.setColumns(20);
        taconten.setRows(5);
        jScrollPane1.setViewportView(taconten);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgmailquanly, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsubject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtgmailquanly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        getContentPane().add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 571, -1, -1));

        btnfile.setText("File");
        btnfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 571, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        // TODO add your handling code here:
        SendMail();
    }//GEN-LAST:event_btnsendActionPerformed

    private void btnfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
        }
    }//GEN-LAST:event_btnfileActionPerformed

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
            java.util.logging.Logger.getLogger(GuiBaoCaoTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiBaoCaoTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiBaoCaoTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiBaoCaoTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiBaoCaoTK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfile;
    private javax.swing.JButton btnsend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taconten;
    private javax.swing.JTextField txtgmailnv;
    private javax.swing.JTextField txtgmailquanly;
    private javax.swing.JPasswordField txtpassnv;
    private javax.swing.JTextField txtsubject;
    // End of variables declaration//GEN-END:variables

    public void SendMail() {

        from = txtgmailnv.getText();
        to = txtgmailquanly.getText();
        host = "localhost";
        subject = txtsubject.getText();
        body = taconten.getText();
        String cc = "hoaidthps21446@fpt.edu.vn,hhoai17102003@gmail.com";
//        String bcc = "hoaidthps21446@fpt.edu.vn,hhoai17102003@gmail.com";

        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");//chỉ ra máy chủ mail của google...smtp.gmail.com            
        p.put("mail.smtp.port", "587");//

        String password = "mghamlblbyxluxkd";
        String user = "hoaidao17102003@gmail.com";
        txtpassnv.setText(password);
        txtgmailnv.setText(user);
        Session s = Session.getDefaultInstance(p,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        try {
            MimeMessage m = new MimeMessage(s);
            m.setFrom(from);
//            if (rdocc.isSelected()) {
//                m.setRecipients(Message.RecipientType.CC, InternetAddress.parse(to));
//            } else if (rdobcc.isSelected()) {
//                m.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(to));
//            } else {
            m.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//            }
            m.setSubject(subject);
//            m.setText(body);
            BodyPart MessageBodyPart = new MimeBodyPart();
            MessageBodyPart.setText(taconten.getText());
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(MessageBodyPart);
            if (file != null) {
                BodyPart FileBodyPart = new MimeBodyPart();
                DataSource source = new FileDataSource(file);
                FileBodyPart.setDataHandler(new DataHandler(source));
                FileBodyPart.setFileName(file.getName());
                multipart.addBodyPart(FileBodyPart);
            }
            m.setContent(multipart);
            Transport.send(m);
            JOptionPane.showMessageDialog(this, "Đã gửi mail thành công", "Message", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
