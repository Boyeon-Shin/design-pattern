package ch09.firstRefactoring;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<?> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
            System.out.println();
        }
    }

    private void printMenu(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    // 기타 메소드
}