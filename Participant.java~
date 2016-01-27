import java.io.*;
import java.util.*;


public class Participant implements java.io.Serializable
{
	
	private String part_name;
	private String part_address;
	private long part_mobile_no;
	private String part_org;
	private String part_email_id;
	
	/**********************************/
	
	
	//constructor
	Participant() {
		part_name = " ";
		part_address = " ";
		part_mobile_no = 0;
		part_org = " ";
		part_email_id = " ";
	}
	
	//setters
	void set_part_name (String n) {
		part_name = n;
	}	
	
	void set_part_address (String a) {
		part_address = a;
	}
	
	void set_part_mobile_no (long m) {
		part_mobile_no = m;
	}
	
	void set_part_org (String o) {
		part_org = o;
	}
	
	void set_part_email_id (String e) {
		part_email_id = e;
	}
	
	//getters
	String get_part_name () {
		return part_name;
	}
	
	String get_part_org () {
		return part_org;
	}
	
	String get_part_address () {
		return part_address;
	}
	
	String get_part_email_id () {
		return part_email_id;
	}
	
	long get_part_mobile_no () {
		return part_mobile_no;
	}
	
	//functions
	void display_part_name(){
		System.out.println("Name : " + part_name);
	}
	
	void create_participant()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\n-- Participant Creation Routine-- ");
			//try{
							System.out.println("\nEnter the details as mentioned.");
							
							System.out.print("\n-- i. Participant-name : ");
							String pn = br.readLine();
							part_name= pn;
							
							System.out.print("\n-- ii. Participant's Address : ");
							String ad = br.readLine();
							part_address= ad;
														
							System.out.print("\n-- iii. Participant's Organisation : ");
							String or = br.readLine();
							part_org= or;
							
							System.out.print("\n-- iv. Participant's email-id : ");
							String id = br.readLine();
							part_email_id= id;
							
							System.out.print("\n-- v. Participant's Contact Number: ");
							long num = 00;
							try{
								num = Long.parseLong(br.readLine());
							}
							catch(Exception e){
								System.out.println("Enter a valid integer");	
							} 
							part_mobile_no= num;
				//}
			//	catch(Exception et){
					//System.out.println("Invalid input format");
				//}	
	}
	
	
	
	void edit_participant()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which field do you want to edit");
		System.out.println("1 - Name");
		System.out.println("2 - Address");
		System.out.println("3 - Mobile Number");
		System.out.println("4 - E-mail ID");
		System.out.println("5 - Organisation");
		int cco = 0;
		String stt;
		try{
			cco = Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println("Enter valid credentials");
		}
		switch(cco)
		{
			//try{
				case 1: System.out.println("Enter the changed participant name");
						stt= br.readLine();
						set_part_name(stt);
						System.out.println("Name changed to : "+ get_part_name());
													break;
													
				case 2: System.out.println("Enter the changed address");
						stt= br.readLine();
						part_address = stt;
						System.out.println("Address changed to : "+ part_address);
													break;
													
				case 3: System.out.println("Enter the changed mobile number");
						long numberm = 0;
						try{
							numberm = Long.parseLong(br.readLine());
						}
						catch(Exception e){
							System.out.println("Enter a valid integer type value");
						}
						part_mobile_no = numberm;
						System.out.println("Mobile Number changed to : "+ part_mobile_no);
													break;
													
				case 4: System.out.println("Enter the changed email id.");
						stt = "random@gmail.com";
						stt = br.readLine();
						part_email_id = stt;
						System.out.println("Email ID changed to : "+ part_email_id);
													break;
	
				case 5: System.out.println("Enter the changed organisation name.");
						stt = br.readLine();
						part_org = stt;
						System.out.println("Organisation name changed to : "+ part_org);
													break;
				default : System.out.println("Invalid entry");	
			//}
			//catch(Exception et){
				//System.out.println("Invalid format");
			//}
																	
					
		}
	}	
}
