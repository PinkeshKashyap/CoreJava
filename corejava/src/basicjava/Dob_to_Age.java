package basicjava;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Dob_to_Age {
	public static void main(String[] args) throws ParseException  {
		
		String s= "2000";
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy"); 
		 Date d=sdf.parse(s);
		 System.out.println(d);
		 
		 Date today=new Date();
		 SimpleDateFormat format1= new SimpleDateFormat("yyyy");
		 String str=format1.format(today);
		 System.out.println(str);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
