/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import java.util.ArrayList;
import javax.swing.JLabel;


public class NextLevel extends javax.swing.JFrame {

    /**
     * Creates new form NextLevel
     */
    int number=0;
     static int temp=0;
    
    public NextLevel(int level)
    {
         setLocationRelativeTo(null);
        initComponents();
        number=level;
        number++;
        temp=level;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Next Level");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 200, 149, 33);

        jButton2.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Play Again");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 160, 150, 30);

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("The Brick Breaker");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 350, 68);

        jLabel2.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("You Won!!!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 90, 160, 30);

        jButton3.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(120, 240, 150, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brickbreaker/GameBackground.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[][] b=GenerateLevels.getLevel(number);
        LevelLayout ll=new LevelLayout(); 
        ll.UpdateLevel(b);
        ArrayList<GameObject> array=ll.getBricks();
        Board board=new Board(number);
        Application ac=new Application(board);
        ac.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int[][] b=GenerateLevels.getLevel(temp);
        LevelLayout ll=new LevelLayout(); 
        ll.UpdateLevel(b);
        ArrayList<GameObject> array=ll.getBricks();
        Board board=new Board(temp);
        Application ac=new Application(board);
        ac.show();
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NextLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NextLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NextLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NextLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NextLevel(temp).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}