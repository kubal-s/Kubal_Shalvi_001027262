/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;
 
import buisness.Patient;
import java.util.Date;
/**
 *
 * @author akhil
 */
public class VitalSigns {
    private int respiratoryRate;
    private int heartRate;
    private int systolicBloodPressure;
    private double weightInKgs;
    private double weightInPounds;
    private Date entryDate;

    public VitalSigns() {
    }
    
    

    public VitalSigns(int respiratoryRate, int heartRate, int systolicBloodPressure, double weightInKgs) {
        setHeartRate(heartRate);
        setRespiratoryRate(respiratoryRate);
        setSystolicBloodPressure(systolicBloodPressure);
        setWeightInKgs(weightInKgs);
    }

    public VitalSigns(double weightInPounds,int respiratoryRate, int heartRate,  int systolicBloodPressure) {
        setHeartRate(heartRate);
        setRespiratoryRate(respiratoryRate);
        setSystolicBloodPressure(systolicBloodPressure);
        setWeightInPounds(weightInPounds);
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
    
    
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
        this.weightInPounds = this.weightInKgs * 2.2046;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
        this.weightInKgs = this.weightInPounds * 0.45359237;
    }
    

    public boolean isNormalRespiratoryRate(Patient patient){
        long age;
        int respiratoryRate;
        age = patient.getAgeInMonth();
        respiratoryRate = this.getRespiratoryRate();
        if(age < 1 && respiratoryRate >=30 && respiratoryRate <= 50 ){
            return true;
        }
        else if(age >= 1 && age < 156 && respiratoryRate >=20 && respiratoryRate <= 30){
            return true;
        }
        else if(age >= 156 && respiratoryRate >= 12 && respiratoryRate <= 20){
            return true;
        }
        return false;
    }
    
    public boolean isNormalHeartRate(Patient patient){
        long age;
        int heartRate;
        age = patient.getAgeInMonth();
        heartRate = this.getHeartRate();
        if(age < 1 && heartRate >= 120 && heartRate <= 160){
            return true;
        }
        else if(age >= 1 && age < 12 && heartRate >= 80 && heartRate <= 140){
            return true;
        }
        else if(age >= 12 && age < 36 && heartRate >= 80 && heartRate <= 130){
            return true;
        }
        else if(age >= 36 && age < 72 && heartRate >= 80 && heartRate <= 120){
            return true;
        }
        else if(age >= 72 && age < 156 && heartRate >= 70 && heartRate <= 110){
            return true;
        }
        else if(age >= 156 && heartRate >= 55 && heartRate <= 105){
            return true;
        }
        return false;
    }
    public boolean isNormalSystolicBloodPressure(Patient patient){
        long age = patient.getAgeInMonth();
        int sBloodPressure = this.getSystolicBloodPressure();
        if(age < 1 && sBloodPressure >= 50 && sBloodPressure <= 70){
            return true;
        }
        else if(age >= 1 && age < 12 && sBloodPressure >= 70 && sBloodPressure <= 100){
            return true;
        }
        else if(age >= 12 && age < 72 && sBloodPressure >= 80 && sBloodPressure <= 110){
            return true;
        }
        else if(age >= 72 && age < 156 && sBloodPressure >= 80 && sBloodPressure <= 120){
            return true;
        }
        else if(age >= 156 && sBloodPressure >= 110 && sBloodPressure <= 120){
            return true;
        }
        return false;
    }
    public boolean isNormalWeightInKilos(Patient patient){
        long age;
        double weightInKg;
        age = patient.getAgeInMonth();
        weightInKg = this.getWeightInKgs();
        if(age < 1 && weightInKg >= 2 && weightInKg <= 3){
            return true;
        }
        else if(age >= 1 && age < 12 && weightInKg >= 4 && weightInKg <= 10){
            return true;
        }
        else if(age >= 12 && age < 36 && weightInKg >= 10 && weightInKg <= 14){
            return true;
        }
        else if(age >= 36 && age < 72 && weightInKg >= 14 && weightInKg <= 18){
            return true;
        }
        else if(age >= 72 && age < 156 && weightInKg >= 20 && weightInKg <= 42){
            return true;
        }
        else if(age >= 156 && weightInKg > 50){
            return true;
        }
        return false;
    }
    public boolean isNormalWeightInPounds(Patient patient){       
        long age;
        double weightInPounds;
        age = patient.getAgeInMonth();
        weightInPounds = this.getWeightInPounds();
        if(age < 1 && weightInPounds >= 4.5 && weightInPounds <= 7){
            return true;
        }
        else if(age >= 1 && age < 12 && weightInPounds >= 9 && weightInPounds <= 22){
            return true;
        }
        else if(age >= 12 && age < 36 && weightInPounds >= 22 && weightInPounds <= 31){
            return true;
        }
        else if(age >= 36 && age < 72 && weightInPounds >= 31 && weightInPounds <= 40){
            return true;
        }
        else if(age >= 72 && age < 156 && weightInPounds >= 41 && weightInPounds <= 92){
            return true;
        }
        else if(age >= 156 && weightInPounds > 110){
            return true;
        }
        return false;
    }

        @Override
    public String toString() {
        return "{" + "respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + systolicBloodPressure + ", weightInKgs=" + weightInKgs + ", weightInPounds=" + weightInPounds + '}';
    }
}
