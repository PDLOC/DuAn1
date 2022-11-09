/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.SanPham;
import Helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamDAO {

    public void insert(SanPham model) {
        String sql = "INSERT INTO SanPham (MaSP, TenSP, MaNPP, MaNV, SoLuong, DonGia, Loai, MoTa, Hinh, TinhTrangHoatDong) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.executeUpdate(sql,
                model.getMaSP(),
                model.getTenSP(),
                model.getMaNPP(),
                model.getMaNV(),
                model.getSoLuong(),
                model.getDonGia(),
                model.getLoai(),
                model.getMoTa(),
                model.getHinh(),
                model.isTinhTrang());
    }

    public void update(SanPham model) {
        String sql = "UPDATE SanPham SET TenSP = ?, MaNPP = ?, MaNV = ?, SoLuong = ?, DonGia = ?, Loai = ?, MoTa = ?, Hinh = ?, TinhTrangHoatDong = ? WHERE MaSP=?";
        XJdbc.executeUpdate(sql,
                model.getTenSP(),
                model.getMaNPP(),
                model.getMaNV(),
                model.getSoLuong(),
                model.getDonGia(),
                model.getLoai(),
                model.getMoTa(),
                model.getHinh(),
                model.isTinhTrang(),
                model.getMaSP());
    }

    public void delete(String masp) {
        String sql = "DELETE FROM SanPham WHERE MaSP=?";
        XJdbc.executeUpdate(sql, masp);
    }

    public List<SanPham> select() {
        String sql = "SELECT * FROM SanPham";
        return select(sql);
    }
    
    public SanPham findById(String masp) {
        String sql = "SELECT * FROM SanPham WHERE MaSP=?";
        List<SanPham> list = select(sql, masp);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<SanPham> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM SanPham WHERE MaSP LIKE ? ";
        return select(sql, "%" + keyword + "%");
    }

    private List<SanPham> select(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    SanPham model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private SanPham readFromResultSet(ResultSet rs) throws SQLException {
        SanPham model = new SanPham();
        model.setMaSP(rs.getString("MaSP"));
        model.setTenSP(rs.getString("TenSP"));
        model.setMaNPP(rs.getString("Manpp"));
        model.setMaNV(rs.getString("MaNV"));
        model.setSoLuong(rs.getInt("SoLuong"));
        model.setDonGia(rs.getDouble("DonGia"));
        model.setLoai(rs.getString("Loai"));
        model.setMoTa(rs.getString("MoTa"));
        model.setHinh(rs.getString("Hinh"));
        model.setTinhTrang(rs.getBoolean("TinhTrangHoatDong"));
        return model;
    }
}
