package DAO;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ThongKeDAO {

    // Tổng doanh thu
    public double getTongDoanhThu() {

        String sql = """
                     SELECT ISNULL(SUM(TongTien),0)
                     FROM HoaDon
                     WHERE TrangThai = N'Đã thanh toán'
                     """;

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            if (rs.next()) {
                return rs.getDouble(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    // Tổng số hóa đơn
    public int getTongHoaDon() {

        String sql = """
                     SELECT COUNT(*)
                     FROM HoaDon
                     """;

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    // Tổng số sản phẩm đã bán
    public int getTongSanPhamBan() {

        String sql = """
                     SELECT ISNULL(SUM(SoLuong),0)
                     FROM ChiTietHoaDon
                     """;

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    // Sản phẩm bán chạy nhất
    public String getSanPhamBanChay() {

        String sql = """
                     SELECT TOP 1
                            sp.TenSP,
                            SUM(ct.SoLuong) AS SoLuongBan
                     FROM ChiTietHoaDon ct
                     INNER JOIN SanPham sp
                            ON ct.MaSP = sp.MaSP
                     GROUP BY sp.TenSP
                     ORDER BY SUM(ct.SoLuong) DESC
                     """;

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            if (rs.next()) {
                return rs.getString("TenSP");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Chưa có dữ liệu";
    }

    // Load toàn bộ thống kê sản phẩm
    public ArrayList<Object[]> getDanhSachThongKe() {

        ArrayList<Object[]> list = new ArrayList<>();

        String sql = """
                     SELECT
                            sp.TenSP,
                            SUM(ct.SoLuong) AS SoLuongBan,
                            SUM(ct.ThanhTien) AS DoanhThu
                     FROM ChiTietHoaDon ct
                     INNER JOIN SanPham sp
                            ON ct.MaSP = sp.MaSP
                     GROUP BY sp.TenSP
                     ORDER BY SUM(ct.SoLuong) DESC
                     """;

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()
        ) {

            int stt = 1;

            while (rs.next()) {

                Object[] row = {
                    stt++,
                    rs.getString("TenSP"),
                    rs.getInt("SoLuongBan"),
                    rs.getDouble("DoanhThu")
                };

                list.add(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Thống kê theo ngày
    public ArrayList<Object[]> getThongKeTheoNgay(String ngay) {

        ArrayList<Object[]> list = new ArrayList<>();

        String sql = """
                     SELECT
                            sp.TenSP,
                            SUM(ct.SoLuong) AS SoLuongBan,
                            SUM(ct.ThanhTien) AS DoanhThu
                     FROM ChiTietHoaDon ct
                     INNER JOIN HoaDon hd
                            ON ct.MaHD = hd.MaHD
                     INNER JOIN SanPham sp
                            ON ct.MaSP = sp.MaSP
                     WHERE CAST(hd.NgayLap AS DATE) = ?
                     GROUP BY sp.TenSP
                     ORDER BY SUM(ct.SoLuong) DESC
                     """;

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setDate(1, java.sql.Date.valueOf(ngay));

            try (ResultSet rs = ps.executeQuery()) {

                int stt = 1;

                while (rs.next()) {

                    Object[] row = {
                        stt++,
                        rs.getString("TenSP"),
                        rs.getInt("SoLuongBan"),
                        rs.getDouble("DoanhThu")
                    };

                    list.add(row);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}