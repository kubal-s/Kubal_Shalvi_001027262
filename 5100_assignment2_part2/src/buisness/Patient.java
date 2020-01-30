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
    private VitalSignsHistory vitalSignsHistory;
    
    public Patient() {
        vitalSignsHistory = new VitalSignsHistory();
    }

    public VitalSignsHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignsHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    public Patient(int age, String fullName, VitalSignsHistory vitalSignsHistory) {
        this.age = age;
        this.fullName = fullName;
        this.vitalSignsHistory = vitalSignsHistory;
    }
     
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
    public boolean isPatientNormal(){
        VitalSigns vs = this.getVitalSignsHistory().getVitalAtIndex(0);
        System.out.println("Tells if Report is normal or not based on latest Vital Signs Record!");
        System.out.println("isNormalRespiratoryRate(this)"+vs.isNormalRespiratoryRate(this));
        System.out.println("isNormalHeartRate(this)"+vs.isNormalHeartRate(this));
        System.out.println("isNormalSystolicBloodPressure(this)"+vs.isNormalSystolicBloodPressure(this));
        System.out.println("isNormalWeightInKilos(this)"+vs.isNormalWeightInKilos(this));
        System.out.println("isNormalWeightInPounds(this)"+vs.isNormalWeightInPounds(this));
        
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

    @Override
    public String toString() {
        return "fullName=" + fullName + "\n"+ vitalSignsHistory ;
    }


     boolean isThisVitalSignNormal(String vsToTest, int index){
         if(vsToTest.equals("Respiratory rate")){
             VitalSigns vs = this.getVitalSignsHistory().getVitalAtIndex(index-1);
              return vs.isNormalRespiratoryRate(this);
         }
         else if(vsToTest.equals("Heart rate")){
             VitalSigns vs = this.getVitalSignsHistory().getVitalAtIndex(index-1);
              return vs.isNormalHeartRate(this);
         }  
         else if(vsToTest.equals("Systolic blood pressure")){
             VitalSigns vs = this.getVitalSignsHistory().getVitalAtIndex(index-1);
              return vs.isNormalSystolicBloodPressure(this);
         }    
         else if(vsToTest.equals("Weight in kilos")){
             VitalSigns vs = this.getVitalSignsHistory().getVitalAtIndex(index-1);
              return vs.isNormalWeightInKilos(this);
         } 
         else if(vsToTest.equals("Weight in pounds")){
             VitalSigns vs = this.getVitalSignsHistory().getVitalAtIndex(index-1);
              return vs.isNormalWeightInPounds(this);
         }
         return false;    
     }
 
    
    
}
