package assignment3Q7;

public class parkedcar {
	 private String ownerName;
	    private int carNumber;
	    private static int token;
	    private static int level;
	    private static int section;
	    private static int slot;
	    
	    
		public parkedcar(String ownerName, int carNumber, int token, int level, int section, int slot) {
			super();
			this.ownerName = ownerName;
			this.carNumber = carNumber;
			this.token = token;
			this.level = level;
			this.section = section;
			this.slot = slot;
		
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public int getCarNumber() {
			return carNumber;
		}
		public void setCarNumber(int carNumber) {
			this.carNumber = carNumber;
		}
		public static int getToken() {
			return token;
		}
		public int setToken(int token) {
			this.token = token;
		}
		public static int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public static int getSection() {
			return section;
		}
		public void setSection(int section) {
			this.section = section;
		}
		public static int getSlot() {
			return slot;
		}
		public void setSlot(int slot) {
			this.slot = slot;
		}
	
	    
		
		
		
}
