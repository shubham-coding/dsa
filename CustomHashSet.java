package others;

import java.util.ArrayList;
import java.util.List;

public class CustomHashSet {
	
	class Container{
		Object val;
		public void put(Object val) {
			this.val=val;
		}
	}
	
	public CustomHashSet() {
		this.elementList= new ArrayList<Container>();
	}
	
	private Container c;
	private List<Container> elementList;
	
	public  void insert(Object v) {
		this.c=new Container();
		c.put(v);
		for(int i=0;i<elementList.size();i++) {
			Container cont = elementList.get(i);
			if(cont.val.equals(v)) {
				elementList.remove(i);
				break;
			}
			
		}
		elementList.add(c);
	}
	
	public Object get(Object v) {
		
		for(int i=0;i<this.elementList.size();i++) {
			Container cont = elementList.get(i);
			if(v.toString()==cont.val.toString()) {
				return cont.val;
			}
		}
		return null;
	}
	
	public void print() {
		for(int i=0;i<this.elementList.size();i++) {
			Container c= elementList.get(i);
			System.out.println(c.val.toString());
		}
		
	}
	
	public void remove(Object value) {
		for(int i=0;i<elementList.size();i++) {
			Container c = elementList.get(i);
			if(c.val.equals(value))
				elementList.remove(i);
		}
	}
	
	public static Boolean isEqual(CustomHashSet set1, CustomHashSet set2) {
		if(set1.elementList.size()!=set2.elementList.size())
			return false;
		int count =0;
		for(int i=0;i<set1.elementList.size();i++) {
			Container c1= set1.elementList.get(i);
			for(int j=0;j<set2.elementList.size();j++) {
				Container c2 = set2.elementList.get(j);
				if(c1.val.equals(c2.val)) {
					count++;
					break;
				}
			}
			
		}
		if(count==set1.elementList.size())
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		CustomHashSet set = new CustomHashSet();
		set.insert("1");
		set.insert("2");
		set.insert("2");
		set.remove("1");
		set.print();
		System.out.println("***");
		CustomHashSet set1 = new CustomHashSet();
		set1.insert("2");
		//set1.insert("1");
		set1.print();
		
		
		Boolean isEqual = isEqual(set, set1);
		System.out.println(isEqual);
		
	}

}
