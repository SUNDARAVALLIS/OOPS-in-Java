package com.tataelxsi.interfacings;
class ApplicationForm{
	String name;
	int rollno;
	public void display() {// default object creation
	System.out.println(name);
	System.out.println(rollno);
	}
	public void setValues(String str,int num) { //using parameters
		name=str;
		rollno=num;
		
	}
}

public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationForm sundu=new ApplicationForm();
		sundu.name="valli";
		sundu.rollno=1234;
		sundu.display();
		
		ApplicationForm bro=new ApplicationForm();
		bro.setValues("value", 71);
		bro.display();
		
		ApplicationForm appa=new ApplicationForm();
		appa.setValues("Jana", 80);
		appa.display();
		
		
		

	}

}
