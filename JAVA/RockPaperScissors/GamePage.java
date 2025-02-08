package com.mycompany.rockpaperscissors;

import java.awt.Font;
import java.io.File;


public class GamePage extends javax.swing.JFrame {

    
    public GamePage() {
        initComponents();
        
       
        
        try{
             File fontStyle = new File("C:\\Users\\paula\\OneDrive\\Documents\\Silkscreen-Regular.ttf");
             Font regular = Font.createFont(Font.TRUETYPE_FONT, fontStyle);
             
             File boldFontStyle = new File("C:\\Users\\paula\\OneDrive\\Documents\\Silkscreen-Bold.ttf");
             Font bold = Font.createFont(Font.TRUETYPE_FONT, boldFontStyle);
             lblPlayerTitle.setFont(bold.deriveFont(20f));
             lblComputerTitle.setFont(bold.deriveFont(20f));
             lblResult.setFont(regular.deriveFont(14f));
             lblComputerScore.setFont(regular.deriveFont(14f));
             lblPlayerScore.setFont(regular.deriveFont(14f));
             lblDraw.setFont(regular.deriveFont(14f));
           
             
        } catch (Exception e){
            e.printStackTrace();
        }   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        btnRock = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        btnScissors = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblPlayerTitle = new javax.swing.JLabel();
        lblPlayerScore = new javax.swing.JLabel();
        lblComputerScore = new javax.swing.JLabel();
        lblDraw = new javax.swing.JLabel();
        lblComputerTitle = new javax.swing.JLabel();
        bgGamePanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 400));
        setMinimumSize(new java.awt.Dimension(748, 400));
        setPreferredSize(new java.awt.Dimension(748, 400));

        gamePanel.setMaximumSize(new java.awt.Dimension(748, 400));
        gamePanel.setMinimumSize(new java.awt.Dimension(748, 400));
        gamePanel.setPreferredSize(new java.awt.Dimension(748, 400));
        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/myrock-removebg-preview.png"))); // NOI18N
        btnRock.setContentAreaFilled(false);
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });
        gamePanel.add(btnRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        btnPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/paper-removebg-preview.png"))); // NOI18N
        btnPaper.setContentAreaFilled(false);
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });
        gamePanel.add(btnPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        btnScissors.setIcon(new javax.swing.ImageIcon("C:\\RockPaperScissorsImg\\scissors-removebg-preview.png")); // NOI18N
        btnScissors.setContentAreaFilled(false);
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });
        gamePanel.add(btnScissors, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        lblResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 255, 255));
        lblResult.setText("RESULT: ");
        gamePanel.add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 170, -1));

        lblPlayerTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPlayerTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerTitle.setText("YOU");
        gamePanel.add(lblPlayerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        lblPlayerScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPlayerScore.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerScore.setText("PLAYER:");
        gamePanel.add(lblPlayerScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 110, -1));

        lblComputerScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblComputerScore.setForeground(new java.awt.Color(255, 255, 255));
        lblComputerScore.setText("COMPUTER:");
        gamePanel.add(lblComputerScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 140, -1));

        lblDraw.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDraw.setForeground(new java.awt.Color(255, 255, 255));
        lblDraw.setText("DRAW:");
        gamePanel.add(lblDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        lblComputerTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblComputerTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblComputerTitle.setText("COMPUTER");
        gamePanel.add(lblComputerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        bgGamePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        gamePanel.add(bgGamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScissorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScissorsActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRockActionPerformed

    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgGamePanel;
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel lblComputerScore;
    private javax.swing.JLabel lblComputerTitle;
    private javax.swing.JLabel lblDraw;
    private javax.swing.JLabel lblPlayerScore;
    private javax.swing.JLabel lblPlayerTitle;
    private javax.swing.JLabel lblResult;
    // End of variables declaration//GEN-END:variables
}
