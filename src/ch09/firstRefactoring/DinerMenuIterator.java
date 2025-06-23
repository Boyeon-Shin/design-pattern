package ch09.firstRefactoring;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("다음 항목을 하나 이상 제거하기 전까지는 항목을 제거할 수 없습니다");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }

}