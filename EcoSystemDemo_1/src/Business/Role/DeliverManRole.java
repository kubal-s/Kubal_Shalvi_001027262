/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class DeliverManRole extends Role {

    public DeliverManRole() {
        this.roletype = RoleType.DeliveryMan;
    }

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, DB4OUtil dB4OUtil) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,dB4OUtil);//To change body of generated methods, choose Tools | Templates.
    }
    
}
