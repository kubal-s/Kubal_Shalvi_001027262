/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import javax.swing.JTextField;


public class MedicalRecordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicalRecordJPanel
     */
    public MedicalRecordJPanel() {
        initComponents();
    }

    public JTextField getAlergy1TxtField() {
        return alergy1TxtField;
    }

    public void setAlergy1TxtField(JTextField alergy1TxtField) {
        this.alergy1TxtField = alergy1TxtField;
    }

    public JTextField getAlergy2TxtField() {
        return alergy2TxtField;
    }

    public void setAlergy2TxtField(JTextField alergy2TxtField) {
        this.alergy2TxtField = alergy2TxtField;
    }

    public JTextField getAlergy3TxtField() {
        return alergy3TxtField;
    }

    public void setAlergy3TxtField(JTextField alergy3TxtField) {
        this.alergy3TxtField = alergy3TxtField;
    }

    public JTextField getMedicalRecordNumberTxtField() {
        return medicalRecordNumberTxtField;
    }

    public void setMedicalRecordNumberTxtField(JTextField medicalRecordNumberTxtField) {
        this.medicalRecordNumberTxtField = medicalRecordNumberTxtField;
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
        medicalRecordNumberTxtField = new javax.swing.JTextField();
        alergy1TxtField = new javax.swing.JTextField();
        alergy2TxtField = new javax.swing.JTextField();
        alergy3TxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(244, 241, 184));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("6.Medical Information");

        jLabel2.setText("Medical Record Number:");

        jLabel3.setText("Alergy 1:");
        jLabel3.setPreferredSize(new java.awt.Dimension(153, 16));

        jLabel4.setText("Alergy 2:");
        jLabel4.setPreferredSize(new java.awt.Dimension(153, 16));

        jLabel5.setText("Alergy3:");

        medicalRecordNumberTxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        medicalRecordNumberTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalRecordNumberTxtFieldActionPerformed(evt);
            }
        });

        alergy1TxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        alergy1TxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy1TxtFieldActionPerformed(evt);
            }
        });

        alergy2TxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        alergy2TxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy2TxtFieldActionPerformed(evt);
            }
        });

        alergy3TxtField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        alergy3TxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy3TxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alergy1TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicalRecordNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alergy2TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alergy3TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(medicalRecordNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alergy2TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alergy1TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(alergy3TxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicalRecordNumberTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalRecordNumberTxtFieldActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_medicalRecordNumberTxtFieldActionPerformed

    private void alergy1TxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy1TxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy1TxtFieldActionPerformed

    private void alergy2TxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy2TxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy2TxtFieldActionPerformed

    private void alergy3TxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy3TxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy3TxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alergy1TxtField;
    private javax.swing.JTextField alergy2TxtField;
    private javax.swing.JTextField alergy3TxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField medicalRecordNumberTxtField;
    // End of variables declaration//GEN-END:variables
}
