import java.util.ArrayList;
public class Inventory {
    ArrayList<Item> current;
    public Inventory() {
        current = new ArrayList<Item>;
    }
    public void addItem(Item item) {
        current.add(item);
    }
    public void removeItem(Item item) {
        for (int i = 0; i < current.size(); i++) {
            if (curr.get(i) == item) {
                curr.remove(i);
            }
        }
    }
}