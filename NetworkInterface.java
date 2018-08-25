package mingquanjia;

import LinkedList.LinkedList;

import LinkedList.Dictionary;
import LinkedList.PriorityQueue;
import LinkedList.PriorityQueue.PriorityPair;

public class NetworkInterface {
	//LinkedList network;
	LinkedList userlist;
	LinkedList corporatelist;
	Dictionary a;
	
	
	
	
	public NetworkInterface(){
		
	//	network= new LinkedList();
		userlist= new LinkedList();
		corporatelist= new LinkedList();
		Dictionary a = new Dictionary();
	
		
	}
	
	
	/**
	 * @param name
	 * @param age
	 * create a linkedlist to store username and age 
	 */
	public void createUserProfile(String name, int age){
		UserProfile userprofile= new UserProfile(name, age); 
		userlist.addLast(userprofile); 
		
	}
	/**
	 * @param name
	 * create a linklist to store corporate name
	 */
	public void createCorporateProfile(String name){
		CorporateProfile corporateProfile=new CorporateProfile(name);
		corporatelist.addLast(corporateProfile);	
		
	}

	
	/**
	 * @param username
	 * @param message
	 * @param privacy
	 * @param ageLimit
	 * @param timestamp
	 * post message to all users wall except younger age
	 */
	public void postMessage(String username, String message, int privacy, int ageLimit, int timestamp){
		for(int i=0;i< userlist.size();i++){
			
				if(ageLimit  < ((UserProfile)userlist.get(i)).age){
					((UserProfile)userlist.get(i)).postMessage(username, message,privacy, ageLimit, timestamp);;
				}
			}
		
		
	}
	
	
	public void postAd(String username, String message, int ageLimit, boolean paid,int timestamp){
		if(paid==false){
			CorporateProfile cp = new CorporateProfile(username);
			int star;
			for(int i=0;i<corporatelist.size();i++){
				if(username==((CorporateProfile)corporatelist.get(i)).name){
					cp = (CorporateProfile)corporatelist.get(i);
					break;
				}
			}
			for(int i=0; i<userlist.size();i++){
		//		user = (UserProfile)userlist.get(i);
				if(cp.dictionary.find(((UserProfile)userlist.get(i)).getName()) != null){
			//		star = (int)cp.dictionary.find(((UserProfile)userlist.get(i)).getName()); 
					if(ageLimit  < ((UserProfile)userlist.get(i)).age){
			//			((UserProfile)userlist.get(i)).postAd(username, message, ageLimit, timestamp+star*10);
						((UserProfile)userlist.get(i)).postAd(username, message, ageLimit, timestamp);
					}
				}
			}
		}
		else if(paid == true){
			for(int i=0;i<userlist.size();i++){
				if(ageLimit  < ((UserProfile)userlist.get(i)).age){
					((UserProfile)userlist.get(i)).postAd(username, message, ageLimit, timestamp );
				}
			}
		}
		
		
	}
			
	
	/**
	 * @param username
	 * four user messages insert one ad
	 */
	public void printWall(String username){	
		//this.Admessage();
		
		for(int i = 0; i<userlist.size();i++){
			
			if(username == ((UserProfile)userlist.get(i)).name){
				int k = 0;
				for(int j=0; j<((UserProfile)userlist.get(i)).getMessagesize();j++){	
					System.out.println(((UserProfile)userlist.get(i)).getMessage(j));
				
					if((j+1)%4==0 && k<=((UserProfile)userlist.get(i)).getAdsize()){
						
							System.out.println(((UserProfile)userlist.get(i)).getAd(k));
							k++;	
					}	
				}			
			}
					
		}
			
	}
		
	public void connect(String name1,String name2){
		for (int i=0;i<userlist.size();i++) {
			if (((UserProfile) userlist.get(i)).getName().equals(name1)) {
				((UserProfile) userlist.get(i)).Friend(name2);
			}
			if (((UserProfile) userlist.get(i)).getName().equals(name2)) {
				((UserProfile) userlist.get(i)).Friend(name1);
			}
		}
	}
	public void printFriendlist(String username){
		for(int i = 0; i<userlist.size();i++){
			if(username == ((UserProfile)userlist.get(i)).name){
				System.out.println((((UserProfile)userlist.get(i))).friendlist);
			}
			
		}
			
	}
	public void rate(String username, String corporateName, int stars){
		//Dictionary a = new Dictionary();
		CorporateProfile cp = new CorporateProfile(corporateName);
		for (int i=0;i<corporatelist.size();i++) {
			cp = (CorporateProfile) corporatelist.get(i);
			if (cp.getName().equals(corporateName)) {
				cp.getDictionary(username,stars);
			//	a.add(.username, stars);
			}
		}
		System.out.println(cp.dictionary);

	}

}
