package assignment9;
import java.util.*;
public class assignment {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int s1[]=new int[3];
	int s2[]=new int[3];
	int s3[]=new int[3];
	for(int i=0;i<3;i++)
	{
		s1[i]=sc.nextInt();
	}
	for(int i=0;i<3;i++)
	{
		s2[i]=sc.nextInt();
	}
	for(int i=0;i<3;i++)
	{
		s3[i]=sc.nextInt();
	}

	marks a=new marks();
	int std[]=new int[3];
	for(int i=0;i<3;i++)
	{
		std[i]=e[i]+b[i]+c[i];
	}
	
	System.out.println(a.studentsTotalMarksInAllSubjects(int[] std));
	System.out.println(a.studentsAverageMarksInAllSubjects(int[] std));
	
	  System.out.println(a.subjectATotalByStudents(int[] e));
	  System.out.println(a.subjectBTotalByStudents(int[] b));
	  System.out.println(a.subjectBTotalByStudents(int[] c));

	  System.out.println(a.subjectAAverageByStudents(int[] e));
	  System.out.println(a.subjectBAverageByStudents(int[] b));
			  System.out.println(a.subjectCAverageByStudents(int[] c));

}

}
