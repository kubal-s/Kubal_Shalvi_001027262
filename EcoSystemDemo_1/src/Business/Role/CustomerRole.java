/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    public CustomerRole() {
        this.roletype = RoleType.Customer;
    }

    
    
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, DB4OUtil dB4OUtil) {
        return new CustomerAreaJPanel(userProcessContainer, account,dB4OUtil);
    }
    
    
}
