package assignment7;

public class array {

    public boolean searchArray(int arr[],int check){
    	int c=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==check)
    		{
    			c++;
    			
    		}

    	}
    			if(c==1)
    				return true;
    			else 
    				return false;
    }
    
}
