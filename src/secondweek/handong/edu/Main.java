package secondweek.handong.edu;

import java.util.ArrayList;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.stduent_run();
		m.fruit_run();
	}
	
	public void stduent_run() {
		
		ArrayList<Student> al = new ArrayList<Student>();
		System.out.println("Student List");
		Student s1 = new Student(101,"A",20);
		al.add(s1);
		Student s2 = new Student(103,"C",22);
		al.add(s2);
		Student s3 = new Student(105,"F",29);
		al.add(s3);
		Student s4 = new Student(108,"As",30);
		al.add(s4);
		Student s5 = new Student(110,"T",25);
		al.add(s5);
		Student s6 = new Student(102,"B",28);
		al.add(s6);
		Student s7 = new Student(109,"D",21);
		al.add(s7);
		Student s8 = new Student(101,"E",24);
		al.add(s8);
		Student s9 = new Student(101,"G",26);
		al.add(s9);
		Student s10 = new Student(101,"H",27);
		al.add(s10);
		
		Collections.sort(al);
		
		for(Student a:al) System.out.println(a.toString());
	}
	
	public void fruit_run() {
		
		ArrayList<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit f1 = new Fruit(101,"melon",10);
		fl.add(f1);
		Fruit f2 = new Fruit(105,"kiwi",50);
		fl.add(f2);
		Fruit f3 = new Fruit(106,"orange",30);
		fl.add(f3);
		Fruit f4 = new Fruit(102,"pineapple",20);
		fl.add(f4);
		Fruit f5 = new Fruit(104,"apple",80);
		fl.add(f5);
		Fruit f6 = new Fruit(107,"annanas",90);
		fl.add(f6);
		Fruit f7 = new Fruit(111,"banana",45);
		fl.add(f7);
		Fruit f8 = new Fruit(109,"pear",60);
		fl.add(f8);
		Fruit f9 = new Fruit(110,"moressang",75);
		fl.add(f9);
		Fruit f10 = new Fruit(112,"name",100);
		fl.add(f10);
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit s:fl) System.out.println(s.toString());
	}
}
