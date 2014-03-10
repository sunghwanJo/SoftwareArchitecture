import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root
public class SortConfigurator {
	@Element
	private String sortType;
	
	@Attribute
	private int index;
	
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
