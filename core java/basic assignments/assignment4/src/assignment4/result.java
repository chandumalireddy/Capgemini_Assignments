package assignment4;


public class result {
		public String dec(int s1,int s2,int s3)
		{
			if(s1>60 && s2>60 && s3>60)
			return "Passed";
			else if(s1>60 && s2>60 && s3<60 || s1<60 && s2>60 && s3>60 || s1>60 && s2<60 && s3>60)
			return "Promoted";
			else if(s1<60 && s2<60 || s2<60 && s3<60 || s3<60 && s1<60)
				return "failed";
			else
				return "failed";
		}
}
