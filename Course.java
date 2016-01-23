import java.io.*;

public class Course 
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	// data-members 
	
	String course_name;
	double fees;
	Integer date;
	Integer month;
	Integer year;
	Integer duration_days;
	Integer num_of_fac;
	Integer num_of_part;
	
	Faculty course_coord;
	Faculty course_fac[] = new Faculty[5];
	Participant reg_part[] = new Participant[5];
	
	/**********************************/
	
	
	//constructors
	
	Course () {
		course_name = " ";
		fees = 0.0;
		date = 0;
		month = 0;
		year = 0;
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
	
	void set_course_date ( int d, int m, int y ) {
		date = d;
		month = m;
		year = y;
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
	
	int get_course_date () {
		return date;
	}  
	
	int get_course_month () {
		return month;
	}
	
	int get_course_year () {
		return year;
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
			System.out.println("Invalid course duration \n");
			return false;
		}
		return true;
	} 
	
	void display_course() {
		System.out.println("-- Course Details --");
		System.out.println("Course Name: "+ course_name);
		System.out.println("Course Start Date: "+ date + "/" + month + "/" + year);
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
	
	void create_course()throws IOException {
		System.out.println("\n-- Course Creation Portal-- ");
							System.out.println("Enter the details as mentioned.");
							
							System.out.print("\n-- i. Course-name : ");
							String cn = br.readLine();
							course_name= cn;
							
							System.out.print("\n-- ii. Course fee (in INR) : ");
							double fe = Double.parseDouble(br.readLine());
							fees= fe;
														
							System.out.print("\n-- iii. Course start-date (as- 'dd' then 'mm' then 'yyyy' ) : ");
							int d = Integer.parseInt(br.readLine());
							int m = Integer.parseInt(br.readLine());
							int y = Integer.parseInt(br.readLine());
							set_course_date(d,m,y);
							
							System.out.print("\n-- iv. Course duration (in days): ");
							int du = Integer.parseInt(br.readLine());
							duration_days= du;
							
							System.out.println("------------------------------------------------");
							System.out.println("\nDetails Noted. Redirecting to course co-ordinator creation directive...\n");
							for(int i=0; i < 100000000; i++) ;
							
							course_coord.create_faculty();
							
							System.out.println("\nDetails Noted. Enter the number of faculty associated with the course.");
							int n;
							n= Integer.parseInt(br.readLine());
							num_of_fac= n;
							
							for(int i=0; i<num_of_fac; i++){
								System.out.println("\n------------------------------");
								System.out.println("\n\nFaculty Number : "+(i+1));
								course_fac[i].create_faculty();
							}
							
							System.out.println("\n\nCourse created. Saving and returning...\n");
							for(int i=0; i < 100000000; i++) ;
	}
	
	void register_part(int i)throws IOException{
	
		reg_part[i].create_participant();
	}
	 
}


