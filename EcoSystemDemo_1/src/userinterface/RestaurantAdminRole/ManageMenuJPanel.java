/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhil
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenuJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Restaurant restaurant;
    private DB4OUtil dB4OUtil;
    public ManageMenuJPanel(JPanel userProcessContainer,DB4OUtil dB4OUtil, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.dB4OUtil = dB4OUtil;
        
        this.restaurant = restaurant;
        lblRestuarantName.setText(restaurant.getName());
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        btnAddItemToMenu = new javax.swing.JButton();
        btnDeleteMenuItem = new javax.swing.JButton();
        btnUpdateMenuItem = new javax.swing.JButton();
        lblRestuarantName = new javax.swing.JLabel();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "name ", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        btnAddItemToMenu.setText("Add");
        btnAddItemToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemToMenuActionPerformed(evt);
            }
        });

        btnDeleteMenuItem.setText("Delete");
        btnDeleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMenuItemActionPerformed(evt);
            }
        });

        btnUpdateMenuItem.setText("Update");
        btnUpdateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMenuItemActionPerformed(evt);
            }
        });

        lblRestuarantName.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack)
                        .addGap(77, 77, 77)
                        .addComponent(lblRestuarantName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddItemToMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeleteMenuItem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdateMenuItem, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblRestuarantName))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddItemToMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteMenuItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateMenuItem)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMenuItemActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String itemName = (String)tblDirectory.getValueAt(selectedRow, 0);
                for(Restaurant r:this.ecoSystem.getRestaurantDirectory().getRestaurants()){
                    if(r.getName().equals(restaurant.getName())){
                        System.out.println("delted item");
                        r.getMenu().deleteMenuItem(itemName);
                        break;
                    }
                }                
                dB4OUtil.storeSystem(ecoSystem);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteMenuItemActionPerformed

    private void btnAddItemToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemToMenuActionPerformed
        // TODO add your handling code here:
        JPanel addMenuJPanel = new AddMenuJPanel(userProcessContainer,dB4OUtil,restaurant);
        userProcessContainer.add("addItemToMenu",addMenuJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnAddItemToMenuActionPerformed

    private void btnUpdateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMenuItemActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            String itemName = (String)tblDirectory.getValueAt(selectedRow, 0);
            JPanel updateMenuJPanel = new UpdateMenuJPanel(userProcessContainer,dB4OUtil,restaurant,itemName);
            userProcessContainer.add("updateMenuItem",updateMenuJPanel);
            CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
            cardLayout.next(this.userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_btnUpdateMenuItemActionPerformed

    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        Restaurant currentResturant = null;
        this.ecoSystem = dB4OUtil.retrieveSystem("manage menu");        
        for(Restaurant r:this.ecoSystem.getRestaurantDirectory().getRestaurants()){
            if(r.getName().equals(restaurant.getName())){
                currentResturant = r;
                break;
            }
        } 
        
        for(Map.Entry<String,Double> em: currentResturant.getMenu().getMenuitem().entrySet()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=em.getKey();
            row[1]=em.getValue();
            dtm.addRow(row);
        }
    }
    public void populate(Restaurant r){
        this.restaurant = r;
        lblRestuarantName.setText(restaurant.getName());
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        this.ecoSystem = dB4OUtil.retrieveSystem("manage menu");
        for(Map.Entry<String,Double> em: restaurant.getMenu().getMenuitem().entrySet()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=em.getKey();
            row[1]=em.getValue();
            dtm.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItemToMenu;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteMenuItem;
    private javax.swing.JButton btnUpdateMenuItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRestuarantName;
    private javax.swing.JTable tblDirectory;
    // End of variables declaration//GEN-END:variables
}
