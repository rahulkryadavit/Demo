
public class Child extends Parent
{

	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.show();
		System.out.println("Add = "+p.add(10, 20));
		System.out.println();
		display();
		Parent.main(args);

	}

	@Override	//annotation
	int add(int a, int b) {
		return a+b;
	}

}
