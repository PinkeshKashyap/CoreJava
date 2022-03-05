package basicjava;

public class Fibonacci {
public static void main(String[] args) {
	long n,a,b,sum;
	n=8;
	a=0;
	b=1;
	sum=0;
	for(long i=0; i<=n;i++){
		System.out.println(a);
		sum=a+b;
		a=b;
		b=sum;
	}
	
}
} 