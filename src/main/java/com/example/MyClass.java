package com.example;

import java.util.Scanner;

public class MyClass
{

    public static void main(String[] args)
    {
        String input1 = "aaa";
        System.out.println("What day do you want to check for a full moon in the year 2016? (MM/DD)");
        Scanner user_input = new Scanner(System.in);
        input1 = user_input.nextLine();
        //System.out.println(input1);
        fullMoon(input1);

    }

   public static void fullMoon(String day)
    {
        Scanner user_input = new Scanner(System.in);

        String Date1 = "01/23";
        String Date2 = "02/22";
        String Date3 = "03/23";
        String Date4 = "04/22";
        String Date5 = "05/21";
        String Date6 = "06/20";
        String Date7 = "07/19";
        String Date8 = "08/18";
        String Date9 = "09/16";
        String Date10 = "10/16";
        String Date11 = "11/14";
        String Date12 = "12/13";
        int month = 0;

        if(day.equals(Date1) || day.equals(Date2) || day.equals(Date3) || day.equals(Date4) || day.equals(Date5) || day.equals(Date6) || day.equals(Date7) || day.equals(Date8) || day.equals(Date9) || day.equals(Date10) || day.equals(Date11) || day.equals(Date12))
        {
            System.out.println("On " + day + " there will be a full moon");
        }

        else
        {
            System.out.println("There will not be a full moon that day, what month would you like to know the day of a full moon? Please enter the month number.");
            month = user_input.nextInt();
            while (month<1 || month>12)
            {
                System.out.println("The month has to be 1-12");
                month = user_input.nextInt();
            }
            if(month == 1)
            {
                System.out.println("The full moon of that month is on " + Date1);
            }
            if(month == 2)
            {
                System.out.println("The full moon of that month is on " + Date2);
            }
            if(month == 3)
            {
                System.out.println("The full moon of that month is on " + Date3);
            }
            if(month == 4)
            {
                System.out.println("The full moon of that month is on " + Date4);
            }
            if(month == 5)
            {
                System.out.println("The full moon of that month is on " + Date5);
            }
            if(month == 6)
            {
                System.out.println("The full moon of that month is on " + Date6);
            }
            if(month == 7)
            {
                System.out.println("The full moon of that month is on " + Date7);
            }
            if(month == 8)
            {
                System.out.println("The full moon of that month is on " + Date8);
            }
            if(month == 9)
            {
                System.out.println("The full moon of that month is on " + Date9);
            }
            if(month == 10)
            {
                System.out.println("The full moon of that month is on " + Date10);
            }
            if(month == 11)
            {
                System.out.println("The full moon of that month is on " + Date11);
            }
            if(month == 12)
            {
                System.out.println("The full moon of that month is on " + Date12);
            }
        }


    }
}
