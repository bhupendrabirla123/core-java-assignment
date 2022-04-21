package com.kaizen.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("hello");
		lst.add(1, "hello1");
		// lst.addAll(2, lst);

//		lst.clear();
		lst.contains("hello");
		System.out.println(lst);
		List<String> lst1 = new ArrayList<String>();
		lst1.add("hello");
		lst1.add("hello1");
		boolean bh = lst1.equals(lst);
		System.out.println(bh);
		boolean b = lst1.containsAll(lst);
		System.out.println(lst.get(1));
		System.out.println(lst.getClass());
		System.out.println(lst.hashCode());
		System.out.println(lst.indexOf("hello1"));
		System.out.println(lst.isEmpty());
		System.out.println(lst.lastIndexOf(lst1));
		System.out.println(lst.iterator());
		System.out.println(lst.remove(0));
		System.out.println(lst.remove("hello1"));
		lst.add("hello");
		lst.add("hello1");
		lst.add("hello");
		lst.add("hello1");
		//System.out.println(lst1.removeAll(lst1));
		System.out.println(lst.removeIf(n->(n.length()==5)));
		System.out.println(lst.retainAll(lst1));
		System.out.println(lst.set(0, "hello1"));
		System.out.println(lst.size());
		System.out.println(lst.toString());
		System.out.println(lst.getClass());
		System.out.println(lst.iterator());
		System.out.println(lst.listIterator());
		System.out.println(lst);

		// lst1.forEach( (Consumer<? super String>) lst);

	}

}
