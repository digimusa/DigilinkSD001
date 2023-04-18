import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args){
        /*Section 3 - HashMap:Retrieving Objects via a key*/

        //HashMap that takes in String values and displays them
        //Declaring hashmap variable
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //Assigning key and value to the hashmap
        map.put(3, "Wednesday");
        map.put(5, "Friday");
        map.put(1, "Monday");
        map.put(2, "Tuesday");
        map.put(7, "Sunday");
        map.put(4, "Thursday");
        map.put(6, "Saturday");

        //Getting the value from the hashmap
        String text = map.get(4);
        //printing out the value
        System.out.println(text);

        //Loop that iterates through the hashmap
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            //Getting the key of the value
            int key = entry.getKey();
            //Getting the value
            String value = entry.getValue();

            //printing out the key and value from the hashmap
            System.out.println(key + ": " + value);
        }
    }
}
