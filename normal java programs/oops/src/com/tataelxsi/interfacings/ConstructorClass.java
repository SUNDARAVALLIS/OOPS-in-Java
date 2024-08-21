package com.tataelxsi.interfacings;
class Sample{
	int rollno;
	int marks;
	/*Sample(){  //default constructor
		rollno=51;
		marks=456;
	}*/
	Sample(int num,int mark){ //PARAMETERIZED CONSTRUCTOR
		rollno=num;
		marks=mark;
	}
}
public class ConstructorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample(51,456);
		System.out.println(obj.marks);
		System.out.println(obj.rollno);
		
		

	}

}