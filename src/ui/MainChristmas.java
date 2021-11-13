package ui;

import java.util.Scanner;
import model.SantaControl;

public class MainChristmas {

	private static SantaControl santaControl;
	private static Scanner sc;

	public MainChristmas() {
		sc = new Scanner(System.in);

		santaControl = new SantaControl();
	}

	public static void main(String[] args) throws Exception {
		System.out.println("********  Welcome santa  *********");

		MainChristmas ppal = new MainChristmas();
		int option = 0;

		do {
			option = ppal.showMenu();
			ppal.choice(option);

		} while (option != 5);

	}

	private int showMenu() {
		int option = 0;
		System.out.println("What do you want to do?\n"
			+ "(1)Register a new child\n" 
			+ "(2)change a child to the other list\n"
			+ "(3)show the list \n"
			+ "(4)show the list with the age order\n"
			+ "(5)Finish");

		option = Integer.parseInt(sc.nextLine());
		return option;
	}

	private void choice(int option) {

		switch (option) {

		case 1:

			createChild();
			break;

		case 2:
			changeList();
			break;

		case 3:
			showList();
			break;

		case 4:
			
			orderList();
			break;

		}
	}

	private void orderList() {

		//santaControl.orderList();


		System.out.println("Naught List: ");
		System.out.println(santaControl.getNaughtyList());

		System.out.println("Good List: ");
		System.out.println(santaControl.getGoodList());

	}

	private void changeList() {
		System.out.println("Write the name of child");
		String  name=sc.nextLine();
		System.out.println(santaControl.changeList(name));
		
		

	}

	private void showList() {
		System.out.println("Enter the corresponding number");
		System.out.println("(1) If is a good child\n(2) If is naughty child");
		int option=Integer.parseInt(sc.nextLine());

		if (option==1){
			System.out.println(santaControl.getGoodList());
		}else if (option ==2){
			System.out.println(santaControl.getNaughtyList());
		}else{
			System.out.println("Error");
		}
	}

	private void createChild() {
		
		//String name, String address, String city, String country, String wish, int age
		String name,address,city,country,christmasWish;
		int age, option;
		
		System.out.println("write the full name of the child");
		name= sc.nextLine();

		System.out.println("write the address of the child");
		address=sc.nextLine();

		System.out.println("write the city of the child");
		city=sc.nextLine();

		System.out.println("write the country of the child");
		country=sc.nextLine();

		System.out.println("write the wish of the child");
		christmasWish=sc.nextLine();

		System.out.println("write the age of the child");
		age=Integer.parseInt(sc.nextLine());
			
		System.out.println("enter the corresponding number");
		System.out.println("(1) If is a good child\n(2) If is naughty child");
		option=Integer.parseInt(sc.nextLine());

		System.out.println(santaControl.createChild(option, name,  address, city, country, christmasWish, age));

	}


}