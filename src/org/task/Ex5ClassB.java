package org.task;

public class Ex5ClassB extends Ex5ClassA{
	public void m2() {
		System.out.println("Ram");
	} 
	public static void main(String[] args) {
		Ex5ClassB obj=new Ex5ClassB();
		obj.m1();
		obj.m2();
	}

}
