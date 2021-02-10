package AnimalKingdomApp;

public class Fish extends AbstractAnimal
{
	public Fish(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breath()
	{
		return "gills";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}

	@Override
	public String toString()
	{
		return "Fish: Name: " + name + " Year Named: " + year + " Animal ID: "+ id + " Energy: "+energy;
	}
}