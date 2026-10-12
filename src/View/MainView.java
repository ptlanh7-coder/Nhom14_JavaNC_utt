package View;

import Controller.LoginController;
import Controller.ThongKeController;
import javax.swing.JOptionPane;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(700, 525);
    }

    public void phanQuyen(String vaiTro) {

        // Nhân viên không được vào quản lý nhân viên
        // và thống kê
        if (vaiTro.equalsIgnoreCase("NhanVien")) {

            btnNhanVien.setEnabled(false);

            btnThongKe.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNhanVien = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("HỆ THỐNG QUẢN LÝ CAFE");
        lblTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, java.awt.Color.RED));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        btnNhanVien.setBackground(new java.awt.Color(173, 216, 230));
        btnNhanVien.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnNhanVien.setText("Quản lý nhân viên ");
        btnNhanVien.setPreferredSize(new java.awt.Dimension(220, 80));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnSanPham.setBackground(new java.awt.Color(144, 238, 144));
        btnSanPham.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSanPham.setText("Quản lý sản phẩm ");
        btnSanPham.setPreferredSize(new java.awt.Dimension(220, 80));
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(255, 228, 181));
        btnKhachHang.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnKhachHang.setText("Quản lý khách hàng ");
        btnKhachHang.setPreferredSize(new java.awt.Dimension(220, 80));

        btnHoaDon.setBackground(new java.awt.Color(221, 160, 221));
        btnHoaDon.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnHoaDon.setText("Quản lý hóa đơn ");
        btnHoaDon.setPreferredSize(new java.awt.Dimension(220, 80));

        btnThongKe.setBackground(new java.awt.Color(135, 206, 250));
        btnThongKe.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnThongKe.setText("Thống kê ");
        btnThongKe.setPreferredSize(new java.awt.Dimension(220, 80));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(255, 99, 71));
        btnDangXuat.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất ");
        btnDangXuat.setPreferredSize(new java.awt.Dimension(220, 80));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblUser.setBackground(new java.awt.Color(0, 102, 204));
        lblUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Xin chào: admin");

        lblRole.setBackground(new java.awt.Color(0, 102, 204));
        lblRole.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("Vai trò: Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        /* TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Bạn có muốn đăng xuất?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {

            LoginView login = new LoginView();

            new LoginController(login);

            login.setVisible(true);

            this.dispose();
        } */
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        /*/ TODO add your handling code here:
        ThongKeView view = new ThongKeView();
        new ThongKeController(view);
        view.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btnThongKeActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JLabel getLblUser() {
        return lblUser;
    }

    public javax.swing.JLabel getLblRole() {
        return lblRole;
    }

    public javax.swing.JButton getBtnNhanVien() {
        return btnNhanVien;
    }

    public javax.swing.JButton getBtnSanPham() {
        return btnSanPham;
    }

    public javax.swing.JButton getBtnKhachHang() {
        return btnKhachHang;
    }

    public javax.swing.JButton getBtnHoaDon() {
        return btnHoaDon;
    }

    public javax.swing.JButton getBtnThongKe() {
        return btnThongKe;
    }

    public javax.swing.JButton getBtnDangXuat() {
        return btnDangXuat;
    }
}
