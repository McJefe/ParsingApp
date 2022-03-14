package com.company;
import java.util.regex.*;

/* CS202 - Jeff McHale - Program 4
           Token.java

    The purpose of this class is to split any c++ statement in to
    tokenize each set of text on a new line. From here, we can work
    on each word, expecting the definitions of c++ statement so we can
    replace and change it accordingly to python.

    The converted string is then displayed to the console

 */

public class Token
{

    private static String [] value;

    //Takes the c++ statement inputted and separates
    //all text values by a new line.
    public static String [] tokenize (String result)
    {
        //With whitespace being used as the delimiter
        //We split all values on a new line to ease parsing
        value = result.split("\\s");

        return value;
    }

    //Displays the corresponding python text that was converted
    public void displayTokens ()
    {
        System.out.println();
        System.out.println ("The converted python code is: " );

        for (int x = 0; x < value.length; ++x)
            System.out.print(value[x] + " ");

        System.out.println();

    }


}
