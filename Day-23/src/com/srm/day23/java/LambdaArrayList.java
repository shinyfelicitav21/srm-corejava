package com.srm.day23.java;
import java.util.ArrayList;

public class LambdaArrayList {
  public static void main(String[] args) {
//creating arraylist.
ArrayList<String> list = new ArrayList<String>();

// add elements to the arraylist.
list.add("Harry");
list.add("Paru");
list.add("Jeeva");
list.add("Sunny");
list.add("Teena");

System.out.print("ArrayList Elements: \n");

// iterate over each element of arraylist
list.forEach((e) -> {
  System.out.print(e + ", ");
});

}
}