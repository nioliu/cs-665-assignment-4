package edu.bu.met.cs665.email.customer;

import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.templates.Default;
import edu.bu.met.cs665.email.templates.EmailTemplate;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/1 11:42
 * File Name: Customer.java
 * Description: customers template
 */

public abstract class Customer {
    protected EmailTemplate emailTemplate;
    protected Information information;

    /**
     * get the specific template
     */
    public String getEmailTemplate() {
        if (emailTemplate == null) {
            return new Default().Template(information);
        } else {
            return emailTemplate.Template(information);
        }
    }

    /**
     * switch to another template for customer
     * strategy pattern
     *
     * @param template temporary template to change
     */
    public void switchEmailTemplate(EmailTemplate template) {
        this.emailTemplate = template;
    }
}

