package edu.bu.met.cs665;


import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.customer.New;
import edu.bu.met.cs665.email.customer.Vip;
import edu.bu.met.cs665.email.templates.VipEmail;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        New aNew = new New(new Information("1", "liu", "yulong"));
        logger.info(aNew.getEmailTemplate());
        aNew.switchEmailTemplate(new VipEmail());
        logger.info(aNew.getEmailTemplate());
    }
}
