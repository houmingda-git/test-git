package com.test;

import java.util.ArrayList;
import java.util.List;


public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getName();
	}

	
	
	public static void getName() {
		
		List<String> list = new ArrayList<String>();
	
		String valueOf = String.valueOf((int)(Math.random()*9+1)*10000);
		System.out.println(valueOf);
		byte[] bytes = valueOf.getBytes();
		 
		
		for (byte b : bytes) {
			System.err.println(b);
		}
		
		
		
		
		
		
		
	}
	
}
