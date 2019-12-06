package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            try{
        Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                User user = new User();
                user.setName(name);
                int age = scanner.nextInt();
                user.setAge(age);
                user.getInfo();

            }catch (Exception e){
                e.printStackTrace();
            }
        }






    }
}
