package com.lti.demo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UserStories {
	
	public void story1(BufferedReader br) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		String splitBy = ";";
		System.out.println("Enter the year of complaint");
		String year = reader.readLine();
		while(year.length()!=4) {
			System.out.println("Please Enter valid year, try again");
			year = reader.readLine();
		}
		while((line = br.readLine()) != null) {
			String[] complaints = line.split(splitBy);
			if(complaints[0].contains(year) == true) {
				System.out.println("Date received :"+complaints[0]+", Product :"+complaints[1]+""
						+ ", Sub-product :"+complaints[2]+ ", Issue :"+complaints[3] 
						+", Sub-issue :"+complaints[4]+", Company :"+complaints[5]+", State	:"+complaints[6]
						+", ZIP code :"+complaints[7]+", Submitted via :"+complaints[8]
						+", Date sent to company :"+complaints[9]
						+", Company response to consumer :"+complaints[10]
						+", Timely response: "+complaints[11]+", Consumer disputed :"+complaints[12]
						+", Complaint ID :"+complaints[13]);
			}
		}	
	}
	
	public void story2(BufferedReader br) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		String splitBy = ";";
		System.out.println("Enter the name of the bank");
		String bankName = reader.readLine();
		while((line = br.readLine()) != null) {
			String[] complaints = line.split(splitBy);
			if(bankName.equals(complaints[5])) {
				System.out.println("Date received :"+complaints[0]+", Product :"+complaints[1]+""
						+ ", Sub-product :"+complaints[2]+ ", Issue :"+complaints[3] 
						+", Sub-issue :"+complaints[4]+", Company :"+complaints[5]+", State	:"+complaints[6]
						+", ZIP code :"+complaints[7]+", Submitted via :"+complaints[8]
						+", Date sent to company :"+complaints[9]
						+", Company response to consumer :"+complaints[10]
						+", Timely response: "+complaints[11]+", Consumer disputed :"+complaints[12]
						+", Complaint ID :"+complaints[13]);
			}
		}	
	}
	
	public void story3(BufferedReader br) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		String splitBy = ";";
		System.out.println("Enter the complaint ID");
		int complaint_id = Integer.parseInt(reader.readLine());
		while((line = br.readLine()) != null) {
			String[] complaints = line.split(splitBy);
			if(Integer.toString(complaint_id).equals(complaints[13])) {
				System.out.println("Date received :"+complaints[0]+", Product :"+complaints[1]+""
						+ ", Sub-product :"+complaints[2]+ ", Issue :"+complaints[3] 
						+", Sub-issue :"+complaints[4]+", Company :"+complaints[5]+", State	:"+complaints[6]
						+", ZIP code :"+complaints[7]+", Submitted via :"+complaints[8]
						+", Date sent to company :"+complaints[9]
						+", Company response to consumer :"+complaints[10]
						+", Timely response: "+complaints[11]+", Consumer disputed :"+complaints[12]
						+", Complaint ID :"+complaints[13]);
			}
		}
	}
	
	public void story4(BufferedReader br) throws IOException, ParseException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		String splitBy = ";";
		System.out.println("Enter the name of the bank");
		String bankName = reader.readLine();
		while((line = br.readLine()) != null) {
			String[] complaints = line.split(splitBy);
			if(bankName.equals(complaints[5])) {
				String date_received = complaints[0];
				String date_resolved = complaints[9];
				Date date_received1;
				Date date_resolved1;
				if(date_received.contains("-")) {
					date_received1 = new SimpleDateFormat("MM-dd-yyyy").parse(date_received);
				} else {
					date_received1 = new SimpleDateFormat("MM/dd/yyyy").parse(date_received);
				}
				if(date_resolved.contains("-")) {
					date_resolved1 = new SimpleDateFormat("MM-dd-yyyy").parse(date_resolved);
				} else {
					date_resolved1 = new SimpleDateFormat("MM/dd/yyyy").parse(date_resolved);
				}
//				long daysBetween = ChronoUnit.DAYS.between(date_received1, date_resolved1);
				long diff = getDifferenceDays(date_received1,date_resolved1);
				System.out.println("Date received :"+complaints[0]+", Product :"+complaints[1]+""
						+ ", Sub-product :"+complaints[2]+ ", Issue :"+complaints[3] 
						+", Sub-issue :"+complaints[4]+", Company :"+complaints[5]
						+", Date sent to company :"+complaints[9]
						+", Complaint ID :"+complaints[13]
						+", No of day took to resolve :"+diff);
			}
		}	
	}
	
	public static long getDifferenceDays(Date d1, Date d2) {
	    long diff = d2.getTime() - d1.getTime();
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void story5(BufferedReader br) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		String splitBy = ";";
		while((line = br.readLine()) != null) {
			String[] complaints = line.split(splitBy);
			if(complaints[10].equals("Closed with explanation") || complaints[10].equals("Closed")) {
				System.out.println("Date received :"+complaints[0]+", Product :"+complaints[1]+""
						+ ", Sub-product :"+complaints[2]+ ", Issue :"+complaints[3] 
						+", Sub-issue :"+complaints[4]+", Company :"+complaints[5]+", State	:"+complaints[6]
						+", ZIP code :"+complaints[7]+", Submitted via :"+complaints[8]
						+", Date sent to company :"+complaints[9]
						+", Company response to consumer :"+complaints[10]
						+", Timely response: "+complaints[11]+", Consumer disputed :"+complaints[12]
						+", Complaint ID :"+complaints[13]);
			}
		}	
	}
	
	public void story6(BufferedReader br) throws IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		String splitBy = ";";
		while((line = br.readLine()) != null) {
			String[] complaints = line.split(splitBy);
			if(complaints[11].toLowerCase().equals("yes")) {
				System.out.println("Date received :"+complaints[0]+", Product :"+complaints[1]
						+ ", Sub-product :"+complaints[2]+ ", Issue :"+complaints[3] 
						+", Sub-issue :"+complaints[4]+", Company :"+complaints[5]+", State	:"+complaints[6]
						+", ZIP code :"+complaints[7]+", Submitted via :"+complaints[8]
						+", Date sent to company :"+complaints[9]
						+", Company response to consumer :"+complaints[10]
						+", Timely response: "+complaints[11]+", Consumer disputed :"+complaints[12]
						+", Complaint ID :"+complaints[13]);
			}
		}
	}
	
//	07-10-2016;Debt collection;Other (i.e. phone, health club, etc.);Cont'd attempts collect debt not owed;Debt resulted from identity theft;Credit Adjustments Inc;MN;554XX;Web;07-10-2016;Closed with explanation;Yes;No;2005385
//	07-11-2016;Debt collection;Credit card;Communication tactics;Threatened to take legal action;Encore Capital Group;PR;007XX;Web;07-11-2016;Closed with explanation;Yes;;2006528
	public void story7() throws IOException {
		File file = new File("G:\\Work Data\\LTI\\Core JAVA\\Workspace\\Mini_Project\\src\\com\\lti\\Project1\\complaints12");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		System.out.println("Taking Input from User");
		System.out.println("Date received");
		String input = reader.readLine();
		str = str + input +";";
		System.out.println("Product");
		input = reader.readLine();
		str = str + input + ";";
		System.out.println("Sub-product");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Issue");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Sub-issue");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Company");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("State");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("ZIP code");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Submitted via");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Date sent to company");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Company response to consumer");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Company response to consumer");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Timely response");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Consumer disputed");
		input = reader.readLine();
		str = str + input +";";
		System.out.println("Complaint ID");
		input = reader.readLine();
		str = str + input +";";
		br.write(str);
		br.close();
		fr.close();
		fr.write(str);
	}
}
