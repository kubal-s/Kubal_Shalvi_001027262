/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhil
 */
public class ProcessRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Restaurant restaurant;
    private DB4OUtil dB4OUtil;
    private WorkRequest workRequest;
    private UserAccount deliveryMan;
    public ProcessRequestJPanel(JPanel userProcessContainer,DB4OUtil dB4OUtil, Restaurant restaurant,WorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = dB4OUtil.retrieveSystem("");
        this.restaurant = restaurant;
        this.dB4OUtil= dB4OUtil;
        this.workRequest = workRequest;
        this.deliveryMan =null;
        initialize();
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
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSender = new javax.swing.JLabel();
        lblRequestedDate = new javax.swing.JLabel();
        lblExtraComments = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDirectory = new javax.swing.JTable();
        lblTotalAmount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboxDeliveryMan = new javax.swing.JComboBox();
        btnAcceptOrder = new javax.swing.JButton();
        btnDeclineOrder = new javax.swing.JButton();

        jLabel1.setText("Sender:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Requested Date:");

        jLabel3.setText("Extra Comments:");

        jLabel4.setText("status:");

        lblSender.setText("sender");

        lblRequestedDate.setText("requested date");

        lblExtraComments.setText("extra comments");

        lblStatus.setText("status");

        tblOrderDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderDirectory);

        lblTotalAmount.setText("total amount");

        jLabel5.setText("Total Paid : ");

        jLabel6.setText("Choose Delivery Man : ");

        comboxDeliveryMan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboxDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxDeliveryManActionPerformed(evt);
            }
        });

        btnAcceptOrder.setText("Accept Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        btnDeclineOrder.setText("Decline Order");
        btnDeclineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineOrderActionPerformed(evt);
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
                        .addComponent(btnBack)
                        .addGap(396, 396, 396))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnDeclineOrder)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(2, 2, 2)
                            .addComponent(lblTotalAmount))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSender)
                                    .addComponent(lblRequestedDate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblStatus)
                                            .addComponent(lblExtraComments)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboxDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAcceptOrder))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblRequestedDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblExtraComments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTotalAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboxDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcceptOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeclineOrder)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:      
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageOrdersJPanel){
                ManageOrdersJPanel mojp =(ManageOrdersJPanel) comp;
                mojp.populate(restaurant);
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        List<UserAccount> deliveryMans = fetchDeliveryMans();
        if(this.deliveryMan == null){
            JOptionPane.showMessageDialog(null, "Currently there are no delivery man available!");
            return;
        }
        for(WorkRequest wr:this.ecoSystem.getWorkQueue().getWorkRequestList()){
            if(wr.equals(this.workRequest)){
                wr.setStatus("Out for delivery");
                this.workRequest = wr;
                break;
            }
        }
        for(UserAccount ua:deliveryMans){
            if(ua.equals(this.deliveryMan)){
                this.deliveryMan.getWorkQueue().addWorkRequest(workRequest);
                break;
            }
        }
        dB4OUtil.storeSystem(ecoSystem);
        initialize();
        btnAcceptOrder.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Order placed for pick up!");
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void comboxDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxDeliveryManActionPerformed
        // TODO add your handling code here:
        this.deliveryMan = (UserAccount)comboxDeliveryMan.getSelectedItem();
        //this.workRequest.setDeliveryMan((UserAccount)comboxDeliveryMan.getSelectedItem());
    }//GEN-LAST:event_comboxDeliveryManActionPerformed

    private void btnDeclineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineOrderActionPerformed
        // TODO add your handling code here:
        for(WorkRequest wr:this.ecoSystem.getWorkQueue().getWorkRequestList()){
            if(wr.equals(this.workRequest)){
                wr.setStatus("Order request declined!");
                this.workRequest = wr;
                break;
            }
        }
        dB4OUtil.storeSystem(ecoSystem);
        initialize();
        btnAcceptOrder.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Order request is declined!");
    }//GEN-LAST:event_btnDeclineOrderActionPerformed
    public void initialize(){
        lblSender.setText(workRequest.getSender().getUsername());
        lblRequestedDate.setText(workRequest.getRequestDate().toString());
        lblStatus.setText(workRequest.getStatus());
        lblExtraComments.setText(workRequest.getMessage());
        
        comboxDeliveryMan.removeAllItems();
        List<UserAccount> deliveryMans = fetchDeliveryMans();
        for(UserAccount ua: deliveryMans){
            comboxDeliveryMan.addItem(ua);
        }
        populate();
    }
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblOrderDirectory.getModel();
        dtm.setRowCount(0);
        double total = 0;
        for(Map.Entry<Item,Integer> em:this.workRequest.getCart().entrySet()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] =em.getKey();
            row[1] =em.getValue();
            row[2] =em.getKey().getPrice();
            row[3]= em.getKey().getPrice()*em.getValue();
            total = total + em.getKey().getPrice()*em.getValue();
            dtm.addRow(row);
        }  
        lblTotalAmount.setText(String.valueOf(total));
    }
    private List<UserAccount> fetchDeliveryMans() {
        ecoSystem = dB4OUtil.retrieveSystem("fetchdeliveryman");
        //To change body of generated methods, choose Tools | Templates.
        List<UserAccount> userAccounts = ecoSystem.getUserAccountDirectory().getUserAccountList();
        List<UserAccount> deliveryMans = new ArrayList<UserAccount>();
        
        for(UserAccount userAccount : userAccounts){
            if(userAccount.getRole().getRoleType() == Role.RoleType.DeliveryMan){
                deliveryMans.add(userAccount);
                //System.out.println(userAccount.getUsername());
            }
        }
        
        return deliveryMans;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeclineOrder;
    private javax.swing.JComboBox comboxDeliveryMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExtraComments;
    private javax.swing.JLabel lblRequestedDate;
    private javax.swing.JLabel lblSender;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JTable tblOrderDirectory;
    // End of variables declaration//GEN-END:variables
}
