package edu.bu.met.cs665.CustomerData;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/17 18:50
 * File Name: CustomerData_HTTPSImpl.java
 * Description: Customer data implements https interface
 */
public class CustomerData_HTTPSImpl implements CustomerData_HTTPS {
    @Override
    public void printCustomer(int customerId) {
        System.out.printf("this print customer %d data with https%n", customerId);
    }

    @Override
    public void getCustomer_HTTPS(int customerId) {
        System.out.printf("this will get customer %d data with https%n", customerId);
    }
}
