import java.io.*;
import java.util.*;

public class Run
{
	
	public static Vector<Course> vec= new Vector<Course>();	
	
	public static void main(String args[])throws Exception {
	
		int choice;
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-- Welcome to Short Term Course Management Portal --");
		System.out.println("**************************************************** \n");
		System.out.println("This portal will guide you to perform various tasks related to courses, participants and faculty associated.");
		
		do{
			System.out.println("-- PORTAL DETAILS --");
			System.out.println("-- Enter 1. 'Course' creation wizard OR 'Course' display segment --");
			System.out.println("-- Enter 2. 'Participants' registration portal --");
			System.out.println("-- Enter 3. Editing details of courses, participants and faculty --");
			System.out.println("-- Enter 4. Deleting something --");
			System.out.println("-- Enter 5. EXIT --");
			
			System.out.println("------------------------------------");
			choice = 0;
			try {
				choice = Integer.parseInt(br.readLine());
			}
			catch(Exception e){
				System.out.println("Enter a valid value");
			}
			
			switch(choice) 
			{
				case 1: System.out.println("-- Enter 1. Creating a new course --");
						System.out.println("-- Enter 2. Display particular course details --");
						int cc = 0;
						try{
							cc = Integer.parseInt(br.readLine());
						}
						catch(Exception e){
							System.out.println("Incorrect format");
						}
						if(cc == 1){
							
							Course c= new Course();
							c.create_course();
							
							if(c.valid_course() == true) {
								
								System.out.println("\n\n Your entered course details are: \n");
								c.display_course();
								System.out.println("\n Details entered successfully !");
								
								vec.addElement(c);
								//push the object into the file
								
								
								System.out.println("\nHow about entering participants now ?? \nEnter 1 to register participants.");
								int ni;
								ni= 0;
								try{
									ni= Integer.parseInt(br.readLine());
								}
								catch(Exception e){
									System.out.println("Incorrect format");
								}
								
								if(ni != 1){
									break;
								}
							}
							else
								System.out.println("\nThere seems to be some problem. Please try again !");
						}
						
						else if(cc == 2){
							if(vec.size() == 0){
								System.out.println("Nothing to display");
							}
							for(int i = 0; i<vec.size(); i++)
								vec.elementAt(i).display_course();
							
							break;	
						}
						
						else {
							System.out.println("WARNING ! Incorrect choice. Returning...\n"); 
							break;
						}
						
				
				
				
				/*********************************/
				case 2: System.out.println("-- Enter 1. Registering a participant in a course --");
						System.out.println("-- Enter 2. Display all registered participants in some course --");
						int ch = 0;
						try{
							ch= Integer.parseInt(br.readLine());
						}
						catch(Exception e){
							System.out.println("Error. Enter a valid integer.");
						}
						if(ch == 1){
							if(vec.size() == 0){
								System.out.println("NO courses to show. Create some course first.");
								break;
							}
							for(int i = 0; i< vec.size(); i++){
									System.out.println("Course Number # " + (i+1) + " is : " + vec.elementAt(i).get_course_name() );
							}
							
							System.out.println("Enter course number in which you want to register");
							int nnum = 0;
							try{
								nnum= Integer.parseInt(br.readLine());
								if(nnum <= 0 || nnum > vec.size() ){
									System.out.println("invalid index");
									break;
								}
							}
							catch(Exception e){
								System.out.println("Incorrect format");
								break;
							}
							
							Course c= vec.elementAt(nnum-1);  
							
							System.out.println("Enter how many participants do you want to register.");
							int nu = 0;
							try{
								nu= Integer.parseInt(br.readLine());
								while(nu > 5 || nu < 0){
									System.out.println("Invalid choice. Enter a number b/w 0 and 5. Try again.");
									nu= Integer.parseInt(br.readLine());
								}
							}
							catch(Exception e){
								System.out.println("Invalid input");
								break;
							}
							c.set_num_of_part(nu);
							for(int i=0;i<nu;i++)
								c.register_part(i);
							
							System.out.println("\n Details entered successfully !");
							//push object to file
							
						}
						
						else if(ch == 2){
						
							if(vec.size() == 0) {
								System.out.println("NO courses to show. Returning...");
								break;
							}	
							for(int i = 0; i< vec.size(); i++){
									System.out.println("Course Number # " + (i+1) + " is : " + vec.elementAt(i).get_course_name() );
							}
							
							System.out.println("Enter course number.");
							int nnum = 0;
							try{
								nnum= Integer.parseInt(br.readLine());
								if(nnum <= 0 || nnum > vec.size() ){
									System.out.println("invalid index");
									break;
								}
							}
							catch(Exception e){
								System.out.println("Incorrect format");
								break;
							}
							
							Course c= vec.elementAt(nnum-1);  
							if(c.get_num_of_part() == 0){
								System.out.println("No registered participant yet");
							}	
							for(int i=0; i<c.get_num_of_part(); ++i)
								c.display_participants();
						}
						
						else
							System.out.println("WARNING ! Incorrect choice. Returning...\n"); 
						
							
						break;
				/*****************************************************/
				
				case 3: System.out.println("\n-----------------------------------------------");
						System.out.println("\nWelcome to editing portal\n"); 
							
						System.out.println("Edit Options");
						System.out.println("1. Edit Course");
						System.out.println("2. Edit Participant");
						System.out.println("3. Edit Faculty");
						String srch;
						boolean boo = false;
						int cce = 0;
						try{
							cce = Integer.parseInt(br.readLine());
						}
						catch(Exception e){
							System.out.println("Enter a valid integer");
						}
						
						switch(cce)
						{
							case 1: System.out.println("Enter the name of the course where you want to make changes");
									srch = br.readLine();
									boo = false;
									for(int i = 0; i< vec.size(); i++){
										if(vec.elementAt(i).get_course_name().equals(srch) == true){
											System.out.println("Course Number : " + (i+1) );
											vec.elementAt(i).display_course_name();
											boo = true;
										}
									}
									
									if(boo == false){
										System.out.println("No such course found. Please check.");
									}
									else{
										System.out.println("Enter the course number of the course you want to edit");
										int num=0;
										try{
											num = Integer.parseInt(br.readLine());
											if(num <= 0 || num > vec.size() ){
												System.out.println("Invalid course number");
												break;
											}
										}
										catch(Exception e){
											System.out.println("Incorrect value format");
											break;
										}
										
										vec.elementAt(num-1).edit_course();
									}
									
									break;
										
							
							case 2: System.out.println("Enter the name of the participant where you want to make changes");
									srch = br.readLine();
									boo = false;
									for(int i = 0; i< vec.size(); i++){
										for(int j = 0; j< vec.elementAt(i).get_num_of_part(); j++){
											if(vec.elementAt(i).reg_part.elementAt(j).get_part_name().equals(srch) == true){
												System.out.println("Participant Number : " + (i)+(j) );
												vec.elementAt(i).display_course_name();
												vec.elementAt(i).reg_part.elementAt(j).display_part_name();
												boo = true;
											}
										}
									}
									
									if(boo == false){
										System.out.println("No such participant found. Please check.");
									}
									else{
										System.out.println("Enter the participant number of the participant you want to edit");
										int num=-1;
										try{
											num = Integer.parseInt(br.readLine());
											while(num < 0 || num/10 >= vec.size() || num%10 >= vec.elementAt(num/10).get_num_of_part() ){
												System.out.println("Invalid participant number. Try again.");
												num = Integer.parseInt(br.readLine());	
											}
										}
										catch(Exception e){
											System.out.println("Incorrect value format");
											break;
										}
										
										vec.elementAt(num/10).reg_part.elementAt(num%10).edit_participant();
									}
									
									break;
							
							case 3: System.out.println("Enter the name of the faculty member where you want to make changes");
									srch = br.readLine();
									boo = false;
									for(int i = 0; i< vec.size(); i++){
										for(int j = 0; j< vec.elementAt(i).get_num_of_fac(); j++){
											if(vec.elementAt(i).course_fac.elementAt(j).get_fac_name().equals(srch) == true){
												System.out.println("Faculty Number : " + (i)+(j) );
												vec.elementAt(i).display_course_name();
												vec.elementAt(i).course_fac.elementAt(j).display_fac_name();
												boo = true;
											}
										}
									}
									
									if(boo == false){
										System.out.println("No such faculty found. Please check.");
									}
									else{
										System.out.println("Enter the faculty code of the faculty you want to edit");
										int num=0;
										try{
											num = Integer.parseInt(br.readLine());
											while(num < 0 || num/10 >= vec.size() || num%10 >= vec.elementAt(num/10).get_num_of_fac() ){
												System.out.println("Invalid faculty number. Try again.");
												num = Integer.parseInt(br.readLine());	
											}
										}
										catch(Exception e){
											System.out.println("Incorrect value format");
											break;
										}
										
										vec.elementAt(num/10).course_fac.elementAt(num%10).edit_faculty();
									}
									break;
									
							default: System.out.println("Enter valid credentials");
							
						}
						
						break;
				
				case 4:	System.out.println("Welcome to deletion portal");
						System.out.println("Delete Options");
						System.out.println("1. Delete Course");
						System.out.println("2. Delete Participant");
						System.out.println("3. Delete Faculty");
						String srchh;
						boolean booh = false;
						int cceh = 0;
						try{
							cceh = Integer.parseInt(br.readLine());
						}
						catch(Exception e){
							System.out.println("Enter a valid integer");
						}
						
						switch(cceh)
						{
							case 1: System.out.println("Enter the name of the course where you want to delete");
									srchh = br.readLine();
									booh = false;
									for(int i = 0; i< vec.size(); i++){
										if(vec.elementAt(i).get_course_name().equals(srchh) == true){
											System.out.println("Course Number : " + (i+1) );
											vec.elementAt(i).display_course_name();
											booh = true;
										}
									}
									
									if(booh == false){
										System.out.println("No such course found. Please check.");
									}
									else{
										System.out.println("Enter the course number of the course you want to edit");
										int num=0;
										try{
											num = Integer.parseInt(br.readLine());
											if(num <= 0 || num > vec.size() ){
												System.out.println("Invalid course number");
												break;
											}
										}
										catch(Exception e){
											System.out.println("Incorrect value format");
											break;
										}
										
										vec.remove(num-1);
										System.out.println("Deleted");
									}
									
									break;
										
							
							case 2: System.out.println("Enter the name of the participant where you want to delete");
									srchh = br.readLine();
									booh = false;
									for(int i = 0; i< vec.size(); i++){
										for(int j = 0; j< vec.elementAt(i).get_num_of_part(); j++){
											if(vec.elementAt(i).reg_part.elementAt(j).get_part_name().equals(srchh) == true){
												System.out.println("Participant Number : " + (i)+(j) );
												vec.elementAt(i).display_course_name();
												vec.elementAt(i).reg_part.elementAt(j).display_part_name();
												booh = true;
											}
										}
									}
									
									if(booh == false){
										System.out.println("No such course found. Please check.");
									}
									else{
										System.out.println("Enter the participant number of the participant you want to delete");
										int num=0;
										try{
											num = Integer.parseInt(br.readLine());
											while(num <= 0 || num/10 >= vec.size() || num%10 >= vec.elementAt(num/10).get_num_of_part() ){
												System.out.println("Invalid participant number. Try again.");
												num = Integer.parseInt(br.readLine());	
											}
										}
										catch(Exception e){
											System.out.println("Incorrect value format");
											break;
										}
										
										vec.elementAt(num/10).delete_part(num%10);
									}
									
									break;
							
							case 3: System.out.println("Enter the name of the faculty member where you want to delete");
									srchh = br.readLine();
									booh = false;
									for(int i = 0; i< vec.size(); i++){
										for(int j = 0; j< vec.elementAt(i).get_num_of_fac(); j++){
											if(vec.elementAt(i).course_fac.elementAt(j).get_fac_name().equals(srchh) == true){
												System.out.println("Faculty Number : " + (i)+(j) );
												vec.elementAt(i).display_course_name();
												vec.elementAt(i).course_fac.elementAt(j).display_fac_name();
												booh = true;
											}
										}
									}
									
									if(booh == false){
										System.out.println("No such course found. Please check.");
									}
									else{
										System.out.println("Enter the faculty code of the faculty you want to delete");
										int num=0;
										try{
											num = Integer.parseInt(br.readLine());
											while(num <= 0 || num/10 >= vec.size() || num%10 >= vec.elementAt(num/10).get_num_of_fac() ){
												System.out.println("Invalid faculty number. Try again.");
												num = Integer.parseInt(br.readLine());	
											}
										}
										catch(Exception e){
											System.out.println("Incorrect value format");
											break;
										}
										
										vec.elementAt(num/10).delete_fac(num%10);
									}
									break;
									
							default: System.out.println("Enter valid credentials");
							
						}
						break;
				
				case 5: 
						break;
				
				default: System.out.println("Enter a valid choice option");
			}
			
			/*********************************************/
			System.out.println("Do you want to continue (1/0). 0 to exit.");
			choice = 0;
			try{
				choice = Integer.parseInt(br.readLine());
			}
			catch(Exception e){
				System.out.println("Incorrect choice. Breaking out...");
			}
			if(choice == 0)
				break;	 
			/*********************************************/	
		}while(true);
		
		System.out.println("\n\n-- Thanks a lot for visiting. Have a nice day ! --\n");
	}
}
