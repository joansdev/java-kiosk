package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 속성
    private String name;
    private List<MenuItem> items = new ArrayList<>();


    // 생성자
    public Menu(String name) {
        this.name = name;
    }

    // 기능

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void showItems() {
        System.out.println("[ " + name + " }");
        for (int i=0; i < items.size(); i++) {
            System.out.println((i+1) + ". ");
            items.get(i).printItem();
        }
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

}
