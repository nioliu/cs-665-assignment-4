package edu.bu.met.cs665.CustomerData;
/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/17 18:50
 * File Name: CustomerData_USBImpl.java
 * Description: Customer data to implement usb interface
 */
public class CustomerData_USBImpl implements CustomerData_USB {
    @Override
    public void printCustomer(int customerId) {
        System.out.printf("this print customer %d data with USB%n", customerId);
    }

    @Override
    public void getCustomer_USB(int customerId) {
        System.out.printf("this will get %d customer data with USB%n", customerId);
    }
}
