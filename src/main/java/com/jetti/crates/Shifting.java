package com.jetti.crates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Shifting {
	
	//Number of crates in old warehouse
	int N;
	//List of all that crates in old ware house
	List<Crate> crateLocation = new ArrayList<Crate>();
	
	public static void main(String args[])
	{
		Shifting obj = new Shifting();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total number of crates in the old warehouse:");
		obj.N = in.nextInt();
		System.out.println("Enter the loction of each crate in x nad y cords:");
		int x=0;
		int y=0;
		
		for(int i=0;i<obj.N;i++)
		{
			System.out.println("Enter the x-cord of crate "+(i+1));
			x = in.nextInt();
			System.out.println("Enter the x-cord of crate "+(i+1));
			y = in.nextInt();
			
			Crate c = new Crate(x,y);
			obj.crateLocation.add(c);			
		}
		
		System.out.println("Enter the number of crates to be moved:");
		int M = in.nextInt();
		
		MoveCrates mobj = new MoveCrates();
		if(mobj.moveToNew(obj.N,obj.crateLocation,M)!=null)
		{
		System.out.println("The following crates will be moved:");		
		System.out.println(mobj.movedCrates);
		}
	}
	
}
