/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.SanPhamDAO;

import ENTITY.SanPham;
import Helper.Auth;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class HoaDonForm extends javax.swing.JInternalFrame {

    public static HoaDonForm hdn;
    public JTextField txt1, txt2;
    DefaultTableModel tblModel, tblModelDanhSach, tblModelHD;
    int index = -1;
    SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
    Connection cnn;
    Statement st;

    /**
     * Creates new form HoaDonForm
     */
    public HoaDonForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        initTable();
        displayUserInfo();
        try {
            hdn = this;
            txt1 = txtMaKH;

            String url = "jdbc:sqlserver://localhost:1433;databaseName=duan1;encrypt=true;trustServerCertificate=true;";
            String user = "edu";
            String pass = "123";
            cnn = DriverManager.getConnection(url, user, pass);
            delete();
            fillTableSP();
        } catch (SQLException ex) {
            System.out.println("loi kn");
        }

    }

    public void initTable() {

        tblModelDanhSach = new DefaultTableModel();
        tblModelDanhSach.setColumnIdentifiers(new Object[]{"Mã SP", "Tên Sp", "Số lượng", "Giá sản phẩm", "Thành tiền"});
        tblDanhSach.setModel(tblModelDanhSach);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmnXoaHD = new javax.swing.JPopupMenu();
        mniXoa = new javax.swing.JMenuItem();
        mniXoaall = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        btnThanhTien = new javax.swing.JButton();
        TxtTenKH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnChonKH = new javax.swing.JButton();

        mniXoa.setText("Xóa Sản Phẩm");
        mniXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniXoaActionPerformed(evt);
            }
        });
        pmnXoaHD.add(mniXoa);

        mniXoaall.setText("Xóa Tất Cả");
        mniXoaall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniXoaallActionPerformed(evt);
            }
        });
        pmnXoaHD.add(mniXoaall);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HÓA ĐƠN");

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

        tblSP1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên Sản Phẩm", "Số Lượng", "Giá Sp", "Loại"
            }
        ));
        tblSP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSP1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 620, 320));

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDanhSach.setComponentPopupMenu(pmnXoaHD);
        jScrollPane2.setViewportView(tblDanhSach);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 980, 280));

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Chi Tiết Hóa Đơn");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 229, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Mã Nhân Viên");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));
        getContentPane().add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 104, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Tên Nhân Viên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));
        getContentPane().add(txtTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 104, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Mã Hóa Đơn");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));
        getContentPane().add(txtMaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 104, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Tổng tiền");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 95, -1));
        getContentPane().add(txtThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 104, -1));

        btnThanhTien.setText("Thanh Toán");
        btnThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhTienActionPerformed(evt);
            }
        });
        getContentPane().add(btnThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 259, 130, 60));
        getContentPane().add(TxtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 104, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tên Khách Hàng");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

        txtMaKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMaKHCaretUpdate(evt);
            }
        });
        getContentPane().add(txtMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 104, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Mã Khách Hàng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, -1, -1));

        btnChonKH.setText("Chọn Khách Hàng");
        btnChonKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonKHActionPerformed(evt);
            }
        });
        getContentPane().add(btnChonKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            new CTHoaDonForm().setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnChonKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonKHActionPerformed
        // TODO add your handling code here:
        new KhachHangHDCHonForm().setVisible(true);
    }//GEN-LAST:event_btnChonKHActionPerformed

    private void tblSP1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSP1MousePressed
        // TODO add your handling code here:
        try {
            index = tblSP1.getSelectedRow();
            String sql = "select MAX(STTHD) from HoaDon";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1) == null) {
                    txtMaHD.setText("HD1");
                } else {
                    int stt = rs.getInt(1);
                    stt++;
                    txtMaHD.setText("HD" + stt);
                }
            }
            insert(index);
            LoadDataToTableHoaDonChiTiet();
            tongtien();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Không thể lập hóa đơn" + ex);
        }
    }//GEN-LAST:event_tblSP1MousePressed

    private void txtMaKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMaKHCaretUpdate
        // TODO add your handling code here:
        try {
            String sql = ("select Tenkh from khachhang where MaKH=?");
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, txtMaKH.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                TxtTenKH.setText(rs.getString(1));
            } else {

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi 101:: Không thể kết nối đến máy chủ" + ex);
        }


    }//GEN-LAST:event_txtMaKHCaretUpdate

    private void mniXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniXoaActionPerformed
        // TODO add your handling code here:
        index = tblDanhSach.getSelectedRow();
        delete1(index);
    }//GEN-LAST:event_mniXoaActionPerformed

    private void mniXoaallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniXoaallActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_mniXoaallActionPerformed

    private void btnThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhTienActionPerformed

        try {

            String sql = "insert into hoadon values (?,?,?,?,?,?,GETDATE())";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, txtMaHD.getText());
            ps.setString(2, txtMaNV.getText());
            ps.setString(3, txtMaKH.getText());
            ps.setString(4, txtTenNV.getText());
            ps.setString(5, TxtTenKH.getText());
            ps.setString(6, txtThanhTien.getText());

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Thêm thành công");
            }

        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
        int line = tblDanhSach.getRowCount();
        for (int i = 0; i < line; i++) {
            String IDProduct = (String) tblDanhSach.getValueAt(i, 0);
            String tensp = (String) tblDanhSach.getValueAt(i, 1);
            String quantity = String.valueOf(tblDanhSach.getValueAt(i, 4));
            String soluong = String.valueOf(tblDanhSach.getValueAt(i, 2));
            try {
                // TODO add your handling code here:
                String sql = "insert into HoaDonChiTiet values (?,?,?,?,?,GETDATE())";
                PreparedStatement ps = cnn.prepareStatement(sql);
                ps.setString(1, txtMaHD.getText());
                ps.setString(2, IDProduct);
                ps.setString(3, tensp);
                ps.setString(4, soluong);

                ps.setString(5, quantity);

                int result = ps.executeUpdate();

            } catch (SQLException ex) {
                System.out.println("loi" + ex);
            }
        }

        try {

            Date now = new Date();
            Writer bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("History//" + txtMaHD.getText().trim() + ".txt")));
            bw.write("\t\t\tLAPTOP VN\r\n\r\n");
            bw.write("\t\t590 CMT8, P.11, Q.3, TPHCM\r\n");
            bw.write("\t\t\tSĐT: 01212692802\r\n\r\n");
            bw.write("\t\t\tHÓA ĐƠN BÁN HÀNG\r\n\r\n");
            bw.write("Mã hóa đƠn: " + txtMaHD.getText() + "\r\n");
            bw.write("Thời gian: " + ft.format(now) + "\r\n");
            bw.write("NHÂN VIÊN: " + txtTenNV.getText() + "\r\n");
            bw.write("------------------------------------------------------------\r\n");
            bw.write("Mã\t\tTên Sản Phẩm\tSố lượng\tĐƠn giá\tThành tiền\r\n\n");
            bw.write("-----------------------------------------------------------\r\n");
            //Ghi sản phẩm
            int quantotal = 0;
            for (int i = 0; i < line; i++) {
                String id = (String) tblModel.getValueAt(i, 0);
                String name = (String) tblModel.getValueAt(i, 1);
                int size = (int) tblModel.getValueAt(i, 2);
                String price = String.valueOf(tblModel.getValueAt(i, 3));
                String quantity = String.valueOf(tblModel.getValueAt(i, 4));
                bw.write((i + 1) + ". " + name + "\r\n\n");
                bw.write(id + "\t" + size + "\t\t" + quantity + "\t\t" + price + "\t" + "\r\n\r\n");
                quantotal += Integer.parseInt(quantity);
            }
            bw.write("------------------------------------------------------------\r\n");
            bw.write("\t\tThành tiền:\t\t\t" + txtThanhTien.getText() + " VNĐ\r\n");
            bw.write("------------------------------------------------------------\r\n");
            bw.write("------------------------------------------------------------\r\n");
            bw.write("Mật khẩu Wifi: motdentam\r\n");
            bw.write("---------------------CÁM ƠN QUÝ KHÁCH!----------------------");
            bw.close();
            //update số ly và chiết khấu vào bảng customer
        } catch (Exception e) {
            System.out.println("Lỗi in" + e);
        }
        //Mở file txt
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("notepad History//" + txtMaHD.getText().trim() + ".txt");
        } catch (IOException e) {
        }
        delete();
    }//GEN-LAST:event_btnThanhTienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField TxtTenKH;
    private javax.swing.JButton btnChonKH;
    private javax.swing.JButton btnThanhTien;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mniXoa;
    private javax.swing.JMenuItem mniXoaall;
    private javax.swing.JPopupMenu pmnXoaHD;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTable tblSP1;
    private javax.swing.JTextField txtMaHD;
    public javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
     public void tongtien() {
        String sql = "select SUM(tongtien) from GioHang";
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                txtThanhTien.setText(rs.getLong(1) + "");
            }
        } catch (SQLException ex) {
            System.out.println("loitong tien");;
        }
    }

    void delete() {
        try {
            String sql = "delete GioHang";
            PreparedStatement ps = cnn.prepareStatement(sql);
            int result = ps.executeUpdate();
            ps.close();
            LoadDataToTableHoaDonChiTiet();
            LoadDataToTableHoaDonChiTiet();
        } catch (Exception e) {
        }
    }

    void delete1(int i) {
        String IDProduct = (String) tblDanhSach.getValueAt(i, 0);
        try {

            String sql = "delete  GioHang where masp = ?";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, IDProduct);
            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa không thành công");
            }
            ps.close();
            LoadDataToTableHoaDonChiTiet();
            tongtien();
        } catch (SQLException e) {
            System.out.println("loi1" + e);
        }

    }
    SanPhamDAO dao = new SanPhamDAO();

    void fillTableSP() {
        DefaultTableModel model = (DefaultTableModel) tblSP1.getModel();
        model.setRowCount(0);
        try {

            List<SanPham> list = dao.select();
            for (SanPham sp : list) {
                Object[] rows = {
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getSoLuong(),
                    sp.getDonGia(),
                    sp.getLoai()
                };
                model.addRow(rows);
            }
        } catch (Exception e) {
            System.out.println("loibang" + e);
        }
    }
    public static String MaSP;

    void insert(int i) {
        try {
            String sql = "insert into GioHang values(?,?,?,?,?)";
            PreparedStatement ps = cnn.prepareStatement(sql);
            int line = tblSP1.getRowCount();
            String soluong1 = JOptionPane.showInputDialog("Số lượng: ");
            int soluong = Integer.parseInt(soluong1);
            if (soluong != 0) {
                MaSP = tblSP1.getValueAt(tblSP1.getSelectedRow(), 0).toString();
                String tensp = (String) tblSP1.getValueAt(i, 1);
                long giasp = (long) tblSP1.getValueAt(i, 3);
                int soLuongGoc = (int) tblSP1.getValueAt(i, 2);
                ps.setString(1, MaSP);
                ps.setString(2, tensp);
                ps.setInt(3, soluong);
                ps.setDouble(4, giasp);
                double thanhtien = giasp * soluong;
                ps.setDouble(5, thanhtien);
                int result = ps.executeUpdate();
                if (result > 0) {
                    System.out.println("Đã thêm");
                    int tongSoLuong = soLuongGoc - soluong;
                    System.out.println(""+tongSoLuong);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số > 0");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số !");
        }

    }

    public void LoadDataToTableHoaDonChiTiet() {
        tblModel = (DefaultTableModel) tblDanhSach.getModel();
        try {
            String sql = "select masp,tensp,SUM(soluong),dongia,SUM(tongtien ) from GioHang\n"
                    + "group by masp,tensp,dongia";
            st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            tblModel.setRowCount(0);
            while (rs.next()) {
                tblModel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getLong(4),
                    rs.getLong(5)});
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi" + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void displayUserInfo() {
        String ID = Auth.user.getMaNV();
        String userID = Auth.user.getTenNV();
        txtMaNV.setText(ID);
        txtTenNV.setText(userID);
    }

}
