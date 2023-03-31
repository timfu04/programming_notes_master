
public class MyGenericClass <T extends Number, V extends Number> { 	// T & V can only be sub class of Number class (e.g. Double, Integer, etc.)
	
	T x;
	V y;
	
	MyGenericClass(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public T getValue() {
		return x;
	}
	
	public V getValue2() {
		return y;
	}
	
}


