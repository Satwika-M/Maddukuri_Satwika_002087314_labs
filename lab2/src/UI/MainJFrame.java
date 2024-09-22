/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.VitalSignsHistory;

/**
 *
 * @author Satwika
 */
public class MainJFrame extends javax.swing.JFrame {
    
    VitalSignsHistory vitalSignsHistory; 

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        vitalSignsHistory = new VitalSignsHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        ControlPane = new javax.swing.JPanel();
        bntCreate = new javax.swing.JButton();
        bntView = new javax.swing.JButton();
        workarea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntCreate.setText("Create");
        bntCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCreateActionPerformed(evt);
            }
        });

        bntView.setText("View");
        bntView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPaneLayout = new javax.swing.GroupLayout(ControlPane);
        ControlPane.setLayout(ControlPaneLayout);
        ControlPaneLayout.setHorizontalGroup(
            ControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntView, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        ControlPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bntCreate, bntView});

        ControlPaneLayout.setVerticalGroup(
            ControlPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPaneLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(bntCreate)
                .addGap(33, 33, 33)
                .addComponent(bntView)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ControlPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bntCreate, bntView});

        SplitPane.setLeftComponent(ControlPane);

        javax.swing.GroupLayout workareaLayout = new javax.swing.GroupLayout(workarea);
        workarea.setLayout(workareaLayout);
        workareaLayout.setHorizontalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        workareaLayout.setVerticalGroup(
            workareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(workarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCreateActionPerformed
        CreateJPanel createPanel = new CreateJPanel(vitalSignsHistory);
        SplitPane.setRightComponent(createPanel);
    }//GEN-LAST:event_bntCreateActionPerformed

    private void bntViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntViewActionPerformed
        ViewJPanel viewPanel = new ViewJPanel(vitalSignsHistory);
        SplitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_bntViewActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPane;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton bntCreate;
    private javax.swing.JButton bntView;
    private javax.swing.JPanel workarea;
    // End of variables declaration//GEN-END:variables
}
