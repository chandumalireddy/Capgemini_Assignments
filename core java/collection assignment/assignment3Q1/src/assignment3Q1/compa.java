package assignment3Q1;

import java.util.Comparator;

public class compa implements Comparator{

	
	public int compare(movies o1, movies o2) {
		
		return o1.getMovieName().compareTo(o2.getMovieName());
	}

}
