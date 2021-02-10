package AnimalKingdomApp;

import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class Main
{
	private static List<AbstractAnimal> filterAnimals(List<AbstractAnimal> theList, CheckAnimal tester)
	{
		List<AbstractAnimal> tempList = new ArrayList<>();

		for (AbstractAnimal v : theList)
		{
			if (tester.test(v))
			{
				tempList.add(v);
			}
		}

		return tempList;
	}

	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("Welcome to Ash's Animal Kingdom!!!");
		System.out.println("-----------------------------------------");

		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals ("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<AbstractAnimal> masterList = new ArrayList<>();
		masterList.add(panda);
		masterList.add(zebra);
		masterList.add(koala);
		masterList.add(sloth);
		masterList.add(armadillo);
		masterList.add(pigeon);
		masterList.add(peacock);
		masterList.add(toucan);
		masterList.add(parrot);
		masterList.add(swan);
		masterList.add(salmon);
		masterList.add(catfish);
		masterList.add(perch);

		System.out.println();
		System.out.println("List of Animals: Year Named Descending!!!");
		System.out.println("-----------------------------------------");
		masterList.sort((a1, a2) -> a1.getYear() - a2.getYear());
		masterList.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("List of Animals: Alphabetical!!!");
		System.out.println("-----------------------------------------");
		masterList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		masterList.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("Here's all the animals that walk!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> walkList = filterAnimals(masterList, (a) -> a.move() == "walk");
		walkList.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("Here's all the animals that swim!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> swimList = filterAnimals(masterList, (a) -> a.move() == "swim");
		swimList.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("Here's all the animals that fly!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> flyList = filterAnimals(masterList, (a) -> a.move() == "fly");
		flyList.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("Here's all the animals that breath with lungs!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> lungsList = filterAnimals(masterList, (a) -> a.breath() == "lungs");
		lungsList.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("Here's all the animals that breath with lungs and were named in 1758!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> lungs1758List = filterAnimals(masterList, (a) -> a.breath() == "lungs" && a.getYear() == 1758);
		lungs1758List.forEach((a) -> System.out.println(a)); 
		System.out.println();
		System.out.println("Here's all the animals that breath with lungs and lay eggs!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> lungsEggsList = filterAnimals(masterList, (a) -> a.breath() == "lungs" && a.reproduce() == "eggs");
		lungsEggsList.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("Here's all the animals that were named in 1758 alphabetically!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> alpha1758List = filterAnimals(masterList, (a) -> a.getYear() == 1758);
		alpha1758List.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		alpha1758List.forEach((a) -> System.out.println(a));
		System.out.println();
		System.out.println("Stretch: Here's all the animals that are mammals alphabetically!!!");
		System.out.println("-----------------------------------------");
		List<AbstractAnimal> mammalList = filterAnimals(masterList, (a) -> a instanceof Mammals);
		mammalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		mammalList.forEach((a) -> System.out.println(a));
	}
}