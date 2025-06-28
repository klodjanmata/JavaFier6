package JavaAdvCoding.Exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, String> storageMap;

    public Storage() {
        storageMap = new HashMap<>();
    }

    public void addToStorage(String key, String value){
        storageMap.put(key, value);
    }

    public String findByKey(String key){
        return storageMap.get(key);
    }

    public Map<String, String> findByValue(String value){
        return storageMap.entrySet().stream()
                .filter(entry ->
                        Objects.equals(value, entry.getValue()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void printAll(){
        for (Map.Entry<String, String> entry : storageMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void printAll(Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void printNode(Map.Entry<String, String> entry){
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }


}
