package Controller;

import DAO.TaiKhoanDAO;
import View.LoginView;
import View.MainView;
import javax.swing.JOptionPane;
import model.TaiKhoan;

public class LoginController {

    private LoginView view;
    private TaiKhoanDAO dao;

    public LoginController(LoginView view) {
        this.view = view;
        this.dao = new TaiKhoanDAO();

        // Sự kiện nút Đăng nhập
        view.getBtnLogin().addActionListener(e -> dangNhap());

        // Sự kiện nút Thoát
        view.getBtnExit().addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(
                    view,
                    "Bạn có muốn thoát chương trình?",
                    "Xác nhận",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }

    private void dangNhap() {

        String username
                = view.getTxtUsername().getText().trim();

        String password
                = String.valueOf(
                        view.getTxtPassword().getPassword());

        // Kiểm tra dữ liệu rỗng
        if (username.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(
                    view,
                    "Vui lòng nhập đầy đủ tên đăng nhập và mật khẩu!",
                    "Thông báo",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        // Kiểm tra tài khoản
        TaiKhoan tk = dao.dangNhap(username, password);

        if (tk != null) {

            // Mở MainView
            MainView mainView = new MainView();
            new MainViewController(mainView);
            // Hiển thị thông tin tài khoản
            mainView.getLblUser()
                    .setText("Xin chào: " + tk.getTenDangNhap());

            mainView.getLblRole()
                    .setText("Vai trò: " + tk.getVaiTro());
            mainView.phanQuyen(
                    tk.getVaiTro());

            // Hiển thị MainView
            mainView.setVisible(true);

            // Đóng LoginView
            view.dispose();

        } else {

            JOptionPane.showMessageDialog(
                    view,
                    "Sai tên đăng nhập hoặc mật khẩu!",
                    "Lỗi đăng nhập",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
