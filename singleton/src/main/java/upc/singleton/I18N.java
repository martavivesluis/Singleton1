package upc.singleton;//aquest es el singleton
import java.util.HashMap;
import java.util.ResourceBundle;


public class I18N {

    private HashMap<String,ResourceBundle> map;


    private static I18N instance = null;

    private I18N() {
        map = new HashMap<String,ResourceBundle >();
        map.put("ca", ResourceBundle.getBundle("catalan"));
        map.put("cas", ResourceBundle.getBundle("spanish"));
        map.put("en", ResourceBundle.getBundle("english"));
     }



    public static I18N getInstance() {
        if (instance==null) {
            instance = new I18N();
        }
        return instance;
    }

    public String getText(String language, String key) {
        String ret = null;
        ret = map.get(language).getString(key);
        return ret;
    }


    public static void main(String[] args) {

        //Map<String, String> map = convertResourceBundleTomap(resource);

        I18N.getInstance().getText("ca", "paraula");
        I18N.getInstance().getText("en", "paraula");
        I18N.getInstance().getText("es", "paraula");
    }

}



