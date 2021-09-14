/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String abc = "password";
        String password;
        System.out.print(" What is the password? ");

        password = input.next();

        if(password.equals(abc)){
            System.out.print("Welcome");
        }
            else{
                System.out.print("I do not know you");
        }
        }
}
