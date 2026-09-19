package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0, count = 0;
		Fruit[] fruit = new Fruit[5];
		int ch;
		do {
			System.out.println(
					"0.Exit\n1.Mango\n2.Orange\n3.Apple\n4.Display All Fruits Names\n5.Display All Information of All Fruits\n6.Display Taste\n7.Mark Fruit as Stale(Not Fresh)\n8.Mark all sour Fruits stale\nEnter the choice\n");
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
				if (count < 5) {
					fruit[count] = new Mango("Yellow", 7, "Mango");
					count++;
				}

				break;
			case 2:
				if (count < 5) {
					fruit[count] = new Orange("Orange", 6, "Orange");
					count++;
				}
				break;
			case 3:
				if (count < 5) {
					fruit[count] = new Apple("Red", 4, "Apple");
					count++;
				}
				break;
			case 4:
				for (i = 0; i < 5; i++) {
					if (fruit[i] != null) {
						System.out.println(fruit[i].getName());
					}
				}
				break;
			case 5:
				for (int j = 0; j < count; j++) {
					if (fruit[j] != null)
						System.out.println(fruit[j]);
				}
				break;
			case 6:
				for (i = 0; i < 5; i++) {
					if (fruit[i] != null) {
						System.out.println(fruit[i].taste());
					}
				}
				break;
			case 7:
				for (i = 0; i < 5; i++) {
					if (fruit[i] != null) {
						System.out.println("index" + i + "fruits: " + fruit[i].getName());
					}
				}
				System.out.println("Enter index that should mark as stale");
				int index = scanner.nextInt();
				fruit[index].isFresh = false;

				break;
			case 8:
				for (i = 0; i < 5; i++) {
					if (fruit[i] != null) {
						if (fruit[i].taste().equals("sour")) {
							fruit[i].isFresh = false;
						}
					}
				}
				for (i = 0; i < 5; i++) {
					if (fruit[i] != null && fruit[i].isFresh == false) {
						System.out.println(fruit[i].getName() + "isStale");
					}
				}
				break;
			default:
				break;
			}
		} while (ch != 0);
	}

}
