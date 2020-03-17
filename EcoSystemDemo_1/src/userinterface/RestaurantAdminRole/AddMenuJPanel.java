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

/**
 *
 * @author akhil
 */
public class AddMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddMenuJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Restaurant restaurant;
    private DB4OUtil dB4OUtil;
    public AddMenuJPanel(JPanel userProcessContainer,DB4OUtil dB4OUtil, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = dB4OUtil.retrieveSystem("addmenu");
        this.restaurant = restaurant;
        lblRestuarantName.setText(this.restaurant.getName());
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
        btnAddMenuItem = new javax.swing.JButton();
        txtItemPrice = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRestuarantName = new javax.swing.JLabel();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddMenuItem.setText("Create");
        btnAddMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMenuItemActionPerformed(evt);
            }
        });

        jLabel1.setText("Item Name");

        jLabel2.setText("Item Price");

        lblRestuarantName.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnAddMenuItem))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(113, 113, 113)
                        .addComponent(lblRestuarantName)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblRestuarantName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnAddMenuItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageMenuJPanel){
                ManageMenuJPanel mmjp =(ManageMenuJPanel) comp;
                mmjp.populate(restaurant);
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMenuItemActionPerformed
        // TODO add your handling code here:
        if(txtItemName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter item name!");
            return;
        }
        if(txtItemPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter item price!");
            return;
        }
        try {
           Double price = (Double)Double.parseDouble(txtItemPrice.getText()); 

            Menu menu = restaurant.getMenu();
            menu.addItemToMenu(txtItemName.getText(), price);
//            dB4OUtil.storeSystem(ecoSystem);
            for(Restaurant r : ecoSystem.getRestaurantDirectory().getRestaurants()){
                if(r.getName().equals(restaurant.getName())){
                    r.setMenu(menu);
                   // Menu menu = restaurant.getMenu();
                    //menu.addItemToMenu(txtItemName.getText(), price);
                    break;
                }

            }
            for(Restaurant r : ecoSystem.getRestaurantDirectory().getRestaurants()){
                for(Map.Entry<String,Double> me : r.getMenu().getMenuitem().entrySet()){
                    System.out.println(me.getKey());
                }
            }
            dB4OUtil.storeSystem(ecoSystem);
            JOptionPane.showMessageDialog(null,"Added item to menu for resturant "+restaurant.getName()+" successfully!");
            txtItemName.setText("");
            txtItemPrice.setText("");
            return;
            //business.getRestaurantDirectory().
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Enter item price in number!");
            return;
        }

    }//GEN-LAST:event_btnAddMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMenuItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRestuarantName;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}
