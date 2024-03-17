package edu.bu.met.cs665.email.templates;

import edu.bu.met.cs665.email.Infomation.Information;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/6 18:58
 * File Name: VipEmail.java
 * Description: This is an email template for Vip customer
 */
public class VipEmail extends EmailTemplate {
    /**
     * This is the real template content of frequent Vip
     *
     * @param information customer information
     */
    @Override
    public String Template(Information information) {
        return String.format("This is Vip email template for %s", information);
    }
}
