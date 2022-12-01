package LastLab;

import java.util.ArrayList;

public class Lab12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Olivia");
		Name.add("Emma");
		Name.add("Ava");
		Name.add("Charlotte");
		Name.add("Sophia");
		ArrayList<String> Name2=new ArrayList<String>();
		Name.add("Noah");
		Name.add("Liam");
		Name.add("William");
		Name.add("Mason");
		Name.add("James");
		Name.addAll(Name2);
		System.out.println(Name);
		Name.set(4, "Sophie");
		System.out.println(Name);
		Name.add(3,"Anne");
		System.out.println(Name);
		boolean isRemoved = Name.remove("Liam");
		System.out.println("Is Liam in the list? " + isRemoved);
		boolean Removed = Name.remove("Sam");
		System.out.println("Is Sam in the List? " + Removed);
		Name.remove(1);
		System.out.println(Name);
		System.out.println(Name.size());
		for(int i = 0;i<Name.size(); i++) {
			System.out.println(i + " " + Name.get(i));
		}
	}

}
