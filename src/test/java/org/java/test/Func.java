package org.java.test;

public class Func {
	public void func(int i){
		int a=i%10;
		i/=10;
		System.out.print(a);
		if(i==0) return;
		func(i);
	}
	
	public static void main(String[] args) {
		Func c=new Func();
		c.func(54321);
		//System.out.println(54321/10);
	}
	
}
