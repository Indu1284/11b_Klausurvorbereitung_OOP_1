package com.cc.java;
/*
public class App {
    public static void main(String[] args) {
    
    // test --> Referenzvariable / RAM-Adresse des Objekts/Instanz (object/instance)
		// Test --> Referenztyp (reference type)
		// Object <--> Instanz

    Test test = new Test();
    //System.out.println("Referenzvariable: " + test);
    //test.showAddress();
    System.out.println(test.getCounter());
    test.setCounter(2);
    System.out.println(test.getCounter());


    }

}
*/

public class App {
  public static void main(String[] args) {
Test test = new Test();
System.out.println(test.getCounter());
  test.setCounter(4);
  System.out.println(test.getCounter());


  }

}
