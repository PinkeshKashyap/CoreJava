package basicjava;

public class Palindrome {
	public static void main(String[] args) {
	String s="pop";
	String ans="";
	for(int i=s.length()-1;i>=0;i--){
		ans=ans+s.charAt(i);
	}
	if(s.equalsIgnoreCase(ans))
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	
	}

}
