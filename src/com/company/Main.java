package com.company;

//import Classes.Product;
import Classes.Product;
import Classes.Store;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number_option = 0;
        String[] options = {"Search a product", "Search a store", "Exit"};
        Scanner scan = new Scanner(System.in);
        final String TEXT_RED = "\u001B[31m";
        final String TEXT_RESET = "\u001B[0m";

        LinkedList<Store> stores = new LinkedList<>();
        stores.add((new Store("11111", "Liverpool","first,second,third floor")));
        stores.add((new Store("22222", "Starbucks","first, second floor")));
        stores.add((new Store("33333", "Sushi Factory","first floor")));
        stores.add((new Store("44444", "Petco","first floor")));

        LinkedList<Product> products = new LinkedList<>();
        products.add((new Product("852741963","Dior Fahrenheit",100, 1200.00F,"Perfumes","Liverpool, Fabricas de Francia, Sears")));
        products.add((new Product("451274128","Hugo Boss",200, 2500.00F,"Perfumes","Liverpool, Fabricas de Francia, Sears")));
        products.add((new Product("584213698","Carolina Herrera",121, 2250.00F,"Perfumes","Liverpool, Fabricas de Francia, Sears")));


        while (true) {
            try {
                System.out.println("Welcome to 'Plaza Andares' ");
                for (int j = 0, optionsLength = options.length; j < optionsLength; j++) {
                    String option = options[j];
                    System.out.println(j+1+".-" + option);
                }
                System.out.print("Please, choose an Option: ");
                number_option = Integer.parseInt(scan.nextLine());
                //c=2;
            } catch (Exception e) {
                System.out.println(TEXT_RED+"Wrong input, please enter a number"+TEXT_RESET);
                System.out.println();
            }

            if (number_option == 2){
                System.out.println("You have pressed number: "+number_option);
                System.out.println();
                System.out.println("Stores Menu");
                for (int i = 0; i < stores.size(); i++) {
                    System.out.println(i+1+".-"+stores.get(i).getStore_name());
                }
                while (true){
                    try {
                        System.out.print("Please, pick an option by typing its number (0 for exit): ");
                        number_option = Integer.parseInt(scan.nextLine());
                        System.out.println("You have pressed number: "+number_option);
                        System.out.println();
                        if (number_option == 0){
                            break;
                        }
                        else{
                            number_option= number_option -1;
                            System.out.println();
                            System.out.println(stores.get(number_option).showStores());
                            System.out.print("Press number 1 to show products, or press number 0 to exit:");
                            number_option = Integer.parseInt(scan.nextLine());
                            if (number_option == 1){
                                for (int i = 0; i < products.size(); i++) {
                                    System.out.println();
                                    System.out.println(i+1+".-"+products.get(i).showProducts());
                                    System.out.println();
                                }
                            }
                            else if(number_option == 0){
                                break;
                            }
                            System.out.println();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(TEXT_RED+"Wrong input, please enter a number"+TEXT_RESET);
                        System.out.println();
                    }
                }

            }
            else if (number_option == 1){
                System.out.println("You have pressed number: "+number_option);
                System.out.println();
                System.out.println("Products Menu");
                for (int i = 0; i < products.size(); i++) {
                    System.out.println();
                    System.out.println(i+1+".-"+products.get(i).showProducts());
                    System.out.println();
                }

                try{
                    System.out.print("Press number 0 to exit:");
                    number_option = Integer.parseInt(scan.nextLine());
                    if(number_option == 0){
                        break;
                    }
                }catch (Exception e){
                    System.out.println(TEXT_RED+"Wrong input, please enter a number"+TEXT_RESET);
                    System.out.println();
                }
                System.out.println();
            }
            else if (number_option == 3){
                break;
            }
        }
    }
}

