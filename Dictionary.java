package LinkedList;
public class Dictionary{
	
	private class DictionaryPair {
		public Object someKey;
		public Object someValue;
		public DictionaryPair ( Object someKey , Object someValue ){
			this.someKey = someKey;
			this.someValue = someValue;	
		}
		public Object getKey(){
			return someKey;
		}
		public Object getValue (){
			return someValue;
		}
		public void setKey ( Object newKey){
			someKey=newKey;
		}
		public void setValue ( Object newValue){
			someValue = newValue;
		}
		
	}
	private LinkedList data ;
	public Dictionary(){
		data = new LinkedList();
	}
	public void add(Object key , Object value){
		DictionaryPair d = new DictionaryPair(key,value);
		data.addLast(d);
	}
	public int findPosition (Object key){
		
		for(int i=0;i<data.size();i++){
			DictionaryPair pair = (DictionaryPair) data.get(i);
			if(key.equals(pair.someKey)){
				return i;
			}
		}
		return -1;
	}
	public Object find(Object key){
		for(int i=0;i<data.size();i++){
			DictionaryPair pair = (DictionaryPair) data.get(i);
			if(key==((DictionaryPair) data.get(i)).getKey()){
				return pair.getValue();
			}
     	}
		return null;
    }
	public int size(){
		return data.size();
	}
	public Object getKey(int n){
		DictionaryPair pair = (DictionaryPair) data.get(n);
		if(n>data.size()){
			return null;
		}
		return pair.someKey;
	}
	public String toString(){
		String s = "";
		for(int i=0;i<data.size();i++){
			DictionaryPair pp = (DictionaryPair) data.get(i);
			s = s + pp.someKey+" "+pp.someValue+" ";
		}
		return s;
	}
	
	

}
