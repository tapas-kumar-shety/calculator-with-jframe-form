/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

/**
 *
 * @author ktapa
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    public calculator() {
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

        jtxtResult = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 60));

        jbtnCE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, 70));

        jbtnBS.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        jbtnBS.setText("←");
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 70));

        jbtnPM.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 70, 70));

        jbtnC.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 70, 70));

        jbtn8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 70, 70));

        jbtn7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 70));

        jbtnPlus.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnPlus.setText("+");
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 70, 70));

        jbtn9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn9.setText("9");
        getContentPane().add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 70, 70));

        jbtn6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn6.setText("6");
        getContentPane().add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 70, 70));

        jbtnMinus.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnMinus.setText("-");
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 70, 70));

        jbtn5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn5.setText("5");
        getContentPane().add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 70, 70));

        jbtn4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn4.setText("4");
        getContentPane().add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, 70));

        jbtn2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn2.setText("2");
        getContentPane().add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 70, 70));

        jbtn1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn1.setText("1");
        getContentPane().add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 70, 70));

        jbtnMultiply.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnMultiply.setText("*");
        jbtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMultiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 70, 70));

        jbtn3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn3.setText("3");
        getContentPane().add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 70, 70));

        jbtnDot.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.setAlignmentY(0.0F);
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 70, 70));

        jbtn0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtn0.setText("0");
        getContentPane().add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 70, 70));

        jbtnDivide.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnDivide.setText("/");
        getContentPane().add(jbtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 70, 70));

        jbtnEquals.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnEquals.setText("=");
        getContentPane().add(jbtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void  EnterNumbers( String q){
       
      String nums = jtxtResult.getText() + q ;
  }
    
    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
