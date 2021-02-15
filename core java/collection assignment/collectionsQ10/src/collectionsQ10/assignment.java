package collectionsQ10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class assignment {

	
	 public static void addMovie(movies movie) {
		 
		 abc.add(movie);
		 
	 }
	 public void find_movie_By_mov_Name(String movieName) {
		 
		 for (movies a : abc) {
		if(a.getMovieName().equals(movieName))
		
		{
			System.out.print(a);
		}
		 
		 
		 
	 }
	 }
	 public void find_movie_By_Genre(String genre) {
		 
		 for(movies a:abc)
		 {
			 if(a.getGenre().equals(genre))
				 System.out.println(a);
		 }
		 
	 }
	 
	 public void removeMovies(String movieName) {
		 
		 
		 for(movies a:abc)
		 {
			 if(a.getMovieName().equals(movieName))
				abc.remove(a);
		 }
		 
		 
	 }
	 public void removeAllMovies(List<movies> movies) {
		 
		 
		 abc.removeAll(movies);
		 System.out.println(abc);
	 }
	 
	 public static void sort(List<movies> abc,Comparator<movies> movieDetailsComparator){
		 
		 Collections.sort(abc,movieDetailsComparator);
		 
		 
		 
	 }
	 
	    public static void printSortedMovieList(List<movies> abc2){
	    	
	    	System.out.println(abc2);
	    	
	    }
		static List<movies>abc=new CopyOnWriteArrayList<>();
	public static void main(String[] args) {
    	
	    movies m1=new movies("bahubali", "prabhas", "anushka", "drama");
	    movies m2=new movies("RRR", "rc", "ab", "historic");
	    
	   assignment a=new assignment(); 	
	    	abc.add(m1);
	    	abc.add(m2);
	    	
	 movies m3=new movies("avengers","rdj","scarlet","action");
	 addMovie(m3);
	 
	 System.out.println(abc);
	 a.find_movie_By_mov_Name("avengers");
	 
	 a.find_movie_By_Genre("drama");
	 
	 a.removeMovies("avengers");
	 System.out.println(abc);
	 
	 sort(abc,new sortbyname());
	 sort(abc,new sortbygenre());
	
printSortedMovieList(abc);
	
	a.removeAllMovies(abc);
	}
	
	 
		
	}
	    			 
	    		  
		        	
	    	
	    	
	    

	  
	        



