package mingquanjia;

import LinkedList.Dictionary;
//import LinkedList.Dictionary;
import LinkedList.LinkedList;
import LinkedList.PriorityQueue;

/**
 * @author Lenovo
 *
 */
/**
 * @author Lenovo
 *
 */
public class UserProfile {
	
	String name;
	int age;
	PriorityQueue userwall;
	PriorityQueue adwall;
    LinkedList friendlist;
    PriorityQueue dictionary;
//    Dictionary a;

	
	
	
	/**
	 * @param username
	 * @param age
	 * wall is PriorityQueue
	 */

	public UserProfile(String name, int age){
		this.name = name;
		this.age = age;
		userwall = new PriorityQueue();
		adwall = new PriorityQueue();
		friendlist = new LinkedList();
		dictionary = new PriorityQueue();
	//	a= new Dictionary();
		
	}
	
	/**
	 * @param author
	 * @param content
	 * @param privacy
	 * @param ageLimit
	 * @param timestamp
	 * every user has two walls, one wall to push messages,the other to push ads.
	 */
	public void postMessage(String author, String content, int privacy, int ageLimit,int timestamp){
		
		userwall.push(new Message(author, content, privacy, ageLimit),timestamp);
		
	}
	public void postAd(String username, String message,int ageLimit,int timestamp){
		
		adwall.push(new adMessage(username, message, ageLimit,timestamp),timestamp);

	}
	
	/**
	 *print the wall 
	 */
	public void printWall(){

		System.out.println(this.toString());
	}

	
	/**
	 * call the toString from the class Wall
	 */
	public Object getMessage(int n){
		
		return userwall.get(n);
	}
	public Object getAd(int n){
		if(n>adwall.size()){
			return null;
		}
		return adwall.get(n);
	}
	
	/**
	 * call the toString from the class Wall
	 */
	public String toString() {
		return userwall.toString();
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getMessagesize() {
		return userwall.size();
	}
	public int getAdsize() {
		return adwall.size();
	}		
	public void Friend(String name2){
		friendlist.addLast(name2);
	}
	public PriorityQueue getDictionary(String name, int stars){
		this.dictionary.push(name, stars);
		return this.dictionary;
	}
	

}

