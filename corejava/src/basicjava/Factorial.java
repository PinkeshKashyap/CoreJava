package basicjava;

public class Factorial {
	public static void main(String[] args){
		int num, fact=1;
		num= 4;
		while(num>0){
			fact= fact*num;
			num--;
			
		}
		System.out.println(fact);
	}
}