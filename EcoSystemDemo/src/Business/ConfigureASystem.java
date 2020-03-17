package Business;

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
        
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("resadmin", "resadmin", user3, new AdminRole());
        
        //created one delivery person
        User user4 = system.getUserDirectory().createUser("User4"); //employee name
        
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("deliveryman", "deliveryman", user4, new DeliverManRole());
        
       //created one customer
        User user5 = system.getUserDirectory().createUser("User5"); //employee name
        
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("customer", "customer", user5, new CustomerRole());
        
       //create one resturant
        Menu menu1 = new Menu();
        menu1.addItemToMenu("rice",7.0);
        menu1.addItemToMenu("curry",12.0);
        
        Restaurant restaurant1 = system.getRestaurantDirectory().createRestaurant(menu1, "Indian Curry", ua3);
        
        Menu menu2 = new Menu();
        menu2.addItemToMenu("cheese pizza",10.0);
        menu2.addItemToMenu("chicken pizza",14.0);
        
        Restaurant restaurant2 = system.getRestaurantDirectory().createRestaurant(menu2, "Pizza Hut", null);
        return system;
    }
    
}
