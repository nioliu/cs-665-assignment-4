package edu.bu.met.cs665.email.templates;

import edu.bu.met.cs665.email.Infomation.Information;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:57
 * File Name: ReturningEmail.java
 * Description: This is an email template for Returning customer
 */
public class ReturningEmail extends EmailTemplate {
    /**
     * This is the real template content of Returning customer
     *
     * @param information customer information
     */
    @Override
    public String Template(Information information) {
        return String.format("This is Returning email template for %s", information);
    }
}
