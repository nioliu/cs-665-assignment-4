package edu.bu.met.cs665;

import edu.bu.met.cs665.CustomerData.CustomerDataAdapter;
import edu.bu.met.cs665.CustomerData.CustomerData_USB;
import edu.bu.met.cs665.CustomerData.CustomerData_USBImpl;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        CustomerData_USBImpl customerDataUsb = new CustomerData_USBImpl();
        CustomerDataAdapter customerDataAdapter = new CustomerDataAdapter(customerDataUsb);
        customerDataAdapter.getCustomer_HTTPS(1233);
    }
}
