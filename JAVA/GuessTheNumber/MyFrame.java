package com.mycompany.guessthenumber;

import java.util.Random;
import javax.swing.JOptionPane;

public class MyFrame extends javax.swing.JFrame {

    int guess, random, start, end, range, tries = 0, correct = 0;

    public MyFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        txtStart = new javax.swing.JTextField();
        lblStart = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblNumTries = new javax.swing.JLabel();
        NumTries = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        txtUserGuess = new javax.swing.JTextField();
        lblUserGuess = new javax.swing.JLabel();
        btnGuess = new javax.swing.JButton();
        Score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(255, 204, 255));

        title.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 102));
        title.setText("Guessing Game");

        btnGenerate.setBackground(new java.awt.Color(255, 0, 102));
        btnGenerate.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        btnGenerate.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerate.setText("Generate");
        btnGenerate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        txtStart.setBackground(new java.awt.Color(255, 204, 255));
        txtStart.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        txtStart.setForeground(new java.awt.Color(51, 51, 51));
        txtStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartActionPerformed(evt);
            }
        });

        lblStart.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lblStart.setForeground(new java.awt.Color(51, 51, 51));
        lblStart.setText("Start");

        lblResult.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 0, 102));

        lblNumTries.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumTries.setForeground(new java.awt.Color(51, 51, 51));

        NumTries.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 13)); // NOI18N
        NumTries.setForeground(new java.awt.Color(255, 0, 102));
        NumTries.setText("Number of tries:");

        lblEnd.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lblEnd.setForeground(new java.awt.Color(51, 51, 51));
        lblEnd.setText("End");

        txtEnd.setBackground(new java.awt.Color(255, 204, 255));
        txtEnd.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        txtEnd.setForeground(new java.awt.Color(51, 51, 51));
        txtEnd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndActionPerformed(evt);
            }
        });

        Result.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 13)); // NOI18N
        Result.setForeground(new java.awt.Color(255, 0, 102));
        Result.setText("Result:");

        txtUserGuess.setBackground(new java.awt.Color(255, 204, 255));
        txtUserGuess.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        txtUserGuess.setForeground(new java.awt.Color(51, 51, 51));
        txtUserGuess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserGuessActionPerformed(evt);
            }
        });

        lblUserGuess.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        lblUserGuess.setForeground(new java.awt.Color(51, 51, 51));
        lblUserGuess.setText("My Guess");

        btnGuess.setBackground(new java.awt.Color(255, 0, 102));
        btnGuess.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        btnGuess.setForeground(new java.awt.Color(255, 255, 255));
        btnGuess.setText("Guess");
        btnGuess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        Score.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 13)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 0, 102));
        Score.setText("Score:");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(title)
                .addGap(0, 357, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStart)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(lblEnd)
                                .addGap(56, 56, 56)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Result)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(lblUserGuess)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUserGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NumTries, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Score)
                        .addGap(169, 169, 169)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResult)
                            .addComponent(lblNumTries))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStart)
                            .addComponent(txtUserGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserGuess))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnd)
                            .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Result))
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(NumTries)
                                .addGap(29, 29, 29)
                                .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82)))
                .addComponent(lblResult)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblNumTries)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Score)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed

        //kuhain yung start to end
        //create an if conditions 
        //start must NOT be higher than the end
        //numbers should be valid
        try {
            start = Integer.parseInt(txtStart.getText());
            end = Integer.parseInt(txtEnd.getText());

            if (start > end) {
                JOptionPane.showMessageDialog(this, "Start must be lower than end! 8080", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (txtStart.getText().isEmpty() || txtEnd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a value first!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            int range = end - start + 1;
            random = (int) (Math.random() * range) + start;
            System.out.println("Button Generated" + random);
            
            tries = 0;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a valid value!", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnGenerateActionPerformed


    private void txtStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartActionPerformed

    private void txtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndActionPerformed

    private void txtUserGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserGuessActionPerformed

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        // TODO add your handling code here:

        //if-empty
        try {
            if (txtUserGuess.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a value first", "Error", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("Guess button: " + random);
            guess = Integer.parseInt(txtUserGuess.getText());
            tries++;
            NumTries.setText("Number of tries: " + tries);

            if (guess < start || guess > end) {
                Result.setText("The number should be \nbetween start and end!");
            } else {
                
                if (guess > random) {
                    Result.setText("Result: Lower!");
                } else if (guess < random) {
                    Result.setText("Result: Higher!");
                } else {
                    Result.setText("You guessed it right! The number is " + random);
                    correct++;
                    Score.setText("Score: " + correct);
                }
            }

        } catch (Exception e) {
            Result.setText("Error!");
        }


    }//GEN-LAST:event_btnGuessActionPerformed

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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumTries;
    private javax.swing.JLabel Result;
    private javax.swing.JLabel Score;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnGuess;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblNumTries;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblUserGuess;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtStart;
    private javax.swing.JTextField txtUserGuess;
    // End of variables declaration//GEN-END:variables
}
