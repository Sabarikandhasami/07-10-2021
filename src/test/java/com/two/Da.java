package com.two;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Da {
public static void main(String[] args) {
	Date date=new Date();
	System.out.println(date);
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yy");
	String format = dateFormat.format(date);
	System.out.println(format);
	System.out.println("aha");
}
	

}
