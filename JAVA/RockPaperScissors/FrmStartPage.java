package com.mycompany.rockpaperscissors;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.SwingUtilities;


public class FrmStartPage extends javax.swing.JFrame {
    
    Clip bgm;
    Clip start;
    
    public FrmStartPage() {
        initComponents();
        // center sa pag run
      setLocationRelativeTo(null);
      loadSound("C:/RockPaperScissorsImg/bgm.wav"); // Load sound when form opens
    loop(); // Start looping sound
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        sound = new javax.swing.JToggleButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 347));

        jPanel1.setMaximumSize(new java.awt.Dimension(650, 347));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 347));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 347));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setIcon(new javax.swing.ImageIcon("C:\\RockPaperScissorsImg\\start-removebg-preview.png")); // NOI18N
        btnStart.setBorder(null);
        btnStart.setBorderPainted(false);
        btnStart.setContentAreaFilled(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 149, -1, -1));

        sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound-on.png"))); // NOI18N
        sound.setBorder(null);
        sound.setBorderPainted(false);
        sound.setContentAreaFilled(false);
        sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundActionPerformed(evt);
            }
        });
        jPanel1.add(sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\OneDrive\\Documents\\Rock Paper Scissor (1)-1.png")); // NOI18N
        background.setText("jLabel1");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 349));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

   
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        start.start();
            start.addLineListener(event -> {
            if (event.getType() == LineEvent.Type.STOP) {
               GamePage page = new GamePage();
               page.setVisible(true);
               this.dispose();
            }
        bgm.stop();
        });
       
        
    }                                        

    private void soundActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(sound.isSelected()){
            soundOff();
            sound.setIcon(new javax.swing.ImageIcon("C:\\RockPaperScissorsImg\\sound-off.png"));
        } else {
            soundOn();
            sound.setIcon(new javax.swing.ImageIcon("C:\\RockPaperScissorsImg\\sound-on.png"));
        }
    }                                     
   
    void loadSound(String filePath) {
          try {
            File soundFile = new File("C:/RockPaperScissorsImg/bgm.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            bgm = AudioSystem.getClip();
            bgm.open(audioStream);
            
            File startFile = new File("C:/RockPaperScissorsImg/start-[AudioTrimmer.com].wav");
            AudioInputStream startStream = AudioSystem.getAudioInputStream(startFile);
            
            start = AudioSystem.getClip();
            start.open(startStream);
               FloatControl gainControl = (FloatControl) start.getControl(FloatControl.Type.MASTER_GAIN);
               gainControl.setValue(6.0f);
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
   
   
    void soundOn (){
       if (bgm != null) {
            bgm.setFramePosition(0); // Rewind to start
            bgm.start();
        }
    }
    
    void soundOff(){
        if (bgm != null && bgm.isRunning()) {
            bgm.stop();
        }
    }
    

    public void loop() {
        if (bgm != null) {
            bgm.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }


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
            java.util.logging.Logger.getLogger(FrmStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel background;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton sound;
    // End of variables declaration                   
}
