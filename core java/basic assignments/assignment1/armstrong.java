package assignment1;

 class armstrong {
	public  int abc(int min)
	{
		int n=0,r=0;
		int c=min;
			while(c>0)
			{
				 n=c%10;
				n=n*n*n;
				r=r+n;
				c=c/10;
			}
				return r;
		}
		}
		
		
	


