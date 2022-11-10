/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ENTITY.ChiTietHoaDon;
import Helper.XDate;
import Helper.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietDAO {
    
    public List<ChiTietHoaDon> select() {
        String sql = "SELECT * FROM HoaDonChiTiet";
        return select(sql);
    }
    

    public List<ChiTietHoaDon> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM HoaDonChiTiet WHERE  MaHD like ? ";
        return select(sql, "%" + keyword + "%");
    }
    
    private List<ChiTietHoaDon> select(String sql, Object... args) {
        List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.executeQuery(sql, args);
                while (rs.next()) {
                    ChiTietHoaDon model = readFromResultSet(rs);
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
    
    private ChiTietHoaDon readFromResultSet(ResultSet rs) throws SQLException {
        ChiTietHoaDon model = new ChiTietHoaDon();
        model.setMaHD(rs.getString("MaHD"));
        model.setMaSP(rs.getString("Masp"));
        model.setTenSP(rs.getString("tensp"));
        model.setSoLuong(rs.getInt("Soluong"));
        model.setTongtien(rs.getLong("tongtien"));
        model.setNgayTG(rs.getDate("Ngaytaodon"));
        return model;
    }
}
