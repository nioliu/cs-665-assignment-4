package edu.bu.met.cs665.CustomerData;

/**
 * Name: Yulong Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 2024/3/17 17:13
 * File Name: CustomerDataAdapter.java
 * Description: create an adapter to bridge the old system with the new one
 */
public class CustomerDataAdapter implements CustomerData_HTTPS {
    /**
     * usb system
     */
    private final CustomerData_USB usbSystem;

    /**
     * Description: create a customer data adapter to bridge old sytsem with the https system
     */
    public CustomerDataAdapter(CustomerData_USB usbSystem) {
        this.usbSystem = usbSystem;
    }

    @Override
    public void printCustomer(int customerId) {
        this.usbSystem.printCustomer(customerId);
    }

    @Override
    public void getCustomer_HTTPS(int customerId) {
        this.usbSystem.getCustomer_USB(customerId);
    }
}
