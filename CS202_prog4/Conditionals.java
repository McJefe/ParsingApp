package com.company;
import java.util.Scanner;

/* CS202 - Jeff McHale - Program 4
        Conditionals.java

The purpose of this derived class is to manage conditional
statements. Statements such as if, if/else and logical operators
will be converted from c++ statements into python.


 */

public class Conditionals extends Syntax
{
    private String value;
    private String hold;
    private String [] parseString;

    public Conditionals() {}

    public Conditionals(String data)
    {
        super.token = data;
    }

    //Function to input data of a type conditional
    public String inputData (String value)
    {
        super.token = value;


        return super.token;
    }
    //Function to parse string data from c++ to python
    //Things to convert: semicolon, ||, &&, braces,
    //left parenthesis is removed, right is replaced with colon
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


            if (value[i].equals("("))
                value[i] = "";
            if (value[i].equals(")"))
                value[i] = ":";
            if (value[i].equals(";"))
                value[i] = ":";
            if (value[i].equals("||"))
                value[i] = "or";
            if (value[i].equals("&&"))
                value[i] = "and";
            if (value[i].equals("{") || value[i].equals("}"))
                value[i] = "";


            //Anything that isn't parsed is copied over as is
            str[i] = (value[i]);
        }


        return str;
    }
    //Determines if string passed in is legal c++
    public boolean checkValue ()
    {
        return true;
    }

    public void display()
    {
        super.display();
    }


}
