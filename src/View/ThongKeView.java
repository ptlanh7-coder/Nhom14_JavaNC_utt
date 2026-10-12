package View;

import Controller.MainViewController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

public class ThongKeView extends javax.swing.JFrame {

    public ThongKeView() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tblThongKe.getColumnCount(); i++) {
            tblThongKe.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTongDoanhThu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTongHoaDon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTongSanPham = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSanPhamBanChay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        scrollPane2 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblColon1 = new javax.swing.JLabel();
        lblColon2 = new javax.swing.JLabel();
        lblColon3 = new javax.swing.JLabel();
        lblColon4 = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        btnTimNgay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thống kê doanh thu");
        setPreferredSize(new java.awt.Dimension(720, 620));
        setResizable(false);

        lblTitle.setBackground(new java.awt.Color(255, 0, 0));
        lblTitle.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 51, 51));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("THỐNG KÊ DOANH THU");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Tổng doanh thu");

        lblTongDoanhThu.setBackground(java.awt.Color.blue);
        lblTongDoanhThu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTongDoanhThu.setForeground(new java.awt.Color(0, 102, 204));
        lblTongDoanhThu.setText("570.000 VNĐ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Tổng hóa đơn");

        lblTongHoaDon.setBackground(java.awt.Color.blue);
        lblTongHoaDon.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTongHoaDon.setForeground(new java.awt.Color(0, 102, 204));
        lblTongHoaDon.setText("6");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Tổng sản phẩm bán");

        lblTongSanPham.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTongSanPham.setForeground(new java.awt.Color(0, 102, 204));
        lblTongSanPham.setText("13");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Sản phẩm bán chạy");

        lblSanPhamBanChay.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSanPhamBanChay.setForeground(new java.awt.Color(0, 102, 204));
        lblSanPhamBanChay.setText("Trà Sữa Truyền Thống");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BẢNG THỐNG KÊ");

        btnRefresh.setBackground(new java.awt.Color(0, 123, 255));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Làm mới");
        btnRefresh.setPreferredSize(new java.awt.Dimension(220, 50));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        scrollPane2.setName(""); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách thống kê sản phẩm"));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(650, 230));

        tblThongKe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sản phẩm ", "Số lượng bán ", "Doanh thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongKe.setPreferredSize(new java.awt.Dimension(650, 200));
        jScrollPane1.setViewportView(tblThongKe);

        scrollPane2.add(jScrollPane1);

        btnBack.setBackground(new java.awt.Color(255, 193, 7));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setText("Quay lại");
        btnBack.setPreferredSize(new java.awt.Dimension(220, 50));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblColon1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblColon1.setText(":");

        lblColon2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblColon2.setText(":");

        lblColon3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblColon3.setText(":");

        lblColon4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblColon4.setText(":");

        lblNgay.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblNgay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNgay.setText("Ngày:");

        txtNgay.setPreferredSize(new java.awt.Dimension(180, 35));
        txtNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayActionPerformed(evt);
            }
        });

        btnTimNgay.setBackground(new java.awt.Color(40, 167, 69));
        btnTimNgay.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTimNgay.setForeground(new java.awt.Color(255, 255, 255));
        btnTimNgay.setText("Tìm ");
        btnTimNgay.setPreferredSize(new java.awt.Dimension(110, 35));
        btnTimNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimNgayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblColon1)
                                .addComponent(lblColon2)
                                .addComponent(lblColon4))
                            .addComponent(lblColon3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSanPhamBanChay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTongHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTongDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTongSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNgay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTongDoanhThu)
                    .addComponent(lblColon1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTongHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColon3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColon4)
                    .addComponent(jLabel4)
                    .addComponent(lblSanPhamBanChay, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnTimNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(
                this,
                "Đã làm mới dữ liệu!"
        );
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainView main = new MainView();
        new MainViewController(main);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayActionPerformed

    private void btnTimNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimNgayActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTimNgay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColon1;
    private javax.swing.JLabel lblColon2;
    private javax.swing.JLabel lblColon3;
    private javax.swing.JLabel lblColon4;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblSanPhamBanChay;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTongDoanhThu;
    private javax.swing.JLabel lblTongHoaDon;
    private javax.swing.JLabel lblTongSanPham;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JTable tblThongKe;
    private javax.swing.JTextField txtNgay;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JLabel getLblTongDoanhThu() {
        return lblTongDoanhThu;
    }

    public javax.swing.JLabel getLblTongHoaDon() {
        return lblTongHoaDon;
    }

    public javax.swing.JLabel getLblTongSanPham() {
        return lblTongSanPham;
    }

    public javax.swing.JLabel getLblSanPhamBanChay() {
        return lblSanPhamBanChay;
    }

    public javax.swing.JTable getTblThongKe() {
        return tblThongKe;
    }

    public javax.swing.JButton getBtnRefresh() {
        return btnRefresh;
    }

    public javax.swing.JButton getBtnBack() {
        return btnBack;
    }

    public javax.swing.JTextField getTxtNgay() {
        return txtNgay;
    }

    public javax.swing.JButton getBtnTim() {
        return btnTimNgay;
    }
}
