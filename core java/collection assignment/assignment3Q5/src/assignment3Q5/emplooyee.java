package assignment3Q5;

import java.util.HashMap;

public class emplooyee {
	
private int id;
private String name;
public emplooyee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int hashCode() {

	return 100;
}
@Override
public boolean equals(Object obj) {

	return true;
}

	}


