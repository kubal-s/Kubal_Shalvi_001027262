/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author akhil
 */
public class Menu {
    
    Set<Item> items;
    public Menu(){
        items = new HashSet<Item>();
    }
    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
    public void addItem(Item i){
        items.add(i);
    }
    public void removeItem(Item i){
        items.remove(i);
    }
    public void update(Item oldItem,Item newItem){
        oldItem.setName(newItem.getName());
        oldItem.setPrice(newItem.getPrice());
//        for(Item i:items){
//            if(i.equals(oldItem)){
//                i.setName(newItem.getName());
//                i.setPrice(newItem.getPrice());
//            }
//        }
    }
    //public void 
    //Map<String,Double> menuitem;

//    public Menu() {
//        this.menuitem = new HashMap<String,Double>();
//    }
//
//    public Map<String, Double> getMenuitem() {
//        return this.menuitem;
//    }
//
//    public void setMenuitem(Map<String, Double> menuitem) {
//        this.menuitem = menuitem;
//    }
//    
//    public void addItemToMenu(String name ,Double price ){
//        this.menuitem.put(name, price);
//    }
//    public void deleteMenuItem(String name){
//        this.menuitem.remove(name);
//    }
//    public void updateMenuItem(String oldName,String newName, Double newPrice){
//        deleteMenuItem(oldName);
//        this.menuitem.put(newName, newPrice); 
//    }

        public Item getItemFromName(String itemName){
            for(Item i: items){
                if(i.getName().equals(itemName)){
                    return i;
                }
            }
            return null;
        }
}
