package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();

        // Menu 생성
        Menu burgerMenu = new Menu("SHAKESHAKE MENU"); // 메뉴 만들기 -> 인스턴스화
        burgerMenu.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addItem(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 키오스크
        Kiosk kiosk = new Kiosk(burgerMenu, sc);
        kiosk.start();


        // Lv2. Main메소드 안에 MenuItems 리스트 추가 / 반복문을 통한 순차적 접근
        menuItems.add(new MenuItem("yohanBurger", 19.9, "대한민국 제일가는 명품버거"));
        menuItems.add(new MenuItem("jiheeBurger", 1.1, "대한민국 양산형 버거"));
        menuItems.add(new MenuItem("spartanBurger", 8.27, "최고의 개발자 육성 캠프 스파르타 건물 1층 버거"));

        Scanner sc2 = new Scanner(System.in);

        while (true) {
            System.out.println(" [BURGER MENU] ");
            for (int i=0; i < menuItems.size(); i++){
                System.out.println((i+1) + ". " + menuItems.get(i).getName() + ". " + " | w " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getInfo());
            }
            System.out.println("0. 종료");

            System.out.println(">> ");
            int input = sc2.nextInt();
            if (input == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (input > 0 && input <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(input-1);
                System.out.println("선택한 상품: " + selectedItem.getName());
            }
        }
        // Lv.3, 4, 5 구현
    }
}
