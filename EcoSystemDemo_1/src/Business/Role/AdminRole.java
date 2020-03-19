/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    public AdminRole() {
        this.roletype = RoleType.RestaurantAdmin;
    }

    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, DB4OUtil dB4OUtil) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, dB4OUtil);
    }

    
    
}
