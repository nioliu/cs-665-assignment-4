package edu.bu.met.cs665;

import edu.bu.met.cs665.email.Infomation.Information;
import edu.bu.met.cs665.email.customer.*;
import edu.bu.met.cs665.email.templates.VipEmail;
import org.junit.Test;

import java.beans.Customizer;
import java.util.logging.Logger;

public class TestGenerateEmailTemplate {
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    /**
     * basic use for generate a New template
     */
    @Test
    public void testBasic() {
        New aNew = new New(new Information("1", "liu", "yulong"));
        logger.info(aNew.getEmailTemplate());
    }

    /**
     * generate a New Customer and switch to another template
     */
    @Test
    public void testStrategy() {
        New aNew = new New(new Information("1", "liu", "yulong"));
        logger.info(aNew.getEmailTemplate());
        aNew.switchEmailTemplate(new VipEmail());
        logger.info(aNew.getEmailTemplate());
    }

    /**
     * basic use for generate a New template
     */
    @Test
    public void testEachCustomer() {
        Information p = new Information("1", "liu", "yulong");
        Customer aBusiness = new Business(p);
        Customer aNew = new New(p);
        Customer aVip = new Vip(p);
        Customer aFrequent = new Frequent(p);
        Customer aReturning = new Returning(p);
        logger.info(aBusiness.getEmailTemplate());
        logger.info(aNew.getEmailTemplate());
        logger.info(aVip.getEmailTemplate());
        logger.info(aFrequent.getEmailTemplate());
        logger.info(aReturning.getEmailTemplate());
    }
}
