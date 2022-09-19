package nl.novi.javaprogrammeren.collecties;

import java.util.HashMap;

public class Translator {

    private HashMap<Integer, String> numericAlpha = new HashMap<>();

    //Constructor
    public Translator(String[] alphabetic, int[] numeric) {
        for (int i=0; i<numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number) {
        return numericAlpha.get(number);
    }

}
