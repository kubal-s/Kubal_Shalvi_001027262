/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    
    public SystemAdminRole() {
        this.roletype = RoleType.SysAdmin;
    }

    
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, DB4OUtil dB4OUtil) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, dB4OUtil);
    }
    
}
