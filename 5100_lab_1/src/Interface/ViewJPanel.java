/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;

public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    private Product product;
    
    public ViewJPanel(Product product) {
        initComponents();
        displayProduct(product);
    }

    private void displayProduct(Product product){
        String productName = product.getName();
        nameTextField.setText(productName);
        
        String productPrice = product.getPrice();
        priceTextField.setText(productPrice);
        
        String productAvailNum = product.getAvailNum();
        availNumberTextField.setText(productAvailNum);
        
        String productDescription = product.getDescription();
        descTextField.setText(productDescription);
        
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
        nameTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        availNumberTextField = new javax.swing.JTextField();
        descTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(436, 301));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setText("View Your Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel3.setText("Price : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel4.setText("Availability Number :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel5.setText("Description :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        nameTextField.setEditable(false);
        nameTextField.setFont(new java.awt.Font("Comfortaa", 1, 12)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 140, -1));

        priceTextField.setEditable(false);
        priceTextField.setFont(new java.awt.Font("Comfortaa", 1, 12)); // NOI18N
        add(priceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 140, -1));

        availNumberTextField.setEditable(false);
        availNumberTextField.setFont(new java.awt.Font("Comfortaa", 1, 12)); // NOI18N
        availNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availNumberTextFieldActionPerformed(evt);
            }
        });
        add(availNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 140, -1));

        descTextField.setEditable(false);
        descTextField.setFont(new java.awt.Font("Comfortaa", 1, 12)); // NOI18N
        add(descTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void availNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availNumberTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availNumberTextField;
    private javax.swing.JTextField descTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
