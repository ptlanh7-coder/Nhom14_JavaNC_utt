package DAO;

import database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TaiKhoan;

public class TaiKhoanDAO {

    public TaiKhoan dangNhap(
            String tenDangNhap,
            String matKhau) {

        String sql
                = "SELECT * FROM TaiKhoan "
                + "WHERE TenDangNhap = ? "
                + "AND MatKhau = ?";

        try (
                Connection conn
                = DBConnection.getConnection(); PreparedStatement ps
                = conn.prepareStatement(sql)) {

            ps.setString(1, tenDangNhap);
            ps.setString(2, matKhau);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    TaiKhoan tk = new TaiKhoan();

                    tk.setMaTK(
                            rs.getInt("MaTK"));

                    tk.setTenDangNhap(
                            rs.getString("TenDangNhap"));

                    tk.setMatKhau(
                            rs.getString("MatKhau"));

                    tk.setVaiTro(
                            rs.getString("VaiTro"));

                    return tk;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
