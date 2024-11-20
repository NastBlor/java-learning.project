package lv.acodemy;

public class ifStatements {
    public static void main(String[] args) {

        //Even or Odd(if)

        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even");
        }

        //Check if a number is negative or positive (Assume 0 is positive)(if-else)

        number = -5;

        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        //Grade checker (if-else-if)
        //90> = A
        //75 -> 89 = B
        //50 -> 74 = C
        //< 50 = F

        //1) Create score variables
        //2)Create logic if (score >= 90) ->A
        //else-if (score >= 75) -> B
        //else-if (score >= 50) -> C
        //else -> F

        int score = 68;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade:B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Task Nr. 1: Check if a person is eligible to buy an alcohol;

        int age = 19;
        if (age >= 18) {
            System.out.println("You can buy an alcohol");
        }
        //Task Nr.2: Check if a number can be divided by 5

        int numberz = 25;
        if (numberz % 5 == 0) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

        int scorez = 25;
        if (scorez >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


        int temperature = 12;
        if (temperature > 30) {
            System.out.println("It's hot");
        } else if (temperature >= 15 && temperature <= 30) {
            System.out.println("Nice weather");
        } else {
            System.out.println("It's cold");
        }

        String color = "red";

        if (color.equals("green")) {
            System.out.println("Go");
        } else if (color.equals("yellow")) {
            System.out.println("Slow down");
        } else if (color.equals("red")) {
            System.out.println("Stop");
        } else {
        System.out.println("Unknown color");
    }
}
}




