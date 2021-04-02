package test;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("123","456");
        hashMap.put("567","8910");
        System.out.println(hashMap);
    }
}
