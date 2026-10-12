package Controller;

import DAO.ThongKeDAO;
import View.MainView;
import View.ThongKeView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThongKeController {

    private ThongKeView view;
    private ThongKeDAO dao;

    public ThongKeController(ThongKeView view) {

        this.view = view;
        this.dao = new ThongKeDAO();

        loadThongKe();
        loadBangThongKe();

        // Làm mới
        view.getBtnRefresh().addActionListener(e -> {

            loadThongKe();
            loadBangThongKe();

            JOptionPane.showMessageDialog(
                    view,
                    "Đã cập nhật dữ liệu mới nhất!"
            );
        });

        // Quay lại
        view.getBtnBack().addActionListener(e -> {

            MainView mainView = new MainView();

            new MainViewController(mainView);

            mainView.setVisible(true);

            view.dispose();
        });

        // Tìm theo ngày
        view.getBtnTim().addActionListener(e -> {
            timTheoNgay();
        });
    }

    private void loadThongKe() {

        DecimalFormat df = new DecimalFormat("#,###");

        view.getLblTongDoanhThu()
                .setText(df.format(
                        dao.getTongDoanhThu()) + " VNĐ");

        view.getLblTongHoaDon()
                .setText(String.valueOf(
                        dao.getTongHoaDon()));

        view.getLblTongSanPham()
                .setText(String.valueOf(
                        dao.getTongSanPhamBan()));

        view.getLblSanPhamBanChay()
                .setText(
                        dao.getSanPhamBanChay());
    }

    private void loadBangThongKe() {

        DefaultTableModel model
                = (DefaultTableModel) view.getTblThongKe().getModel();

        model.setRowCount(0);

        ArrayList<Object[]> list
                = dao.getDanhSachThongKe();

        DecimalFormat df
                = new DecimalFormat("#,###");

        for (Object[] row : list) {

            Object[] newRow = {
                row[0],
                row[1],
                row[2],
                df.format(
                Double.parseDouble(
                row[3].toString()))
                + " VNĐ"
            };

            model.addRow(newRow);
        }
    }

    private void timTheoNgay() {

        String ngay
                = view.getTxtNgay().getText().trim();

        if (ngay.isEmpty()) {

            JOptionPane.showMessageDialog(
                    view,
                    "Vui lòng nhập ngày!",
                    "Thông báo",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        DefaultTableModel model
                = (DefaultTableModel) view.getTblThongKe().getModel();

        model.setRowCount(0);

        ArrayList<Object[]> list
                = dao.getThongKeTheoNgay(ngay);

        if (list.isEmpty()) {

            JOptionPane.showMessageDialog(
                    view,
                    "Không tìm thấy dữ liệu ngày " + ngay,
                    "Thông báo",
                    JOptionPane.INFORMATION_MESSAGE
            );

            return;
        }

        DecimalFormat df
                = new DecimalFormat("#,###");

        for (Object[] row : list) {

            Object[] newRow = {
                row[0],
                row[1],
                row[2],
                df.format(
                Double.parseDouble(
                row[3].toString()))
                + " VNĐ"
            };

            model.addRow(newRow);
        }
    }
}
