package assignment9;

public class marks {
	
	    private int subjectA,subjectB,subjectC;

	    public int studentsTotalMarksInAllSubjects(Student[] students) {
	    int a=0;	
	    	for(int i=0;i<3;i++)
	    	{
	    		a=a+students[i];
	    }
	    	return a;
	    }
	    
	    public double studentsAverageMarksInAllSubjects(Student[] students) {
	    	 int a=0;	
		    	for(int i=0;i<3;i++)
		    	{
		    		a=a+students[i];
		    }
		    	double c=a/3;
	    	return c;
	    }

	    public int subjectATotalByStudents(int[] marks) {
	    	
	    	int a=0;
	    	for(int i=0;i<3;i++)
	    	{
	    		a=a+marks[i];
	    	}
	    	return a;
	    	
	    }
	    public int subjectBTotalByStudents(int[] marks) {
	    	int a=0;
	    	for(int i=0;i<3;i++)
	    	{
	    		a=a+marks[i];
	    	}
	    	return a;
	    }
	    public int subjectCTotalByStudents(int[] marks) {
	    	int a=0;
	    	for(int i=0;i<3;i++)
	    	{
	    		a=a+marks[i];
	    	}
	    	return a;
	    }


	    public double subjectAAverageByStudents(int[] marks) {
	    	
	    	int a=0;
	    	double c=0;
	    	for(int i=0;i<3;i++)
	    	{
	    		a=a+marks[i];
	    	}
	    	c=a/3;
	    }
	    return c;
	    	
	    }
	    public double subjectBAverageByStudents(int[] marks) {
	    	
	    	int a=0;
	    	double c=0;
	    	for(int i=0;i<3;i++)
	    	{
	    		a=a+marks[i];
	    	}
	    	c=a/3;
	    }
	    return c;
	    }
	    public double subjectCAverageByStudents(int[] marks) {
	    	
	    	int a=0;
	    	double c=0;
	    	for(int i=0;i<3;i++)
	    	{
	    		a=a+marks[i];
	    	}
	    	c=a/3;
	    }
	    return c;
	    }

}
