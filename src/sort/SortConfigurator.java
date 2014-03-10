package sort;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root
public class SortConfigurator {
	@Element
	private String sortType;
	
	public SortConfigurator(){
		super();
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	
	
}
