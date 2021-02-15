package assignment3Q6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class chatapp {
	private Map<String, classroom> chatrooms = new HashMap<String, classroom>();
    private Map<String, user> users = new HashMap<String, user>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {
    	
    	return chatrooms.containsKey(name);
    }

    public boolean isUsernameExists(String username) {
    	
    	return users.containsKey(username);
    	
    }

    public boolean authenticateUser(String username, String password) {
    	user usr = users.get(username);
    	if(usr != null) {
    	 if(usr.getPassword().equals(password)) {
    		return true;
    	}
    	}
    	return false;
    }

    //UI Methods Below
    public void createChatroom() {
    	Scanner scan = new Scanner(System.in);
    	String chatRoomName = "room1";
    	try {
    		System.out.println("Enter Chat room Name");
    		chatRoomName = scan.nextLine();
    		if(isChatroomNameValid(chatRoomName)) {
    			
    			
    		}else {
    			System.out.println("ChatRoom name already exists or Not Valid!");
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		scan.close();
    	}
    }

    public void addNewUser() {
    	Scanner sc = new Scanner(System.in);
    	String uName = "";
    	try {
    		System.out.println("Enter user name");
    		uName = sc.nextLine();
    		if(isUsernameExists(uName)) {
    			System.out.println("User name Already exists");
    		}else {
    			//TODO Add new user to collection
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		
    	}
    	
    }

    public boolean login() {
    	//TODO: Login Work
    	return true;
    }

    public void sendMessage() {
    	
    }
    public void printMessages() {
    	
    }

    public void listUsersFromChatroom() {
    	//private Map<String, User> users = new HashMap<String, User>();
    	for(HashMap.Entry<String,user> entry : users.entrySet()) {
    		System.out.println(entry.getKey());
    	}
    }

    public void logout(){}

    public void deleteUser(){
    	//Take user name
    	//check user exists or not
    	//if found delete
    }

    public void deleteChatroom() {
    	
    }
    public void menu() {
    	System.out.println("> Java Chat Application");
    	System.out.println("A) Create chatroom");
    	System.out.println("B) Add the user");
    	System.out.println("C) User login");
    	System.out.println("D) Send a message");
    	System.out.println("E) Display the messages from a specific chatroom");
    	System.out.println("F) List down all users belonging to the specified chat room.");
    	System.out.println("G) Logout");
    	System.out.println("H) Delete an user");
    	System.out.println("I) Delete the chat room.");
    	System.out.println("Please enter your option:");
    	Scanner scan = new Scanner(System.in);
    	String ch = "";
    	try {
    		ch = scan.next();
    		ch = ch.toUpperCase();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		scan.close();
    	}
    	switch(ch) {
    	case "A":
    		createChatroom();
    		break;
    	case "B":
    		addNewUser();
    		break;
    	case "C":
    		login();
    		break;
    	case "D":
    		sendMessage();
    		break;
    	case "E":
    		printMessages();
    		break;
    	case "F":
    		listUsersFromChatroom();
    		break;
    	case "G":
    		logout();
    		break;
    	case "H":
    		deleteUser();
    		break;
    	case "I":
    		deleteChatroom();
    		break;
    	default:
    		System.out.println("Inavalid choice!");
    		break;
    	}
    	
    }
}


	    	



