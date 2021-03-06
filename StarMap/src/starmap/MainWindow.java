/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
/**
 * This is the Mainwindow class that display the main GUI. This class conains a
 * jpanels that display the stars/constellations, as well as a jpanel that shows
 * a stars information if the user is hovering over the star. This Jframe also
 * contains some menus: file, view, and help. Under file there is an exit option
 * that closes the application. Under the view menu there is a find
 * stars/constellation menu item, a set position/time menu item, and a toggle
 * constellation menu item. The help menu contains a usage and help section for 
 * the application.
 * @author Matthew Rames
 */
public class MainWindow extends javax.swing.JFrame {

    
    /**
     * Creates new form MainWindow2
     */
    public MainWindow() {
        initComponents();
        //Set title of application to StarMap
        setTitle("StarMap");
        //If the red X is pressed close the application
        this.setDefaultCloseOperation(MainWindow.EXIT_ON_CLOSE);
        //Get all of the star infromation from xml files and the constellation
        //information.
        map.infoPanel = starInfo1;
        map.loadConstellations(FileLoader.getStars(), FileLoader.getConstellations());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        map = new starmap.StarMapPanel();
        starInfo1 = new starmap.StarInfo();
        jMenuBar1 = new javax.swing.JMenuBar();
        QuitButton = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ViewMenu = new javax.swing.JMenu();
        PositionButton = new javax.swing.JMenuItem();
        FindSC = new javax.swing.JMenuItem();
        ShowConst = new javax.swing.JCheckBoxMenuItem();
        HelpMenu = new javax.swing.JMenu();
        Usage = new javax.swing.JMenuItem();
        About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout mapLayout = new javax.swing.GroupLayout(map);
        map.setLayout(mapLayout);
        mapLayout.setHorizontalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mapLayout.createSequentialGroup()
                .addGap(0, 565, Short.MAX_VALUE)
                .addComponent(starInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mapLayout.setVerticalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapLayout.createSequentialGroup()
                .addComponent(starInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 338, Short.MAX_VALUE))
        );

        QuitButton.setText("File");

        jMenuItem1.setText("Quit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        QuitButton.add(jMenuItem1);

        jMenuBar1.add(QuitButton);

        ViewMenu.setText("View");

        PositionButton.setText("Set Position/Date");
        PositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionButtonActionPerformed(evt);
            }
        });
        ViewMenu.add(PositionButton);

        FindSC.setText("Find Star/Constellation");
        FindSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindSCActionPerformed(evt);
            }
        });
        ViewMenu.add(FindSC);

        ShowConst.setSelected(true);
        ShowConst.setText("Show Constellations");
        ShowConst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowConstActionPerformed(evt);
            }
        });
        ViewMenu.add(ShowConst);

        jMenuBar1.add(ViewMenu);

        HelpMenu.setText("Help");
        HelpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuActionPerformed(evt);
            }
        });

        Usage.setText("Usage");
        Usage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsageActionPerformed(evt);
            }
        });
        HelpMenu.add(Usage);

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        HelpMenu.add(About);

        jMenuBar1.add(HelpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void UsageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsageActionPerformed
        //Display a static information text box on the usage of the application.
        String message = "StarMap v1.0.0\nTo pan around the scene you can click\n"
        + "and hold the left mouse or right mouse button and drag.\n"
        + "If you want to zoom in you can use the mouse wheel\n"
        + "to zoom in and out. To set your position you can click set\n"
        + "position under the view menu; this allows you to set: latitude,\n"
        + "longitude, azmiuth, and altitude. From the view menu you can\n"
        + "also search for a star or constellation you just have to type in\n"
        + "the name of the star or constellation, click find and it will zoom in and\n"
        + "focus on the star or constellation if it is visable from your\n"
        + "current position. Also from the view menu you can toggle wether or not\n"
        + "the constellations are visable.";
        JOptionPane.showMessageDialog(null, message, "Usage", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_UsageActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        //Display a static dialog box about the application.
        String message = "StarMap v1.0.0\n   Matthew Rames\n   John Brink";
        JOptionPane.showMessageDialog(null, message, "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AboutActionPerformed

    private void PositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionButtonActionPerformed

        //If the position button is pressed create a new dialog that allows
        //the user to select a postion and date.
        ObserverDialog window = new ObserverDialog(this, true, map);
        window.setVisible(true);
        
    }//GEN-LAST:event_PositionButtonActionPerformed

    private void ShowConstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowConstActionPerformed
        //If the show constellations is toggled change the state of show
        //constellations.
        JCheckBoxMenuItem checkBox = (JCheckBoxMenuItem)evt.getSource();
        map.setShowConstellations(checkBox.getState());
    }//GEN-LAST:event_ShowConstActionPerformed

    private void FindSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindSCActionPerformed
        //If the find star/constellation menu item is pushed, create a new dialog
        //that allows the user to type in a star or constellation and return the 
        //string.
        FindDialog fd = new FindDialog(this, true, map);
        fd.setVisible(true);
    }//GEN-LAST:event_FindSCActionPerformed

    private void HelpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuActionPerformed

    }//GEN-LAST:event_HelpMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true); 
            }      
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem FindSC;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem PositionButton;
    private javax.swing.JMenu QuitButton;
    private javax.swing.JCheckBoxMenuItem ShowConst;
    private javax.swing.JMenuItem Usage;
    private javax.swing.JMenu ViewMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private starmap.StarMapPanel map;
    private starmap.StarInfo starInfo1;
    // End of variables declaration//GEN-END:variables
}
