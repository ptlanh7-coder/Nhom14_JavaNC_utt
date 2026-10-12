package Controller;

import View.LoginView;
import View.MainView;
import View.ThongKeView;

import javax.swing.JOptionPane;

public class MainViewController {

    private MainView view;

    public MainViewController(MainView view) {

        this.view = view;

        view.getBtnThongKe()
                .addActionListener(e -> moThongKe());

        view.getBtnDangXuat()
                .addActionListener(e -> dangXuat());
    }

    private void moThongKe() {

        ThongKeView thongKeView = new ThongKeView();

        new ThongKeController(thongKeView);

        thongKeView.setVisible(true);

        view.dispose();
    }

    private void dangXuat() {

        int confirm = JOptionPane.showConfirmDialog(
                view,
                "Bạn có muốn đăng xuất?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {

            LoginView loginView = new LoginView();

            new LoginController(loginView);

            loginView.setVisible(true);

            view.dispose();
        }
    }
}