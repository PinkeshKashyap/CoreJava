package basicjava;

public class Amstrong {
public static void main(String[] args) {
	int rem, number, temp, total=0;
	number=155;
	temp=number;
	while(number>0){
		rem= number%10;
		total= total+(rem*rem*rem);
		number= number/10;
	}
	if(temp==total)
		System.out.println("given number is Amstrong");
	else
		System.out.println("given number is not Amstrong");
	
}
}
