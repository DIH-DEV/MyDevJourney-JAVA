package PracticeFile;

import java.util.*;
import java.util.ArrayList;

public class LibraryManager {
    public static void main(String[] args) {
        List <String> catalog = new ArrayList<>();
        Set <Tags> genreTags = new HashSet<>();
        Map<String,Employees> checkedOutBooks = new HashMap<>();

        Employees employees1 = new Employees();
        employees1.setGender('M');
        employees1.setEmployeeLastName("Esho");
        employees1.setEmployeeId("ISBN-102");
        employees1.setEmployeeFirstName("Kelvin");

        Employees employees2 = new Employees();
        employees2.setGender('F');
        employees2.setEmployeeLastName("Havvy");
        employees2.setEmployeeId("ISBN-101");
        employees2.setEmployeeFirstName("Tracy");

        //Add to List
        catalog.add("1984");
        catalog.add("Dune");
        catalog.add("1984");
        catalog.add("The Hobbit");

        //Add to set list
        genreTags.add(Tags.Sci_Fi);
        genreTags.add(Tags.Classic);
        genreTags.add(Tags.Fantasy);
        genreTags.add(Tags.Classic);

       // Register Books
        checkedOutBooks.put(employees1.getEmployeeId(), employees1);
        checkedOutBooks.put(employees2.getEmployeeId(), employees2);

//        //Print Second book title
//        System.out.println("The Second book On the Catalog: "+ catalog.get(1));
//        //Print Unique Tags
//        System.out.println(" ");
//        System.out.println("Unique Tags: "+ genreTags);

        for (Tags tag : genreTags){
            System.out.println("Genre: " + tag);
        }

        if (checkedOutBooks.containsKey(employees1.getEmployeeId())){
            System.out.println("Employee Info: " + checkedOutBooks.get(employees1.getEmployeeId()));
        }
//        //Return a book/emove
//        checkedOutBooks.remove("ISBN-102");
//        //Print updated record
//        System.out.println(" ");
//        System.out.println(checkedOutBooks.entrySet());
//
    }

}
