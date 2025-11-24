package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mycollection {
	
	private List list;
	private Set set;
	private Map map;
	
	public Mycollection(List list, Set set, Map map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}

	@Override
	public String toString() {
		return "Mycollection [list=" + list + ", set=" + set + ", map=" + map + "]";
	}

}
