/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;

import buisness.VitalSigns;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author akhil
 */
public class Patient {
    private int age; 
    private String fullName;
    VitalSigns vitalSigns ;

    public Patient() {
    }
     
    

    public Patient(int age, String fullName, VitalSigns vitalSigns) {
        this.age = age;
        this.fullName = fullName;
        this.vitalSigns = vitalSigns;
    }
    


    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
 

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public boolean isPatientNormal(){
        VitalSigns vs = new VitalSigns();
       // System.out.println("vs.isNormalRespiratoryRate(this)"+vs.isNormalRespiratoryRate(this));
       // System.out.println("vs.isNormalHeartRate(this)"+vs.isNormalHeartRate(this));
       // System.out.println("vs.isNormalSystolicBloodPressure(this)"+vs.isNormalSystolicBloodPressure(this));
       // System.out.println("vs.isNormalWeightInKilos(this)"+vs.isNormalWeightInKilos(this));
       // System.out.println("vs.isNormalWeightInPounds(this)"+vs.isNormalWeightInPounds(this));
        
        if(vs.isNormalRespiratoryRate(this)&&
           vs.isNormalHeartRate(this)&&
           vs.isNormalSystolicBloodPressure(this)&&
           vs.isNormalWeightInKilos(this)&&
           vs.isNormalWeightInPounds(this))
            return true;
        else 
            return false;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

 
    
    
}
