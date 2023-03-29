
public class Hero extends Person{
	
	String power;
	
	Hero(String name, int age, String power){
		super(name, age); // pass "name" and "age" to super/parent class to assigne name and age values
		this.power = power;
	}	
	
	public String toString() {
		return super.toString() + this.power;
	}	
}


