/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserDirectory {
    
    private ArrayList<User> employeeList;

    public UserDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<User> getEmployeeList() {
        return employeeList;
    }
    
    public User createUser(String name){
        User employee = new User();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}