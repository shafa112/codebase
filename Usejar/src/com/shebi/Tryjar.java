package com.shebi;

import java.util.HashMap;
import java.util.Map;

import com.shafa.DemoJava;


//import com.shafa.DemoJava;
public class Tryjar {

	public static void main(String[] args) {

		//jar ka jo package tha add karne ke baad,
		//it is just like another package of this project now
		
		DemoJava.main(new String[5]);
		
		//since main was public method we can call here 
		//import is used when yu want to use classes or methods
		//of another package
		
		//within same package yu dnt need to import
		
		Map m = new HashMap<>();
		m.put(1,"shafa" );
		m.put(2, "shebi");
		System.out.println(m.toString());
		
	}

}
