package com.BeStore.codeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamle {
	public static void main(String[] args) {
	     ArrayList<String> mylist = new ArrayList<String>();
	        mylist.add("ide");
	        mylist.add("quiz");
	        mylist.add("geeksforgeeks");
	        mylist.add("quiz");
	        mylist.add("practice");
	        mylist.add("qa");
	 
	        System.out.println("Original List : \n" + mylist);
	 
	        Collections.shuffle(mylist);
	 
	        System.out.println("\nShuffled List : \n" + mylist);
	}
}
