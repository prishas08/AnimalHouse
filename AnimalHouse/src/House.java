import java.util.ArrayList;

public class House {
	
	private ArrayList<Animal> house;
	
	public House()
	{
		house = new ArrayList<Animal>();
	}
	
	public void add(Animal a)
	{
		house.add(a);
	}
	
	public void printAnimals()
	{
		for(int i = 0; i < house.size(); i++)
		{
			System.out.println(house.get(i).toString());
			System.out.println();
		}
	}

	public void cleanHouse()
	{
		ArrayList<Toy> toys;
		int index = 0;
		for(int i = 0; i < house.size(); i++)
		{
			toys = house.get(i).getToys();
			for(int j = 0; j < house.get(i).getToys().size(); j++)
			{
				if(toys.indexOf(toys.get(j))!= toys.lastIndexOf(toys.get(j)))
				{
					index = toys.indexOf(toys.get(j));
					toys.remove(index);
				}
			}
		}
		
	}
}
