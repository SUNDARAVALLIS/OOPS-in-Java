package com.tataelxsi.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ArrayListMain {

	public static void main(String[] args) {
//		instead of using sout
	    Logger logger = Logger.getLogger(ArrayListMain.class.getName());
	    
//	    Creating a Arraylist
	    List<String> bike = new ArrayList<String>();
	    
//	   Adding values in list
	   bike.add("RR310");
	   bike.add("RC200");
	   bike.add("NS200");
	   bike.add("GT650");
//	   logger.info(""+bike);
	   
//	   Getting an element
	   logger.info(bike.get(0));
	   logger.info(bike.get(2));
	   
//	   Removing an element
	   bike.remove(1);
	   logger.info(""+bike);
	   
//	   To find a size of a list
//	   System.out.println(bike.size());
	   
//	   To clear all elements in a list
	  // bike.clear();
//	   logger.info(""+bike);
	   System.out.println(bike.size());
	   System.out.println(bike.get(1));

	}

}
