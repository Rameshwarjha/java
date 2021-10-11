
import java.util.*;
public class main {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        //insertion in hashmap
        hm.put("India", 48);
        hm.put("pak", 32);
        hm.put("Europe",50);
        hm.put("Ireland", 30);

        //updation in hashmap --> use put again for the already inserted values
        hm.put("India",100);
        hm.put("Europe", 60);

        //insertion in hashmap -->use put function with keys which are not already present int the hashmap
        hm.put("england", 60);

        //#get --> returns value of the key  
        //if present -- value
        //if not present -- null
        // System.out.println(hm.get("India"));  //when key is present--> value                 //print get value by key
        // System.out.println(hm.get("France"));  //when key is not present -->null

        int value= hm.get("Ireland");         //get value by key
        // System.out.println(value);            //print value


       //#containsKey
    //    System.out.println(hm.containsKey("India"));  // if present --> true
    //    System.out.println(hm.containsKey("France"));  // if not present --> false


       //#keySet
    //    Set<String>keys = hm.keySet();
    //    System.out.println(keys);

    //    System.out.println(hm.keySet());


        // syso in hashmap
        // System.out.println(hm);

        //# remove 
        // System.out.println(hm);
        Integer rem = hm.remove("pak");
        // System.out.println(rem);
        
        Integer removed = hm.remove("france");
        // System.out.println(removed);

        // System.out.println(hm);

        




    }
    
}
