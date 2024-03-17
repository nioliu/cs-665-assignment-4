package edu.bu.met.cs665.email.templates;

import edu.bu.met.cs665.email.Infomation.Information;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/1 10:51
 * File Name: EmailTemplate.java
 * Description: define the basic class of email template
 */

public abstract class EmailTemplate {
    /**
     * return the real template for current customer
     */
    public abstract String Template(Information information);
}
