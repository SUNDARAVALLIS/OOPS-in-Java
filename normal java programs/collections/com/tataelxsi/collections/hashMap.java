package com.tataelxsi.collections;
import java.util.*;
public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> people = new HashMap<String, Integer>();

	    people.put("sai",1);
	    people.put("pranav",2);
	    people.put("shakthi",3);
	    people.put("raga",4);
	    System.out.println(people);
	    for (String i : people.keySet()) {
	      System.out.println("Name: " + i + " EmpNo: " + people.get(i));
	    }

	}

}
