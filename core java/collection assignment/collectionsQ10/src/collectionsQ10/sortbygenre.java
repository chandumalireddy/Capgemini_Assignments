package collectionsQ10;

import java.util.Comparator;

public class sortbygenre implements Comparator<movies>{

	@Override
	public int compare(movies o1, movies o2) {
		
		return o1.getGenre().compareTo(o2.getGenre());
	} 

}
