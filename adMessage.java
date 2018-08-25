package mingquanjia;

public class adMessage {
	protected String username;
	protected String message;
	protected int ageLimit;
	protected int timestamp;
//	protected int star;
	public adMessage(String username, String message,int ageLimit,int timestamp){
		this.username=username;
		this.message=message;
		this.ageLimit=ageLimit;
		this.timestamp=timestamp;
//		this.star = star;
	}
	public String toString(){
		String s = "";

		s = "username: " + this.username + " " + "message: " + this.message + " " + "ageLimit: " + this.ageLimit;
		
		return s;
	}
	
	
	
}
