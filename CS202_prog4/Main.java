package com.company;
import java.util.Scanner;

/* CS202 - Jeff McHale - Program 4
            main.java

The purpose of this class is to simulate the test bed
for the client application.

A user will have the choice to choose which type of
statement they'd like converted from c++ to python.

1) Conditional statements
2) Function prototypes
3) Data type definitions

 */

public class Main {

    public static void main(String[] args) {

        int count = 0;
        String response;
        boolean input = true;
        node Node = new node();
        Token token = new Token();

        Scanner in = new Scanner(System.in);

        System.out.println ("Welcome! This program will be able to convert certain c++ statements to python");
        System.out.println ("Provided that this program is a complete mess, please input values with a space between them.");
        System.out.println ("For example, instead of:");
        System.out.println ("int funcName (int x, int y);");
        System.out.println ("Do...");
        System.out.println ("int funcName ( int x, int y ) ;");
        System.out.println();
        System.out.println("The program will run for 5 different inputs");
        System.out.println();
        System.out.println("God Speed");


    do {

        System.out.println("1) Conditionals");
        System.out.println("2) Functions");
        System.out.println("3) Types");

        //Branch used to upcast correct object
        int branch = in.nextInt();
        Node.setData(branch);

        //Create a linked list, passing in node
        LList list = new LList (Node);

        list.insert(Node);
//        list.display();

        token.displayTokens();

//        System.out.println("Continue? y/n");
//        response = in.nextLine();
//
//        if (response.equalsIgnoreCase("y"))
//            input = true;
//        else
//            input = false;

        ++count;

        } while (count < 5);

        in.close();

    }


}
