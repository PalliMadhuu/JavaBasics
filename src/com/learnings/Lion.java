package com.learnings;

public class Lion implements Animal {
	
	public String animalName;
	public String sounds;
	public Lion(String animalName,String sounds) {
		this.animalName=animalName;
		this.sounds=sounds;
	}

	public void makeSound() {
		System.out.println(animalName + " "+ sounds);
	}
}
