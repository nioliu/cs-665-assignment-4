package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.templates.NewEmail;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:47
 * File Name: New.java
 * Description: This is a New customer
 */
public class New extends Customer {
    /**
     * This method create a New customer with some default settings
     */
    public New(Information information) {
        super.information = information;
        super.emailTemplate = new NewEmail();
    }
}
