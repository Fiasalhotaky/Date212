
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class SortedDateList {
	
	TreeMap<Date212, String> treeMap = new TreeMap<>(new DateComparator());
	public void add(String data)
	{
		Date212 x = new Date212(data);
		treeMap.put(x, x.toString());
	}
	public void add(Date212 data) {
		
		treeMap.put(data, data.toString());
		
	}
	//toString method
	public String toString() {
		String result = "";
		 Set set = treeMap.entrySet();
	        Iterator i = set.iterator();
	        while (i.hasNext()) {
	        	Map.Entry me = (Map.Entry)i.next();
	        	result += me.getValue() + "\n"; 
	    
	        }
	        return result;
		}

}