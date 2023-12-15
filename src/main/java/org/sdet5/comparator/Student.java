package org.sdet5.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    public String toString() {
        return this.rollNo + " " + this.name + " "
                + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        System.out.println(a.rollNo - b.rollNo);
        return a.rollNo - b.rollNo;
    }
}

class Sortbyname implements Comparator<Student> {
  public int compare(Student a, Student b)
    {
        System.out.println(a.name.compareTo(b.name));
        return a.name.compareTo(b.name);
    }
}

class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of Student type
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

  /*      // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));*/
    }
}