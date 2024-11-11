package lv.acodemy;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {

        // This is my comment

        /*
        This is first line
        This second line
        This is third line
         */

        //int(Integer)-whole number/ natural number
        int age = 30;
        int currentYear = 2024;
        //current_year = snake case - never do like this!
        //current-year = kebab case - never do like this!
        //currentYear =camel case(lower capital case) - good practice
        int inventoryItemCount = 100;
        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        //double(fractional numbers)
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;
        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        char grade = 'A';
        char myInitial= 'N';
        char currencySymbol = '$';
        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        //boolean (logical type, can keep only two values: true or false)
        //How to name? has or is
        //Example: isSummer/ if(isSummer) {}; is LoggedIn;
        //Example: hasAccess/ if (hasAccess) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);
        boolean isSummer = false;
        System.out.println(isSummer);

        //long
        long phoneNumber = 2222020;
        System.out.println(phoneNumber);

        //float
        float interestRate = 4.5f;
        System.out.println(interestRate);

        //Arithmetic operators
        int a= 10;
        int b= 5;
        int sum= a+b; //add
        System.out.println(sum);

        int c=20;
        int d=8;
        int difference = c-d;
        System.out.println(difference);

        int m=7;
        int n=3;
        int result = m*n;
        System.out.println(result);

        //Divide

        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        System.out.println(division);

        double num3 = 10;
        double num4 = 3;
        double divResult = num3/ num4;
        System.out.println(divResult);

        //%(remainder of a division)

        int f = 10;
        int g = 3;
        int remainder = f % g; //10= 3 * 3 +1
        System.out.println(remainder);

        int number = 8;
        boolean isEven = (number % 2 == 0); //comparison operator
        System.out.println(isEven);

        //Increment ++
        //++preIncrement
        //Decrement --
        //++decrement

        number ++;
        System.out.println(number);
        number --;
        System.out.println(number);

        int counter = 10;
        counter ++;
        int postIncrement = counter++; //postIncrement = 11; counter = 12;
        int preIncrement = ++counter; //preIncrement = 13; counter = 13;
        System.out.println(postIncrement);
        System.out.println(preIncrement);
    }
}
