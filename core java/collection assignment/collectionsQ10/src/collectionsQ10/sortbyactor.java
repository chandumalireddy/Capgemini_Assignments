package collectionsQ10;

import java.util.Comparator;

public class sortbyactor implements Comparator<movies>{

	@Override
	public int compare(movies o1, movies o2) {
		
		return o1.getActor().compareTo(o2.getActor());
	}

}
