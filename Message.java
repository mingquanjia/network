package mingquanjia;

public class Message {
	protected String author;
	protected String content;
	protected int privacy;
	protected int ageLimit;	
	
	/**
	 * @param author
	 * @param content
	 * @param privacy
	 * @param ageLimit
	 */

	public Message(String author, String content, int privacy, int ageLimit){
		this.author = author;
		this.content = content;
		this.privacy = privacy;
		this.ageLimit = ageLimit;
		
	}
	
	public String toString(){
		String s = "";
		s = "author: " + this.author + " " + "content: " +
				this.content + " " + " privacy: " + this.privacy +" " +
				"ageLimit: " + this.ageLimit;
		
		return s;
	}
		
}
