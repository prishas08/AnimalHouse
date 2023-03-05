import java.util.ArrayList;

public class Animal {
	
	private String name;
	private int birthYear;
	private Animal friend;
	private static int currentYear;
	private ArrayList<Toy> collection;
	
	public void addToy(Toy t)
	{
		collection.add(t);
	}
	public Animal(String n, int b)
	{
		name = n;
		birthYear = b;
		collection = new ArrayList<Toy>();
	}
	public void setFriend(Animal a)
	{
		friend = a;
	}

	public int getAge()
	{
		int a = currentYear - birthYear;
		return a;
	}
	public ArrayList<Toy> getToys() 
	{
		return this.collection;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		currentYear = 2021;
		int age = currentYear - birthYear;
		String s = "Hello, I am " + name + ", I am " + age + " years old\n";
		if (friend != null)
		{
			s+= "I have a friend named " + friend.getName() + ". \n";
		}
		else
		{
			s+= "I have no friends. \n";
		}
		s+= "I have the following toys: " + collection + "\n";
		return s;
	}
}
