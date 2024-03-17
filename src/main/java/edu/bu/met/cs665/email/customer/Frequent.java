package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.templates.FrequentEmail;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:46
 * File Name: Frequent.java
 * Description: This is a frequent customer
 */
public class Frequent extends Customer {
    /**
     * This method create a Frequent customer with some default settings
     */
    public Frequent(Information information) {
        super.information = information;
        super.emailTemplate = new FrequentEmail();
    }
}
