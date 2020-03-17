/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author akhil
 */
public class Menu {
    
    Map<String,Double> menuitem;

    public Menu() {
        this.menuitem = new HashMap<String,Double>();
    }

    public Map<String, Double> getMenuitem() {
        return this.menuitem;
    }

    public void setMenuitem(Map<String, Double> menuitem) {
        this.menuitem = menuitem;
    }
    
    public void addItemToMenu(String name ,Double price ){
        this.menuitem.put(name, price);
    }
    public void deleteMenuItem(String name){
        this.menuitem.remove(name);
    }
    public void updateMenuItem(String oldName,String newName, Double newPrice){
        deleteMenuItem(oldName);
        this.menuitem.put(newName, newPrice); 
    }
}
