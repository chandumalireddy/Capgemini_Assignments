package collectionsQ10;

import java.util.Comparator;

public class sortbyname implements Comparator<movies>{

	@Override
	public int compare(movies o1, movies o2) {
		
		return o1.getMovieName().compareTo(o2.getMovieName());
	}


}
