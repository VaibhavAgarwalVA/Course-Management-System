import java.io.*;

public class Participant 
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String part_name;
	String part_address;
	long part_mobile_no;
	String part_org;
	String part_email_id;
	
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
	void create_participant()throws IOException{
		System.out.println("\n\n-- Participant Creation Routine-- ");
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
							long num = Long.parseLong(br.readLine());
							part_mobile_no= num;
							
	}	
}