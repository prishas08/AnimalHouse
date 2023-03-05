
public class Cat extends Animal {
	
	private int numLives;
	
	public Cat(String name, int age, int numLives)
	{
		super(name, age);
		this.numLives = numLives;
	}
	public Cat(String name, int age)
	{
		super(name, age);
		this.numLives = 9;
	}
	
	@Override
	public String toString()
	{
		String s = "";
		s = super.toString() + "And I have " + numLives + " lives.\n";
		return s;
	}

	

}
