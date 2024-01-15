// Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have 
// that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the 
// value and replacing it with the empty string.


// mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
// mapBully({"a": "candy"}) → {"a": "", "b": "candy"}

import java.util.*;

class demo{
    public static void main(String args[])
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "vinegar");
        
        if(map.containsKey("a"))
        {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        System.out.println(map);
    }
}