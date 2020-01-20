/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javax.swing.JTextField;


public class SavingAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SavingAccountJPanel
     */
    public SavingAccountJPanel() {
        initComponents();
    }

    public JTextField getAccountBalanceTxtField() {
        return accountBalanceTxtField;
    }

    public void setAccountBalanceTxtField(JTextField accountBalanceTxtField) {
        this.accountBalanceTxtField = accountBalanceTxtField;
    }

    public JTextField getAccountNumberTxtField() {
        return accountNumberTxtField;
    }

    public void setAccountNumberTxtField(JTextField accountNumberTxtField) {
        this.accountNumberTxtField = accountNumberTxtField;
    }

    public JTextField getAccountTypeTxtField() {
        return accountTypeTxtField;
    }

    public void setAccountTypeTxtField(JTextField accountTypeTxtField) {
        this.accountTypeTxtField = accountTypeTxtField;
    }

    public JTextField getBankNameTxtField() {
        return bankNameTxtField;
    }

    public void setBankNameTxtField(JTextField bankNameTxtField) {
        this.bankNameTxtField = bankNameTxtField;
    }

    public JTextField getRoutingNumberTxtField() {
        return routingNumberTxtField;
    }

    public void setRoutingNumberTxtField(JTextField routingNumberTxtField) {
        this.routingNumberTxtField = routingNumberTxtField;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bankNameTxtField = new javax.swing.JTextField();
        routingNumberTxtField = new javax.swing.JTextField();
        accountNumberTxtField = new javax.swing.JTextField();
        accountTypeTxtField = new javax.swing.JTextField();
        accountBalanceTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(244, 241, 184));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("3.Saving Account Information");

        jLabel2.setText("Bank Name:");

        jLabel3.setText("Routing Number:");

        jLabel4.setText("Account Balance:");

        jLabel5.setText("Account Number:");

        jLabel6.setText("Account Type:");

        bankNameTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bankNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankNameTxtFieldActionPerformed(evt);
            }
        });

        routingNumberTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        routingNumberTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routingNumberTxtFieldActionPerformed(evt);
            }
        });

        accountNumberTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accountNumberTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountNumberTxtFieldActionPerformed(evt);
            }
        });

        accountTypeTxtField.setEditable(false);
        accountTypeTxtField.setText("Saving");
        accountTypeTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accountTypeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTypeTxtFieldActionPerformed(evt);
            }
        });

        accountBalanceTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        accountBalanceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountBalanceTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bankNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(routingNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)
                                .addComponent(accountTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(accountBalanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(bankNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(routingNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountBalanceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(accountTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bankNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankNameTxtFieldActionPerformed

    private void routingNumberTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routingNumberTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routingNumberTxtFieldActionPerformed

    private void accountBalanceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountBalanceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountBalanceTxtFieldActionPerformed

    private void accountNumberTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountNumberTxtFieldActionPerformed

    private void accountTypeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTypeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTypeTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountBalanceTxtField;
    private javax.swing.JTextField accountNumberTxtField;
    private javax.swing.JTextField accountTypeTxtField;
    private javax.swing.JTextField bankNameTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField routingNumberTxtField;
    // End of variables declaration//GEN-END:variables
}
