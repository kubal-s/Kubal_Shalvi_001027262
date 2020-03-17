/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import Business.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnManageCustomers = new javax.swing.JButton();
        btnManageRestaurants = new javax.swing.JButton();
        btnManageDeliveryMan = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 177, -1));

        btnManageRestaurants.setText("Manage Restaurants");
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 87, 177, -1));

        btnManageDeliveryMan.setText("Manage Delivery Man");
        btnManageDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryManActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 134, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnManageDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryManActionPerformed
        // TODO add your handling code here:
        JPanel manageDeliveryMan = new ManageDeliveryMan(userProcessContainer,ecosystem);
        userProcessContainer.add("ManageDeliveryMan",manageDeliveryMan);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageDeliveryMan;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
