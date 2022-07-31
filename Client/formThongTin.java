/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Client;

import Server.ThongTinSV;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.logging.Logger;

/**
 * @author Pham Minh Hieu
 */
public class formThongTin extends javax.swing.JFrame {

    /**
     * Creates new form formThongTin
     */
    public formThongTin() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("THI TRẮC NGHIỆM");
        URL urlIcon = formClient.class.getResource("icon.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIcon);
        this.setIconImage(img);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldHoTen = new javax.swing.JTextField();
        jTextFieldMSSV = new javax.swing.JTextField();
        jTextFieldSDT = new javax.swing.JTextField();
        jButtonGuiThongTin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN SINH VIÊN");

        jLabel2.setText("HỌ VÀ TÊN");

        jLabel3.setText("MÃ SỐ SINH VIÊN");

        jLabel4.setText("SỐ ĐIỆN THOẠI");

        jTextFieldHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoTenActionPerformed(evt);
            }
        });

        jTextFieldMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMSSVActionPerformed(evt);
            }
        });

        jTextFieldSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSDTActionPerformed(evt);
            }
        });

        jButtonGuiThongTin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonGuiThongTin.setText("GỬI");
        jButtonGuiThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuiThongTinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(167, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(165, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonGuiThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jButtonGuiThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoTenActionPerformed

    private void jTextFieldMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMSSVActionPerformed

    private void jTextFieldSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSDTActionPerformed

    private void jButtonGuiThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuiThongTinActionPerformed
        // TODO add your handling code here:
        if (jTextFieldHoTen.getText().equals("") || jTextFieldMSSV.getText().equals("") || jTextFieldSDT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "VUI LÒNG ĐIỀN ĐẦY ĐỦ THÔNG TIN!!");
            jTextFieldHoTen.requestFocus();
            return;
        }
        
        String thongTin = "";

        thongTin += jTextFieldHoTen.getText();
        ThongTinSV.hoTen = jTextFieldHoTen.getText();
        thongTin += "///";

        ThongTinSV.mssv = jTextFieldMSSV.getText();
        thongTin += jTextFieldMSSV.getText();
        thongTin += "///";

        ThongTinSV.sdt = jTextFieldSDT.getText();
        thongTin += jTextFieldSDT.getText();
        thongTin += "///";

        String arrStr[] = thongTin.split("///");
        System.out.println("Ho ten: " + arrStr[0] + "\nMSSV: " + arrStr[1] + "" + "\nSDT: " + arrStr[2]);

        boolean check = true;
        while (check) {
            try {
                Socket socket = new Socket("localhost", 7777);
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeUTF(thongTin);
                dos.flush();
                String thongTinNhan = dis.readUTF();
                if (thongTinNhan.equals("Success")) {
                    JOptionPane.showMessageDialog(null, "GỬI THÔNG TIN THÀNH CÔNG!");
                    check = false;
                    socket.close();
                    formThongTin TT = new formThongTin();
                    this.setVisible(false);
                    formThiTN TTN = new formThiTN();
                    TTN.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "GỬI THÔNG TIN THÀNH CÔNG!");
                    socket.close();
                    formThongTin TT = new formThongTin();
                    this.setVisible(false);
                    formThiTN TTN = new formThiTN();
                    TTN.setVisible(true);
                    return;
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "GỬI THÔNG TIN THÀNH CÔNG!");
                formThongTin TT = new formThongTin();
                this.setVisible(false);
                formThiTN TTN = new formThiTN();
                TTN.setVisible(true);
                Logger.getLogger(formThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonGuiThongTinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuiThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldHoTen;
    private javax.swing.JTextField jTextFieldMSSV;
    private javax.swing.JTextField jTextFieldSDT;
    // End of variables declaration//GEN-END:variables
}
