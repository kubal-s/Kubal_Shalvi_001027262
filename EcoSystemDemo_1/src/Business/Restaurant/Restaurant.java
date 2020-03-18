/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant {
    private Menu menu;
    private String name;
    private UserAccount restaurantAdmin;
    
    public Restaurant(){
    }

    public Restaurant(Menu m, String s, UserAccount ua) {
        this.menu = m;
        this.name = s;
        this.restaurantAdmin = ua;
    }
    
    

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccount getRestaurantAdmin() {
        return restaurantAdmin;
    }

    public void setRestaurantAdmin(UserAccount restaurantAdmin) {
        this.restaurantAdmin = restaurantAdmin;
    }

    @Override
    public String toString() {
        return this.name; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        
        //System.out.println();
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Restaurant that = (Restaurant) obj;
        if (!this.name.equals(that.name))
            return false;
        if (!this.getRestaurantAdmin().getUsername().equals(that.getRestaurantAdmin().getUsername())) 
            return false;
        if (!this.getRestaurantAdmin().getPassword().equals(that.getRestaurantAdmin().getPassword())) 
            return false;
        if (!this.getRestaurantAdmin().getUser().getName().equals(that.getRestaurantAdmin().getUser().getName())) 
            return false;
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
