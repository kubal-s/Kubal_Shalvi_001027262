package Business;

import Business.Restaurant.Item;
import Business.User.User;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        //created two system administrators
        User user1 = system.getUserDirectory().createUser("User1"); //employee name
        
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", user1, new SystemAdminRole());
        
        User user2 = system.getUserDirectory().createUser("User2"); //employee name
        
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("mainadmin", "mainadmin", user2, new SystemAdminRole());
        
        //created one resturant administrators
        User user3 = system.getUserDirectory().createUser("User3"); //employee name
        
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("resadmin1", "resadmin1", user3, new AdminRole());
        
        
        //created one delivery person
        User user4 = system.getUserDirectory().createUser("User4"); //employee name
        
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("deliveryman", "deliveryman", user4, new DeliverManRole());
        
       //created one customer
        User user5 = system.getUserDirectory().createUser("User5"); //employee name
        
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("customer", "customer", user5, new CustomerRole());
        
        //created one resturant administrators
        User user6 = system.getUserDirectory().createUser("User6"); //employee name
        
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("resadmin2", "resadmin2", user6, new AdminRole());
       //create one resturant
        Menu menu1 = new Menu();
        Item i1 = new Item("rice",7.0);
        Item i2 = new Item("curry",12.0);
        menu1.addItem(i1);
        menu1.addItem(i2);
        //menu1.addItemToMenu("rice",7.0);
        //menu1.addItemToMenu("curry",12.0);
        
        Restaurant restaurant1 = system.getRestaurantDirectory().createRestaurant(menu1, "Indian Curry", ua3);
        
        Menu menu2 = new Menu();
        Item i3 = new Item("cheese pizza",10.0);
        Item i4 = new Item("chicken pizza",14.0);    
        menu2.addItem(i3);
        menu2.addItem(i4);
        
        //menu2.addItemToMenu("cheese pizza",10.0);
        //menu2.addItemToMenu("chicken pizza",14.0);
        
        Restaurant restaurant2 = system.getRestaurantDirectory().createRestaurant(menu2, "Pizza Hut", ua6);
        return system;
    }
    
}   
