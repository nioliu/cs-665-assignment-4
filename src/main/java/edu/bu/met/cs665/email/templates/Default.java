package edu.bu.met.cs665.email.templates;

import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.templates.EmailTemplate;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:49
 * File Name: Default.java
 * Description: This is a default template for business customer,
 * for the EmailTemplate to return a default template
 */
public class Default extends EmailTemplate {
    /**
     * This is the real template content of default
     *
     * @param information customer information
     */
    @Override
    public String Template(Information information) {
        return String.format("This is default email template for %s", information);
    }
}
