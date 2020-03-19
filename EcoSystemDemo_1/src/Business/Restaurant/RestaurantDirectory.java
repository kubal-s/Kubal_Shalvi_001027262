/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    List<Restaurant> restaurants;

    public RestaurantDirectory() {
        restaurants = new ArrayList<Restaurant>();
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
    public Restaurant createRestaurant(Menu m, String s, UserAccount ua){
        Restaurant r = new Restaurant(m, s, ua);
        this.restaurants.add(r);
        return r;
    }
    public void removeRestaurant(Restaurant restaurant){
        this.restaurants.remove(restaurant);
    }
    
    public Restaurant getRestaurantByName(String restaurantName){
        for(Restaurant r: restaurants){
            if(r.getName().equals(restaurantName)){
                return r;
            }
        }
        return null;
    }
}
