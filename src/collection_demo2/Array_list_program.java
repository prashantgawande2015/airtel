package collection_demo2;

import java.util.ArrayList;

public class Array_list_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> objarray = new ArrayList<String>();
		objarray.add("ABC");
		objarray.add("PQR");
		objarray.add("ABC");
		System.out.println(objarray);
		System.out.println(objarray.size());
		
		for(int i=0;i<objarray.size();i++)
		{
			System.out.println(objarray.get(i));
			
		}

	}

}
