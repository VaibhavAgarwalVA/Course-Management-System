import java.io.*;
import java.util.*;

public class Course 
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	// data-members 
	
	private String course_name;
	private double fees;
	private String start;
	private Integer duration_days;
	private Integer num_of_fac;
	private Integer num_of_part;
	
	Faculty course_coord;
	Faculty course_fac[] = new Faculty[5];
	Participant reg_part[] = new Participant[5];
	
	/**********************************/
	
	
	//constructors
	
	Course () {
		course_name = " ";
		fees = 0.0;
		start = " ";
		duration_days = 0;
		num_of_fac= 0;
		num_of_part= 0;
		
		course_coord= new Faculty();
		for(int i=0; i<5; i++){
			course_fac[i]= new Faculty();
			reg_part[i]= new Participant();
		}
	}
	
	
	
	//setters
	void set_course_name ( String s ) {
		course_name = s;
	} 
	
	void set_course_fee ( double f ) {
		fees = f;
	} 
	
	void set_start_date ( String s ) {
		start = s;
	} 
	
	void set_course_duration ( int dd ) {
		duration_days = dd;
	}
	
	void set_num_of_fac (int n) {
		num_of_fac = n;
	}
	
	void set_num_of_part (int n) {
		num_of_part = n;
	}
	
	//getters
	String get_course_name () {
		return course_name;
	} 
	
	double get_course_fee () {
		return fees;
	}  
	
	String get_start_date(){
		return start;
	}  
	
	int get_course_duration () {
		return duration_days;
	}

	int get_num_of_fac () {
		return num_of_fac;
	}
	
	int get_num_of_part () {
		return num_of_part;
	}
	
	
	
	// methods
	
	boolean valid_course () {
		if( duration_days > 14 ) {
			System.out.println("Invalid course duration. Maximum 14 days allowed. \n");
			return false;
		}
		return true;
	} 
	
	void delete_part(int i){
		;
	}
	
	void delete_fac(int i){
		;
	}
	
	void display_course() {
		System.out.println("-- Course Details --");
		System.out.println("Course Name: "+ course_name);
		System.out.println("Course Start Date: "+ start);
		System.out.println("Course Fees: INR "+ fees);
		System.out.println("Course Duration: "+ duration_days + " days");
		System.out.println("Course Coordinator: "+ course_coord.get_fac_name() );
		if(num_of_fac > 0){
			System.out.println("Associsted Faculty List:");
			for(int i=0;i<num_of_fac;i++)
				System.out.println("Faculty #"+(i+1)+" : "+course_fac[i].get_fac_name() );
		}
		else
			System.out.println("No associated faculty.");
		
		if(num_of_part > 0){
			System.out.println("Registered Participant List:");
			for(int i=0;i<num_of_part;i++)
				System.out.println("Participant #"+(i+1)+" : "+reg_part[i].get_part_name() );
		}
		else
			System.out.println("No registered participant yet.");	
	}
	
	void display_course_name() {
		System.out.println("Course Name: "+ course_name);
	}
	
	void create_course() throws IOException{
		System.out.println("\n-- Course Creation Portal-- ");
					//try{	
							System.out.println("Enter the details as mentioned.");
							
							System.out.print("\n-- i. Course-name : ");
							String cn = br.readLine();
							course_name= cn;
							
							System.out.print("\n-- ii. Course fee (in INR) : ");
							double fe = 0;
							try{
								fe= Double.parseDouble(br.readLine());
							}
							catch(Exception e){
								System.out.println("Please enter valid integer");
							}
							fees= fe;
														
							System.out.print("\n-- iii. Course start-date (dd/mm/yyyy in a single string) : ");
							String st = br.readLine();
							start = st;
							
							System.out.print("\n-- iv. Course duration (in days): ");
							int du = 0;
							try{
							du= Integer.parseInt(br.readLine());
							}
							catch(Exception e){
								System.out.println("Please enter valid integer");
							}
							duration_days= du;
							
							System.out.println("------------------------------------------------");
							System.out.println("\nDetails Noted. Redirecting to course co-ordinator creation directive...\n");
							for(int i=0; i < 100000000; i++) ;
							
							course_coord.create_faculty();
							
							System.out.println("\nDetails Noted. Enter the number of faculty associated with the course.");
							int n = 0;
							try{
								n= Integer.parseInt(br.readLine());
								while(n < 0 || n > 5){
									System.out.println("Enter a non-negative value less than 5. ");
									n= Integer.parseInt(br.readLine());
								}
								
							}
							catch(Exception e){
								System.out.println("Please enter valid integer");
							}
							num_of_fac= n;
							
							for(int i=0; i<num_of_fac; i++){
								System.out.println("\n------------------------------");
								System.out.println("\n\nFaculty Number : "+(i+1));
								course_fac[i].create_faculty();
							}
						//}
						//catch(Exception et){
							//System.out.println("Invalid input");
						//}	
							
	}
	
	void register_part(int i)throws IOException{
		reg_part[i].create_participant();
		System.out.println("\n-- Participant details noted successfully --\n");
	}
	
	void display_participants(){
		for(int i=0;i<num_of_part;i++)
			System.out.println("Participant #"+(i+1)+" is : "+ 	reg_part[i].get_part_name());
	}
	
	//search for faculty
	boolean search_fac_by_name (String n) {
		boolean vv = false;
		if((course_coord.get_fac_name()).equals(n) == true)
			vv = true;
		else{
			for(int i=0; i< num_of_fac; i++){
				if((course_fac[i].get_fac_name()).equals(n) == true)
					vv = true;
			}
		}
		return vv;	
	}
	
	//search for participant
	boolean search_part_by_name (String n) {
		boolean vv = false;
		for(int i=0; i< num_of_part; i++){
			if((reg_part[i].get_part_name()).equals(n) == true)
				vv = true;
		}
		return vv;	
	}
	
	void edit_course()throws IOException{
		System.out.println("Which field do you want to edit");
		System.out.println("1 - Course Name");
		System.out.println("2 - Start- date");
		System.out.println("3 - Fees");
		System.out.println("4 - Duration of course");
		System.out.println("5 - Course Coordinator");
		int cco = 0;
		String stt;
		int stri;
		try{
			cco = Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println("Enter valid credentials");
		}
		switch(cco)
		{
			//try{		
				case 1: System.out.println("Enter the changed course name");
						stt= br.readLine();
						set_course_name(stt);
						System.out.println("Course Name changed to : "+ get_course_name());
													break;
													
				case 2: System.out.println("Enter the changed start date");
						stt= br.readLine();
						set_start_date(stt);
						System.out.println("Course Start Date changed to : "+ get_start_date());
													break;
													
				case 3: System.out.println("Enter the changed course fee");
						double fees_c = 0.0;
						try{
							fees_c = Double.parseDouble(br.readLine());
						}
						catch(Exception e){
							System.out.println("Enter a valid floating type value");
						}
						set_course_fee(fees_c);
						System.out.println("Course Fees changed to : "+ get_course_fee());
													break;
													
				case 4: System.out.println("Enter the changed course duration");
						stri = 0;
						try{
							stri = Integer.parseInt(br.readLine());
							while(stri < 0){
								System.out.println("Duration can't be negative. Try again.");
								stri = Integer.parseInt(br.readLine()); 
							}
								
						}
						catch(Exception e){
							System.out.println("Enter a valid integer as course duration in days."); 
						}
						set_course_duration(stri);
						System.out.println("Course Fees changed to : "+ get_course_duration());
													break;
	
				case 5: System.out.println("Enter the details of the changed course coordinator");
						course_coord.create_faculty();
						System.out.println("Course Coordinator changed to " + course_coord.get_fac_name());
									break;
			//	}
				
		//		catch(Exception e){
	//				System.out.println("Enter the details in valid format");
//				}									
													
				default : System.out.println("Invalid entry");		
			}
	}
	
	 
}


