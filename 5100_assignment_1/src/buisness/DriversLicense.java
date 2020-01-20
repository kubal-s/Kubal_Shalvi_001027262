/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buisness;

import java.awt.image.BufferedImage;


public class DriversLicense {
    	private String licenseNumber;
	//private Date dateOfIssue;
	//private Date dateOfExpiration;
	private String dateOfIssue;
	private String dateOfExpiration;
	private String bloodType;
        private BufferedImage driversLicenseImage;

    public BufferedImage getDriversLicenseImage() {
        return driversLicenseImage;
    }

    public void setDriversLicenseImage(BufferedImage driversLicenseImage) {
        this.driversLicenseImage = driversLicenseImage;
    }
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDateOfExpiration() {
		return dateOfExpiration;
	}
	public void setDateOfExpiration(String dateOfExpiration) {
		this.dateOfExpiration = dateOfExpiration;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
}
