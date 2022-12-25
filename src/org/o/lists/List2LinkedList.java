package org.o.lists;

import java.util.LinkedList;
import java.util.List;

public class List2LinkedList {
	
	public static void main(String[] args) {
		
		System.out.println("Linked Array List:");
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(60);
		l.add(30);
		l.add(50);
		l.add(40);
		
//		System.out.println(l);
		
		List<Integer> i = new LinkedList<Integer>();
		i.add(15);
		i.add(25);
		
//		System.out.println(i);
		
//		int a = l.size();
//		System.out.println(a);
//		
//		int b = l.get(1);
//		System.out.println(b);
//		
//		boolean c = l.contains(20);
//		System.out.println(c);
//		
//		int d = l.indexOf(20);
//		System.out.println(d);
//		
//		int e = l.lastIndexOf(20);
//		System.out.println(e);
//		
//		l.add(1, 15);
//		System.out.println(l);
//		
//		l.remove(4);
//		System.out.println(l);
//		
//		l.set(2, 30);
//		System.out.println(l);
		
		l.addAll(i);
		System.out.println(l);
		
//		l.clear();
//		System.out.println(l);
//		
//		i.removeAll(i);
//		System.out.println(i);
//		
//		l.retainAll(i);
//		System.out.println(l);
		
	}
}