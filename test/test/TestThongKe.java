package test;

import DAO.ThongKeDAO;

public class TestThongKe {

    public static void main(String[] args) {

        ThongKeDAO dao = new ThongKeDAO();

        System.out.println(
                "Tong doanh thu: "
                + dao.getTongDoanhThu());

        System.out.println(
                "Tong hoa don: "
                + dao.getTongHoaDon());

        System.out.println(
                "Tong san pham ban: "
                + dao.getTongSanPhamBan());

        System.out.println(
                "San pham ban chay: "
                + dao.getSanPhamBanChay());
    }
}