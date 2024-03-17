package edu.bu.met.cs665;

import edu.bu.met.cs665.CustomerData.CustomerDataAdapter;
import edu.bu.met.cs665.CustomerData.CustomerData_HTTPS;
import edu.bu.met.cs665.CustomerData.CustomerData_HTTPSImpl;
import edu.bu.met.cs665.CustomerData.CustomerData_USBImpl;
import org.junit.Test;

public class TestCustomerData {
    @Test
    public void testBasic() {
        CustomerData_HTTPSImpl customerDataHttps = new CustomerData_HTTPSImpl();
        customerDataHttps.getCustomer_HTTPS(111);
        customerDataHttps.printCustomer(222);

        CustomerData_USBImpl customerDataUsb = new CustomerData_USBImpl();
        // use adapter to make usb system compatible with the new http system
        CustomerData_HTTPS customerDataAdapter = new CustomerDataAdapter(customerDataUsb);
        customerDataAdapter.getCustomer_HTTPS(1233);
        customerDataAdapter.printCustomer(1233);
    }

    @Test
    public void testHttpsData() {
        CustomerData_HTTPSImpl customerDataHttps = new CustomerData_HTTPSImpl();
        customerDataHttps.getCustomer_HTTPS(111);
        customerDataHttps.printCustomer(222);
    }

    @Test
    public void testUSBData() {
        CustomerData_USBImpl customerDataUsb = new CustomerData_USBImpl();
        // use adapter to make usb system compatible with the new http system
        CustomerData_HTTPS customerDataAdapter = new CustomerDataAdapter(customerDataUsb);
        customerDataAdapter.getCustomer_HTTPS(1233);
        customerDataAdapter.printCustomer(1233);
    }
}
