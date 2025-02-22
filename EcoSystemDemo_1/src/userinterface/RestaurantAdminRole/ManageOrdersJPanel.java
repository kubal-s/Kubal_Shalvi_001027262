/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
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
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Restaurant restaurant;
    private DB4OUtil dB4OUtil;
    public ManageOrdersJPanel(JPanel userProcessContainer,DB4OUtil dB4OUtil, Restaurant restaurant) {
        initComponents();     
        this.userProcessContainer = userProcessContainer;
        this.dB4OUtil = dB4OUtil;
        this.restaurant = restaurant;
        lblRestuarantName.setText(this.restaurant.getName());
        populate(restaurant);
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
        lblRestuarantName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        btnProcessRequest = new javax.swing.JButton();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblRestuarantName.setText("jLabel3");

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sender", "Requested Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProcessRequest)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblRestuarantName))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblRestuarantName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcessRequest)
                .addContainerGap(88, Short.MAX_VALUE))
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

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            WorkRequest wr = (WorkRequest)tblDirectory.getValueAt(selectedRow, 0);
            if(!wr.getStatus().equals("Requested")){
                JOptionPane.showMessageDialog(null, "Please select request that needs processing");
                return;
            }
            
            JPanel processRequestJPanel = new ProcessRequestJPanel(userProcessContainer,dB4OUtil,restaurant,wr);
            userProcessContainer.add("processRequest",processRequestJPanel);
            CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
            cardLayout.next(this.userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
            return;
        }
    }//GEN-LAST:event_btnProcessRequestActionPerformed
    
    public List<WorkRequest> fetchWorkRequests(Restaurant r){
        this.ecoSystem = dB4OUtil.retrieveSystem("");
        List<WorkRequest>  workRequest = new ArrayList<WorkRequest>();
        for(WorkRequest wr : ecoSystem.getWorkQueue().getWorkRequestList()){
            if(wr.getReceiver().equals(r)){
               workRequest.add(wr);
            }
        }
        return workRequest;
    }
    public void populate(Restaurant r){
        List<WorkRequest> workRequests = fetchWorkRequests(r);
        this.restaurant = r;
        lblRestuarantName.setText(restaurant.getName());
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        for(WorkRequest wr:workRequests){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=wr;
            row[1]=wr.getRequestDate();
            row[2]=wr.getStatus();
            dtm.addRow(row);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRestuarantName;
    private javax.swing.JTable tblDirectory;
    // End of variables declaration//GEN-END:variables
}
