package com;

public class Prime {
	
	public String pm(int x)
	{
		for(int i=2; i<x/2; i++)
		{
			if(x%i==0)
			{
				return "Not a Prime Number";
			}
		}
	return "Prime Number";
	
	}
}
