package mingquanjia;

import LinkedList.Dictionary;
import LinkedList.PriorityQueue;

public class CorporateProfile {
	String name;
	int age;
	PriorityQueue corporatewall;
	Dictionary dictionary;
	/**
	 * @param name
	 * create a corporateprofile to a company and push all the ads of this company
	 */
	public CorporateProfile(String name){
		this.name=name;
		corporatewall = new PriorityQueue();
		dictionary = new Dictionary();
		
	}
	
	public void postAd(String username, String message,int ageLimit,int timestamp){
		
		corporatewall.push(new adMessage(username, message, ageLimit,timestamp),timestamp);
		
	}
	public String getName(){
		return name;
	}
	public int size(){
		return corporatewall.size();
	}
	public Dictionary getDictionary(String username, int stars){
		this.dictionary.add(username, stars);
		return this.dictionary;
	}

}
