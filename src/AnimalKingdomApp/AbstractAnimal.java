package AnimalKingdomApp;

abstract class AbstractAnimal
{
	private static int maxId = 1001;

	protected int id;
	protected String name;
	protected int year;

	protected int energy;

	public AbstractAnimal(String name, int year)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.year = year;

		this.energy = 1;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	void eat(int i)
	{
		energy += i; 
	}

	public int getYear()
	{
		return year;
	}

	public String getName()
	{
		return name;
	}
}