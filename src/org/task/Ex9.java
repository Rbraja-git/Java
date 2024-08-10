package org.task;

public class Ex9 {
	
	public static void m1(int id,String name) {
		System.out.println(id,name);
		
	}
	
	public void m1(int id) {
		System.out.println(id);
		
		
	}
	
	public static void main(String[] args) {
		Ex9 o=new Ex9();
		o.m1(10);
		o.m1(90, "Raja");
	}

}
