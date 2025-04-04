package Lists;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Demo2 {

    public static void main(String[] args) {
    
        ArrayList<Integer> list2 = new ArrayList<>(); // initial capacity=10
		System.out.println("Arraylist list2 size: " + list2.size()); // size=0
		for(int i=1; i<=10; i++)	// add 10 elements
			list2.add(i);
		System.out.println("Arraylist list2 size: " + list2.size()); // size=10 and capacity is full
		list2.add(11);	// when new element added, capacity will grow.
						// new capacity = 1.5 * old capacity = 10 + 5 = 15
        // System.out.println("Arraylist list2 capacity: " + list2.capacity()); // size=11
		System.out.println("Arraylist list2 size: " + list2.size()); // size=11
		System.out.println(list2.toString());
		
		Vector<Integer> list3 = new Vector<>(); // initial capacity=10
		System.out.println("vector list3 capacity: " + list3.capacity()); // capacity=0
		System.out.println("vector list3 size: " + list3.size()); // size=0
		for(int i=1; i<=10; i++)	// add 10 elements
			list3.add(i);
		System.out.println("vector list3 capacity: " + list3.capacity()); // capacity=10
		System.out.println("vector list3 size: " + list3.size()); // size=10
		list3.add(11);	// when new element added, capacity will grow.
						// new capacity = 2 * old capacity = 2 * 10 = 20
		System.out.println("vector list3 capacity: " + list3.capacity()); // capacity=20
		System.out.println("vector list3 size: " + list3.size()); // size=11
		list3.trimToSize(); // shrink capacity to current size
		System.out.println("vector list3 capacity: " + list3.capacity()); // capacity=20
		System.out.println("vector list3 size: " + list3.size()); // size=11
		System.out.println(list3.toString());
		
		System.out.println("\nTraverse vector using Enumeration: ");
		Enumeration<Integer> en = list3.elements();
		while(en.hasMoreElements()) {
			Integer ele = en.nextElement();
			System.out.print(ele + ", ");
		}
		System.out.println();
		System.out.println("\nTraverse vector/list using Iterator: ");
		ListIterator<Integer> itr = list3.listIterator();
		while(itr.hasNext()) {
			Integer ele = itr.next();
			System.out.print(ele + ", ");
		}
		System.out.println();
		
		System.out.println("\nTraverse vector/list using for-loop: ");
		for(int i=0; i<list3.size(); i++) {
			Integer ele = list3.get(i);
			System.out.print(ele + ", ");
		}
		System.out.println();		
	}
}
