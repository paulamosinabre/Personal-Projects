package com.mycompany.rockpaperscissors;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class GamePage extends javax.swing.JFrame {

    Clip win, lose, bgmGame;
    int player, computer, player_score = 0, computer_score = 0, draw = 0;

    public GamePage() {
        initComponents();
        loadSound("C:/RockPaperScissorsImg/bgmGamePage.wav");
        loop();

        setLocationRelativeTo(null);
        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        lblComputer = new javax.swing.JLabel();
        btnRock = new javax.swing.JButton();
        btnPaper = new javax.swing.JButton();
        btnScissors = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        lblPlayerTitle = new javax.swing.JLabel();
        lblPlayerScore = new javax.swing.JLabel();
        lblComputerScore = new javax.swing.JLabel();
        lblDraw = new javax.swing.JLabel();
        lblComputerTitle = new javax.swing.JLabel();
        bgGamePanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(748, 438));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gamePanel.setMaximumSize(new java.awt.Dimension(748, 400));
        gamePanel.setMinimumSize(new java.awt.Dimension(748, 400));
        gamePanel.setPreferredSize(new java.awt.Dimension(748, 400));
        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gamePanel.add(lblComputer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 140, 70));

        btnRock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/myrock-removebg-preview.png"))); // NOI18N
        btnRock.setBorder(null);
        btnRock.setBorderPainted(false);
        btnRock.setContentAreaFilled(false);
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });
        gamePanel.add(btnRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        btnPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/paper-removebg-preview.png"))); // NOI18N
        btnPaper.setBorder(null);
        btnPaper.setBorderPainted(false);
        btnPaper.setContentAreaFilled(false);
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });
        gamePanel.add(btnPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        btnScissors.setIcon(new javax.swing.ImageIcon("C:\\RockPaperScissorsImg\\scissors-removebg-preview.png")); // NOI18N
        btnScissors.setBorder(null);
        btnScissors.setBorderPainted(false);
        btnScissors.setContentAreaFilled(false);
        btnScissors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScissorsActionPerformed(evt);
            }
        });
        gamePanel.add(btnScissors, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\OneDrive\\Documents\\BACK-removebg-preview.png")); // NOI18N
        backBtn.setBorder(null);
        backBtn.setContentAreaFilled(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        gamePanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblResult.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 255, 255));
        lblResult.setText("RESULT: ");
        gamePanel.add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, -1));

        lblPlayerTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPlayerTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerTitle.setText("YOU");
        gamePanel.add(lblPlayerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        lblPlayerScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPlayerScore.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerScore.setText("PLAYER:");
        gamePanel.add(lblPlayerScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 130, -1));

        lblComputerScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblComputerScore.setForeground(new java.awt.Color(255, 255, 255));
        lblComputerScore.setText("COMPUTER:");
        gamePanel.add(lblComputerScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 170, -1));

        lblDraw.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDraw.setForeground(new java.awt.Color(255, 255, 255));
        lblDraw.setText("DRAW:");
        gamePanel.add(lblDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 110, -1));

        lblComputerTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblComputerTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblComputerTitle.setText("COMPUTER");
        gamePanel.add(lblComputerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        bgGamePanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        gamePanel.add(bgGamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 748, 400));

        getContentPane().add(gamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        

    private void btnScissorsActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        generateComputer();
        resetColors();
        btnRock.setBackground(Color.gray);
        player = 3;
        checkResult();
    }                                           

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        generateComputer();
        resetColors();
        btnRock.setBackground(Color.gray);
        player = 2;
        checkResult();
    }                                        

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        generateComputer();
        resetColors();
        btnRock.setBackground(Color.gray);
        player = 1;
        checkResult();
    }                                       

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        FrmStartPage startPage = new FrmStartPage();
        startPage.setVisible(true);
        this.dispose();
        bgmGame.stop();
    }                                       

    void generateComputer() {
        computer = (int) (Math.random() * 3 + 1);
        if (computer == 1) {
            lblComputer.setIcon(new ImageIcon("C:/RockPaperScissorsImg/myrock-removebg-preview.png"));
        } else if (computer == 2) {
            lblComputer.setIcon(new ImageIcon("C:/RockPaperScissorsImg/paper-removebg-preview.png"));
        } else {
            lblComputer.setIcon(new ImageIcon("C:/RockPaperScissorsImg/scissors-removebg-preview.png"));
        }
    }

    void resetColors() {
        btnRock.setBackground(Color.gray);
        btnPaper.setBackground(Color.gray);
        btnScissors.setBackground(Color.gray);
    }

    void checkResult() {
        if (computer == player) {
            lblResult.setText("Result: Draw");
            draw++;
        }

        if (player == 1 && computer == 2) {
            lblResult.setText("Result: You Lose!");
            computer_score++;
            isLose();

        } else if (player == 2 && computer == 3) {
            lblResult.setText("Result: You Lose!");
            computer_score++;
            isLose();
        } else if (player == 3 && computer == 1) {
            lblResult.setText("Result: You Lose!");
            computer_score++;
            isLose();
        } else if (player == 1 && computer == 3) {
            lblResult.setText("Result: You Win!");
            player_score++;
            isWin();
        } else if (player == 2 && computer == 1) {
            lblResult.setText("Result: You Win!");
            player_score++;
            isWin();
        } else if (player == 3 && computer == 2) {
            lblResult.setText("Result: You Win!");
            player_score++;
            isWin();
        }
        lblComputerScore.setText("Computer: " + Integer.toString(computer_score));
        lblPlayerScore.setText("Player: " + Integer.toString(player_score));
        lblDraw.setText("Draw: " + Integer.toString(draw));
    }

    void isWin() {
        win.setFramePosition(0);
        win.start();
        System.out.println("tugotg ni win");
    }

    void isLose() {
        lose.setFramePosition(0);
        lose.start();
        System.out.println("tugtog ni lose");
    }

    void loadSound(String filepath) {
        try {

            File bgmFile = new File("C:/RockPaperScissorsImg/bgmGamePage.wav");
            AudioInputStream bgmStream = AudioSystem.getAudioInputStream(bgmFile);
            bgmGame = AudioSystem.getClip();
            bgmGame.open(bgmStream);
            
            File winFile = new File("C:/RockPaperScissorsImg/win.wav");
            AudioInputStream winStream = AudioSystem.getAudioInputStream(winFile);
            win = AudioSystem.getClip();
            win.open(winStream);

            File loseFile = new File("C:/RockPaperScissorsImg/lose.wav");
            AudioInputStream startStream = AudioSystem.getAudioInputStream(loseFile);
            lose = AudioSystem.getClip();
            lose.open(startStream);

            FloatControl winLouder = (FloatControl) win.getControl(FloatControl.Type.MASTER_GAIN);
            winLouder.setValue(-5.0f);
            FloatControl loseLouder = (FloatControl) lose.getControl(FloatControl.Type.MASTER_GAIN);
            loseLouder.setValue(-5.0f);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    void loop() {
        if (bgmGame != null) {
            bgmGame.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

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

    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bgGamePanel;
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnScissors;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel lblComputer;
    private javax.swing.JLabel lblComputerScore;
    private javax.swing.JLabel lblComputerTitle;
    private javax.swing.JLabel lblDraw;
    private javax.swing.JLabel lblPlayerScore;
    private javax.swing.JLabel lblPlayerTitle;
    private javax.swing.JLabel lblResult;
    // End of variables declaration                   
}

