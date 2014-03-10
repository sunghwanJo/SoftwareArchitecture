package sort;

public class IntegerDataSet {
	
	private int[] intArray;
	private SortAlgorithm sortAlgorithm;
	
	IntegerDataSet(){
		
	}
	
	public IntegerDataSet(int[] intArray){
		this.intArray = intArray;
	}
	
	public int[] getIntArray() {
		return intArray;
	}

	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public void sort(){
		this.intArray = sortAlgorithm.doSort(this.intArray);
	}
	
	public void printIntArray(){
		for(int i : this.intArray){
			System.out.print(i+" ");
		}
	}
}
