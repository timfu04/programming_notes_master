
public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/ method is created and shared.
		// 			The class "owns" the static member
		// 			static variable/method is shared by all instances of that class
		
		Friend friend1 = new Friend("SpongeBob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		
		// Best practice
		// Do not need to create Friend object, because its own by the class
		System.out.println(Friend.numberOfFriends);
		
		// Not recommended to access static variable/method from object (not there is a warning)
//		System.out.println(friend1.numberOfFriends);
		
		Friend.displayFriends();
	}
}


 