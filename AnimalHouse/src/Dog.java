
public class Dog extends Animal {
	
	private boolean goodBoy;
	
	public Dog(String y, int birth, boolean b)
	{
		super(y, birth);
		goodBoy = b;
	}
	
	@Override
	public String toString()
	{
		String s = "";
		s = super.toString();
		if (goodBoy == false)
		{
			s+= "I am not a good boy.\n";
		}
		else if(goodBoy == true)
		{
			s+= "I am a good boy.\n";
		}
		return s;
	}

}
