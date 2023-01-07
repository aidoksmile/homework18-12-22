// Найти пересечения слов в массивах и указать их общее количество.
// Пример:
// mas1= [“qwe”,”asd”,”qwe”,”x”]
// mas2=[“qwe”,”v”]
// Результат:
// qwe=3

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"qwe", "asd", "qwe", "x"};
        String[] arr2 = new String[]{"qwe", "v"};
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            if (map.containsKey(arr2[k])) {
                map.put(arr2[k], map.get(arr2[k]) + 1);
            } else {
                map.put(arr2[k], 1);
            }
        }
        for (Map.Entry<String, Integer> entry :map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}