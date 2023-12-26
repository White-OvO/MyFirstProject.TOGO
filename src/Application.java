public class Application 
{

	public static void main(String[] args) {
//    "//"This is the variable to write a comment.
		/*
		 * Primitive data type (8 types)
		 * int - an integer (a number)
		 * double - decimal places 32.899403 For example an item price.	
		 * float - precision decimal data type 45/33733
		 * long - like a number or integer of a number range
		 * short - ike a int. less of number range
		 * byte - 8 bits of data
		 * char - a single character - a B A & // A middle name would be a strign while a Initial only need ' ' and not double " ".
		 * boolean - true or false
		 * 
		 *
		 * 
		 * 
		 * 
		 * Objects
		 * string - us textual data, a string of characters
		 * 
		 *   always CAP first letter for a string EX: String "  TEXT " ;
		 * 
		 */
		
	// variable declaration - type, identifier, assignment operator, value, semicolon
		
		// system.out.println FOLLOWED by ("text here") and a semicolon to add text to your project. 
		//Always CAP "s" in Sytem.out.println (__) ;
	int numbersofFriends;
	
	int Chrissage = 67;
	
	char middleInitial = 'C';
	
	double accountbalance = 45.67;
	// For a double to add integers togther 
	boolean it_is_cold_outside = true;
	
	String firstname = "Chris";
	
	System.out.println(middleInitial);
	
	System.out.println(Chrissage);
	
	System.out.println(accountbalance);
	
	System.out.println(it_is_cold_outside);
	System.out.println(firstname);
	
   //operator performs actions on operands
   // + - * /
	int age = 34 * 2;
	System.out.println(age) ; 
	boolean isage30 = age == 30;
	System.out.println(isage30);
	
	
	age = age + 1;
	System.out.println(age);
	
	String firstname1 = "chris";
	String lastname = "Gonzalez";
	String fullname = firstname1 + " " + lastname ; 
	System.out.println( fullname);
	
	System.out.println(495 * 243);
	Object system;
	
	
	
	for (int i = 0; i < 3; i++) {
		System.out.println("Helloworld");
	}
	
String [] colors  = { "blue", "red", "yellow"};
for (int i = 0; i < 3; i++) {
	System.out.println(colors[i]);
}
	//Concatenation 
	
}
}
	