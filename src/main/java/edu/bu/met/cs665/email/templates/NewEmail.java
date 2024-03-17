package edu.bu.met.cs665.email.templates;

import edu.bu.met.cs665.email.Infomation.Information;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:57
 * File Name: NewEmail.java
 * Description: This is an email template for New customer
 */
public class NewEmail extends EmailTemplate {
    /**
     * This is the real template content of New customer
     *
     * @param information customer information
     */
    @Override
    public String Template(Information information) {
        return String.format("This is New email template for %s", information);
    }
}
