//Andre Barajas
//Cecs328
//Spring 2018
//Assignment 2 Party

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Table
{
	private int k1 = 0;
	private int k2 = 0;
	private int counter =1;
	private int partySize = 0;
	private Map<Integer, Relation> map;
		
	public Table(Scanner input, int N)
	{
		partySize = N;
		int count =  0;
		int X = 1;
		int Y = 1;
						
						map = new HashMap<>(partySize);
						for(int i = 1;i <= partySize;i++)
					    {
							 map.put( i,new Relation());
						}
						for(int i =0;i<=2;i++)
						{
							if(i==0)
							{
							String x = input.nextLine();
							k1 = Integer.parseInt(x);
							}
							else if (i==1)
							{
								String x = input.nextLine();
								k2 = Integer.parseInt(x);
							}
							else if (i == 2)
							{
								
								int sigma;
											while(input.hasNextLine())
											{
												int counter = partySize;
												String y = input.nextLine();
												//count = count + y.length();
												for(int q = 0; q < y.length();q++)
												{
													sigma = partySize-counter;
													if(Y >= sigma )
													{
																boolean e  = (y.charAt(q) == '1');
																
																if(Y< partySize+1  )
																{
																	if(e && (X != Y))
																	 {
																		
																		 (map.get(X)).addKnown(Y);
																		 (map.get(Y)).addKnown(X);
																		
																	 }
																
																}
																else 
																{
																	X++;
																	Y=1;
																	if(e)
																	 {
																		(map.get(X)).addKnown(Y);
																	 }
																} Y++;
													}else
													{
														if(Y< partySize+1  ) {Y++;}
														else {X++; Y=1;}
														
													}
													
													counter--;
												}
											}	
							}	
						}
	}	
		public int getSize()
		{
			return partySize;
		}
		public Map<Integer, Relation> getMap()
		{
			return map;
		}
}
		

