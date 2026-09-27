
package com.sunbeam;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Stack stack = null;
		int choice;

		do {
			if (stack == null) {
				System.out.println("\n1. Choose Fixed Stack");
				System.out.println("2. Choose Growable Stack");
				System.out.println("3. Exit");
				System.out.print("Enter choice: ");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					stack = new FixedStack();
					break;

				case 2:
					stack = new GrowableStack();
					break;

				case 3:
					return;

				default:
					System.out.println("Invalid choice");
				}
			}

			else {
				do {
					System.out.println("\n1. Push Data");
					System.out.println("2. Pop Data");
					System.out.println("3. Exit");
					System.out.print("Enter choice: ");

					choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.print("Enter id: ");
						int id = sc.nextInt();

						System.out.print("Enter name: ");
						String name = sc.next();

						System.out.print("Enter salary: ");
						double salary = sc.nextDouble();

						stack.push(new Employee(id, name, salary));
						break;

					case 2:
						Employee e = stack.pop();

						if (e != null)
							System.out.println(e);
						break;

					case 3:
						break;

					default:
						System.out.println("Invalid choice");
					}

				} while (choice != 3);

				stack = null;
			}

		} while (true);

	}
}
