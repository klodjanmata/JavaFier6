package JavaAdvCoding;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("apple", 3);
        wordCount.put("banana", 5);
        wordCount.put("cherry", 2);
        wordCount.put("date", 4);
        wordCount.put("elderberry", 1);
        printFormatedMap(wordCount);
    }

    public static void printFormatedMap(Map<String, Integer> map){
        boolean firstLine = true;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (!firstLine){
                System.out.println(",");
            }
            firstLine = false;
            System.out.print("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println(".");
    }
}

//info,
//info2,
//info3,
//info4.
//