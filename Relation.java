//Andre Barajas
//Cecs328
//Spring 2018
//Assignment 2 Party

import java.util.*;
public class Relation 
{
	private HashSet<Integer> k1;
	public Relation()
	{
		k1 =  new HashSet<>(); //k1 other people whom they know
	}
	public void addKnown(int x)
	{
		k1.add(x);
	}

	public HashSet<Integer> returnKnown()
	{
		return k1;
	}
	public void removeKey(int i)
	{
		Iterator<Integer> it = k1.iterator();
		int ww = 0;
		while(it.hasNext())
			{
				int w = it.next();
				if (w == i)
					ww = w;
			}
		if (ww != 0)
			k1.remove(ww);
	}
}
