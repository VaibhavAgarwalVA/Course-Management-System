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
			System.out.println("-- Enter 4. Other --");
			System.out.println("------------------------------------");
			
			choice = Integer.parseInt(br.readLine());
			
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
						}
						
						else
							System.out.println("WARNING ! Incorrect choice. Returning...\n"); 
						
						break;
				
				
				
				/*********************************/
				case 2: System.out.println("-- Enter 1. Registering a participant in a course --");
						System.out.println("-- Enter 2. Display all registered participants in some course --");
						int ch;
						ch= Integer.parseInt(br.readLine());
						if(ch == 1){
							for(int i = 0; i< vec.size(); i++){
									System.out.println("Course Number # " + (i+1) + " is : " + vec.elementAt(i).get_course_name() );
							}
							
							System.out.println("Enter course number in which you want to register");
							int nnum = 0;
							try{
								nnum= Integer.parseInt(br.readLine());
								if(nnum <= 0 && nnum > vec.size() ){
									System.out.println("invalid index");
									break;
								}
							}
							catch(Exception e){
								System.out.println("Incorrect format");
							}
							
							Course c= vec.elementAt(nnum-1);  
							
							System.out.println("Enter how many participants do you want to register.");
							int nu;
							nu= Integer.parseInt(br.readLine());
							
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
								if(nnum <= 0 && nnum > vec.size() ){
									System.out.println("invalid index");
									break;
								}
							}
							catch(Exception e){
								System.out.println("Incorrect format");
							}
							
							Course c= vec.elementAt(nnum-1);  
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
						System.out.println("1. Edit course");
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
											if(num <= 0 && num > vec.size() ){
												System.out.println("Invalid course number");
												break;
											}
										}
										catch(Exception e){
											System.out.println("Incorrect value format");
										}
										
										vec.elementAt(num-1).edit_course();
									}
									
									break;
										
							
							case 2:
							
							case 3:
							
							default: System.out.println("Enter valid credentials");
							
						}
						
						
				
						break;
				
				case 4:
						break;
				
				default:
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
