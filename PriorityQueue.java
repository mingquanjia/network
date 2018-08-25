package LinkedList;

public class PriorityQueue {
	public class PriorityPair implements Comparable{
		public Object element;
		public Object priority;
		public PriorityPair(Object element, Object priority){
			this.element = element;
			this.priority = priority;
		}
		public int compareTo (Object o){
			PriorityPair p2=(PriorityPair)o;
			
			return ((Comparable)priority).compareTo(p2.priority);
		}
	}
	private LinkedList data;
	
	public PriorityQueue(){
		data = new LinkedList();
	}
	public void push(Object o, Object priority){
		
		data.addSorted(new PriorityPair(o,priority));
	}
	/**
	 * remove the small priority element
	 */
	public Object pop(){
		Object o;
		LinkedList d = data;
		o= d.getFirst();
		d.removeFirst();
		return o;
	}
	public Object top(){
		return data.getLast();
	}
	public int size(){
		return data.size();	
	}
	public Object get(int n){
		if(n>data.size()){
			return null;
		}
		PriorityPair pp = (PriorityPair)data.get(n);
		return pp.element;
		
	}
	
	public Object getpriority(int n){
		PriorityPair p = (PriorityPair)data.get(n);
		return p.priority;
	}
	
	public String toString()
	{
		String s = " ";
		for(int i=0;i<data.size();i++){
			if(data!=null){
				PriorityPair pair = (PriorityPair)data.get(i);
				s +=   pair.element+" ";
			}
		}
		return s;
	}
	

}

	
		