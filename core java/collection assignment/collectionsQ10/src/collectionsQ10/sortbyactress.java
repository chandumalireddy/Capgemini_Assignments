package collectionsQ10;

import java.util.Comparator;

public class sortbyactress implements Comparator<movies>{

	@Override
	public int compare(movies o1, movies o2) {
		
		return o1.getActress().compareTo(o2.getActress());
	}

}
