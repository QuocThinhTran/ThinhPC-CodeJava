package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01ModelMap {
    public static void main(String[] args) {
        Map<Integer, String> vnMotoShow = new HashMap<>();

        vnMotoShow.put(74, "Quảng Trị");
        vnMotoShow.put(75, "Huế");
        vnMotoShow.put(76, "Quãng Ngãi");
        vnMotoShow.put(77, "Bình Định");
        vnMotoShow.put(78, "Phú Yên");

        System.out.println(vnMotoShow.size());
        loopByKey(vnMotoShow);
        loopByValue(vnMotoShow);
        loopByEntry(vnMotoShow);

    }
    // loop by key
    private static void loopByKey(Map<Integer, String> map) {
        System.out.println("===== Loop By Key =====");

        Set<Integer> keySet = map.keySet();
        for(Integer set : keySet) {
            System.out.print(set + " ");
        }
        System.out.println();
    }
    // loop by value
    private static void loopByValue(Map<Integer, String> map) {
        System.out.println("===== Loop By Value =====");

        Collection<String> value = map.values();
        for(String s : value) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    // loop by entry
    private static void loopByEntry(Map<Integer, String> map) {
        System.out.println("===== Loop By Entry =====");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.print(entry.getKey() + ", " + entry.getValue() + "\n");
        }
    }
}
