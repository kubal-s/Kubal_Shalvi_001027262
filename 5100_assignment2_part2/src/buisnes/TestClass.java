/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;

import buisness.Patient;
import java.util.ArrayList;
import java.util.List;
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
        
       List<Patient> patientsInHospital = new ArrayList<Patient>();
        
        Scanner objIn = new Scanner(System.in);
        int flag = 1;
        do{
            String fullName = "";
            int age;
            int respRate;
            int heartRate;
            int sBloodPresur;
            double weight;
            String date;
            
            int weightFlag;
            
            boolean isNewPatient = false;
            System.out.println("Enter full name of person:");
            fullName = objIn.nextLine();
            System.out.println("Enter birth date in dd-mm-yyyy:");
            date = objIn.nextLine();
            
            
            System.out.println("Enter respiratory rate:");
            respRate = objIn.nextInt();
          
            System.out.println("Enter heart rate:");
            heartRate = objIn.nextInt();
           
            System.out.println("Enter systolic blood pressure:");
            sBloodPresur = objIn.nextInt();           
            
            System.out.println("Enter 1 to enter weight in kgs , else enter weight in pounds!");
            weightFlag = objIn.nextInt();
            if(weightFlag == 1){
                System.out.println("Please enter weight in kgs:");
                weight = objIn.nextDouble();
            }
            else{
                System.out.println("Please enter weight in pounds/lbs:");
                weight = objIn.nextDouble();
            }
            
            if(patientsInHospital.isEmpty()){
                Patient newp = new Patient();
                VitalSignsHistory vsh = newp.getVitalSignsHistory();
                VitalSigns vs = vsh.createVitalSigns();
                vs.setHeartRate(heartRate);
                vs.setRespiratoryRate(respRate);
                vs.setSystolicBloodPressure(sBloodPresur);
                
                if(weightFlag == 1){
                    vs.setWeightInKgs(weight);
                }
                else{
                    vs.setWeightInPounds(weight);
                }
                vsh.addToVitalSignsHistory(vs);
                newp.setFullName(fullName);
                newp.setDateOfBirth(date);
                patientsInHospital.add(newp);
                System.out.println( newp.isPatientNormal()?"\nNormal":"\nAbnormal");
             }
            else{
                Patient newp = new Patient();
                for(Patient p : patientsInHospital){                   
                    if(p.getFullName().equals(fullName) && p.getDateOfBirth().equals(date)){
                        VitalSigns vs = p.getVitalSignsHistory().createVitalSigns();
                        vs.setHeartRate(heartRate);
                        vs.setRespiratoryRate(respRate);
                        vs.setSystolicBloodPressure(sBloodPresur);
                        if(weightFlag == 1){
                            vs.setWeightInKgs(weight);
                        }
                        else{
                            vs.setWeightInPounds(weight);
                        }
                        p.getVitalSignsHistory().addToVitalSignsHistory(vs);
                        System.out.println( p.isPatientNormal()?"\nNormal":"\nAbnormal");
                        isNewPatient = false;
                        break;
                    }
                    else{
                        
                        VitalSignsHistory vsh = newp.getVitalSignsHistory();
                        VitalSigns vs = vsh.createVitalSigns();
                        vs.setHeartRate(heartRate);
                        vs.setRespiratoryRate(respRate);
                        vs.setSystolicBloodPressure(sBloodPresur);

                        if(weightFlag == 1){
                            vs.setWeightInKgs(weight);
                        }
                        else{
                            vs.setWeightInPounds(weight);
                        }
                        vsh.addToVitalSignsHistory(vs);
                        newp.setFullName(fullName);
                        newp.setDateOfBirth(date);
                        System.out.println( newp.isPatientNormal()?"\nNormal":"\nAbnormal");
                        isNewPatient = true;
                        break;
                    }
               }
                if(isNewPatient)    
                    patientsInHospital.add(newp);
            }
            
            System.out.println("Enter 1 to check more patients:");
            flag = objIn.nextInt();
            objIn.nextLine();
            
        }while(flag == 1);
        
        
        StringBuffer sb = new StringBuffer();
        for (Patient p : patientsInHospital) {
            sb.append(p);
            sb.append("\n");
        }
        String str = sb.toString();
        System.out.println(str);
      
      System.out.println("Enter patient name to test for specific vital sign:");
      String patientName  = objIn.nextLine();  
      
      System.out.println("Enter the index of vital sign to test:");
      int indexVS = objIn.nextInt();
      
      objIn.nextLine();
      System.out.println("Enter birth date in dd-mm-yyyy:");
      String date1 = objIn.nextLine();
      

      System.out.println("Enter vital sign to test from following list\n-> Respiratory rate\n -> Heart rate\n -> Systolic blood pressure\n -> Weight in kilos \n -> Weight in pounds :");
      String vsToTest = objIn.nextLine();
      
      boolean foundPatientFag = false;
      for(Patient p: patientsInHospital){
          if(p.getFullName().equals(patientName) && p.getDateOfBirth().equals(date1)){
              boolean val = p.isThisVitalSignNormal(vsToTest,indexVS);
              if(val == true){
                  System.out.println(vsToTest +" Vital Sign falls in normal range\n");
              }
              else{
                  System.out.println(vsToTest +" Vital Sign falls in abnormal range\n");
              }
              p.isPatientNormal();
             foundPatientFag = true;
             break;
          }

      }
      if(!foundPatientFag){
          System.out.println("No such patient exist\n");
      }
    }
    
}
