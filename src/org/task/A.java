package org.task;

//1.Access Instance Variable into non static method--->Direct Access

public class A {
	int id=100;
	public void m1() {
		System.out.println(id);
	}
	public static void main(String[] args) {
		A o=new A();
		o.m1();
	}

}

//2.access non static variable into non static method --->extends


//public class A{
//	public void m1() {
//		
//	}
//	public void m2() {
//		
//	}
//}