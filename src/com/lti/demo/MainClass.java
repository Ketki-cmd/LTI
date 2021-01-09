package com.lti.demo;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;  

public class MainClass
{  
	public static void main(String[] args)   
	{  
			String line = "";  
			String splitBy = ";";
			UserStories us = new UserStories();
			try   
			{  
				BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ketki\\Desktop\\complaints.csv"));  
				BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
				int c = 1;
				while(c!=0) {
					System.out.println("***MENU***");
					System.out.println("0. Exit the program");
					System.out.println("1. Display all the complaints based on the year");
					System.out.println("2. Display all the complaints based on the name of the bank");
					System.out.println("3. Display complaints based on the complaint id");
					System.out.println("4. Display number of days took by the Bank to close the complaint");
					System.out.println("5. Display all the complaints closed/closed with explanation");
					System.out.println("6. Display all the complaints which received a timely response");
					System.out.println("7. Store a new complaint");
					
					c = Integer.parseInt(reader.readLine());
					
					switch(c) {
						case 0: System.out.println("Program Exit");
								break; 
					
						case 1: us.story1(br);
								break;
								
						case 2: us.story2(br);
								break;
								
						case 3: us.story3(br);
								break;
								
						case 4: us.story4(br);
								break;
								
						case 5: us.story5(br);
								break;
								
						case 6: us.story6(br);
								break;
								
						case 7: us.story7();
								break;
								
						default: System.out.println("Invalid Input");
								break;
					}	
				}
			} catch (IOException e) {  
				e.printStackTrace();  
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}  
}  