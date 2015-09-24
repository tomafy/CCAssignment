package hw2;

import java.util.LinkedList;

class Animal {
	private int order;
	private String name;

	protected void setName(String n) {
		name = n;
	}

	public void setOrder(int o) {
		order = o;
	}

	public String getName() {
		return name;
	}

	public int getOrder() {
		return order;
	}
}

class Dog extends Animal {
	Dog() {
		setName("dog");
	}
}

class Cat extends Animal {
	Cat() {
		setName("cat");
	}

}
//Cat and Dog are subclass of Animal
public class Solution36 {
	int order = 0;
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();

	public void enqueque(Animal animal) {
		if (animal.getName().equals("dog")) {
			animal.setOrder(order);
			dogs.add((Dog) animal);
		} else if (animal.getName().equals("cat")) {
			animal.setOrder(order);
			cats.add((Cat) animal);
		} else {
			System.out.println("We only hold cats or dogs");
			return;
		}
		order++;
	}

	public Animal dequeueAny() {
		//Check the type of animal
		if (dogs.isEmpty())
			return dequeueCat();
		if (cats.isEmpty())
			return dequeueDog();
		if (dogs.peek().getOrder() < cats.peek().getOrder()) {
			return dequeueDog();
		} else {

		}
		return dequeueCat();
	}

	public Dog dequeueDog() {
		return dogs.poll();
	}

	public Cat dequeueCat() {
		return cats.poll();
	}
}
