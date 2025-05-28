package org.fenixsoft.jvm.chapter10;

import java.util.HashMap;
import java.util.Map;

public class GenericToPrimitive {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("꼬끼오", "꼭기오");
        System.out.println(map.get("꼬끼오"));
    }
}
