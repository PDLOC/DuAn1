/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.KhachHangDAO;
import ENTITY.KhachHang;
import Helper.XDate;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class KhachHangHDCHonForm extends javax.swing.JDialog {

    KhachHangDAO dao = new KhachHangDAO();
    int row = -1;

    /**
     * Creates new form KhachHangForm
     */
    public KhachHangHDCHonForm() {

        initComponents();
        setLocationRelativeTo(null);
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSDTKH = new javax.swing.JTextField();
        txtDiaChiKH = new javax.swing.JTextField();
        txtNgayTGKH = new javax.swing.JTextField();
        btnFirstKH = new javax.swing.JButton();
        btnNextKH = new javax.swing.JButton();
        btnPrevKH = new javax.swing.JButton();
        btnLastKH = new javax.swing.JButton();
        rdoNamKH = new javax.swing.JRadioButton();
        rdoNuKH = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        btnUpdateKH = new javax.swing.JButton();
        btnDelKH = new javax.swing.JButton();
        btnAddKH = new javax.swing.JButton();
        btnClearKH = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txtFindKH = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnFindKH = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Mã khách hàng:");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 113, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Tên khách hàng:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Giới tính:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 113, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Số điện thoại:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 113, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Địa chỉ:");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 113, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Ngày tham gia:");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 113, -1));
        jPanel8.add(txtMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 320, -1));
        jPanel8.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 320, -1));
        jPanel8.add(txtSDTKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 320, -1));
        jPanel8.add(txtDiaChiKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 320, -1));
        jPanel8.add(txtNgayTGKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 320, -1));

        btnFirstKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/first.png"))); // NOI18N
        btnFirstKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel8.add(btnFirstKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 40, 34));

        btnNextKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/next.png"))); // NOI18N
        btnNextKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel8.add(btnNextKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 40, 34));

        btnPrevKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/prev.png"))); // NOI18N
        btnPrevKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel8.add(btnPrevKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 40, 34));

        btnLastKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/last.png"))); // NOI18N
        btnLastKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel8.add(btnLastKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 40, 34));

        buttonGroup1.add(rdoNamKH);
        rdoNamKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdoNamKH.setText("Nam");
        jPanel8.add(rdoNamKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        buttonGroup1.add(rdoNuKH);
        rdoNuKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdoNuKH.setText("Nữ");
        jPanel8.add(rdoNuKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdateKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/update.png"))); // NOI18N
        btnUpdateKH.setText("Sửa");
        btnUpdateKH.setBorder(null);
        btnUpdateKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel7.add(btnUpdateKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 40));

        btnDelKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Delete.png"))); // NOI18N
        btnDelKH.setText("Xóa");
        btnDelKH.setBorder(null);
        btnDelKH.setPreferredSize(new java.awt.Dimension(63, 25));
        btnDelKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel7.add(btnDelKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 40));

        btnAddKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/save.png"))); // NOI18N
        btnAddKH.setText("Thêm");
        btnAddKH.setBorder(null);
        btnAddKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel7.add(btnAddKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 40));

        btnClearKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/new.png"))); // NOI18N
        btnClearKH.setText("Mới");
        btnClearKH.setBorder(null);
        btnClearKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel7.add(btnClearKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 40));

        jPanel8.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 160, 210));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Giới Tính", "Số Điện Thoại", "Địa chỉ", "Ngày Tham Gia"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblKhachHangMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhachHang);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 327, 960, 280));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Tìm kiếm:");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 40));
        jPanel8.add(txtFindKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 270, 30));

        jButton2.setText("Chọn Khách Hàng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 175, 40));

        btnFindKH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFindKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/search.png"))); // NOI18N
        btnFindKH.setText("Tìm");
        btnFindKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindKHActionPerformed(evt);
            }
        });
        jPanel8.add(btnFindKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 120, 40));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 980, 610));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindKHActionPerformed
        // TODO add your handling code here:
        fillTable();
        clear();
    }//GEN-LAST:event_btnFindKHActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here

        try {
            int index = tblKhachHang.getSelectedRow();
            TableModel model = tblKhachHang.getModel();
            String id = (String) model.getValueAt(index, 0);

            HoaDonForm.hdn.txt1.setText(id);

            this.dispose();
        } catch (Exception e) {
            System.out.println("fm" + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        Next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        Last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        Prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        delete();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        insert();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMousePressed
        // TODO add your handling code here:
        this.row = tblKhachHang.rowAtPoint(evt.getPoint());
        if (this.row >= 0) {
            this.edit();
        }
    }//GEN-LAST:event_tblKhachHangMousePressed
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
            java.util.logging.Logger.getLogger(CTHoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTHoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTHoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTHoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangHDCHonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddKH;
    private javax.swing.JButton btnClearKH;
    private javax.swing.JButton btnDelKH;
    private javax.swing.JButton btnFindKH;
    private javax.swing.JButton btnFirstKH;
    private javax.swing.JButton btnLastKH;
    private javax.swing.JButton btnNextKH;
    private javax.swing.JButton btnPrevKH;
    private javax.swing.JButton btnUpdateKH;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNamKH;
    private javax.swing.JRadioButton rdoNuKH;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiaChiKH;
    private javax.swing.JTextField txtFindKH;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgayTGKH;
    private javax.swing.JTextField txtSDTKH;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtFindKH.getText();
            List<KhachHang> list = dao.selectByKeyword(keyword);
            for (KhachHang kh : list) {
                Object[] row = {
                    kh.getMaKh(),
                    kh.getTenKh(),
                    kh.isGioiTinh() ? "Nam" : "Nữ",
                    kh.getSdt(),
                    kh.getDiaChi(),
                    kh.getNgayTG()
//                  XDate.toString(kh.getNgayTG())
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setForm(KhachHang model) {
        txtMaKH.setText(model.getMaKh());
        txtTenKH.setText(model.getTenKh());
        rdoNamKH.setSelected(model.isGioiTinh());
        rdoNuKH.setSelected(!model.isGioiTinh());
        txtSDTKH.setText(model.getSdt());
        txtDiaChiKH.setText(model.getDiaChi());
        txtNgayTGKH.setText(XDate.toString(model.getNgayTG()));
    }

    KhachHang getForm() {
        KhachHang model = new KhachHang();
        model.setMaKh(txtMaKH.getText());
        model.setTenKh(txtTenKH.getText());
        model.setSdt(txtSDTKH.getText());
        model.setDiaChi(txtDiaChiKH.getText());
        model.setNgayTG(XDate.toDate(txtNgayTGKH.getText()));
        model.setGioiTinh(rdoNamKH.isSelected());
        return model;
    }

    void edit() {
        try {
            String MaKH = (String) tblKhachHang.getValueAt(this.row, 0);
            KhachHang kh = dao.findById(MaKH);
            if (kh != null) {
                setForm(kh);
                updateStatus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    void first() {
        row = 0;
        tblKhachHang.setRowSelectionInterval(row, row);
        edit();
    }

    void Prev() {
        if (row > 0) {
            row--;
            tblKhachHang.setRowSelectionInterval(row, row);
            edit();
        }
    }

    void Next() {
        if (row < tblKhachHang.getRowCount() - 1) {
            row++;
            tblKhachHang.setRowSelectionInterval(row, row);
            edit();
        }
    }

    void Last() {
        row = tblKhachHang.getRowCount() - 1;
        tblKhachHang.setRowSelectionInterval(row, row);
        edit();
    }

    void updateStatus() {
        boolean edit = this.row >= 0;
        boolean first = this.row == 0;
        boolean last = this.row == tblKhachHang.getRowCount() - 1;
        txtMaKH.setEditable(!edit);
        btnAddKH.setEnabled(!edit);
        btnUpdateKH.setEnabled(edit);
        btnDelKH.setEnabled(edit);

        btnFirstKH.setEnabled(edit && !first);
        btnPrevKH.setEnabled(edit && !first);
        btnNextKH.setEnabled(edit && !last);
        btnLastKH.setEnabled(edit && !last);
    }

    void insert() {
        if (vali()) {
            KhachHang model = getForm();
            try {
                dao.insert(model);
                this.fillTable();
                JOptionPane.showMessageDialog(this, "Thêm mới thành công!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Thêm mới thất bại!");
            }
        }
    }

    void update() {
        KhachHang model = getForm();
        try {
            dao.update(model);
            this.fillTable();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
        }

    }

    void delete() {
        int answer = JOptionPane.showConfirmDialog(this, "Bạn có thực sự muốn xóa khách hàng này ?", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (answer == JOptionPane.YES_OPTION) {
            String makh = txtMaKH.getText();
            try {
                dao.delete(makh);
                this.fillTable();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
            }
        }
    }

    public boolean vali() {
        if (txtMaKH.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã !");
            txtMaKH.requestFocus();
            return false;
        }
        if (txtTenKH.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống tên !");
            txtTenKH.requestFocus();
            return false;
        }
        if (buttonGroup1.isSelected(null)) {
            JOptionPane.showMessageDialog(this, "Mời bạn check giới tính !");
            return false;

        }
        if (txtNgayTGKH.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mời bạn điền ngày tham gia !");
            txtNgayTGKH.requestFocus();
            return false;
        }
        return true;
    }

    void clear() {
        this.setForm(new KhachHang());
        buttonGroup1.clearSelection();
        txtNgayTGKH.setText("");
        this.updateStatus();
        row = - 1;
        updateStatus();
    }
}
