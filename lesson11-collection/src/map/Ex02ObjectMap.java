package map;

import bean.Item;
import bean.Warehouse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex02ObjectMap {
    public static void main(String[] args) {
        Map<Warehouse, List<Item>> data = inventory();

        data.put(new Warehouse("WH 1", "Quảng Trị"),
                Arrays.asList(new Item(1, "A", 10, 101)));

        data.put(new Warehouse("WH 5", "Phú Quốc"),
                Arrays.asList(new Item(5, "E", 50, 105)));

        System.out.println("sizes = " + data.size());
        printf(data);

   }
   private static Map<Warehouse, List<Item>> inventory() {
        Map<Warehouse, List<Item>> inventory = new HashMap<>();

        inventory.put(new Warehouse("WH 1", "Quảng Trị"),
                Arrays.asList(new Item(1, "A", 10, 101)));

       inventory.put(new Warehouse("WH 2", "Phú Yên"),
               Arrays.asList(new Item(2, "B", 20, 102)));

       inventory.put(new Warehouse("WH 3", "Nha Trang"),
               Arrays.asList(new Item(3, "C", 30, 103)));

       inventory.put(new Warehouse("WH 4", "Huế"),
               Arrays.asList(new Item(4, "D", 40, 104)));

        return inventory;
   }
   private static <K, V> void printf(Map<K, V> map) {
        for(Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ------> " + entry.getValue());
        }
    }
}
