package com.first.maven_first;
import java.io.BufferedReader;
import java.util.*;
import java.io.*;

public class Calculator2 {
	public static void main(String[] args) throws IOException
		{
			int x,y;
			char z;
			
			System.out.println("Enter the number : ");
			BufferedReader ar=new  BufferedReader(new InputStreamReader(System.in));
			x=Integer.parseInt(ar.readLine());
			BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		    y=Integer.parseInt(br.readLine());
			System.out.print("Enter an operator (+, -, *, /) : ");
			BufferedReader cr=new  BufferedReader(new InputStreamReader(System.in));
			z=(char)cr.read();
			Calculator1 obj = new Calculator1(x,y,z);
			obj.calculate();
		}
	}
