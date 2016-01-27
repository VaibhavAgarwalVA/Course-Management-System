import java.io.*;
import java.util.*;


public class Faculty 
{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	
	private String fac_department;
	private String fac_name;
	private String fac_address;
	private long fac_mobile_no;
	private String fac_email_id;
	
	
	
	//constructor
	Faculty () {
		fac_department = " ";
		fac_name = " ";
		fac_address = " ";
		fac_mobile_no = 0;
		fac_email_id = " ";
	}
	
	//setters
	void set_fac_name (String n) {
		fac_name = n;
	}
	
	void set_fac_dep (String d) {
		fac_department = d;
	}
	
	void set_fac_address (String a) {
		fac_address = a;
	}
	
	void set_fac_email_id (String e) {
		fac_email_id = e;
	}
	
	void set_fac_mobile_no (long m) {
		fac_mobile_no = m;
	}
	
	//getters
	String get_fac_name () {
		return fac_name;
	}
	
	String get_fac_dep () {
		return fac_department;
	}
	
	String get_fac_address () {
		return fac_address;
	}
	
	String get_fac_email_id () {
		return fac_email_id;
	}
	
	long get_fac_mobile_no () {
		return fac_mobile_no;
	}
	
	//functions
	void display_fac_name(){
		System.out.println("Name : " + fac_name);
	}
	
	void create_faculty()throws IOException{
						
					//try{		
							System.out.println("\n-- Faculty Creation Routine-- ");
							System.out.println("Enter the details as mentioned.");
							
							System.out.print("\n-- i. Faculty-name : ");
							String fn = br.readLine();
							fac_name= fn;
							
							System.out.print("\n-- ii. Faculty's Address : ");
							String ad = br.readLine();
							fac_address= ad;
														
							System.out.print("\n-- iii. Faculty's Department : ");
							String dep = br.readLine();
							fac_department= dep;
							
							System.out.print("\n-- iv. Faculty's email-id : ");
							String id = br.readLine();
							fac_email_id= id;
							
							System.out.print("\n-- v. Faculty's Contact Number: ");
							long num=0;
							try{
								num = Long.parseLong(br.readLine());
							}
							catch(Exception e){
								System.out.println("Incorrect format");
							}	 
							fac_mobile_no= num;
					//}
				//	catch(Exception et){
						//System.out.println("Enter the details in a valid format");
					//}	
	}
	
	void edit_faculty()throws IOException{
		System.out.println("Which field do you want to edit");
		System.out.println("1 - Name");
		System.out.println("2 - Address");
		System.out.println("3 - Mobile Number");
		System.out.println("4 - E-mail ID");
		System.out.println("5 - Department");
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
				case 1: System.out.println("Enter the changed faculty name");
						stt= br.readLine();
						set_fac_name(stt);
						System.out.println("Name changed to : "+ get_fac_name());
													break;
													
				case 2: System.out.println("Enter the changed address");
						stt= br.readLine();
						fac_address = stt;
						System.out.println("Address changed to : "+ fac_address);
													break;
													
				case 3: System.out.println("Enter the changed mobile number");
						long numberm = 0;
						try{
							numberm = Long.parseLong(br.readLine());
						}
						catch(Exception e){
							System.out.println("Enter a valid integer type value");
						}
						fac_mobile_no = numberm;
						System.out.println("Mobile Number changed to : "+ fac_mobile_no);
													break;
													
				case 4: System.out.println("Enter the changed email id.");
						stt = "random@gmail.com";
						stt = br.readLine();
						fac_email_id = stt;
						System.out.println("Email ID changed to : "+ fac_email_id);
													break;
	
				case 5: System.out.println("Enter the changed department name.");
						stt = br.readLine();
						fac_department = stt;
						System.out.println("Department changed to : "+ fac_department);
													break;
													
				default : System.out.println("Invalid entry");	
				//catch(Exception et){
					//System.out.println("Input format error");
				//}										
			//}
	}	
}
}

