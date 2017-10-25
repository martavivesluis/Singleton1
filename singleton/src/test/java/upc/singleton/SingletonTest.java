package upc.singleton;

import junit.framework.Assert;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SingletonTest {
    private I18N singleton;
    final static Logger logger= Logger.getLogger(SingletonTest.class);
    //static Logger logger = Logger.getLogger(ss.class);
    @Before
    public void before() {
        logger.info("test iniciat");

    }

    @After
    public void after() {

        logger.info("test completat amb èxit");;
    }

    @Test
    public void size1() throws Exception {
        singleton = I18N.getInstance();
        String out = singleton.getText("ca","continueButton");
        logger.info("OUT : "+out);
    }
    @Test
    public void size2(){
        String out = I18N.getInstance().getText("ca","continueButton");
        Assert.assertEquals("Continua", out);

    }

}