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
	void create_faculty(){
						
					try{		
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
							long num = Long.parseLong(br.readLine());
							fac_mobile_no= num;
					}
					catch(Exception e){
						System.out.println("Enter the details in a valid format");
					}	
	}
}


