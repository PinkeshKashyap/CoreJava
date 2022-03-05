package basicjava;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;



public class HandlingDT {
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d);		
		
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy hh/mm/ss");
		String a=f.format(d);
		System.out.println(a);
		Calendar c=Calendar.getInstance();
		int dayOfYear= c.get(Calendar.DAY_OF_YEAR);
		sout
		
	}


	
}
