package Satya;

public class StringMutable {

	public static void main(String[] args) {
		
		//String is immutable
		
		String str = "Satya";
		String str1 = "satya";
		
		str = "nani";
		String s1 = new String("satya");
		
		//StringBufferandStringBuilder 
		
		StringBuffer sbf  = new StringBuffer("satya");
		sbf.append("bujji");
		sbf.replace(0, 5, "venky");
		
		sbf.delete(8, 10);
		System.out.println(sbf);
		
		
		
		
		

	}

}
