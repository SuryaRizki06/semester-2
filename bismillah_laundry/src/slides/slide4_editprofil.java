/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slides;

/**
 *
 * @author nuraz
 */
public class slide4_editprofil extends javax.swing.JFrame {

    /**
     * Creates new form slide4_editprofil
     */
    public slide4_editprofil() {
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

        background_kuning = new javax.swing.JLabel();
        background_putih = new javax.swing.JLabel();
        profil = new javax.swing.JButton();
        dashboard = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background_kuning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/slide1_login/background kuning.png"))); // NOI18N
        getContentPane().add(background_kuning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1030));

        background_putih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/slide3_dashboard/background putih.png"))); // NOI18N
        getContentPane().add(background_putih, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/slide3_dashboard/profil.png"))); // NOI18N
        profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilActionPerformed(evt);
            }
        });
        getContentPane().add(profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        dashboard.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        dashboard.setForeground(new java.awt.Color(0, 102, 102));
        dashboard.setText("Dashboard");
        getContentPane().add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 530, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Kamis, 20 Februari 2025");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/slide3_dashboard/icon-icon.png"))); // NOI18N
        icon.setText("jLabel2");
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilActionPerformed

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
            java.util.logging.Logger.getLogger(slide4_editprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slide4_editprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slide4_editprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slide4_editprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slide4_editprofil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_kuning;
    private javax.swing.JLabel background_putih;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton profil;
    // End of variables declaration//GEN-END:variables
}
