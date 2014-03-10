import java.util.ArrayList;


public class IntegerDataSet {
	
	private ArrayList<Integer> intLists;
	private SortAlgorithm sortAlgorithm;
	
	IntegerDataSet(){
		
	}
	
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public void sort(){
		sortAlgorithm.sort(intLists);
	}
}
