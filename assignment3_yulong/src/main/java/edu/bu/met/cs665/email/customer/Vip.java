package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.templates.VipEmail;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:49
 * File Name: Vip.java
 * Description: This is a Vip customer
 */
public class Vip extends Customer {
    /**
     * This method create a Vip customer with some default settings
     */
    public Vip(Information information) {
        super.information = information;
        super.emailTemplate = new VipEmail();
    }
}
