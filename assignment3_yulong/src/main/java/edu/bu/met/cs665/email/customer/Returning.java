package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.templates.ReturningEmail;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:48
 * File Name: Returning.java
 * Description: This is a Returning customer
 */
public class Returning extends Customer {
    /**
     * This method create a Returning customer with some default settings
     */
    public Returning(Information information) {
        super.information = information;
        super.emailTemplate = new ReturningEmail();
    }
}
