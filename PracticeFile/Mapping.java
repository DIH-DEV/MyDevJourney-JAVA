package PracticeFile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapping {
    public static void main(String[] args) {
        Map <String,Integer> inventory = new HashMap<>();

        inventory.put("Honda", 20);
        inventory.put("Lexus", 45);
        inventory.put("Toyota",456);

        Integer num = inventory.getOrDefault("Vinc",0 );
        System.out.println(num);
        System.out.println();

        if (inventory.containsKey("Hondaa")){
            System.out.println("Honda is in the Inventory");
        }else{
            System.out.println("NOT FOUND!");
        }
        inventory.remove("Lexus");
        System.out.println("Map Content: " + inventory.entrySet());
        System.out.println("Map keys: " + inventory.keySet());
        System.out.println("Values: " + inventory.values());

        Set <String> keys = inventory.keySet();
        for (String key : keys ){
            System.out.println("Inventory: "+ key);
        }
    }

}
