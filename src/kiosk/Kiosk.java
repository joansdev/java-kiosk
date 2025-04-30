package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    Scanner scanner = new Scanner(System.in);
    private List<Menu> menus = new ArrayList<>();

    private Menu menu;


    // 생성자
    public Kiosk(Menu menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
    }

    //기능
    // 메인메뉴 출력
    public void showMainMenu() {
        System.out.println("[ SHAKESHAKE MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i + 1) + ". " + menus.get(i).getName());
        }
        System.out.println("0. 종료");
    }

    // 프로그램 반복 실행 (0 입력시까지)
    public void run() {
        while (true){
            showMainMenu();
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("프로그램 종료.");
                break;
            }
        }
    }

    public void start() {
        while (true) {
            System.out.println("\n[ " + menu.getName() + " ]");
            for (int i = 0; i < menu.getItems().size(); i++) {
                MenuItem item = menu.getItems().get(i);
                System.out.printf("%d. %s | W %.1f | %s\n", i + 1, item.getName(), item.getPrice(), item.getInfo());
            }
            System.out.println("0. 종료");

            System.out.print(">> ");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (input >= 1 && input <= menu.getItems().size()) {
                MenuItem selectedItem = menu.getItems().get(input - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName());
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }

    // 입력 처리
    public void handleMenuSelection(int choice) {
        if (choice >= 1 && choice <= menus.size()) {
            menus.get(choice - 1).showItems();
        } else {
            System.out.println("잘못된 입력입니다");
        }
    }



}
