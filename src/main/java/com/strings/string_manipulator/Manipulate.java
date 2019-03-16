package com.strings.string_manipulator;

import static java.lang.Character.getNumericValue;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

/**
 *
 * @author Juho Suni
 */
public class Manipulate {

    /**
     * 
     * @param str
     * @return String modified 
     */
    public static String manipulator(String str) {
        if (str == null) {
            return null;
        }
        char[] modifiedArray = new char[str.length()];
        int i;
        
        //Counter to keep up with varying lower and uppercase letters    
        int letterCounter = 0;
        for (i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (isLetter(c)) {               
                c = getUpOrLow(c, letterCounter);
                letterCounter += 1;
                
            } else if (isDigit(c)) {
                int num = getNumericValue(c);
                if (isOdd(num)) {
                    c = getUpOrLow('o', letterCounter);
                } else {
                    c = getUpOrLow('e', letterCounter);
                }
                letterCounter += 1;

            }
            //Finally let's add the character to the array
            //NOTE: If char wasn't number nor letter, it'll be unmodified
            modifiedArray[i] = c;
        }

        return String.copyValueOf(modifiedArray);
    }
    /**
     * Manipulates the character to upper 
     * or lower case according to given "index"
     * 
     * @param ch
     * @param letterCount
     * @return char modified 
     */
    static char getUpOrLow(char ch, int letterCount){
        char a = ch;
        if(isOdd(letterCount)){
            a = toLowerCase(a);
        }else{
            a = toUpperCase(a);
        }       
        return a;
    }
    
    /**
     * Checks if number is odd or not
     * 
     * @param a
     * @return boolean  
     */
    static boolean isOdd(int a) {
        boolean isOdd = true;
        if (a % 2 == 0) {
            isOdd = false;
        }
        return isOdd;
    }
}
