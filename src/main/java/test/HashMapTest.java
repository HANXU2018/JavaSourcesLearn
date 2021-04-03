package test;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("1","2");
        hashMap.put("3","4");
        hashMap.get("1");
        System.out.println(hashMap.put("5","6"));
        System.out.println(hashMap.put("1","3"));

        System.out.println(hashMap);
    }
}
