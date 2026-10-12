package test;

import DAO.TaiKhoanDAO;
import model.TaiKhoan;

public class TestLogin {
    public static void main(String[] args) {
        TaiKhoanDAO dao = new TaiKhoanDAO();
        TaiKhoan tk = dao.dangNhap("admin","123456");
        if (tk != null) {
            System.out.println("Dang nhap thanh cong!");
            System.out.println("Ten dang nhap: " + tk.getTenDangNhap());
            System.out.println("Vai tro: " + tk.getVaiTro());
        } else {
            System.out.println("Sai tai khoan hoac mat khau!");
        }
    }
}