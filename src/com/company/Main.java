package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        while (true){
            try{

                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Enter your age:");
                int age = scanner.nextInt();
                scanner.nextLine();
                user.setName(name);
                user.setAge(age);
                user.getInfo();

            }catch (Exception e){
                e.printStackTrace();
            }
        }






    }
}
