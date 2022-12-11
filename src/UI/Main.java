
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Helper.Auth;
import java.awt.Color   ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame {

    Color panelDefault;
    Color panelClick;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelDefault = new Color(240, 240, 240);
        panelClick = new Color(102, 255, 204);
        init();
        background();
        SanPhamForm sp = new SanPhamForm();
        lblUsername.setText(Auth.user.getTenNV());
        jDesktopPane1.add(sp).setVisible(true);
        pnlSanPham.setBackground(panelClick);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblDoiMatKhau = new javax.swing.JLabel();
        ShowKhachHang = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlKhachHang = new javax.swing.JPanel();
        ShowSanPham = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlSanPham = new javax.swing.JPanel();
        ShowHoaDon = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlHoaDon = new javax.swing.JPanel();
        ShowNhanVien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        KetThuc = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pnlKetThuc = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ShowThongKe = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cửa hàng máy tính");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Đăng xuất");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, -1));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("jLabel1");
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 40));

        lblDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lblDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDoiMatKhau.setText("Đổi mật khẩu");
        lblDoiMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDoiMatKhauMousePressed(evt);
            }
        });
        jPanel2.add(lblDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, -1));

        ShowKhachHang.setBackground(new java.awt.Color(0, 153, 153));
        ShowKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowKhachHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowKhachHangMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/khachhang.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Khách hàng");

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ShowKhachHangLayout = new javax.swing.GroupLayout(ShowKhachHang);
        ShowKhachHang.setLayout(ShowKhachHangLayout);
        ShowKhachHangLayout.setHorizontalGroup(
            ShowKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowKhachHangLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ShowKhachHangLayout.setVerticalGroup(
            ShowKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowKhachHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ShowKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel2.add(ShowKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 60));

        ShowSanPham.setBackground(new java.awt.Color(0, 153, 153));
        ShowSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowSanPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowSanPhamMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/sanpham.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sản phẩm");

        javax.swing.GroupLayout pnlSanPhamLayout = new javax.swing.GroupLayout(pnlSanPham);
        pnlSanPham.setLayout(pnlSanPhamLayout);
        pnlSanPhamLayout.setHorizontalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlSanPhamLayout.setVerticalGroup(
            pnlSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ShowSanPhamLayout = new javax.swing.GroupLayout(ShowSanPham);
        ShowSanPham.setLayout(ShowSanPhamLayout);
        ShowSanPhamLayout.setHorizontalGroup(
            ShowSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowSanPhamLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        ShowSanPhamLayout.setVerticalGroup(
            ShowSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShowSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel2.add(ShowSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, 60));

        ShowHoaDon.setBackground(new java.awt.Color(0, 153, 153));
        ShowHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowHoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowHoaDonMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hóa đơn");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/hoadon.png"))); // NOI18N

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ShowHoaDonLayout = new javax.swing.GroupLayout(ShowHoaDon);
        ShowHoaDon.setLayout(ShowHoaDonLayout);
        ShowHoaDonLayout.setHorizontalGroup(
            ShowHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowHoaDonLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ShowHoaDonLayout.setVerticalGroup(
            ShowHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShowHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ShowHoaDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        jPanel2.add(ShowHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 220, 60));

        ShowNhanVien.setBackground(new java.awt.Color(0, 153, 153));
        ShowNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowNhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowNhanVienMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nhân viên");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/nhanvien.png"))); // NOI18N

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ShowNhanVienLayout = new javax.swing.GroupLayout(ShowNhanVien);
        ShowNhanVien.setLayout(ShowNhanVienLayout);
        ShowNhanVienLayout.setHorizontalGroup(
            ShowNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowNhanVienLayout.createSequentialGroup()
                .addComponent(pnlNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        ShowNhanVienLayout.setVerticalGroup(
            ShowNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowNhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ShowNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.add(ShowNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, 60));

        KetThuc.setBackground(new java.awt.Color(0, 153, 153));
        KetThuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KetThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KetThucMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KetThucMousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/ketthuc.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Kết thúc");

        javax.swing.GroupLayout pnlKetThucLayout = new javax.swing.GroupLayout(pnlKetThuc);
        pnlKetThuc.setLayout(pnlKetThucLayout);
        pnlKetThucLayout.setHorizontalGroup(
            pnlKetThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlKetThucLayout.setVerticalGroup(
            pnlKetThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout KetThucLayout = new javax.swing.GroupLayout(KetThuc);
        KetThuc.setLayout(KetThucLayout);
        KetThucLayout.setHorizontalGroup(
            KetThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KetThucLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        KetThucLayout.setVerticalGroup(
            KetThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KetThucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(KetThucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel2.add(KetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 220, 60));

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 255, 255));
        lblDongHo.setText("jLabel18");
        jPanel2.add(lblDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, 120, 30));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/clock.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 40, 50));

        ShowThongKe.setBackground(new java.awt.Color(0, 153, 153));
        ShowThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowThongKeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowThongKeMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/thongke.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Thống kê");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ShowThongKeLayout = new javax.swing.GroupLayout(ShowThongKe);
        ShowThongKe.setLayout(ShowThongKeLayout);
        ShowThongKeLayout.setHorizontalGroup(
            ShowThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowThongKeLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ShowThongKeLayout.setVerticalGroup(
            ShowThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowThongKeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ShowThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel2.add(ShowThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/test_account_120px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 710));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 990, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1244, 725);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowKhachHangMousePressed
        // TODO add your handling code here:
        pnlNhanVien.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelClick);
        pnlSanPham.setBackground(panelDefault);
        pnlHoaDon.setBackground(panelDefault);
        pnlThongKe.setBackground(panelDefault);
        pnlKetThuc.setBackground(panelDefault);

    }//GEN-LAST:event_ShowKhachHangMousePressed

    private void ShowKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowKhachHangMouseClicked
        // TODO add your handling code here:
        KhachHangForm kh = new KhachHangForm();
        jDesktopPane1.add(kh).setVisible(true);
    }//GEN-LAST:event_ShowKhachHangMouseClicked

    private void ShowSanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowSanPhamMousePressed
        // TODO add your handling code here:
        pnlNhanVien.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlSanPham.setBackground(panelClick);
        pnlKhachHang.setBackground(panelDefault);
        pnlHoaDon.setBackground(panelDefault);
        pnlThongKe.setBackground(panelDefault);
        pnlKetThuc.setBackground(panelDefault);

    }//GEN-LAST:event_ShowSanPhamMousePressed

    private void ShowSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowSanPhamMouseClicked
        // TODO add your handling code here:
        SanPhamForm sp = new SanPhamForm();
        jDesktopPane1.add(sp).setVisible(true);
    }//GEN-LAST:event_ShowSanPhamMouseClicked

    private void ShowHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowHoaDonMousePressed
        // TODO add your handling code here:
        pnlNhanVien.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlSanPham.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlHoaDon.setBackground(panelClick);

        pnlThongKe.setBackground(panelDefault);
        pnlKetThuc.setBackground(panelDefault);

    }//GEN-LAST:event_ShowHoaDonMousePressed

    private void ShowHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowHoaDonMouseClicked
        // TODO add your handling code here:
        HoaDonForm hd = new HoaDonForm();
        jDesktopPane1.add(hd).setVisible(true);
    }//GEN-LAST:event_ShowHoaDonMouseClicked

    private void ShowThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowThongKeMousePressed
        // TODO add your handling code here:
        pnlNhanVien.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlSanPham.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlHoaDon.setBackground(panelDefault);
        pnlThongKe.setBackground(panelClick);
        pnlKetThuc.setBackground(panelDefault);
    }//GEN-LAST:event_ShowThongKeMousePressed

    private void ShowThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowThongKeMouseClicked
        // TODO add your handling code here:
        if (!Auth.isManager()) {
            JOptionPane.showMessageDialog(this, "Nhân viên không thể xem mục này");
            pnlThongKe.setBackground(panelDefault);
        } else {
            ThongKeForm tk = new ThongKeForm();
            jDesktopPane1.add(tk).setVisible(true);
        }
    }//GEN-LAST:event_ShowThongKeMouseClicked

    private void KetThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KetThucMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình ?", "Kết thúc", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_KetThucMouseClicked

    private void KetThucMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KetThucMousePressed
        // TODO add your handling code here:
        pnlNhanVien.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlSanPham.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlHoaDon.setBackground(panelDefault);
        pnlThongKe.setBackground(panelDefault);
        pnlKetThuc.setBackground(panelClick);
    }//GEN-LAST:event_KetThucMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn muốn đăng xuất ?", "Đăng xuất", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            Auth.clear();
            this.openLogin();
//            this.openLoading();
            this.setVisible(true);
            lblUsername.setText(Auth.user.getTenNV());
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblDoiMatKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDoiMatKhauMousePressed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn đổi mật khẩu ?", "Đổi mật khẩu", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            new DoiMatKhau(this, true).setVisible(true);
        }
    }//GEN-LAST:event_lblDoiMatKhauMousePressed

    private void ShowNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowNhanVienMousePressed
        // TODO add your handling code here:
        pnlNhanVien.setBackground(panelClick);
        pnlKhachHang.setBackground(panelDefault);
        pnlSanPham.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlHoaDon.setBackground(panelDefault);
        pnlThongKe.setBackground(panelDefault);
        pnlKetThuc.setBackground(panelDefault);
    }//GEN-LAST:event_ShowNhanVienMousePressed

    private void ShowNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowNhanVienMouseClicked
        // TODO add your handling code here:
        if (!Auth.isManager()) {
            JOptionPane.showMessageDialog(this, "Nhân viên không thể xem mục này");
            pnlNhanVien.setBackground(panelDefault);
        } else {
            NhanVienForm nv = new NhanVienForm();
            jDesktopPane1.add(nv).setVisible(true);
        }
    }//GEN-LAST:event_ShowNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KetThuc;
    private javax.swing.JPanel ShowHoaDon;
    private javax.swing.JPanel ShowKhachHang;
    private javax.swing.JPanel ShowNhanVien;
    private javax.swing.JPanel ShowSanPham;
    private javax.swing.JPanel ShowThongKe;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel lblDoiMatKhau;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlKetThuc;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlSanPham;
    private javax.swing.JPanel pnlThongKe;
    // End of variables declaration//GEN-END:variables
    void background() {
        pnlNhanVien.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlSanPham.setBackground(panelDefault);
        pnlKhachHang.setBackground(panelDefault);
        pnlHoaDon.setBackground(panelDefault);
        pnlThongKe.setBackground(panelDefault);
        pnlKetThuc.setBackground(panelDefault);
    }

    void init() {
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();
        openLogin();
    }

    void openLogin() {
        new LoginForm(this, true).setVisible(true);
    }

//    void openLoading() {
//        new LoadingForm(this, true).setVisible(true);
//    }
}
