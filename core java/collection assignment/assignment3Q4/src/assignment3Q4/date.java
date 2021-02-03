package assignment3Q4;

import java.util.Comparator;
public  class date  {
	private int date;
	private int month; 
	private int Year;
	
	public date(int d,int m,int y)
	{
		this.date=d;
		this.month=m;
		this.Year=y;
	}

	
	public int getDate() {
		return date;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Year;
		result = prime * result + date;
		result = prime * result + month;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		date other = (date) obj;
		if (Year != other.Year)
			return false;
		if (date == other.date && month==other.month)
			return false;
		return true;
	}


	public int getMonth() {
		return month;
	}


	public int getYear() {
		return Year;
	}


	public String toString() {
		return date+" "+month+" "+Year;
	}


	


	}		
	








	
		
		
	

