import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class Main {

	public static void main(String[] args) {
		File path = new File(".");
	    String filePath = path.getAbsolutePath()+"/src/";
	    
        Serializer serializer = new Persister();
        File source = new File(filePath + "sortConfigurationInfo.xml");
         
        SortConfigurator sortConfigurator = null;
        try {
            sortConfigurator = serializer.read(SortConfigurator.class, source);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        String sortType = sortConfigurator.getSortType();
        SortAlgorithm sortAlgorithm = null;
        
        try {
			sortAlgorithm = (SortAlgorithm)Class.forName( sortType + "Sort").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        
        IntegerDataSet intDataSet = new IntegerDataSet();
        intDataSet.setSortAlgorithm(sortAlgorithm);
	}
}
