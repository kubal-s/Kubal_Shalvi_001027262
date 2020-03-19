/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    RoleType roletype;
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            DB4OUtil dB4OUtil);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    public RoleType getRoleType(){
        return roletype;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.roletype != null ? this.roletype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Role other = (Role) obj;
        if (this.roletype != other.roletype) {
            return false;
        }
        return true;
    }
    
    
}