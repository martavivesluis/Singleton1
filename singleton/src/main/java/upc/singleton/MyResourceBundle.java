package upc.singleton;

import org.apache.log4j.Logger;

import java.util.ResourceBundle;

public class MyResourceBundle  {
    final static Logger logger= Logger.getLogger(MyResourceBundle.class);

    private MyResourceBundle(){

    }


    public static void main(String[] args) {
        ResourceBundle cat  = ResourceBundle.getBundle("catalan");
        logger.info(" "+( cat.getString("continueButton"))+" ");

        ResourceBundle en = ResourceBundle.getBundle("english");
        logger.info(" "+( en.getString("continueButton"))+" ");

        ResourceBundle es = ResourceBundle.getBundle("spanish");
        logger.info(" "+( es.getString("continueButton"))+" ");
    }

}
