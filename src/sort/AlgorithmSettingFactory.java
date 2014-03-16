package sort;
import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class AlgorithmSettingFactory {
	private SortAlgorithm sortAlgorithm=null;
	
	public AlgorithmSettingFactory() {
		
	}
	public String getAlgorithmTypeFromConfigurator(){
		File path = new File(".");
	    String xmlFilePath = path.getAbsolutePath()+"/src/xmlfile/";
	   
        Serializer serializer = new Persister();
        File source = new File(xmlFilePath + "sortConfigurationInfo.xml");
         
        SortConfigurator sortConfigurator = null;
        try {
            sortConfigurator = serializer.read(SortConfigurator.class, source);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        String sortType = sortConfigurator.getSortType();
        return sortType;
        
	}
	
	public void setAlgorithmToIntegerDataSet(DataSets integerDataSet){
		String sortType = this.getAlgorithmTypeFromConfigurator();
        String pacakageName = "sort";
        try {
			sortAlgorithm = (SortAlgorithm)Class.forName( pacakageName+"."+sortType + "Sort").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        
		integerDataSet.setSortAlgorithm(sortAlgorithm);
	}
}
