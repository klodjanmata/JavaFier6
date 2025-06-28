package JavaAdvCoding;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise1And2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("spinach");
        fruits.add("Date");
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("Elderberry");
        fruits.add("Cherry");
        List<String> orderedFruits = reverseOrderCaseInsensitiveMap(fruits);
        System.out.println(orderedFruits);
    }
    // Exercise1
    public static List<String> reverseOrder(List<String> list){
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // Exercise 2
    public static List<String> reverseOrderCaseInsensitive(List<String> list){
        List<String> orderedList = new ArrayList<>();
        for (String s : list) {
            orderedList.add(s.toUpperCase());
        }
        return orderedList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static List<String> reverseOrderCaseInsensitiveMap(List<String> list){
        Map<String, String> orderedMap = new HashMap<>();
        for (String s : list) {
            orderedMap.put(s.toUpperCase(), s);
        }
        List<String> orderedKeys = orderedMap.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        List<String> listToReturn = new ArrayList<>();
        for (String s : orderedKeys) {
            listToReturn.add(orderedMap.get(s));
        }
        return listToReturn;
    }
}
