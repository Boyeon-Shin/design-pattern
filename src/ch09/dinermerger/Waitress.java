//package ch09.dinermerger;
//
//public class Waitress {
//	Menu pancakeHouseMenu;
//	Menu dinerMenu;
//
//	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
//		this.pancakeHouseMenu = pancakeHouseMenu;
//		this.dinerMenu = dinerMenu;
//	}
//
//	public void printMenu() {
//		Iterator<U> pancakeIterator = pancakeHouseMenu.createIterator();
//		Iterator<U> dinerIterator = dinerMenu.createIterator();
//
//		System.out.println("MENU\n----\nBREAKFAST");
//		printMenu(pancakeIterator);
//		System.out.println("\nLUNCH");
//		printMenu(dinerIterator);
//
//	}
//
//	private void printMenu(Iterator<U> iterator) {
//		while (iterator.hasNext()) {
//			MenuItem menuItem = iterator.next();
//			System.out.print(menuItem.getName() + ", ");
//			System.out.print(menuItem.getPrice() + " -- ");
//			System.out.println(menuItem.getDescription());
//		}
//	}
//
//	public void printVegetarianMenu() {
//		printVegetarianMenu(pancakeHouseMenu.createIterator());
//		printVegetarianMenu(dinerMenu.createIterator());
//	}
//
//	public boolean isItemVegetarian(String name) {
//		Iterator<U> breakfastIterator = pancakeHouseMenu.createIterator();
//		if (isVegetarian(name, breakfastIterator)) {
//			return true;
//		}
//		Iterator<U> dinnerIterator = dinerMenu.createIterator();
//		if (isVegetarian(name, dinnerIterator)) {
//			return true;
//		}
//		return false;
//	}
//
//
//	private void printVegetarianMenu(Iterator<U> iterator) {
//		while (iterator.hasNext()) {
//			MenuItem menuItem = iterator.next();
//			if (menuItem.isVegetarian()) {
//				System.out.print(menuItem.getName());
//				System.out.println("\t\t" + menuItem.getPrice());
//				System.out.println("\t" + menuItem.getDescription());
//			}
//		}
//	}
//
//	private boolean isVegetarian(String name, Iterator<U> iterator) {
//		while (iterator.hasNext()) {
//			MenuItem menuItem = iterator.next();
//			if (menuItem.getName().equals(name)) {
//				if (menuItem.isVegetarian()) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//}
