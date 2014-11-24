/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

/**
 *
 * @author 7101020
 */
public class ObserverDialog extends javax.swing.JDialog {

    ObserverDialogListener listener;
    
    /**
     * Creates new form ObserverDialog
     */
    public ObserverDialog(java.awt.Frame parent, boolean modal, ObserverDialogListener listener) {
        super(parent, modal);
        this.listener = listener;
        initComponents();
    }
    
    public interface ObserverDialogListener
    {
        public void observerUpdated(double latitude, double longitude, double altitude, double azimuth);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OkButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LongSlider = new javax.swing.JSlider();
        LatSlider = new javax.swing.JSlider();
        AltSlider = new javax.swing.JSlider();
        AzSlider = new javax.swing.JSlider();
        LongSpinner = new javax.swing.JSpinner();
        LatSpinner = new javax.swing.JSpinner();
        AltSpinner = new javax.swing.JSpinner();
        AzSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OkButton.setText("Ok");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Longitude");

        jLabel2.setText("Latitude");

        jLabel3.setText("Altitude");

        jLabel4.setText("Azimuth");

        LongSlider.setMajorTickSpacing(60);
        LongSlider.setMaximum(180);
        LongSlider.setMinimum(-180);
        LongSlider.setMinorTickSpacing(10);
        LongSlider.setValue(0);
        LongSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LongSliderStateChanged(evt);
            }
        });

        LatSlider.setMajorTickSpacing(60);
        LatSlider.setMaximum(180);
        LatSlider.setMinimum(-180);
        LatSlider.setMinorTickSpacing(10);
        LatSlider.setValue(0);
        LatSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LatSliderStateChanged(evt);
            }
        });

        AltSlider.setMajorTickSpacing(10);
        AltSlider.setMaximum(90);
        AltSlider.setMinorTickSpacing(1);
        AltSlider.setValue(0);
        AltSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AltSliderStateChanged(evt);
            }
        });

        AzSlider.setMajorTickSpacing(60);
        AzSlider.setMaximum(360);
        AzSlider.setMinorTickSpacing(10);
        AzSlider.setValue(0);
        AzSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AzSliderStateChanged(evt);
            }
        });

        LongSpinner.setModel(new javax.swing.SpinnerNumberModel(0, -180, 180, 1));
        LongSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LongSpinnerStateChanged(evt);
            }
        });

        LatSpinner.setModel(new javax.swing.SpinnerNumberModel(0, -180, 180, 1));
        LatSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LatSpinnerStateChanged(evt);
            }
        });

        AltSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 90, 1));
        AltSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AltSpinnerStateChanged(evt);
            }
        });

        AzSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 360, 1));
        AzSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AzSpinnerStateChanged(evt);
            }
        });

        jLabel5.setText("Please select your desired position.");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LongSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LongSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AzSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AzSpinner))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LatSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LatSpinner))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AltSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AltSpinner))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(LongSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LongSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LatSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(LatSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AltSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(AltSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(AzSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AzSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkButton)
                    .addComponent(CancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AltSlider, AltSpinner, AzSlider, AzSpinner, LatSlider, LatSpinner, LongSlider, LongSpinner, jLabel1, jLabel2, jLabel3, jLabel4});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        if(listener != null)
            listener.observerUpdated(LongSlider.getValue(), LatSlider.getValue(),
                                    AltSlider.getValue(), AzSlider.getValue());
        this.dispose();
    }//GEN-LAST:event_OkButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void LongSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LongSliderStateChanged
        LongSpinner.setValue(LongSlider.getValue());
    }//GEN-LAST:event_LongSliderStateChanged

    private void LongSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LongSpinnerStateChanged
        LongSlider.setValue((int)LongSpinner.getValue());
    }//GEN-LAST:event_LongSpinnerStateChanged

    private void LatSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LatSliderStateChanged
        LatSpinner.setValue(LatSlider.getValue());
    }//GEN-LAST:event_LatSliderStateChanged

    private void LatSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LatSpinnerStateChanged
        LatSlider.setValue((int)LatSpinner.getValue());
    }//GEN-LAST:event_LatSpinnerStateChanged

    private void AltSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AltSliderStateChanged
        AltSpinner.setValue(AltSlider.getValue());
    }//GEN-LAST:event_AltSliderStateChanged

    private void AltSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AltSpinnerStateChanged
        AltSlider.setValue((int)AltSpinner.getValue());
    }//GEN-LAST:event_AltSpinnerStateChanged

    private void AzSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AzSliderStateChanged
        AzSpinner.setValue(AzSlider.getValue());
    }//GEN-LAST:event_AzSliderStateChanged

    private void AzSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AzSpinnerStateChanged
        AzSlider.setValue((int)AzSpinner.getValue());
    }//GEN-LAST:event_AzSpinnerStateChanged

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
            java.util.logging.Logger.getLogger(ObserverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObserverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObserverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObserverDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ObserverDialog dialog = new ObserverDialog(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider AltSlider;
    private javax.swing.JSpinner AltSpinner;
    private javax.swing.JSlider AzSlider;
    private javax.swing.JSpinner AzSpinner;
    private javax.swing.JButton CancelButton;
    private javax.swing.JSlider LatSlider;
    private javax.swing.JSpinner LatSpinner;
    private javax.swing.JSlider LongSlider;
    private javax.swing.JSpinner LongSpinner;
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
