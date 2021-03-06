<<<<<<< HEAD
package Telas;

import Model.DataHoje;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

// Criando as variaveis / Objetos das interfaces
    CadastroCliente menuCadCli = null;
     CadastroProduto menuCadProduto = null;
     Vendas menuVenda = null;
     
     // objeto de data atual 
     DataHoje data = new DataHoje();

    public Principal() {
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

        jMenuItem5 = new javax.swing.JMenuItem();
        jdiPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadProd = new javax.swing.JMenu();
        jmCadCli = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jdiPrincipalLayout = new javax.swing.GroupLayout(jdiPrincipal);
        jdiPrincipal.setLayout(jdiPrincipalLayout);
        jdiPrincipalLayout.setHorizontalGroup(
            jdiPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        jdiPrincipalLayout.setVerticalGroup(
            jdiPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        getContentPane().add(jdiPrincipal, java.awt.BorderLayout.CENTER);

        jmCadProd.setText("Cadastro");
        jmCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadProdActionPerformed(evt);
            }
        });

        jmCadCli.setText("Cliente");
        jmCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadCliActionPerformed(evt);
            }
        });
        jmCadProd.add(jmCadCli);

        jMenuItem2.setText("Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmCadProd.add(jMenuItem2);

        jMenuBar1.add(jmCadProd);

        jMenu4.setText("Venda");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Nova Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Relatórios");

        jMenuItem1.setText("Gerar Relatório");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadCliActionPerformed
        if (menuCadCli == null || !menuCadCli.isVisible()) {
            menuCadCli = new CadastroCliente();
            jdiPrincipal.add(menuCadCli);
            menuCadCli.setVisible(true);
        } else if (menuCadCli.isVisible()) {
            try {
                menuCadCli.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            menuCadCli.getDesktopPane().getDesktopManager().deiconifyFrame(menuCadCli);
            menuCadCli.getDesktopPane().getDesktopManager().maximizeFrame(menuCadCli);
            menuCadCli.getDesktopPane().getDesktopManager().minimizeFrame(menuCadCli);
            menuCadCli.toFront();
//            try {
//                menuCadCli.setMaximum(true);
//            } catch (PropertyVetoException ex) {
//                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

    }//GEN-LAST:event_jmCadCliActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (menuCadProduto == null || !menuCadProduto.isVisible()) {
            menuCadProduto = new CadastroProduto();
            jdiPrincipal.add(menuCadProduto);
            menuCadProduto.setVisible(true);
        } else if (menuCadProduto.isVisible()) {
            try {
                menuCadProduto.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            menuCadProduto.getDesktopPane().getDesktopManager().deiconifyFrame(menuCadProduto);
            menuCadProduto.getDesktopPane().getDesktopManager().maximizeFrame(menuCadProduto);
            menuCadProduto.getDesktopPane().getDesktopManager().minimizeFrame(menuCadProduto);
            menuCadProduto.toFront();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed


    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        
        if (menuVenda == null || !menuVenda.isVisible()) {
            menuVenda = new Vendas();
            jdiPrincipal.add(menuVenda);
            menuVenda.setVisible(true);
        } else if (menuVenda.isVisible()) {
            try {
                menuVenda.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            menuVenda.getDesktopPane().getDesktopManager().deiconifyFrame(menuVenda);
            menuVenda.getDesktopPane().getDesktopManager().maximizeFrame(menuVenda);
            menuVenda.getDesktopPane().getDesktopManager().minimizeFrame(menuVenda);
            menuVenda.toFront();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadProdActionPerformed
        
    }//GEN-LAST:event_jmCadProdActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JDesktopPane jdiPrincipal;
    private javax.swing.JMenuItem jmCadCli;
    private javax.swing.JMenu jmCadProd;
    // End of variables declaration//GEN-END:variables
}
=======
package Telas;

import Model.DataHoje;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

// Criando as variaveis / Objetos das interfaces
    CadastroCliente menuCadCli = null;
     CadastroProduto menuCadProduto = null;
     Vendas menuVenda = null;
     Relatorio novoRel = null;
     
     // objeto de data atual 
     DataHoje data = new DataHoje();

    public Principal() {
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

        jMenuItem5 = new javax.swing.JMenuItem();
        jdiPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadProd = new javax.swing.JMenu();
        jmCadCli = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jdiPrincipalLayout = new javax.swing.GroupLayout(jdiPrincipal);
        jdiPrincipal.setLayout(jdiPrincipalLayout);
        jdiPrincipalLayout.setHorizontalGroup(
            jdiPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        jdiPrincipalLayout.setVerticalGroup(
            jdiPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        getContentPane().add(jdiPrincipal, java.awt.BorderLayout.CENTER);

        jmCadProd.setText("Cadastro");
        jmCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadProdActionPerformed(evt);
            }
        });

        jmCadCli.setText("Cliente");
        jmCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadCliActionPerformed(evt);
            }
        });
        jmCadProd.add(jmCadCli);

        jMenuItem2.setText("Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmCadProd.add(jMenuItem2);

        jMenuBar1.add(jmCadProd);

        jMenu4.setText("Venda");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Nova Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Relatórios");

        jMenuItem1.setText("Gerar Relatório");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadCliActionPerformed
        if (menuCadCli == null || !menuCadCli.isVisible()) {
            menuCadCli = new CadastroCliente();
            jdiPrincipal.add(menuCadCli);
            menuCadCli.setVisible(true);
        } else if (menuCadCli.isVisible()) {
            try {
                menuCadCli.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            menuCadCli.getDesktopPane().getDesktopManager().deiconifyFrame(menuCadCli);
            menuCadCli.getDesktopPane().getDesktopManager().maximizeFrame(menuCadCli);
            menuCadCli.getDesktopPane().getDesktopManager().minimizeFrame(menuCadCli);
            menuCadCli.toFront();
//            try {
//                menuCadCli.setMaximum(true);
//            } catch (PropertyVetoException ex) {
//                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }

    }//GEN-LAST:event_jmCadCliActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (menuCadProduto == null || !menuCadProduto.isVisible()) {
            menuCadProduto = new CadastroProduto();
            jdiPrincipal.add(menuCadProduto);
            menuCadProduto.setVisible(true);
        } else if (menuCadProduto.isVisible()) {
            try {
                menuCadProduto.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            menuCadProduto.getDesktopPane().getDesktopManager().deiconifyFrame(menuCadProduto);
            menuCadProduto.getDesktopPane().getDesktopManager().maximizeFrame(menuCadProduto);
            menuCadProduto.getDesktopPane().getDesktopManager().minimizeFrame(menuCadProduto);
            menuCadProduto.toFront();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed


    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        
        if (menuVenda == null || !menuVenda.isVisible()) {
            menuVenda = new Vendas();
            jdiPrincipal.add(menuVenda);
            menuVenda.setVisible(true);
        } else if (menuVenda.isVisible()) {
            try {
                menuVenda.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            menuVenda.getDesktopPane().getDesktopManager().deiconifyFrame(menuVenda);
            menuVenda.getDesktopPane().getDesktopManager().maximizeFrame(menuVenda);
            menuVenda.getDesktopPane().getDesktopManager().minimizeFrame(menuVenda);
            menuVenda.toFront();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadProdActionPerformed
        
    }//GEN-LAST:event_jmCadProdActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       if (novoRel == null || !novoRel.isVisible()) {
            novoRel = new Relatorio();
            jdiPrincipal.add(novoRel);
            novoRel.setVisible(true);
        } else if (novoRel.isVisible()) {
            try {
                novoRel.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            novoRel.getDesktopPane().getDesktopManager().deiconifyFrame(novoRel);
            novoRel.getDesktopPane().getDesktopManager().maximizeFrame(novoRel);
            novoRel.getDesktopPane().getDesktopManager().minimizeFrame(novoRel);
            novoRel.toFront();
//            try {
//                menuCadCli.setMaximum(true);
//            } catch (PropertyVetoException ex) {
//                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JDesktopPane jdiPrincipal;
    private javax.swing.JMenuItem jmCadCli;
    private javax.swing.JMenu jmCadProd;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> 012bf34936702e0c57d5d6e5fb75a8df23c5439a
