// Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have 
// that same value. In all cases remove the key "c", leaving the rest of the map unchanged.


// mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
// mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
// mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

import java.util.HashMap;

class demo{
    public static void main(String args[])
    {
        HashMap<String, String> map = new HashMap<>();
        
        map.put("a", "ggg");
        map.put("b", "kkk");
        map.put("c", "lll");
        
        if(map.containsKey("a"))
        {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        System.out.println(map);
    }
}