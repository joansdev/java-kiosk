package kiosk;

public class MenuItem {

    // 속성
    private String name;
    private double price;
    private String info;

    // 생성자
    MenuItem(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    // 기능
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getInfo() {
        return this.info;
    }

    public void printItem() {
        System.out.println("상품 정보: " + name + price + info);
    }
}
