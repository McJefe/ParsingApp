package com.company;

import java.util.Scanner;

/* CS202 - Jeff McHale - Program 4
            Types.java

The purpose of this derived class is to manage type declarations
and initializations. Once a C++ statement is inputted
from the console, this class will convert it to its
appropriate python form.

 */

public class Types extends Syntax
{
    private String value;
    private String [] parseString;

    //Default Constructor
    public Types() {}

    //Copy Constructor
    public Types (String data)
    {
        super.token = data;
    }

    //Function to input data of a type declaration
    public String inputData (String value)
    {
        super.token = value;

        return super.token;
    }

    //Parses string from c++ to python
    //Things to convert: data type, semicolon, braces, parenthesis
    public String [] parseData (String [] value)
    {
        String [] str = new String [value.length];


        //Array of strings is iterated over, replacing values
        //in each index when necessary
        for (int i = 0; i < value.length; ++i)
        {
            //Data types
            if (value[i].equals("int") || value[i].equals("char") || value[i].equals("bool")
                    || value[i].equals("void)") || value[i].equals("float") || value[i].equals("double"))
                value[i] = "";
            //Parenthesis
            if (value[i].equals("(") || value[i].equals(")"))
                value[i] = "";
            //Semicolon
            if (value[i].equals(";"))
                value[i] = "";
            //Braces
            if (value[i].equals("{") || value[i].equals("}"))
                value[i] = "";


            //Anything that isn't parsed is copied over as is
            str[i] = (value[i]);
        }




        return str;
    }

    //Checks if inputted value is legal c++
    public boolean checkValue()
    {
        return true;
    }

    //Displays current field
    public void display()
    {
        super.display();
    }
}
