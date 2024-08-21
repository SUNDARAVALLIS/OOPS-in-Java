package com.tataelxsi.collections;
import java.util.*;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> l=new HashSet<Integer>();
		l.add(1);
		l.add(8);
		l.add(9);
		l.add(2);
		l.add(1);//tried adding duplicate value
		System.out.println(l);
		
		//TreeSet 
		Set<Integer> ts=new HashSet<Integer>();
		ts.add(1);
		ts.add(8);
		ts.add(9);
		ts.add(2);
		ts.add(1);
		System.out.print(ts);
		

		
	}

}
