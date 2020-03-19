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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.message != null ? this.message.hashCode() : 0);
        hash = 71 * hash + (this.sender != null ? this.sender.hashCode() : 0);
        hash = 71 * hash + (this.receiver != null ? this.receiver.hashCode() : 0);
        hash = 71 * hash + (this.status != null ? this.status.hashCode() : 0);
        hash = 71 * hash + (this.requestDate != null ? this.requestDate.hashCode() : 0);
        hash = 71 * hash + (this.cart != null ? this.cart.hashCode() : 0);
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
        final WorkRequest other = (WorkRequest) obj;
        if ((this.message == null) ? (other.message != null) : !this.message.equals(other.message)) {
            return false;
        }
        if (this.sender != other.sender && (this.sender == null || !this.sender.equals(other.sender))) {
            return false;
        }
        if (this.receiver != other.receiver && (this.receiver == null || !this.receiver.equals(other.receiver))) {
            return false;
        }
        if ((this.status == null) ? (other.status != null) : !this.status.equals(other.status)) {
            return false;
        }
        if (this.requestDate != other.requestDate && (this.requestDate == null || !this.requestDate.equals(other.requestDate))) {
            return false;
        }
        if (this.cart != other.cart && (this.cart == null || !this.cart.equals(other.cart))) {
            return false;
        }
        return true;
    }
    
}
