package assignment3Q6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class classroom {

	  private String name;
	    private Set<String> username;
	    private List<String> messages;
	    public classroom(){
	    	name = "";
	        username = new HashSet<String>();
	        messages = new ArrayList<String>();
	    }
	    
	    public classroom(String name, Set<String> username, List<String> messages) {
			super();
			this.name = name;
			this.username = username;
			this.messages = messages;
			
		}

		public boolean removeUser(String username) {
			if(this.username.contains(username)) {
				this.username.remove(username);
				return true;
			}
	    	return false;
	    }
		public void addUsername(String name) {
			if(username.contains(name)) {
				System.out.println("Entered user already Exists! ");
			}else {
				username.add(name);
				System.out.println("addedd");
			}
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
		
		
	}

