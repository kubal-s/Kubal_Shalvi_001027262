/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.SupplierDirectory;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author AEDSpring2019
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    List<User> list;
    JPanel panelRight;
    String role;
    public LoginScreen(JPanel panelRight, List<User> list,String role) {
        initComponents();
        this.list = list;
        this.panelRight = panelRight;
        this.role = role;
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

        btnSubmit = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<Object>();
        txtTitle = new javax.swing.JLabel();
        txtPword = new javax.swing.JPasswordField();

        btnSubmit.setText("Login");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        comboUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTitle.setText("Supplier Login Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboUser, 0, 166, Short.MAX_VALUE)
                            .addComponent(txtTitle)
                            .addComponent(txtPword))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitle)
                .addGap(18, 18, 18)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnSubmit)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        User user = (User) comboUser.getSelectedItem();
        String password = txtPword.getText();
        boolean isWrongPwd = true;
        if (txtPword.getText().trim().isEmpty()){
            txtPword.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null,"Please enter password!");
            return;
        }
        //traverse over user
        for(User u : list){
            System.out.println(u.getPassword());
            System.out.println(u.getUserName());
            System.out.println(user.getUserName());
            System.out.println(password);
            if(u.getUserName().equals(user.getUserName())&&u.verify(password)){
                isWrongPwd = false;
                txtPword.setBorder(new LineBorder(Color.LIGHT_GRAY));
                CardLayout layout = (CardLayout)panelRight.getLayout();
                panelRight.add(new SuccessScreen(user));
                layout.next(panelRight);
            }
        }
        if(isWrongPwd){
            txtPword.setBorder(new LineBorder(Color.red));
            JOptionPane.showMessageDialog(null,"Wrong password entered!");
            return;
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    
    private void initialize(){
        String roleText;
        roleText = (role).substring(0, 1) + (role).substring(1).toLowerCase();
        txtTitle.setText(roleText+" Login Screen");
        comboUser.removeAllItems();
        for(User u : list){
            comboUser.addItem(u);
        }
        //only customer or suppliers should be listed based on the selection
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Object> comboUser;
    private javax.swing.JPasswordField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
