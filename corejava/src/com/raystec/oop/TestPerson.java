package com.raystec.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		

		Person p=new Person();
		p.Setname("Pinkesh");
		p.Setaddress("banganga");
		
		String s = "21/10/2000";
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date d= sdf.parse(s);

		p.SetDob(d);
		System.out.println(p.getDob());
		System.out.println(p.getAvgAge());
		System.out.println(p.getaddress());
		System.out.println(p.getname());
		

}
}