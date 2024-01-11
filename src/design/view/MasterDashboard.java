/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package design.view;

/**
 *
 * @author novar
 */
public class MasterDashboard extends javax.swing.JPanel {

    /**
     * Creates new form MasterDashboard
     */
    public MasterDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cardAnggota = new Palette.Custom_JPanelRounded();
        lb_orders = new javax.swing.JLabel();
        lbJumlahOrders = new javax.swing.JLabel();
        cardAnggota2 = new Palette.Custom_JPanelRounded();
        lb_anggota2 = new javax.swing.JLabel();
        lbJumlahPeminjaman = new javax.swing.JLabel();
        cardAnggota3 = new Palette.Custom_JPanelRounded();
        lb_anggota3 = new javax.swing.JLabel();
        lbJumlahPengembalian = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.Custom_JTabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cardAnggota1 = new Palette.Custom_JPanelRounded();
        lb_anggota1 = new javax.swing.JLabel();
        lbJumlahBuku = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(215, 212, 212));
        jPanel2.setPreferredSize(new java.awt.Dimension(1133, 690));

        cardAnggota.setBackground(new java.awt.Color(255, 255, 255));
        cardAnggota.setRoundBottomLeft(30);
        cardAnggota.setRoundBottomRight(30);
        cardAnggota.setRoundTopLeft(30);
        cardAnggota.setRoundTopRight(30);

        lb_orders.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_orders.setForeground(new java.awt.Color(51, 153, 0));
        lb_orders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_purchase_order_30px_2.png"))); // NOI18N
        lb_orders.setText("ORDERS");

        lbJumlahOrders.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lbJumlahOrders.setForeground(new java.awt.Color(0, 0, 0));
        lbJumlahOrders.setText("999");

        javax.swing.GroupLayout cardAnggotaLayout = new javax.swing.GroupLayout(cardAnggota);
        cardAnggota.setLayout(cardAnggotaLayout);
        cardAnggotaLayout.setHorizontalGroup(
            cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggotaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahOrders)
                    .addComponent(lb_orders))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        cardAnggotaLayout.setVerticalGroup(
            cardAnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggotaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_orders)
                .addGap(20, 20, 20)
                .addComponent(lbJumlahOrders)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        cardAnggota2.setBackground(new java.awt.Color(255, 255, 255));
        cardAnggota2.setPreferredSize(new java.awt.Dimension(217, 123));
        cardAnggota2.setRoundBottomLeft(30);
        cardAnggota2.setRoundBottomRight(30);
        cardAnggota2.setRoundTopLeft(30);
        cardAnggota2.setRoundTopRight(30);

        lb_anggota2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_anggota2.setForeground(new java.awt.Color(0, 204, 204));
        lb_anggota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_bullish_filled_30px.png"))); // NOI18N
        lb_anggota2.setText("PROFIT");

        lbJumlahPeminjaman.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lbJumlahPeminjaman.setForeground(new java.awt.Color(0, 0, 0));
        lbJumlahPeminjaman.setText("999");

        javax.swing.GroupLayout cardAnggota2Layout = new javax.swing.GroupLayout(cardAnggota2);
        cardAnggota2.setLayout(cardAnggota2Layout);
        cardAnggota2Layout.setHorizontalGroup(
            cardAnggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardAnggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahPeminjaman)
                    .addComponent(lb_anggota2))
                .addGap(140, 140, 140))
        );
        cardAnggota2Layout.setVerticalGroup(
            cardAnggota2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_anggota2)
                .addGap(20, 20, 20)
                .addComponent(lbJumlahPeminjaman)
                .addGap(20, 20, 20))
        );

        cardAnggota3.setBackground(new java.awt.Color(255, 255, 255));
        cardAnggota3.setPreferredSize(new java.awt.Dimension(217, 123));
        cardAnggota3.setRoundBottomLeft(30);
        cardAnggota3.setRoundBottomRight(30);
        cardAnggota3.setRoundTopLeft(30);
        cardAnggota3.setRoundTopRight(30);

        lb_anggota3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_anggota3.setForeground(new java.awt.Color(255, 153, 0));
        lb_anggota3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cost_30px.png"))); // NOI18N
        lb_anggota3.setText("COST");

        lbJumlahPengembalian.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lbJumlahPengembalian.setForeground(new java.awt.Color(0, 0, 0));
        lbJumlahPengembalian.setText("999");

        javax.swing.GroupLayout cardAnggota3Layout = new javax.swing.GroupLayout(cardAnggota3);
        cardAnggota3.setLayout(cardAnggota3Layout);
        cardAnggota3Layout.setHorizontalGroup(
            cardAnggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardAnggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahPengembalian)
                    .addComponent(lb_anggota3))
                .addGap(140, 140, 140))
        );
        cardAnggota3Layout.setVerticalGroup(
            cardAnggota3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_anggota3)
                .addGap(20, 20, 20)
                .addComponent(lbJumlahPengembalian)
                .addGap(20, 20, 20))
        );

        tblData.setBackground(new java.awt.Color(255, 255, 255));
        tblData.setForeground(new java.awt.Color(255, 255, 255));
        tblData.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("List Of Customers");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Master Data > Dashboard");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_compass_30px.png"))); // NOI18N

        cardAnggota1.setBackground(new java.awt.Color(255, 255, 255));
        cardAnggota1.setRoundBottomLeft(30);
        cardAnggota1.setRoundBottomRight(30);
        cardAnggota1.setRoundTopLeft(30);
        cardAnggota1.setRoundTopRight(30);

        lb_anggota1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_anggota1.setForeground(new java.awt.Color(204, 0, 204));
        lb_anggota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_sales_performance_filled_30px.png"))); // NOI18N
        lb_anggota1.setText("REVENUE");

        lbJumlahBuku.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lbJumlahBuku.setForeground(new java.awt.Color(0, 0, 0));
        lbJumlahBuku.setText("999");

        javax.swing.GroupLayout cardAnggota1Layout = new javax.swing.GroupLayout(cardAnggota1);
        cardAnggota1.setLayout(cardAnggota1Layout);
        cardAnggota1Layout.setHorizontalGroup(
            cardAnggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(cardAnggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbJumlahBuku)
                    .addComponent(lb_anggota1))
                .addGap(140, 140, 140))
        );
        cardAnggota1Layout.setVerticalGroup(
            cardAnggota1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAnggota1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_anggota1)
                .addGap(20, 20, 20)
                .addComponent(lbJumlahBuku)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cardAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(583, 583, 583)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, 0)
                                        .addComponent(cardAnggota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(cardAnggota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(cardAnggota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cardAnggota3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(cardAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cardAnggota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cardAnggota2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_JPanelRounded cardAnggota;
    private Palette.Custom_JPanelRounded cardAnggota1;
    private Palette.Custom_JPanelRounded cardAnggota2;
    private Palette.Custom_JPanelRounded cardAnggota3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbJumlahBuku;
    private javax.swing.JLabel lbJumlahOrders;
    private javax.swing.JLabel lbJumlahPeminjaman;
    private javax.swing.JLabel lbJumlahPengembalian;
    private javax.swing.JLabel lb_anggota1;
    private javax.swing.JLabel lb_anggota2;
    private javax.swing.JLabel lb_anggota3;
    private javax.swing.JLabel lb_orders;
    private Palette.Custom_JTabel tblData;
    // End of variables declaration//GEN-END:variables
}