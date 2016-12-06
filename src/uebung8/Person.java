package uebung8;

import java.util.ArrayList;
import java.util.List;

public class Person {

		private String name;
		private int age;
		
		@Override
		public String toString(){
			return name + ","+age;
		}
		
		void increaseAge(){
			this.age++;
			}
		public Person(String name, int age){
			this.name = name;
			this.age = age;
			
			
		}
		
		public static void main (String[]args){
			Person karl = new Person("Karl",30);
			Person karla = new Person("Karla",22);
			Person jolle = new Person("jolle",19);
			Person rolf = new Person("rolf", 4);
			karl.increaseAge();
		//	System.out.println(karl);
		
		
		List<Person> household = new ArrayList<>();
		household.add(karl);
		household.add(karla);
		household.add(jolle);
		household.add(0,rolf);
		
		for(Person p: household){
			System.out.println(p);
			
			
		}
		System.out.println(household.size());
		if(household.contains(jolle)){
			household.remove(jolle);
			
		}
		household.remove(household.indexOf(karl));
		System.out.println(household.contains(jolle));
		for(Person p: household){
			System.out.println(p);
		}}
		}