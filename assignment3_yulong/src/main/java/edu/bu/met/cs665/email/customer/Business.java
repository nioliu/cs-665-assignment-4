package edu.bu.met.cs665.email.customer;


import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.templates.BusinessEmail;


/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:45
 * File Name: Business.java
 * Description: This is a business customer
 */
public class Business extends Customer {
    /**
     * This method create a business customer with some default settings
     */
    public Business(Information information) {
        super.information = information;
        super.emailTemplate = new BusinessEmail();
    }
}
