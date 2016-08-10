package com.ZooProject;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		int totalAnimals = 20;
		
		ArrayList<Animals> theZoo = new ArrayList<>(totalAnimals);
				
		Mammals orca = new Mammals("Zoo", "Mammal", "Carnivore", "Dolphin", "Orca", "Willy", 15, true, true, true, false, false, 0, "Ocean");
		Mammals lion = new Mammals("Zoo", "Mammal", "Carnivore", "Felidae", "Lion", "Tarzan", 6, true, false, true, true, false, 3, "Land");
		Mammals chimp = new Mammals("Zoo", "Mammal", "Omnivore", "Great Ape", "Chimpanzee", "Henry", 14, true, true, true, false, false, 4, "Land");
		Mammals groundHog = new Mammals("Zoo", "Mammal", "Herbavore", "Rodent", "Ground Hog", "Phill", 3, true, true, false, true, false, 1, "Land");
				
		Birds pigeon = new Birds("Zoo", "Bird", "Omnivore", "Doves", "Rock Pigeon", "Coo", 1, true, true, true, "City", 3, true, true, false);
		Birds penguin = new Birds("Zoo", "Bird", "Omnivore", "Spheniscidae", "Penguin", "Penny", 3, true, true, false, "Ocean", 1, false, true, true);
		Birds anhinga = new Birds("Zoo", "Bird", "Omnivore", "Anhingide", "Anhinga", "Diver", 3, true, true, true, "Bays", 5, true, false, true);
		Birds tucan = new Birds("Zoo", "Bird", "Herbavore", "Ramphastides", "Tucan", "Sam", 2, true, true, true, "Jungle", 4, true, false, false);
		
		Fish bass = new Fish("Zoo", "Fish", "Carnivore", "Centrarchidae", "Bass", "Billy", 3, true, true, false, 6, true, true, false);
		Fish catFish = new Fish("Zoo", "Fish", "Omnivore", "Catfish", "Catfish", "Whiskers", 2, true, true, true, 7, false, false, false);
		Fish tuna = new Fish("Zoo", "Fish", "Carnivore", "scombridae", "Tuna", "Charlie", 4, true, false, true, 7, true, true, true);
		Fish carp = new Fish("Zoo", "Fish", "Herbavore", "Cyprinidae", "Carp", "Cody", 2, true, true, true, 7, true, false, false);
		
		Insects cockroach = new Insects("Zoo", "Insect", "Omnivore", "Roach", "Cockroach", "Eww", 1, true, true, true, "Worldwide", 6, 50, false, true);
		Insects tick = new Insects("Zoo", "insect", "Carnivore", "Acari", "Tick", "Sucker", 1, true, true, true, "East of the Rockies", 6, 3000, true, false);
		Insects butterfly = new Insects("Zoo", "Insect", "Herbavore", "Anthropod", "Butterfly", "Monark", 1, true, true, true, "Worldwide", 6, 100, false, true);
		Insects prayingMantis = new Insects("Zoo", "Insect", "Carnivore", "Anthropod", "Praying Mantis", "Scyther", 2, true, true, false, "Worldwide", 6, 200, false, false);
		
		Reptiles cobra = new Reptiles("Zoo", "Reptile", "Carnivore", "Elapidae", "Cobra", "Coby", 4, true, true, false, 0, 50, true, false, true);
		Reptiles iguana = new Reptiles("Zoo", "Reptile", "Omnivore", "iguanidae", "Iguana", "Perkins", 2, true, true, false, 4, 50, false, false, true);
		Reptiles boxTurtle = new Reptiles("Zoo", "Reptile", "Herbavore", "Emydidae", "Box Turtle", "Boxy", 5, false, false, false, 4, 7, false, true, true);
		Reptiles anaconda = new Reptiles("Zoo", "Reptile", "Carnivore", "Eunectes", "Anaconda", "Squeezy", 5, true, true, true, 0, 20, true, false, false);
		
		theZoo.add(lion);
		theZoo.add(chimp);
		theZoo.add(orca);
		theZoo.add(groundHog);
		theZoo.add(pigeon);
		theZoo.add(penguin);
		theZoo.add(anhinga);
		theZoo.add(tucan);
		theZoo.add(bass);
		theZoo.add(catFish);
		theZoo.add(tuna);
		theZoo.add(carp);
		theZoo.add(cockroach);
		theZoo.add(tick);
		theZoo.add(butterfly);
		theZoo.add(prayingMantis);
		theZoo.add(cobra);
		theZoo.add(iguana);
		theZoo.add(boxTurtle);
		theZoo.add(anaconda);
		
		
		for (int i = 0; i < totalAnimals; i++) {
			
			System.out.print("Today at the Zoo I saw a ");
			System.out.print(theZoo.get(i).getSpecies());
			System.out.print(" named ");
			System.out.print(theZoo.get(i).getName());
			System.out.print(". The zookeeper said it was ");
			System.out.print(theZoo.get(i).getAge());
			System.out.print(" years old, is a ");
			System.out.print(theZoo.get(i).getAnimalClass());
			
		if (theZoo.get(i).isAlive()) {
			System.out.print(", alive");
		} else {
			System.out.print(" but has passed away");
		}
		if (theZoo.get(i).isHungry()) {
			System.out.println(", and that they are very hungry.");
		} else {
			System.out.println(", and is not hungry at all.");
		}
						
			
		}
		
		
	}

}
