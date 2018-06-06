package com.shafa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputRead {
	
	public static void main(String[] args) throws IOException {
		//System.out.println(args.toString());
		//System.out.println(args.length);
		System.out.println(args.toString());
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b=br.readLine();
		s.close();
		System.out.println(str+"---"+b);
	}

}
