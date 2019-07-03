package com.example.demo2;

import java.util.Scanner;

 //test
public class Demo2Application {

    //static List<Sim> simy = new ArrayList<>();

    public enum Imiona {
        TOMASZ, KRZYSZTOF, WALDEMAR, MARCIN;
    }

    public static void main(String[] args) {

// zbudować listę simow, sprawdzic czy znajduje się w tej liście, uzyć while i do while

        String firstname;
        String surname;
        int age;
        double walletMoneyCashAmount;
        boolean changeSim;

        String newFirstname;
        String newSurname;
        String pizzaType;

        int pizzaSize;
        boolean spiceOrNot;

        int newAge;
        double newWalletCashAmount;

        System.out.println();
        System.out.println("**************************");
        System.out.println("*           MENU         *");
        System.out.println("**************************");
        System.out.println("1. Add your sim");
        System.out.println("0. Quit");

        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        boolean chooseName;

        switch (choose) {
            case 1:
                System.out.println("Enter the firstname:");
                scan.nextLine();
                firstname = scan.nextLine();

                for (Imiona im : Imiona.values()) {
                    if (im.name().toLowerCase().equals(firstname.toLowerCase())) {
                        System.out.println("The name is on the list");

                        System.out.println("Do you want to take Sim from the list? (true/false)");
                        chooseName = scan.nextBoolean();
                        if (chooseName) {
                            Sim simFromList = new Sim(18, "", im.name().toLowerCase(), 200);
                            System.out.println(simFromList);
                        }
                    }
                    else {
                        scan.nextLine();
                        System.out.println("Enter the surname");
                        surname = scan.nextLine();
                        System.out.println("Enter the age of Sim");
                        age = scan.nextInt();
                        System.out.println("Enter the money:");
                        walletMoneyCashAmount = scan.nextDouble();
                        Sim sim = new Sim(age, surname, firstname, walletMoneyCashAmount);
                        //     simy.add(sim);
                        System.out.println(sim);
                    }
                }
/*                    System.out.println();
                    System.out.println("What do you want to do?");
                    System.out.println("3. Go to the restaurant");
                    System.out.println("4. Change the sim");
                    System.out.println("5. Add money");
                    choose = scan.nextInt();
                    scan.nextLine();

        case 3:
        System.out.println("Can I take your order?");
        Restaurant rest = new Restaurant();
        System.out.println("Which type of pizza do you want?");
        PizzaType pt = new PizzaType();
        //  System.out.println("         " + pt);
        String pizzaTypeAnswer = scan.nextLine();
        boolean checkPizzzaType;
        if (!pt.equals(pizzaTypeAnswer.toString())) {
            checkPizzzaType = false;
        }
        while (checkPizzzaType = false) {
            System.out.println("Which type of pizza do you want?");
            pizzaTypeAnswer = scan.nextLine();
        }

        rest.pizza.setType(scan.nextLine());
        System.out.println("Which size do you want?");
        rest.pizza.setSize(scan.nextInt());
        System.out.println("Do you like spicy?");
        rest.pizza.setSpiceOrNot(scan.nextBoolean());
        System.out.println(rest.pizza);
        case (0):
        System.out.println("bye");
        System.exit(0);
        break;
            default:
                choose = 0;



    */

        }
    }
}


