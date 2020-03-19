/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Restaurant currentRestaurant;
    private WorkRequest workRequest;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account,DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.dB4OUtil = dB4OUtil;
        this.userAccount = account;
        
        this.currentRestaurant = null;
        this.workRequest = null;
        initialize();
        //valueLabel.setText(enterprise.getName());
        //populateRequestTable();
    }
    
//    public void populateRequestTable(){
//        
//    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCartDirectory = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        comboxResturant = new javax.swing.JComboBox();
        btnSubmitCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItemsDirectory = new javax.swing.JTable();
        btnTrackOrders = new javax.swing.JButton();

        tblCartDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCartDirectory);
        if (tblCartDirectory.getColumnModel().getColumnCount() > 0) {
            tblCartDirectory.getColumnModel().getColumn(0).setResizable(false);
            tblCartDirectory.getColumnModel().getColumn(1).setResizable(false);
            tblCartDirectory.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        comboxResturant.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboxResturant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxResturantActionPerformed(evt);
            }
        });

        btnSubmitCart.setText("Submit Cart");
        btnSubmitCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitCartActionPerformed(evt);
            }
        });

        tblItemsDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "Add to Cart"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblItemsDirectory);
        if (tblItemsDirectory.getColumnModel().getColumnCount() > 0) {
            tblItemsDirectory.getColumnModel().getColumn(0).setResizable(false);
            tblItemsDirectory.getColumnModel().getColumn(1).setResizable(false);
            tblItemsDirectory.getColumnModel().getColumn(2).setResizable(false);
        }

        btnTrackOrders.setText("TrackOrders");
        btnTrackOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmitCart))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(comboxResturant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrackOrders))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAddToCart))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmitCart)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboxResturant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrackOrders))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddToCart))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)tblItemsDirectory.getModel();
        //Map<Item,Integer> m = new HashMap<Item, Integer>();
        for(int row = 0;row < dtm.getRowCount();row++) {
            if(dtm.getValueAt(row,2).equals(true)){
                this.workRequest.addToCart((Item)dtm.getValueAt(row,0), 1);
                //m.put((Item)dtm.getValueAt(row,0), 1);
                dtm.setValueAt(false, row, 2);
            }
        }
        populateCart();

//        WorkRequest w= new WorkRequest();
//        w.setSender(userAccount);
//        w.setReceiver(currentRestaurant);
//        ecoSystem.getWorkQueue().getWorkRequestList().add(w);
//        dB4OUtil.storeSystem(ecoSystem);
//        JOptionPane.showMessageDialog(null, "Cart submitted successfully to "+ currentRestaurant);
        //w.setMessage(TOOL_TIP_TEXT_KEY);
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnSubmitCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitCartActionPerformed
        // TODO add your handling code here:
        if(this.workRequest.getCart().size()<=0){
            JOptionPane.showMessageDialog(null, "Cart is empty.. please add items to submit!");
            return;
        }
        String message = JOptionPane.showInputDialog("Any extra comments on this order?");
        //JOptionPane.o
        if ((message != null)) {
            this.workRequest.setSender(userAccount);
            this.workRequest.setReceiver(currentRestaurant);
            this.workRequest.setStatus("Requested");
            this.workRequest.setMessage(message);
            this.workRequest.setRequestDate(new Date());
            ecoSystem.getWorkQueue().getWorkRequestList().add(this.workRequest);
            dB4OUtil.storeSystem(ecoSystem);
            double totalAmount = 0;
            for(Map.Entry<Item,Integer> em : this.workRequest.getCart().entrySet()){
                totalAmount = totalAmount + em.getValue()*em.getKey().getPrice();
            }
            this.workRequest = new WorkRequest();
            JOptionPane.showMessageDialog(null, "You pay $"+totalAmount+". Your Cart has been submitted successfully to "+ currentRestaurant);
            populateCart();
            return;
        }
        else{
            this.workRequest = new WorkRequest();
            JOptionPane.showMessageDialog(null, "Request cancelled!");
            populateCart();
            return;
        }

        //this.workRequest.se
    }//GEN-LAST:event_btnSubmitCartActionPerformed

    private void comboxResturantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxResturantActionPerformed
        // TODO add your handling code here:
        this.currentRestaurant = (Restaurant)comboxResturant.getSelectedItem();
        populate(this.currentRestaurant);
        
    }//GEN-LAST:event_comboxResturantActionPerformed

    private void btnTrackOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackOrdersActionPerformed
        // TODO add your handling code here:
        JPanel trackOrderJPanel = new TrackOrderJPanel(userProcessContainer,dB4OUtil,userAccount);
        userProcessContainer.add("trackOrder",trackOrderJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnTrackOrdersActionPerformed

    public void initialize(){
        this.ecoSystem = dB4OUtil.retrieveSystem("");
        comboxResturant.removeAllItems();
        for(Restaurant r: this.ecoSystem.getRestaurantDirectory().getRestaurants()){
            comboxResturant.addItem(r);
        }
    }
    public void populate(Restaurant restaurant){
        this.workRequest = new WorkRequest();
        DefaultTableModel dtm = (DefaultTableModel)tblItemsDirectory.getModel();
        dtm.setRowCount(0);
        Menu menu =null;
        if(restaurant!=null){
            menu = restaurant.getMenu();
            //this.ecoSystem = dB4OUtil.retrieveSystem("manage menu");
            for(Item i:menu.getItems()){
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]=i;
                row[1]=i.getPrice();
                row[2]=false;
                dtm.addRow(row);
            }
        }
    }
    public void populateCart(){
        DefaultTableModel dtm = (DefaultTableModel)tblCartDirectory.getModel();
        dtm.setRowCount(0);
        for(Map.Entry<Item,Integer> em:this.workRequest.getCart().entrySet()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] =em.getKey();
            row[1] =em.getValue();
            row[2]= em.getKey().getPrice()*em.getValue();
            //System.out.println(em);
            dtm.addRow(row);
        }  
            //this.ecoSystem = dB4OUtil.retrieveSystem("manage menu");
//            for(Item i:menu.getItems()){
//                Object[] row = new Object[dtm.getColumnCount()];
//                row[0]=i;
//                row[1]=i.getPrice();
//                row[2]=false;
//                dtm.addRow(row);
//            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnSubmitCart;
    private javax.swing.JButton btnTrackOrders;
    private javax.swing.JComboBox comboxResturant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCartDirectory;
    private javax.swing.JTable tblItemsDirectory;
    // End of variables declaration//GEN-END:variables
}
