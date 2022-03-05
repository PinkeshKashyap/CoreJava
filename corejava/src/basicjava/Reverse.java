package basicjava;

public class Reverse {
	public static void main(String[] args){
		int number=1025;
		int lastdigit,reverse = 0;
		while(number>0){
			lastdigit=number%10;
			reverse= ( reverse*10)+lastdigit;
			number=number/10;
		}
		System.out.println(reverse);
		
			
		}
	}

  
