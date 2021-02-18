package spring2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class question {
	 private int questionId;
	 private String question;
	 private List<String> answers;
	 private Set<String> answers1;
	 private Map<Integer,String> answers11;
	 
	 
	 
	
	 public question(int questionId, String question, List<String> answers, Set<String> answers1,
			Map<Integer, String> answers11) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		this.answers1 = answers1;
		this.answers11 = answers11;
	}
	public List<String> getMyList() {
			return answers;
		}
	 public void setMyList(List<String> myList) {
			this.answers = myList;
		}
	public Set<String> getAnswers1() {
		return answers1;
	}

	public void setAnswers1(Set<String> answers1) {
		this.answers1 = answers1;
	}
	public Map<Integer, String> getMyMap() {
		return answers11;
	}
	public void setMyMap(Map<Integer, String> myMap) {
		this.answers11 = myMap;
	}
	
	 public void display()
	 {
		 System.out.println(questionId+" "+question);
		 Iterator<String>it=answers.iterator();
		 while(it.hasNext())
			 System.out.println(it.next());
		 
	 }
	 public void display1()
	 {
		 System.out.println(questionId+" "+question);
		 Iterator<String>it=answers1.iterator();
		 while(it.hasNext())
			 System.out.println(it.next());
		 
	 }
	 public void display2()
	 {
		 System.out.println(questionId+" "+question);
		 for (Entry<Integer, String> entry : answers11.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); 
		 
	 }

	
}
