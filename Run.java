import java.io.*;
import java.util.*;

public class Run
{
	Course arr[]= new Course[10];	
	
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
			System.out.println("-- Enter 3. 'Faculty' related task --");
			System.out.println("-- Enter 4. Other --");
			System.out.println("------------------------------------");
			
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) 
			{
				case 1: System.out.println("-- Enter 1. Creating a new course --");
						System.out.println("-- Enter 2. Display particular course details --");
						int cc;
						cc = Integer.parseInt(br.readLine());
						
						if(cc == 1){
							
							Course c= new Course();
							c.create_course();
							
							
							
							if(c.valid_course() == true) {
								
								System.out.println("\n\n Your entered course details are: \n");
								c.display_course();
								System.out.println("\n Details entered successfully !");
								
								//push the object into the file
							}
							else
								System.out.println("\nThere seems to be some problem. Please try again !");
						}
						
						else if(cc == 2){
							Course c= new Course();
							//read object from the list
							
							//for all objects 
								c.display_course_name();
						}
						
						else
							System.out.println("WARNING ! Incorrect choice. Returning...\n"); 
						
						
				
				/*********************************/
				case 2: System.out.println("-- Enter 1. Registering a participant in a course --");
						System.out.println("-- Enter 2. Display all registered participants in some course --");
						int ch;
						ch= Integer.parseInt(br.readLine());
						if(ch == 1){
							
							
							Course c= new Course();
							
							System.out.println("Enter how many participants do you want to register.");
							int nu;
							nu= Integer.parseInt(br.readLine());
							
							for(int i=0;i<nu;i++)
								c.register_part(i);
							
							System.out.println("\n Details entered successfully !");
							//push object to file
							
						}
						
						else if(ch == 2){
							Course c= new Course();
							//read object from the list
							
							//for all objects 
								c.display_course_name();
						}
						
						else
							System.out.println("WARNING ! Incorrect choice. Returning...\n"); 
						
							
						break;
				
				case 3: 
						break;
				
				case 4:
						break;
				
				default:
			}
			
			/*********************************************/
			System.out.println("Do you want to continue (1/0). 0 to exit.");
			choice = Integer.parseInt(br.readLine());
			if(choice == 0)
				break;	 
			/*********************************************/	
		}while(true);
		
		System.out.println("\n\n-- Thanks a lot for visiting. Have a nice day ! --\n");
	}
}
