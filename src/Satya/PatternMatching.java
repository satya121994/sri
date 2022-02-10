package Satya;

public class PatternMatching {

	public static void main(String[] args) {
		
		
		//PatternMatching in java with using Built in Method
		
		String text ="satyanarayana";
		String pattern = "nar";
		
		boolean result = text.contains(pattern);
		if(result)
			System.out.println("pattern found");
		else
			System.out.println("not found");
		
		//PatternMatching in java without using built in method
		
		String text1 = "nanibujji";
		String pattern1 = "ujj";
		
		int count = 0;
		
		int tlen = text1.length();
		int plen = pattern1.length();
		
		char c,p;
		for(int i = 0;i<=tlen-plen;i++) {
			c = text1.charAt(i);
			p= pattern1.charAt(0);
			
			if(c==p) {
				for(int j =i,k=0;j<i+plen;j++,k++) {
					c = text1.charAt(j);
					p = pattern1.charAt(k);
					 
					if(c==p);
					
					count ++;	
				}
			}
		}
		
		if(count ==plen)
			System.out.println("patternfound");
		else
			System.out.println("notfound");

		
	}

}
