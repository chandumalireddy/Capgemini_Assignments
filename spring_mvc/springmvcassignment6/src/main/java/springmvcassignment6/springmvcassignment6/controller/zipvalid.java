package springmvcassignment6.springmvcassignment6.controller;

import java.util.HashMap;

public class zipvalid {

	private String a=new customer().getCity();
	private int b=new customer().getZip();
	public String getA() {
		return a;
	}
	public int getB()
	{
		return b;
	}
	public HashMap<String,Integer> gett(){
		HashMap<String,Integer>h=new HashMap<String,Integer>();
		h.put("O", 25);
		h.put("M", 25);
		h.put("K", 25);
		return h;
	}
}
