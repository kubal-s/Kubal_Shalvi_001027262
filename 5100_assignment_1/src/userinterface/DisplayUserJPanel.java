/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import buisness.Person;
import java.awt.Graphics;
import javax.swing.BoxLayout;


public class DisplayUserJPanel extends javax.swing.JPanel {

    private Person person;
    private DemographicInfoJPanel demographicInfoJPanel;
    private AddressJPanel addressJPanel;
    private CheckingAccountJPanel checkingAccountJPanel;
    private DriversLicenseJPanel driversLicenseJPanel;
    private MedicalRecordJPanel medicalRecordJPanel;
    private SavingAccountJPanel savingAccountJPanel;
    /**
     * Creates new form DisplayUserJPanel
     */
    public DisplayUserJPanel(Person person) {
        initComponents();
        this.person = person;
        	
        
		demographicInfoJPanel = new DemographicInfoJPanel();
		addressJPanel = new AddressJPanel();
		checkingAccountJPanel = new CheckingAccountJPanel();
		savingAccountJPanel = new SavingAccountJPanel();
		driversLicenseJPanel = new DriversLicenseJPanel(person.getDriversLicense());
                driversLicenseJPanel.setDisplayLicense(true);
		medicalRecordJPanel = new MedicalRecordJPanel();
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		try {
		demographicInfoJPanel.getFirstNameTxtField().setText(person.getFirstName());
		demographicInfoJPanel.getLastNameTxtField().setText(person.getLastName());
		demographicInfoJPanel.getPhoneNumberTxtField().setText(person.getPhoneNumber());
		demographicInfoJPanel.getDateOfBirthTxtField().setText(person.getDateOfBirth());
		demographicInfoJPanel.getAgeTxtField().setText(person.getAge());
		demographicInfoJPanel.getHeightTxtField().setText(person.getHeight());
		demographicInfoJPanel.getWeightTxtField().setText(person.getWeight());
		demographicInfoJPanel.getSocialSecurityNumberTxtField().setText(person.getSocialSecurityNo());
                
		
		this.add(demographicInfoJPanel);
		
		demographicInfoJPanel.getFirstNameTxtField().setEditable(false);
		demographicInfoJPanel.getLastNameTxtField().setEditable(false);
		demographicInfoJPanel.getPhoneNumberTxtField().setEditable(false);
		demographicInfoJPanel.getDateOfBirthTxtField().setEditable(false);
		demographicInfoJPanel.getAgeTxtField().setEditable(false);
		demographicInfoJPanel.getHeightTxtField().setEditable(false);
		demographicInfoJPanel.getWeightTxtField().setEditable(false);
		demographicInfoJPanel.getSocialSecurityNumberTxtField().setEditable(false);;
		
                }
                catch(Exception e){
                    this.add(demographicInfoJPanel);
                    System.out.println("No demographic information");
                }
		
                try{
                addressJPanel.getCityTxtField().setText(person.getAddress().getCity());
		addressJPanel.getStateTxtField().setText(person.getAddress().getState());
		addressJPanel.getStreetAddressTxtField().setText(person.getAddress().getStreetAddress());
		addressJPanel.getZipCodeTxtField().setText(person.getAddress().getZipCode());
		
		this.add(addressJPanel);
		
		addressJPanel.getCityTxtField().setEditable(false);;
		addressJPanel.getStateTxtField().setEditable(false);
		addressJPanel.getStreetAddressTxtField().setEditable(false);
		addressJPanel.getZipCodeTxtField().setEditable(false);
		
                }
                catch(Exception e){
                    this.add(addressJPanel);
                    System.out.println("No address information");
                }
                try{
                savingAccountJPanel.getAccountBalanceTxtField().setText(person.getSavingAccount().getAccountBalance());
		savingAccountJPanel.getAccountTypeTxtField().setText(person.getSavingAccount().getAccountType());
		savingAccountJPanel.getAccountNumberTxtField().setText(person.getSavingAccount().getBankAccountNumber());
		savingAccountJPanel.getBankNameTxtField().setText(person.getSavingAccount().getBankName());
		savingAccountJPanel.getRoutingNumberTxtField().setText(person.getSavingAccount().getBankRoutingNumber());
                
                this.add(savingAccountJPanel);
                                
                savingAccountJPanel.getAccountBalanceTxtField().setEditable(false);
		savingAccountJPanel.getAccountTypeTxtField().setEditable(false);
		savingAccountJPanel.getAccountNumberTxtField().setEditable(false);
		savingAccountJPanel.getBankNameTxtField().setEditable(false);
		savingAccountJPanel.getRoutingNumberTxtField().setEditable(false);
                

                }
                catch(Exception e){
                    this.add(savingAccountJPanel);
                    System.out.println("No savings account information");
                }

		
                try{
                checkingAccountJPanel.getAccountBalanceTxtField().setText(person.getCheckingAccount().getAccountBalance());
		checkingAccountJPanel.getAccountTypeTxtField().setText(person.getCheckingAccount().getAccountType());
		checkingAccountJPanel.getAccountNumberTxtField().setText(person.getCheckingAccount().getBankAccountNumber());
		checkingAccountJPanel.getBankNameTxtField().setText(person.getCheckingAccount().getBankName());
		checkingAccountJPanel.getRoutingNumberTxtField().setText(person.getCheckingAccount().getBankRoutingNumber());
		
                this.add(checkingAccountJPanel);
                
                checkingAccountJPanel.getAccountBalanceTxtField().setEditable(false);
		checkingAccountJPanel.getAccountTypeTxtField().setEditable(false);
		checkingAccountJPanel.getAccountNumberTxtField().setEditable(false);
		checkingAccountJPanel.getBankNameTxtField().setEditable(false);
		checkingAccountJPanel.getRoutingNumberTxtField().setEditable(false);
		
                }
                catch(Exception e){
                    this.add(checkingAccountJPanel);
                    System.out.println("No checking account information");
                }
		

		
		
                try{
		driversLicenseJPanel.getLicenseNumberTxtField().setText(person.getDriversLicense().getLicenseNumber());
		driversLicenseJPanel.getDateOfExpirationTxtField().setText(person.getDriversLicense().getDateOfExpiration());
		driversLicenseJPanel.getDateOfIssueTxtField().setText(person.getDriversLicense().getDateOfIssue());
		driversLicenseJPanel.getBloodTypeTxtField().setText(person.getDriversLicense().getBloodType());
		
                
                
		this.add(driversLicenseJPanel);
		
		driversLicenseJPanel.getLicenseNumberTxtField().setEditable(false);
		driversLicenseJPanel.getDateOfExpirationTxtField().setEditable(false);
		driversLicenseJPanel.getDateOfIssueTxtField().setEditable(false);
		driversLicenseJPanel.getBloodTypeTxtField().setEditable(false);
                driversLicenseJPanel.getAddDriverLicenseImg().setVisible(false);
                }
                catch(Exception e){
                    this.add(driversLicenseJPanel);
                    System.out.println("No drivers license information");
                }
   
		try{
		medicalRecordJPanel.getMedicalRecordNumberTxtField().setText(person.getMedicalRecord().getMedicalRecordNumber());
		medicalRecordJPanel.getAlergy1TxtField().setText(person.getMedicalRecord().getAlergy1());
		medicalRecordJPanel.getAlergy2TxtField().setText(person.getMedicalRecord().getAlergy2());
		medicalRecordJPanel.getAlergy3TxtField().setText(person.getMedicalRecord().getAlergy3());
		
		this.add(medicalRecordJPanel);
		
		medicalRecordJPanel.getMedicalRecordNumberTxtField().setEditable(false);
		medicalRecordJPanel.getAlergy1TxtField().setEditable(false);
		medicalRecordJPanel.getAlergy2TxtField().setEditable(false);
		medicalRecordJPanel.getAlergy3TxtField().setEditable(false);
                
                }
                catch(Exception e){
                    this.add(medicalRecordJPanel);
                    System.out.println("No medicalrecord information");
                }
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{
        g.drawImage(person.getDriversLicense().getDriversLicenseImage(), 100, 100, this); 
        }
        catch(Exception e){
            System.out.println("no drivers license image uploaded");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(244, 241, 184));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
