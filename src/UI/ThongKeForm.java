/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import ENTITY.ThongKe;
import ENTITY.ThongKeHoaDon;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Admin
 */
public class ThongKeForm extends javax.swing.JInternalFrame {

    DefaultTableModel tblModel;
    Connection cnn = null;
    Date date;
    NumberFormat formatter = new DecimalFormat("####");
//    ArrayList<SanPham> ListSP = new ArrayList<>();
    ArrayList<ThongKe> ListTK = new ArrayList<>();
    ArrayList<ThongKeHoaDon> ListTKHD = new ArrayList<>();
        JPanel p1 = null;
        JLabel TL1 = null;
        JLabel l1 = null;
        JPanel p2 = null;
        JLabel TL2 = null;
        JLabel l2 = null;
        JPanel p3 = null;
        JLabel TL3 = null;
        JLabel l3 = null;
    

    /**
     * Creates new form ThongKeForm
     */
    public ThongKeForm() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        init();
        LoadTheLoaiThongKe();
        LoadToCBOYear();
        Connect();
        FillDanhSachToArrayThongke();
        FillToTable();
        RunBieuDo();
    }

    public void Connect() {
        try {
            String user = "edu";
            String pass = "123";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=duan1;encrypt=true;trustServerCertificate=true;";
            cnn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối");
        }
    }

    public void init() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new Object[]{"MaSP", "Sản Phẩm", "Số Lượng", "Tổng Tiền"});
        tblDoanhThu.setModel(tblModel);
        chkbang.setSelected(true);
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
        jPanel1 = new javax.swing.JPanel();
        tbpdoanhthu = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cboyear = new javax.swing.JComboBox<>();
        chkbang = new javax.swing.JRadioButton();
        chkbieudo = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        rdoEST = new javax.swing.JRadioButton();
        pnlthongke = new javax.swing.JPanel();
        pnlThongkebieudo = new javax.swing.JPanel();
        pnlthongketrong = new javax.swing.JPanel();
        lbldtsp = new javax.swing.JLabel();
        doanhthu = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        pnlEST = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbldoanhthu = new javax.swing.JLabel();
        cboloaithongke = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblngaybatdau = new javax.swing.JLabel();
        lblngayketthuc = new javax.swing.JLabel();
        dateketthuc = new com.toedter.calendar.JDateChooser();
        datebatdau = new com.toedter.calendar.JDateChooser();
        btntimkiem = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblsohoadon = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblsosanpham = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbltongkhachhang = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(990, 690));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbpdoanhthu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Năm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboyearActionPerformed(evt);
            }
        });
        jPanel3.add(cboyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, -1));

        buttonGroup1.add(chkbang);
        chkbang.setText("Bảng");
        chkbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbangActionPerformed(evt);
            }
        });
        jPanel3.add(chkbang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        buttonGroup1.add(chkbieudo);
        chkbieudo.setText("Biểu Đồ");
        chkbieudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbieudoActionPerformed(evt);
            }
        });
        jPanel3.add(chkbieudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel9.setText("Lựa Chọn Hiển Thị");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        buttonGroup1.add(rdoEST);
        rdoEST.setText("EST");
        jPanel3.add(rdoEST, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 330));

        pnlthongke.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION)));

        pnlThongkebieudo.setLayout(new javax.swing.BoxLayout(pnlThongkebieudo, javax.swing.BoxLayout.LINE_AXIS));

        lbldtsp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldtsp.setText("Doanh Thu Sản Phẩm");

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MaSP", "TenSP", "Số Lượng", "Tổng Tiền"
            }
        ));
        doanhthu.setViewportView(tblDoanhThu);

        javax.swing.GroupLayout pnlthongketrongLayout = new javax.swing.GroupLayout(pnlthongketrong);
        pnlthongketrong.setLayout(pnlthongketrongLayout);
        pnlthongketrongLayout.setHorizontalGroup(
            pnlthongketrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlthongketrongLayout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(lbldtsp)
                .addGap(244, 244, 244))
            .addGroup(pnlthongketrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlthongketrongLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(doanhthu, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlthongketrongLayout.setVerticalGroup(
            pnlthongketrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlthongketrongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldtsp)
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(pnlthongketrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlthongketrongLayout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(doanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout pnlESTLayout = new javax.swing.GroupLayout(pnlEST);
        pnlEST.setLayout(pnlESTLayout);
        pnlESTLayout.setHorizontalGroup(
            pnlESTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        pnlESTLayout.setVerticalGroup(
            pnlESTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlthongkeLayout = new javax.swing.GroupLayout(pnlthongke);
        pnlthongke.setLayout(pnlthongkeLayout);
        pnlthongkeLayout.setHorizontalGroup(
            pnlthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlthongketrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlThongkebieudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlEST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlthongkeLayout.setVerticalGroup(
            pnlthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlthongkeLayout.createSequentialGroup()
                .addComponent(pnlthongketrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(pnlthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlThongkebieudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlEST, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnlthongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 670, 330));

        tbpdoanhthu.addTab("Doanh Thu", jPanel2);

        jPanel1.add(tbpdoanhthu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 940, 380));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Doanh Thu");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, -1));

        lbldoanhthu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldoanhthu.setText("10000");
        jPanel6.add(lbldoanhthu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 90));

        cboloaithongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboloaithongkeActionPerformed(evt);
            }
        });
        jPanel5.add(cboloaithongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 75, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Loại Thời Gian");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblngaybatdau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblngaybatdau.setText("Ngày Bắt Đầu");
        jPanel5.add(lblngaybatdau, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        lblngayketthuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblngayketthuc.setText("Ngày Kết Thúc");
        jPanel5.add(lblngayketthuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));
        jPanel5.add(dateketthuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 111, -1));
        jPanel5.add(datebatdau, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 111, -1));

        btntimkiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btntimkiem.setText("Tìm Kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });
        jPanel5.add(btntimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, 31));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Số Hóa Đơn");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 180, -1));

        lblsohoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsohoadon.setText("0");
        jPanel7.add(lblsohoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 180, 90));

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Số sản phẩm");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 180, -1));

        lblsosanpham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsosanpham.setText("0");
        jPanel8.add(lblsosanpham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 180, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 180, 90));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tổng Khách hàng");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, -1));

        lbltongkhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltongkhachhang.setText("0");
        jPanel9.add(lbltongkhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 190, 90));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 220));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THỐNG KÊ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboyearActionPerformed
        // TODO add your handling code here:
        timthongketheonam();
        FillToTable();
    }//GEN-LAST:event_cboyearActionPerformed

    private void cboloaithongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboloaithongkeActionPerformed
        // TODO add your handling code here:
        LoadHienThongKe();
    }//GEN-LAST:event_cboloaithongkeActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String bd = String.valueOf(sdf.format(datebatdau.getDate()));
        String kt = String.valueOf(sdf.format(dateketthuc.getDate()));
        LoadThongKe(bd, kt);
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void chkbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbangActionPerformed
        // TODO add your handling code here:
        HienThiThongKeSP();
    }//GEN-LAST:event_chkbangActionPerformed

    private void chkbieudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbieudoActionPerformed
        // TODO add your handling code here:
        HienThiThongKeSP();
    }//GEN-LAST:event_chkbieudoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntimkiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboloaithongke;
    private javax.swing.JComboBox<String> cboyear;
    private javax.swing.JRadioButton chkbang;
    private javax.swing.JRadioButton chkbieudo;
    private com.toedter.calendar.JDateChooser datebatdau;
    private com.toedter.calendar.JDateChooser dateketthuc;
    private javax.swing.JScrollPane doanhthu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbldoanhthu;
    private javax.swing.JLabel lbldtsp;
    private javax.swing.JLabel lblngaybatdau;
    private javax.swing.JLabel lblngayketthuc;
    private javax.swing.JLabel lblsohoadon;
    private javax.swing.JLabel lblsosanpham;
    private javax.swing.JLabel lbltongkhachhang;
    private javax.swing.JPanel pnlEST;
    private javax.swing.JPanel pnlThongkebieudo;
    private javax.swing.JPanel pnlthongke;
    private javax.swing.JPanel pnlthongketrong;
    private javax.swing.JRadioButton rdoEST;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTabbedPane tbpdoanhthu;
    // End of variables declaration//GEN-END:variables

    public void LoadTheLoaiThongKe() {
        try {
            String[] thang = {"Hôm Nay","Theo Ngày"};
            for (String s : thang) {
                cboloaithongke.addItem(s);
            }
        } catch (Exception e) {
            System.out.println(e+"5555");
        }
    }

    public void LoadHienThongKe() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (cboloaithongke.getSelectedItem().equals("Hôm Nay")) {
                String bd = String.valueOf(sdf.format(new Date()));
                String kt = String.valueOf(sdf.format(new Date()));
                LoadThongKe(bd, kt);
                lblngaybatdau.setVisible(false);
                lblngayketthuc.setVisible(false);
                datebatdau.setVisible(false);
                dateketthuc.setVisible(false);
                btntimkiem.setVisible(false);
            }else{
                lblngaybatdau.setVisible(true);
                lblngayketthuc.setVisible(true);
                datebatdau.setVisible(true);
                dateketthuc.setVisible(true);
                btntimkiem.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e+"lỗi nè");
        }
    }



    public void FillDanhSachToArrayThongke() {
        try {
            String sql = "select Masp,tensp,sum(Soluong) as N'Soluong', sum(tongtien) as N'tongtien' from hoadonchitiet\n"
                    + "group by Masp,tensp";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String masp = rs.getString(1);
                String tensp = rs.getString(2);
                int soluong = rs.getInt(3);
//                int dongia = rs.getInt(4);
                long thanhtien = rs.getLong(4);
//                double tt = Double.parseDouble(thanhtien);
                ThongKe tk = new ThongKe(masp, tensp, soluong, thanhtien);
                ListTK.add(tk);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex+" gi vay ak");
            JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu");
        }
    }

    public void LoadThongKe(String nbd,String nkt) {
        try {
            
            String sql = "{call sp_ThongKeDoanhThuall (?,?)}";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, nbd);
            ps.setString(2, nkt);
            ResultSet rs = ps.executeQuery();
            int sohd = 0;
            int soluong = 0;
            int sokh = 0;
            int kqsp = 0;
            long kqtt = 0;
            while (rs.next()) {
                String mahd = rs.getString(1);
                if (!mahd.isEmpty() || mahd != null) {
                    sohd++;
                }
                String tenkh = rs.getString(2);
                if (!tenkh.isEmpty() || tenkh != null) {
                    sokh++;
                }
                int sl = rs.getInt(3);
                soluong+= sl;
                long tongtien = rs.getLong(4);
                kqtt += tongtien;
                ThongKeHoaDon tk = new ThongKeHoaDon(sohd, sokh, soluong, kqtt);
                ListTKHD.add(tk);
            }
            FillThongKeHD();
            ps.close();
            rs.close();

        } catch (Exception e) {
            System.out.println(e+"12345");
        }
    }
    
    public void FillThongKeHD(){
        for (ThongKeHoaDon tk : ListTKHD) {
            lbldoanhthu.setText(String.valueOf(tk.getTongtien())+" VND");
            lblsohoadon.setText(String.valueOf(tk.getMahd()));
            lblsosanpham.setText(String.valueOf(tk.getSoluong()));
            lbltongkhachhang.setText(String.valueOf(tk.getMasp()));
        }
    }

    
    public void HienThiThongKeSP(){
        tblModel = (DefaultTableModel) tblDoanhThu.getModel();
        if (chkbang.isSelected()) {
//            lbldtsp.setVisible(true);
//            tblDoanhThu.setVisible(true);
//            doanhthu.setVisible(true);
            pnlthongketrong.setVisible(true);
//            pnlthongke.setVisible(true);
            pnlThongkebieudo.setVisible(false);
            pnlEST.setVisible(false);
        }else if (chkbieudo.isSelected()){
            pnlEST.setVisible(false);
            pnlthongketrong.setVisible(false);
            pnlThongkebieudo.setVisible(true);
//            ThongKeEST();
        }else if (rdoEST.isSelected()) {
            pnlEST.setVisible(true);
            pnlthongketrong.setVisible(false);
            pnlThongkebieudo.setVisible(false);
        }
    }
    
    public void ThongKeEST(){
        p1 = new JPanel();
        
        TL1 = new JLabel("Khách Hàng Mua Nhiều Nhất");
        l1 = new JLabel("");
        p1.add(TL1,l1);
        p1.setLayout(new FlowLayout(20));
        p1.setVisible(true);
        p2 = new JPanel();
        TL2 = new JLabel("Sản Phẩm Có Doanh Thu Nhiều Nhất");
        l2 = new JLabel("");
        p2.add(TL2,l2);
        p2.setVisible(true);
//        p3 = new JPanel();
//        TL3 = new JLabel("Sản Phẩm Có Doanh Thu Nhiều Nhất");
//        l3 = new JLabel("");
        pnlEST.add(p1,p2);
        pnlEST.updateUI();
    }
//    public void FillDoanhThu() {
//        for (danhsach ds : ListDS) {
//            lbldoanhthu.setText(String.valueOf(ds.getThanhtien()));
//            lblsohoadon.setText(String.valueOf(ds.getSohd()));
//            lblsosanpham.setText(String.valueOf(ds.getSosp()));
//            lbltongkhachhang.setText(String.valueOf(ds.getSokh()));
//        }
//    }
//    public void FillSanPhamToArray() {
//        try {
//            String sql = "select Tensp, DonGia from SanPham";
//            Statement st = cnn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                String ten = rs.getString(1);
//                double dongia = rs.getInt(2);
//                SanPham s = new SanPham(ten, dongia);
//                ListSP.add(s);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    
    public void FillToTable() {
        try {
        tblModel = (DefaultTableModel) tblDoanhThu.getModel();
        tblModel.setRowCount(0);
        for (ThongKe TE : ListTK) {
            tblModel.addRow(new Object[]{
                TE.getMaSP(), TE.getTensp(), TE.getSoluong(), TE.getThanhtien()
            });
        }
        } catch (Exception e) {
            System.out.println(e+"alo");
        }
    }

    public void LoadToCBOYear() {
        try {
            String[] nam = {" ", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
            for (String string : nam) {
                cboyear.addItem(string);
            }
        } catch (Exception e) {
            System.out.println(e+" kkkkkk");
        }
    }

    public void timthongketheonam() {
        try {
            String sql = "{call sp_ThongKeDoanhThu (?)}";
            PreparedStatement stmt = cnn.prepareStatement(sql);
            stmt.setString(1, (String) cboyear.getSelectedItem());
            ResultSet rs = stmt.executeQuery();
            ListTK.clear();
            while (rs.next()) {
                String masp = rs.getString(1);
                String tensp = rs.getString(2);
                int soluong = rs.getInt(3);
                long thanhtien = rs.getLong(4);
                ThongKe tk = new ThongKe(masp, tensp, soluong, thanhtien);
                ListTK.add(tk);
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e+" 987654");
        }
    }
    
    //Biểu Đồ Thống Kê
    public JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart3D(
                "BIỂU ĐỒ THỐNG KẾ SẢN PHẨM",
                "SẢN PHẨM", "SỐ LƯỢNG",
                createDataset(), PlotOrientation.VERTICAL, false, false, false);
        return barChart;
    }

    public int getcounttable(){
        tblModel = (DefaultTableModel) tblDoanhThu.getModel();
        int count = tblModel.getRowCount();
        return count;
    }    
    public CategoryDataset createDataset() {
        tblModel = (DefaultTableModel) tblDoanhThu.getModel();
        int count = tblModel.getRowCount();
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < count; i++) {
            dataset.addValue((Number) tblModel.getValueAt(i, 2), "SỐ LƯỢNG", (Comparable) tblModel.getValueAt(i, 0));
        }
        return dataset;
    }
    
    public void RunBieuDo(){
//        ChartPanel chartPanel = new ChartPanel(createChart());
//        chartPanel.setPreferredSize(new java.awt.Dimension(540, 300));
//        chartPanel.setVisible(true);
//        chartPanel.setName("Biểu Đồ Thống Kê");
//        ChartFrame chartframe = new ChartFrame("Biểu Đồ Thống Kê", createChart(),true);
//        chartframe.setVisible(true);
//        chartframe.setSize(550,300);
        ChartPanel charpanel = new ChartPanel(createChart());
        pnlThongkebieudo.removeAll();
        pnlThongkebieudo.add(charpanel);
        pnlThongkebieudo.updateUI();
//        JTabbedPane td = new JTabbedPane();
//        td.setName("Biểu Đồ");
//        td.add(chartPanel);
//        pnlthongke.add(chartPanel);
//        tbpdoanhthu.add(chartPanel);
        
//        JFrame frame = new JFrame();
//        frame.add(chartPanel);
//        frame.setTitle("Biểu đồ JFreeChart trong Java Swing");
//        frame.setSize(600, 400);
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.setVisible(true);
//        return chartPanel;
    }
}
