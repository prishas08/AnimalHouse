
public class Toy {
	
	private String name;
	public Toy(String n)
	{
		name = n;
	}
	
	@Override
	public String toString()
	{
		String s = name;
		return s;
	}
	
	@Override
	public boolean equals(Object s)
	{
		if (this.name.equals(s.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
// #4 - envelope

}
