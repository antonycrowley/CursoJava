package inheritance;

public class Child extends Parent {
	
	/*
	 * Overriding
	 */
	
	@Override
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	
	public String childMethod() {
		return "from class child";
	}

}
