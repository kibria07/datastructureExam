package map;
import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {
	
	//Implement a method which can add data into a Map
	
	Map<String,String>map = new HashMap<String,String>();
	
	public void addElementByMap(String data){
		
		map.put("1","phone");
	    map.put("2","robot");
	    map.put("3","apple");
	    map.put("4","banana");
	}
	
	/*Implement a method that can retrieve data from a Map and it will return data containing in a Map
	 * Use while loop to iterate through
	 */
	
	public Map<String, String> getDataByMap(Map<String,String> map){
		Map<String, String> mapData = new HashMap<String,String>();
		  Set set=mapData.entrySet(); 
		Iterator itr=set.iterator();  
		  
		  while(itr.hasNext()){  
		   Map.Entry m=(Map.Entry)itr.next();  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		
		return mapData;
	}
	
	/*Implement a method that can retrieve data from a Map contains List and it will return data containing in a Map
	 * Use for loop to iterate through
	 */
		
		public Map<String, List<String>> getDataByMapList(Map<String,List<String>> list){
			Map<String, List<String>> listData = new HashMap<String,List<String>>();
			
			/*LinkedList <String> List = new LinkedList<String>();
			List.add("a");
			List.add("aaaa");
			List.add("abc");
			List.add("dca");*/
			
			/* Iterator itr=List.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());*/
			   
			   Collection c = listData.values();
			    Iterator it = c.iterator();
			    while (it.hasNext()) {
			      System.out.println(it.next());
			    }
			
			
			return listData;
		}

}
