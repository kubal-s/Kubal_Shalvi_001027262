/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raunak
 */
public class WorkRequest {

    private String message;
    private UserAccount sender;
    private Restaurant receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Map<Item,Integer> cart;
    
    public WorkRequest(){
        requestDate = new Date();
        cart = new HashMap<Item, Integer>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public Restaurant getReceiver() {
        return receiver;
    }

    public void setReceiver(Restaurant receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Map<Item, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Item, Integer> cart) {
        this.cart = cart;
    }
    public void addToCart(Item item, Integer quantity){
        if(cart.get(item)!=null){
            int oldQuantity = cart.get(item);
            int newQuantity = oldQuantity + quantity;
            cart.put(item, newQuantity);
        }
        else{
            cart.put(item, quantity);
        }
    }
    @Override
    public String toString() {
        return sender.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
