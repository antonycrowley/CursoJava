package inheritance;

public class Test {

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Parent obj2 = new Child();

		obj1.sum(5, 5);
		obj2.sum(5, 5);

		obj2.sum("10", "20");
		obj2.sum(1, 2, 3);
		
		Parent obj3 = new Parent();
		obj3.sum(2, 2);
		String str1 = new Child().childMethod();
		System.out.println(str1);
		
		String str2 = ((Child)obj3).childMethod();
		System.out.println(str2);
	}
}
