/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piu;

import javax.swing.ImageIcon;

/**
 *
 * @author Dalay
 */
public class Contato extends javax.swing.JFrame {

    /**
     * Creates new form Contatos
     */
    public Contato() {
        initComponents();
        button_Contato.setEnabled(false);
        im_Mapa.setIcon(imagem);
    }
        ImageIcon imagem = new ImageIcon("src/imagens/mapa.jpg");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Contato = new javax.swing.JLabel();
        button_FazerLogin = new javax.swing.JButton();
        button_Cardapio = new javax.swing.JButton();
        button_Inicio = new javax.swing.JButton();
        button_Contato = new javax.swing.JButton();
        label_Endereco = new javax.swing.JLabel();
        label_Telefone = new javax.swing.JLabel();
        im_Mapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_Contato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_Contato.setText("Contato");

        button_FazerLogin.setText("Fazer Login");

        button_Cardapio.setText("Cardápio");

        button_Inicio.setText("Inicio");

        button_Contato.setText("Contato");

        label_Endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Endereco.setText("Endereço: Rua dos Narnianos, 0");

        label_Telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Telefone.setText("Telefone: 0101-1101");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Endereco)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(label_Telefone))
                            .addComponent(im_Mapa))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_Inicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Cardapio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_FazerLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Contato)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(label_Contato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label_Contato)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Inicio)
                    .addComponent(button_Cardapio)
                    .addComponent(button_FazerLogin)
                    .addComponent(button_Contato))
                .addGap(38, 38, 38)
                .addComponent(label_Endereco)
                .addGap(18, 18, 18)
                .addComponent(label_Telefone)
                .addGap(36, 36, 36)
                .addComponent(im_Mapa)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contato().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cardapio;
    private javax.swing.JButton button_Contato;
    private javax.swing.JButton button_FazerLogin;
    private javax.swing.JButton button_Inicio;
    private javax.swing.JLabel im_Mapa;
    private javax.swing.JLabel label_Contato;
    private javax.swing.JLabel label_Endereco;
    private javax.swing.JLabel label_Telefone;
    // End of variables declaration//GEN-END:variables
}
