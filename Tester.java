//Andre Barajas
//Cecs328
//Spring 2018
//Assignment 2 Party

import java.io.*;
import java.util.*;
public class Tester 
{
	//public static ArrayList<Object> invite = new ArrayList<>();
	public static int N =0;
	public static int k1, k2;
	public static void main(String args[]) throws FileNotFoundException 
	{  
			Scanner input = new Scanner(new File("initialParty.txt"));
			Scanner input0 = new Scanner(new File("initialParty.txt"));
			
			N = findN(input);
			input.close();
			
			Table matrix = new Table(input0, N);
			input0.close();
			
			chooseSet(matrix.getMap());
			
			if(matrix.getMap().size() == k1+k2 || matrix.getMap().size() <0)
			{
				System.out.println("");
			}
			else
			{
				Set<Integer> keys = (matrix.getMap()).keySet();
				for(Integer  key: keys)
				{
					System.out.println(key);
				}
			}
			
			
	}
	public static Map<Integer, Relation> chooseSet( Map<Integer, Relation> epsilon)
	 
	{
		boolean hi = epsilon.isEmpty();
		if (!hi)
		{
			int q = epsilon.size();	
			Iterator it = epsilon.entrySet().iterator();
			while(it.hasNext() && ( q> k1+k2))
			{
					Map.Entry<Integer, Relation> pair = (Map.Entry<Integer, Relation>)it.next();
					 int val = pair.getKey();
					 
					 if ((((pair.getValue()).returnKnown().size()) < k1) || (((pair.getValue()).returnKnown().size()) >= q-k2))
						{
								epsilon.remove(pair.getKey());
								
								Iterator it0 = epsilon.entrySet().iterator();
								while(it0.hasNext())
								{
									Map.Entry<Integer, Relation> pair0 = (Map.Entry<Integer, Relation>)it0.next();
									epsilon.get(pair0.getKey()).removeKey(val);
								}
								it = epsilon.entrySet().iterator();	
								}	
				   	q = epsilon.size();
				}				
		}
		return epsilon;
	}
	
	public  static int findN(Scanner input)
	{
		int count = 0;
				for(int i =0;i<=2;i++)
				{
						if(i==0)
						{
							String x = input.nextLine();
							k1 = Integer.parseInt(x);
						} else if (i==1)
						{
							String x = input.nextLine();
							k2 = Integer.parseInt(x);
						} else if (i == 2)
						{
								while(input.hasNextLine())
								{
									String y = input.nextLine();
									count = count + y.length();
								}	
						}	
				}
		return (int) Math.sqrt(count);
	}
}
