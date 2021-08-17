/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ElControladorDeRequerimientos;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Acer
 */
public class VistaMenu extends JFrame {

    /**
     * Creates new form VistaMenu
     */
    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    public VistaMenu() {
        initComponents();

        Image icon = new ImageIcon(getClass().getResource("/img/bienes-raices-icon.png")).getImage();
        setIconImage(icon);
        setSize(350, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20),
                new java.awt.Dimension(0, 20));
        jLabelTitulo = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20),
                new java.awt.Dimension(0, 20));
        jLabelImagen = new javax.swing.JLabel();

        jPanel2 = new javax.swing.JPanel();

        btnRequerimiento1 = new javax.swing.JButton();
        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Consultas");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        jPanel1.add(filler3);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("BIENVENIDO");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelTitulo.setAlignmentX(0.5F);

        jPanel1.add(jLabelTitulo);
        jPanel1.add(filler2);

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bienes-raices-icon.png"))); // NOI18N
        jLabelImagen.setAlignmentX(0.5F);

        jPanel1.add(jLabelImagen);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(),
                "Escoja una Consuta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP,
                new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(345, 120));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 50, 10));

        btnRequerimiento1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRequerimiento1.setText("Consulta 1");
        btnRequerimiento1.addActionListener(CONTROLADOR);
        btnRequerimiento1.setActionCommand("requerimiento1");
        jPanel2.add(btnRequerimiento1);
        
        btnRequerimiento2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRequerimiento2.setText("Consulta 2");
        btnRequerimiento2.addActionListener(CONTROLADOR);
        btnRequerimiento2.setActionCommand("requerimiento2");
        jPanel2.add(btnRequerimiento2);

        btnRequerimiento3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRequerimiento3.setText("Consulta 3");
        btnRequerimiento3.addActionListener(CONTROLADOR);
        btnRequerimiento3.setActionCommand("requerimiento3");
        jPanel2.add(btnRequerimiento3);
        
        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {

    // // new VistaMenu().setVisible(true);
    // /* Set the Nimbus look and feel */
    // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    // /* If Nimbus (introduced in Java SE 6) is not available, stay with the
    // default look and feel.
    // * For details see
    // http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    // */
    // try {
    // for (javax.swing.UIManager.LookAndFeelInfo info :
    // javax.swing.UIManager.getInstalledLookAndFeels()) {
    // if ("Nimbus".equals(info.getName())) {
    // javax.swing.UIManager.setLookAndFeel(info.getClassName());
    // break;
    // }
    // }
    // } catch (ClassNotFoundException ex) {
    // java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (InstantiationException ex) {
    // java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (IllegalAccessException ex) {
    // java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    // java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE,
    // null, ex);
    // }
    // </editor-fold>

    /* Create and display the form */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // new VistaMenu().setVisible(true);
    // }
    // });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
