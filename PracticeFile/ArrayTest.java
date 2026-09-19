package PracticeFile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTest {
    List <String> names = new ArrayList<>();

    public static void main(String[] args) {
        List<String> id = new ArrayList<>();
        List <String> names = new ArrayList<>();
        names.add("kemi");
        names.add("henry");
        id.add("12");
        id.add("34");
        id.add("34");
        names.add("henry");
        names.addAll(id);

        System.out.println(names);

        String[] dept = new String[3];
        dept[0] = "science";
        dept[2] = "reb";
        dept[1] = "tes";

        System.out.println(dept[0]);

        Set <String> team = new HashSet<>();
        team.add("White");
        team.add("Black");
        team.add("White");
        team.add("Blue");

        System.out.println(team);

    }
}
