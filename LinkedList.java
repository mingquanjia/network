package LinkedList;
/**
 * wall is a collection of messages. So create a LinkedList to collect these messages. 
 *
 */
public class LinkedList {
	
	private class ListElement{
		private Object el1 ;
		private ListElement el2 ;
	/**
	 * @param el
	 * @param nextElement
	 */
	public ListElement ( Object el , ListElement nextElement ){
		el1 = el;
		el2 = nextElement ;
	}
	/**
	 * create ListElement
	 */
	public ListElement ( Object el)
	{
		this (el , null );
	}
	/**
	 * get the first element
	 */
	public Object first ()
	{
		return el1;
	}
	/**
	 * get the next element
	 */
	public ListElement rest ()
	{
		return el2;
	}
	/**
	 * set the value of the first element
	 */
	public void setFirst ( Object value )
	{
		el1 = value ;
	}
	/**
	 * set the value of the next element
	 */
	
	public void setRest ( ListElement value )
	{
		el2 = value ;
	}
	
	}
	/**
	 * create a pointer
	 */
	private ListElement head;
	/**
	 * initialized the pointer
	 */
	public LinkedList ()
	{
		head = null ;
	}
	
	/**
	 * get the value of the first ListElement
	 */
	public Object getFirst ()
	{
		return head . first ();
	}
	/**
	 * add a ListElement in the first
	 */
	public void addFirst ( Object o)
	{
		head = new ListElement (o, head );
	}
	/**
	 *remove the first ListElement 
	 */
	public void removeFirst(){
	//	if(head.rest() != null){
			head=head.rest();
	//	}
	}
	
	/**
	 * get the value of the last ListElement
	 */
	public Object getLast(){
		ListElement p = head;
		while(p.rest()!=null) {
			p = p.rest();
		
		}
		return p.first();
	}
	
	/**
	 * add a ListElement in the end
	 */
	public void addLast(Object o){
		ListElement p = head;	
		ListElement n = new ListElement(o);
		if (head==null) {
			head =  new ListElement(o);
		   return;	
		}
		while(p.rest()!=null) {
			p = p.rest();
		}
		p.setRest(n);
		}
	
	/**
	 * remove the last ListElement 
	 */
	public void removeLast(){
		ListElement p=head;
		if(p==null || p.rest()==null){
			return;
		}
		while(p.rest().rest()!=null){
			p=p.rest();
		}
		p.setRest(null);
	}
	/**
	 * retrieve the nth ListElement
	 */
	public Object get( int n)
	{
		if(this.size()<n){
			return null;
		}
		ListElement d = head ;
		if(d==null){
			return null;
		}
		
		while (n>0)
	{
			d = d. rest ();
			n --;
	}
		return d. first ();
	}
	
	public void append(LinkedList list2){
		ListElement ll= list2.head;
		while (ll!=null)
		{ 
			
			this.addLast(ll.first());
			ll = ll.rest();
		}
	}
	/**
	 * Higher o, higher priority
	 */
	public void addSorted(Comparable o){
		
		if(head==null){
			head=new ListElement(o,null);
		}
		else if(((Comparable) head.first()).compareTo(o)<= 0){
			head=new ListElement(o,head);
		}
		else {
			ListElement d= head;
			while((d.rest()!=null) && (((Comparable) d.rest().first()).compareTo(o)>0)){
				d = d.rest();
			}
			ListElement next = d.rest();
			d.setRest(new ListElement(o,next));
		}
		
	}
	
	/**
	 * accounting the size 
	 */
	public int size(){
		ListElement p= head;
		int i=0;
		while (p!=null){
			p=p.rest();
			i++;
		}
		return i;
	}
	
	/** 
	 * call the method toString from the class Message 
	 */
	public String toString(){
		String ss="";
		ListElement d = head ;
		while(d!=null){
			ss=ss+ "("+ d.first().toString()+")"+"\n";
			d=d.rest();
		}
		
		return ss;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
