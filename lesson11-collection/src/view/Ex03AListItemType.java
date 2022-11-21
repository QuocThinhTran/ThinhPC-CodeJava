package view;

import bean.Item;
import model.DataModel;

import java.util.Iterator;
import java.util.List;

public class Ex03AListItemType {
    public static void main(String[] args) {
        List<Item> items = DataModel.getItems();

        Item itemRemoveTobe = new Item(8, "Item 8", 120, 102);
        items.remove(itemRemoveTobe);
        printf("items",items);
        System.out.println("------------------------------------------------------------------------");
        items.removeIf(item -> item.getId() < 5);
        printf("item id < 5", items);
        System.out.println("------------------------------------------------------------------------");
        removeIf(items, item -> item.getStoreId() > 300);
        printf("item storeId < 300", items);
    }

    private static boolean removeIf(List<Item> list, Condition c) {
        boolean removed = false;
        Iterator<Item> iterator = list.iterator();
        while(iterator.hasNext()) {
            if(c.test(iterator.next())) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }

    private static void printf(String prefix, List<Item> list) {
        System.out.print(prefix + " -------> ");
        for(Item i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
@FunctionalInterface
interface Condition {
    boolean test(Item item);
}
