package demo;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

	class Container{
		Object key;
		Object value;
		public void insert(Object k, Object v){
			this.key=k;
			this.value=v;
		}
	}
	
	private Container c;
	private List<Container> recordList;
	
	public MyHashMap(){
		
		this.recordList=new ArrayList<Container>();
	}
	
	public void put(Object k, Object v){
		this.c=new Container();
		c.insert(k, v);
		boolean flag =true;
		//check for the same key before adding
		for(int i=0; i<recordList.size(); i++){
			Container c1=recordList.get(i);
			if(c1.key.equals(k)){
				//remove the existing object
				//recordList.remove(i);
				flag = false;
			/*	List<Object> list = new ArrayList<>();
				list.add(c1.value);
				list.add(v);*/
				break;//for list
				//c.insert(k, list);// for list
			}
		}
		if(flag)
		recordList.add(c);
	}
	
	public Object get(Object k){
		for(int i=0; i<this.recordList.size(); i++){
			Container con = recordList.get(i);
			//System.out.println("k.toString():"+k.toString()+"con.key.toString()"+con.key.toString());
			if (k.toString()==con.key.toString()) {
				
				return con.value;
			}
			
		}
		return null;
	}
	
	public Object print(){
		for(int i=0; i<this.recordList.size(); i++){
			Container con = recordList.get(i);
			//System.out.println("k.toString():"+k.toString()+"con.key.toString()"+con.key.toString());
			/*
			 * if (k.toString()==con.key.toString()) {
			 * 
			 * return con.value; }
			 */
			System.out.println(con.key.toString()+" "+con.value);
			
		}
		return null;
	}
	
	public static void main(String[] args) {
		MyHashMap hm = new MyHashMap();
		hm.put("1", "1");
		hm.put("2", "2");
		hm.put("3", "3");
		//System.out.println(hm.get("3"));
		hm.put("3", "4");
		
		//System.out.println(hm.get("1"));
		//System.out.println(hm.get("3"));
		//System.out.println(hm.get("8"));
		
		System.out.println(hm.print());
	}

}