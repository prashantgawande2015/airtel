package collection_demo;
import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

	public static void main(String[] args) {
		
		ArrayList <String>objarraylist = new ArrayList<String>();
		
		objarraylist.add("prashant");
		objarraylist.add("prasant");
		objarraylist.add("sudam");
		objarraylist.add("Gawande");
		
		System.out.println(objarraylist);
		
		// print the size of array_list
		System.out.println("Array size is=");
		System.out.println(objarraylist.size());
		
		// remove the perticular element from arraylist
		System.out.println(objarraylist.remove("prashant"));
		
		System.out.println(objarraylist);
		
		// printing through the while loop
		
		Iterator <String> itr = objarraylist.iterator();
		while(itr.hasNext())
		{
			itr.next();
		}
		// priting element by enhance for loop
		
		for (String element :objarraylist)
		{
			System.out.println(element);
		}
		
		
	}
	
	
	

}
