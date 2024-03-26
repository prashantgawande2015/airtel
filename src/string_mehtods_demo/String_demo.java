package string_mehtods_demo;

public class String_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Selenium ";
		
		String s2= "        sandip";
		
		System.out.println(s); // print the simple string
		
		// using charAt() method
		System.out.println(s.charAt(4));
		
		// using length() method
		System.out.println(s.length());
		
		// using contains method
		System.out.println(s.contains("nium"));
		
		// using equal method
		System.out.println(s.equals("selenium "));
		
		// using equalsIgnoreCase case method
		System.out.println(s.equalsIgnoreCase("selenium "));
		
		
		// using toUpperCase() method
		System.out.println(s.toUpperCase());
		// print the substring
		System.out.println(s.substring(2, 6));
		
		// using trim() method
		System.out.println(s2);
		System.out.println(s2.trim());
		
		
		
		
		
		
		
	}

}
