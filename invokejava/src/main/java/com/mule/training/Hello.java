package com.mule.training;

public class Hello {

	
	public static String test () {
		return "message from mule training!";
	}
	
	
	public String demo(int x, int y) {
		return "demo message!"+(x+y);
	}
    public static void main (String[] args) {
 
    	Hello h=new Hello();
    	System.out.println(h.demo(10,20));
}

}