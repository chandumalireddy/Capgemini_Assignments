package assignment2Q6;

public class assignment {
	   public static void main(String[] args) {
		   
		   
		   Persistence filePersistance=new FilePersistence();
		   Persistence databasepersistence=new DataPersistence();
		   System.out.println(filePersistance.persist());
		   System.out.println(databasepersistence.persist());
		   
		   
	   }
}
