import java.util.Stack;

public class DataStructor {

	public static void main(String[] args) {
// push an object to the stack
	Stack<String> stack = new Stack <String>();
//we will name this variable stack
	// unique methods
	// E push - any item to the top of the stack 
	// E pop - pop on top of the stack
	// E peek - seek the top of the stack
	// E search - search in the stack for an item
	System.out.println("ln before - [stack.push\"ffjfjf\"]");
	System.out.println(stack.empty());
// sysout stack.empty will come out true at this point because
		// there in nothing in the stack yet. we just made the stack with nothing in it.
	
	
	// we are not going to add to the stack now
	
	System.out.println("Ln 25 After the [stack.push] :");
	
	stack.push("naruto");
	stack.push("Gundams");
	stack.push("halo");
	stack.push("pokemon");
	
	System.out.println(stack.empty());
// stack is no longer empty
//pop most top object/ removes top pop	
//
//	stack.pop(); //removes pokrmon
//	stack.pop(); //removes halo 
//	
	String myFavGame = stack.pop();
	//removing one to many from the stack will return a stack pop error
	
	
	
	
	//list of stack
	System.out.println("my fave game variable : "+ myFavGame);
	System.out.println("\n list of stacks" + stack);
	
//pop most top object/ removes top pop	
	
	
	// we poped the last push "pokemon on ln 36" then we named it my faviorte game
// that does not mean pop is a way to see what is the top item of thee list rather	
// consider peek
	
	System.out.println("\n" +"first object in the stack : " + stack.peek() );
	
	
	//to search for a object in the method we use sesrch
	
	//ssysout
	}

}
