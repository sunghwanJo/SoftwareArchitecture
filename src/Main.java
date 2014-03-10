import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class Main {

	public static void main(String[] args) {
		File path = new File(".");
	    String filePath = path.getAbsolutePath()+"/src/";
	    
        Serializer serializer = new Persister();
        File source = new File(filePath + "sortConfigurationInfo.xml");
         
        SortConfigurator example = null;
        try {
            example = serializer.read(SortConfigurator.class, source);
        } catch (Exception e) {

        	e.printStackTrace();
        }
        
        
        
	}


}
