import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import sort.AlgorithmSettingFactory;
import sort.DataSets;


public class Main {

	public static void main(String[] args) {

        int[] tempIntArray = {1, 2, 20, 30, 25, 49, 36};
        DataSets intDataSet = new DataSets(tempIntArray);
        AlgorithmSettingFactory algorithmSettingFactory = new AlgorithmSettingFactory();
        
        //XML File에서 설정된 알고리즘을 적용
        algorithmSettingFactory.setAlgorithmToIntegerDataSet(intDataSet);
        
        System.out.println("적용된 Sorting Method : "+intDataSet.getSortAlgorithm().getSortType());
        
        System.out.println("Before sort");
        intDataSet.printIntArray();
        System.out.println("\nAfter sort");
        intDataSet.sort();
        intDataSet.printIntArray();
        
        
	}
}
