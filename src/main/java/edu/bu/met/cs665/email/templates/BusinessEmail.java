package edu.bu.met.cs665.email.templates;

import edu.bu.met.cs665.email.Infomation.Information;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:49
 * File Name: BusinessEmail.java
 * Description: This is an email template for business customer
 */
public class BusinessEmail extends EmailTemplate {
    /**
     * This is the real template content of business customer
     *
     * @param information customer information
     */
    @Override
    public String Template(Information information) {
        return String.format("This is business email template for %s", information);
    }
}
