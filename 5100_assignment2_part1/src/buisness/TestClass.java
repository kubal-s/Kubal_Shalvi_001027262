/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;

import buisness.Patient;
import java.util.Scanner;
/**
 *
 * @author akhil
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        VitalSigns vitalSigns1 = new VitalSigns(20,130,112,1.2); // RR,HR,SBP,Wkg
        Patient patient1 = new Patient(34,"sheldon cooper",vitalSigns1);//age,fullname,vs
        //Using hardcoded value
        if(patient1.isPatientNormal())
            System.out.println("Patient is normal");
        else
            System.out.println("Patient is abnormal");
        
        
        Scanner objIn = new Scanner(System.in);
        int flag = 1;
        do{
            VitalSigns vs = new VitalSigns();
            String fullName = "";
            int age;
            int respRate;
            int heartRate;
            int sBloodPresur;
            double weight;
            
            int weightFlag;
            System.out.println("Enter full name of person:");
            fullName = objIn.nextLine();
            System.out.println("Enter age in months:");
            age = objIn.nextInt();
            
            
            System.out.println("Enter respiratory rate:");
            respRate = objIn.nextInt();
            vs.setRespiratoryRate(respRate);
            System.out.println("Enter heart rate:");
            heartRate = objIn.nextInt();
            vs.setHeartRate(heartRate);
            System.out.println("Enter systolic blood pressure:");
            sBloodPresur = objIn.nextInt();
            vs.setSystolicBloodPressure(sBloodPresur);
            
            
            System.out.println("Enter 1 to enter weight in kgs , else enter weight in pounds!");
            weightFlag = objIn.nextInt();
            if(weightFlag == 1){
                System.out.println("Please enter weight in kgs:");
                weight = objIn.nextDouble();
                vs.setWeightInKgs(weight);
            }
            else{
                System.out.println("Please enter weight in pounds/lbs:");
                weight = objIn.nextDouble();
                vs.setWeightInPounds(weight);
            }
            Patient p = new Patient(age, fullName, vs);
            if(p.isPatientNormal())
                System.out.println("Patient is normal!");
            else
                System.out.println("Patient is abnormal!");
            System.out.println("Enter 1 to check more patients:");
            flag = objIn.nextInt();
            
        }while(flag == 1);
        //System.out.println("Enter age in months:");
        //int age = objIn.nextInt();
        
        
        
        patient1.setAge(12);
        patient1.setVitalSigns(vitalSigns1);
        patient1.getVitalSigns().setHeartRate(110);
        patient1.getVitalSigns().setRespiratoryRate(20);
        patient1.getVitalSigns().setSystolicBloodPressure(110);
        patient1.getVitalSigns().setWeightInKgs(10);
        
        //assignment part1
        System.out.println(patient1.isPatientNormal());

        
    }
    
}
