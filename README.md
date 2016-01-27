Software Lab Assignment #1
# Course-Management-System
Assignment-1 (a)

Class Course {
	defines in itself, objects of-
		CLASS PARTICIPANT
		CLASS FACULTY
}

Class Run creates vector of course objects and manipulates data and functionality of Course.

Architecture - 
	1. Primary Unit: Course
	2. Faculty and Participants are identified by their course.
	3. The only way to retrieve info about faculty and participants is by exhaustively search all courses.
	4. There exists a mechanism to identify identiites by a unique identification code.
	
File IO implemented using Serialization of vector of course type objects.	
