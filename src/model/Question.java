package model;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	
	
	private int id;
	private String qname;
	private Map<String,String>answers;
	
	
	public Question() {
		super();
	}


	public Question(int id, String qname, Map<String, String> answers) {
		super();
		this.id = id;
		this.qname = qname;
		this.answers = answers;
	}


	public void showInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+qname);  
	    System.out.println("Answers....");  
	    
	    
	    Set<Entry<String, String>> set = answers.entrySet();
	    
	    Iterator<Entry<String, String>> i = set.iterator();
	    
	    while(i.hasNext())
	    {
	    	Entry<String, String> entry =i.next();
	    	
	    	System.out.println("Answer= "+entry.getKey()+" "+"Posted By= "+entry.getValue());
	    }
	    
	}  
	
	
	
}
