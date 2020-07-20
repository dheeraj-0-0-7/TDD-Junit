
package pavan;

public class Remove
{
	public static void main(String[] args) {
        System.out.println("ABC"); 
        System.out.println(remove("ABC"));
        System.out.println("AABC"); 
        System.out.println(remove("AABC"));
        System.out.println("BAC"); 
        System.out.println(remove("BAC"));
        System.out.println("BAAC"); 
        System.out.println(remove("BAAC"));
	}
	 static String remove(String string) {
		String result=string;
		int n=string.length();
		if(string.charAt(0)=='A'&&string.charAt(1)!='A')
		{
			
			result= ""+string.substring(1,n);
		}
		else if(string.charAt(0)=='A'&&string.charAt(1)=='A') 
		{
			result=""+string.substring(2,n) ;
		}
		if(string.charAt(0)!='A'&&string.charAt(1)=='A')
		{
			
			result= string.charAt(0)+string.substring(2,n);
		}
		
		return result;
	}
}
