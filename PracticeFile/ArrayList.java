package PracticeFile;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> names = new java.util.ArrayList<>();
        //Add elements to array
        names.add("Tayo");
        names.add("Ade");
        names.add("Shayo");
        //names.add(1,"Femi");

        System.out.println("names: " + names);

        for (String name : names){
            System.out.println("Name: " + name);
        }
        String get = names.set(2,"Grace");
        System.out.println(" ");
        System.out.println(names.get(2));

        int size = names.size();
        System.out.println(size);

        List <String> nicks = new java.util.ArrayList<>();
        nicks.add("joe");
        nicks.add("Sims");

        names.addAll(nicks);

        for (String n : names){
            System.out.println("Combined: " + n);
        }

        if (names.contains("AdeX")){
            System.out.println("EXISTS");
        }else {
            System.out.println("DOESNT EXIST ");
        }


    }
}
