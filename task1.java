// 1) Подсчитать количество вхождения каждого слова
// Пример:
// Россия идет вперед всей планеты. Планета — это не Россия.

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        String str = "Россия идет вперед всей планеты. Планета — это не Россия";
        String[] newStr = str.toLowerCase().split(" ");
        
        for (String inNewStr : newStr) {
            map.putIfAbsent(inNewStr, 0);
            map.put(inNewStr, (map.get(inNewStr) + 1));
        }
        for (var entry : map.entrySet()) {
            System.out.println("The word - " + entry.getKey() + " ,  - meets " + entry.getValue());
        }
    }    
}