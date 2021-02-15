package assignment3Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asssignment {
	   private String name;
	    private String carModel;
	    private int carNo;
	    private int mobileNumber;
	    private String address;
	    
	   

		public asssignment(String name, String carModel, int carNo, int mobileNumber, String address) {
			super();
			this.name = name;
			this.carModel = carModel;
			this.carNo = carNo;
			this.mobileNumber = mobileNumber;
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCarModel() {
			return carModel;
		}

		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}

		public int getCarNo() {
			return carNo;
		}

		public void setCarNo(int carNo) {
			this.carNo = carNo;
		}

		public int getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(int mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	
		public static void main(String[] args) {
			
		
			
		
			 asssignment a1=new  asssignment("chandu","dzire",999,12121212,"Hyderabad");
			 asssignment a2=new  asssignment("sekhar","i20",123,98989898,"Hyderabad");
			 asssignment a3=new  asssignment("abc","i20",123,98989898,"Hyderabad");
			 
			 ownerdet d=new ownerdet();
			 
		d.add_new_car(a1);
		
		
		d.get_parked_car_location(1);
	    		    }

		
}
