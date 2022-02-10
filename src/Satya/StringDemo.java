package Satya;

public class StringDemo {

	public static void main(String[] args) {
		
		//String splitting from CSV(comma seperated value)in java
		
		String str = "satya, nani,bujji ,venky";
		
		System.out.
		println(str);
		
	  String name[] = str.split(" ");
	  System.out.println(name[2]);
	  
	  for(String val: name) {
		  System.out.println(val);
	  }
		  
	}

}
