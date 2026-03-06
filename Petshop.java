package pgm;

import java.util.Scanner;

class Animal{
	String species;
	String name;
	double price;
	String feature;
	
	Animal(String species,String name,double price ){
		this.name=name;
		this.species=species;
		this.price=price;
	}
	void feature(String message) {
		feature=message;
		
		
	}
	void display() {
		System.out.println("name is"+name);
		System.out.println("species is"+species);
		System.out.println("price is"+price);
		
	}
}

public class Petshop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Animal[] animal=new Animal[3];
		for(int i=0;i<3;i++) {
			System.out.println("Enter details for Animal " + (i + 1));
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.println("enter the species");
			String species=sc.nextLine();
			System.out.println("enter the price");
			double price=sc.nextDouble();
			animal[i]=new Animal(species,name,price);0
			System.out.println("enter the feature");
			
			String features=sc.nextLine();
			animal[i].feature(features);
			sc.nextLine();
			}
		System.out.println("Petshop details");
		for(int i=0;i<3;i++) {
			animal[i].display();
			animal[i].feature();
			
		}
		sc.close();
		

	}

}
