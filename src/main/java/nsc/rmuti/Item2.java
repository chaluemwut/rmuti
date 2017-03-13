package nsc.rmuti;

import java.util.ArrayList;

public class Item2 {
	private ArrayList lst;
	
	public Item2(){
		lst = new ArrayList();
	}
	
	public void addFirst(Object e){
		lst.add(0, e);
	}

}
