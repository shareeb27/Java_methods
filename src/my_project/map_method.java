package my_project;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;
public class map_method{

	
	
	
	//map methods  
	   
	 // key and value pair 
	
	
	// syntax  --> map<key,value> refName = new types of map <key,value>(); 


 /* 
  * one 
  * 10
  * 12,10
  * 
  * apple - 2 
  * mango - three
  *  
  */

					//collection all methods in Interface
	
	public static void main(String[] args) {
		
		
						//syntax
				Map<Integer, Character> m = new HashMap<>();
				
				
					m.put(1,'H');
					m.put(2, 'H');
					m.put(3, null);
					m.put(null, null);
					
					System.out.println(m);
					
					
					
					// using key set to get only integer 
					
				Set<Integer> keyset = m.keySet();
				System.out.println(keyset);
				
					//using collection to get only string values 
				
				Collection<Character> values = m.values();
				System.out.println(values);
				
				
				
				//set entry
				
				Set<Entry<Integer, Character> > entrySet = m.entrySet();
				for(Entry<Integer, Character> entry : entrySet) {
					
					System.out.println(entry);
				}
				
				 // throws exception 
				
			/*pubic abstract Void vote(int a);
				
				if (a>18) {
					System.out.println("you are able to vote");
				}
				else {
					System.out.println("you are nor able to vote");
				}
				}
				
					*/
				
						
				
				
					
					
					
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
	

}




















