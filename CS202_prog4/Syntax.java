package com.company;
import java.util.Scanner;

/* CS202 - Jeff McHale - Program 4
           Syntax.java

Our base class in the program's hierarchy.
                Syntax
              /    |   \
   Conditionals    |    Types
                Functions

Due to each class managing/parsing its own type
Class Syntax was made an abstract base class. Pure virtual functions
include:
         Inputting data (c++ exp to be converted to python)
         Parsing that string to python form
         Checking if string inputted is a legal definition

Non-pure virtual function includes displaying data

 */


public abstract class Syntax
{
    //String to hold expression we need to convert
    protected String token;

    //Default Constructor
    public Syntax () {}
    //Copy Constructor
    public Syntax (String data)
    {
        token = data;
    }

          //Pure abstract functions

    //Gets input data of a given concept
    public abstract String inputData (String value);

    //Function to parse string data from c++ to python
    public abstract String [] parseData (String [] value);

    //Determines if string passed in is legal c++
    public abstract boolean checkValue ();


    //Displays data
    public void display()
    {
        System.out.println(token);
    }

}
