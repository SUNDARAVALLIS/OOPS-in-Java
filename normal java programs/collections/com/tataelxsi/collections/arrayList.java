package com.tataelxsi.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		ArrayList l=new ArrayList<Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		l.add(sc.nextInt());
		
		Collections.sort(l);
		System.out.print(l);

	}

}
