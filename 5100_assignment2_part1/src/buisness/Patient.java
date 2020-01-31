/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;

import buisness.VitalSigns;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
/**
 *
 * @author akhil
 */
public class Patient {
    private String dateOfBirth; 
    private String fullName;
    VitalSigns vitalSigns ;
    private long ageInMonth;

    public Patient() {
    }
     
    

    public Patient(String dateOfBirth , String fullName, VitalSigns vitalSigns) {
        this.dateOfBirth = dateOfBirth;
        this.fullName = fullName;
        this.vitalSigns = vitalSigns;
        this.ageInMonth = this.calculateAgeInMonths(dateOfBirth);
    }
    


    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.ageInMonth = calculateAgeInMonths(dateOfBirth);
    }

    public long getAgeInMonth() {
        return ageInMonth;
    }

    public void setAgeInMonth(long ageInMonth) {
        this.ageInMonth = ageInMonth;
    }
 

   
    public boolean isPatientNormal(){
        VitalSigns vs = new VitalSigns();
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
    //referenced https://javarevisited.blogspot.com/2016/10/how-to-get-number-of-months-and-years-between-two-dates-in-java.html
    public long calculateAgeInMonths(String dateOfBirth){
        String[] values = dateOfBirth.split("-");
        int day = Integer.parseInt(values[0]);
        int month = Integer.parseInt(values[1]);
        int year = Integer.parseInt(values[2]);
        Calendar birthDay = new GregorianCalendar(year, month - 1, day );
        Calendar today = new GregorianCalendar(); 
        today.setTime(new Date());
        int yearsInBetween = today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR); 
        int monthsDiff = today.get(Calendar.MONTH) - birthDay.get(Calendar.MONTH);
        long ageInMonths = yearsInBetween*12 + monthsDiff; 
        long age = yearsInBetween;
        this.setAgeInMonth(ageInMonth);
        return ageInMonths;
    }
 
    
    
}
