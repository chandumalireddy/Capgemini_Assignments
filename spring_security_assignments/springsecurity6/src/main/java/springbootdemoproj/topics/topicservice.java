package springbootdemoproj.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicservice {

	private static List<topic> topics=new ArrayList<>(Arrays.asList(new topic("one","hello"),new topic("two","hi"),new topic("three","good")));
	
	public List<topic> getalltopic(){
		return topics;
	}
	public static void addtopic(topic t)
	{
		topics.add(t);
	}
	public topic gettopicid(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public static void updatetopic(String id, topic t) {
		for(int i=0;i<topics.size();i++)
		{
			topic t1=topics.get(i);
			if(t1.getId().equals(id)) {
				topics.set(i, t);
			}
		}
		
	}
	public static void deletetopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
		
	}
	
	
}
