package option.calculator;

import org.apache.commons.math3.distribution.NormalDistribution;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author timyouell
 */
public class OptionCalc extends javax.swing.JFrame {

    /**
     * Creates new form OptionCalc
     */
    public OptionCalc() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CallButton = new javax.swing.JRadioButton();
        PutButton = new javax.swing.JRadioButton();
        Share = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Exercise = new javax.swing.JTextField();
        Time = new javax.swing.JTextField();
        Volatility = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Calculate = new javax.swing.JButton();
        Solution = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Interest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Dividend = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Option Pricing Calculator");
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);

        buttonGroup1.add(CallButton);
        CallButton.setText("Call");
        CallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CallButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(PutButton);
        PutButton.setText("Put");
        PutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PutButtonActionPerformed(evt);
            }
        });

        Share.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShareActionPerformed(evt);
            }
        });

        jLabel2.setText("Volatility (%):");

        Exercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExerciseActionPerformed(evt);
            }
        });

        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });

        Volatility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolatilityActionPerformed(evt);
            }
        });

        jLabel4.setText("Share price:");

        jLabel5.setText("Exercise price:");

        jLabel6.setText("Time to expiration (days):");

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Solution.setEditable(false);
        Solution.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Solution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolutionActionPerformed(evt);
            }
        });

        jLabel1.setText("Option price:");

        Interest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestActionPerformed(evt);
            }
        });

        jLabel7.setText("Interest (%):");

        Dividend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividendActionPerformed(evt);
            }
        });

        jLabel9.setText("Dividend Annual Yield (%):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(CallButton)
                        .addGap(26, 26, 26)
                        .addComponent(PutButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Dividend, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Share, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(Exercise)
                                    .addComponent(Time, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Volatility, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Solution, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Interest, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Calculate)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CallButton)
                    .addComponent(PutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Share, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exercise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volatility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Interest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dividend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Solution, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CallButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CallButtonActionPerformed

    private void ShareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShareActionPerformed

    private void ExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExerciseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExerciseActionPerformed

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeActionPerformed

    private void VolatilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolatilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolatilityActionPerformed

    private void SolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SolutionActionPerformed

    private void PutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PutButtonActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        if ((Volatility.getText().equals("")) || 
                (Share.getText().equals("")) || 
                (Exercise.getText().equals("")) || 
                (Time.getText().equals("")) ||
                (Interest.getText().equals("")) ||
                (Dividend.getText().equals("")));
        {
            Solution.setText("Missing values");
        }
        
        if (CallButton.isSelected() == false & PutButton.isSelected() == false) 
        {
            Solution.setText("Select option type");
        }
        
        else if (CallButton.isSelected())
        {
            // get the text from each input and parse as a double.
            double share = Double.parseDouble(Share.getText());
            double exercise = Double.parseDouble(Exercise.getText());
            double days = Double.parseDouble(Time.getText());
            double interest_percentage = Double.parseDouble(Interest.getText());
            double volatility_percentage = Double.parseDouble(Volatility.getText());
            double dividend_percentage = Double.parseDouble(Dividend.getText());
            // change the inputs of days to years.
            double time = days/365;
            // change inputs of dividend, volatility and interest to decimals 
            // rather than percentages.
            double dividend = dividend_percentage/100;
            double volatility = volatility_percentage/100;
            double interest = interest_percentage/100;
            // define rate as ln(1+interest).
            double rate = java.lang.Math.log(1 + interest);
            // create variables that are easier to manage in the d1 and d2 
            // equations.
            double init = (1/((volatility)*(java.lang.Math.sqrt(time))));
            double share_ex = share/exercise;
            double log_share_ex = java.lang.Math.log(share_ex);
            double vol_sqrd = java.lang.Math.pow((volatility), 2);
            // define d1 and d2.
            double d1;
            double d2;
            d1 = init * (log_share_ex+(((rate-dividend)+((vol_sqrd)/2)))*(time));
            d2 = d1 - (volatility*java.lang.Math.sqrt(time));
            // define N(d1) and N(d2)
            NormalDistribution normal = new NormalDistribution(0,1);
            double nd1 = normal.cumulativeProbability(d1);
            double nd2 = normal.cumulativeProbability(d2);
            // define the final European call option pricing formula gathering
            // all the inputs and what has been calculated so far.
            double call;
            call = (java.lang.Math.exp(-dividend*time)*(share*nd1))-(exercise*(java.lang.Math.exp((-rate*time)))*nd2);
            // set the returned value to print in decimal format.
            String value = String.format("%,2f", call);
            Solution.setText(value);
        }
        
        else if (PutButton.isSelected())
        {
            // get the text from each input and parse as a double.
            double share = Double.parseDouble(Share.getText());
            double exercise = Double.parseDouble(Exercise.getText());
            double days = Double.parseDouble(Time.getText());
            double interest_percentage = Double.parseDouble(Interest.getText());
            double volatility_percentage = Double.parseDouble(Volatility.getText());
            double dividend_percentage = Double.parseDouble(Dividend.getText());
            // change the inputs of days to years.
            double time = days/365;
            // change inputs of dividend, volatility and interest to decimals 
            // rather than percentages.
            double dividend = dividend_percentage/100;
            double volatility = volatility_percentage/100;
            double interest = interest_percentage/100;
            // define rate as ln(1+interest).
            double rate = java.lang.Math.log(1 + interest);
            // create variables that are easier to manage in the d1 and d2 
            // equations.
            double init = (1/((volatility)*(java.lang.Math.sqrt(time))));
            double share_ex = share/exercise;
            double log_share_ex = java.lang.Math.log(share_ex);
            double vol_sqrd = java.lang.Math.pow((volatility), 2);
            // define d1 and d2.
            double d1;
            double d2;
            d1 = init * (log_share_ex+(((rate-dividend)+((vol_sqrd)/2)))*(time));
            d2 = d1 - (volatility*java.lang.Math.sqrt(time));
            // define N(d1) and N(d2)
            NormalDistribution normal = new NormalDistribution(0,1);
            double nd1 = normal.cumulativeProbability(-d1);
            double nd2 = normal.cumulativeProbability(-d2);
            // define the final European put option pricing formula gathering
            // all the inputs and what has been calculated so far.
            double put;
            put = (exercise*(java.lang.Math.exp((-rate*time)))*nd2)-(share*(java.lang.Math.exp((-dividend*time)))*nd1);
            // set the returned value to print in decimal format.
            String value = String.format("%,2f", put);
            Solution.setText(value);
        }
        
    }//GEN-LAST:event_CalculateActionPerformed

    private void InterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InterestActionPerformed

    private void DividendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DividendActionPerformed

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
            java.util.logging.Logger.getLogger(OptionCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JRadioButton CallButton;
    private javax.swing.JTextField Dividend;
    private javax.swing.JTextField Exercise;
    private javax.swing.JTextField Interest;
    private javax.swing.JRadioButton PutButton;
    private javax.swing.JTextField Share;
    private javax.swing.JTextField Solution;
    private javax.swing.JTextField Time;
    private javax.swing.JTextField Volatility;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
