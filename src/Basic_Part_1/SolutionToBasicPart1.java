package Basic_Part_1;

public class SolutionToBasicPart1 {

    //  Q1:Write a Java program to print 'Hello' on screen and then print your name on a separate line
    public static void question1() {
        System.out.println("Hello\nSteve");
    }

    //  Q2:Write a Java program to print the sum of two numbers
    public static double question2(double a, double b) {
        return (a + b);
    }

    //  Q3:Write a Java program to divide two numbers and print on the screen
    public static void question3(int a, int b) {
        System.out.println(a / b);
    }

    //  Q4:Write a Java program to print the result of the following operations.
//  Test Data:
//  a. -5 + 8 * 6
//  b. (55+9) % 9
//  c. 20 + -3*5 / 8
//  d. 5 + 15 / 3 * 2 - 8 % 3
//  Expected Output :
//  43
//  1
//  19
//  13
    public static void question4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + (-3 * 5) / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    //  Q5:Write a Java program that takes two numbers as input and display the product of two numbers
    public static void question5(int a, int b) {
        System.out.println(a * b);
    }

    //  Q6:Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
    public static void question6(int a, int b) {
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    //    Q7:Write a Java program that takes a number as input and prints its multiplication table upto 10
    public static void question7(int a) {
        for (int i = 1; i <= +10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }

    //    Q8: Write a Java program to display the following pattern.
//    Sample Pattern :
//
//    J    a   v     v  a
//    J   a a   v   v  a a
//    J  J  aaaaa   V V  aaaaa
//    JJ  a     a   V  a     a
    public static void question8() {
        System.out.println("J    a   v     v  a");
        System.out.println("J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println("JJ  a     a   V  a     a");
    }

    //    Q9:Write a Java program to compute the specified expressions and print the output
//            Test Data:
//            ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    public static void question9() {
        double d = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(d);
    }

    //    Q10:Write a Java program to compute a specified formula. Go to the editor
//      Specified Formula :
//      4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//      Expected Output
//      2.9760461760461765
    public static void question10() {
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }

    //    Q11:Write a Java program to print the area and perimeter of a circle
    public static void question11(double radius) {
        System.out.println("Perimeter is: " + 2 * radius * Math.PI);
        System.out.println("Area is " + radius * radius * Math.PI);
    }

    //    Q12:Write a Java program that takes three numbers as input to calculate and print the average of the numbers
    public static void question12(int a, int b, int c) {
        System.out.println("Average of these 3 numbers is " + (a + b + c) / 3);
    }

    //    Q13:Write a Java program to print the area and perimeter of a rectangle
    public static void question13(double width, double height) {
        double area = width * height;
        double perimeter = (width + height) * 2;
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }

    //    Q14:Write a Java program to print an American flag on the screen
    public static void question14() {
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println(" * * * * *  ================================== ");
        System.out.println("* * * * * * ================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
        System.out.println("============================================== ");
    }

    //    Q15: Write a Java program to swap two variables
    public static void question15(int a, int b) {
        System.out.println("The first number is " + a + " and the second number is " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping, the first number is " + a + " and the second number is " + b);
    }

    //    Q31:Write a Java program to check whether Java is installed on your computer.
    public static void question31() {
        System.out.println("Java Version:" + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

    }

    //    Q32:Write a Java program to compare two numbers
    public static void question32(int a, int b) {
        if (a == b) {
            System.out.println("a = b");
        }
        if (a > b) {
            System.out.println("a > b");
        }
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
        if (a <= b) {
            System.out.println("a <= b");
        }
        if (a != b) {
            System.out.println("a != b");
        }
    }

    //    Q33:Write a Java program and compute the sum of the digits of an integer.
    public static void question33_1(int a) {
        int sum = 0;
        String str = String.valueOf(a);
        String[] strs = str.split("");
        for (String number : strs) {
            int i = Integer.parseInt(number);
            sum += i;
        }
        System.out.println("The sum of the digits is: " + sum);
    }

    public static void question33_2(int a) {
        int sum = 0;
        while (a != 0) {
            int i = a % 10;
            sum += i;
            a = a / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }

    //    Q34: Write a Java program to compute the area of a hexagon.
    public static void question34(double side) {
        double area_of_hexagon = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + area_of_hexagon);
    }

    //    Q35:Write a Java program to compute the area of a polygon.
    public static void question35(double n, double side) {
        double area_of_polygon = (n * side * side) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area is: " + area_of_polygon);
    }

    //    Q36:Write a Java program to compute the distance between two points on the surface of earth.
//    Radius of the earth r = 6371.01 Kilometers
    public static void question36(double lat1, double lon1, double lat2, double lon2) {
        double radius_of_earth = 6371.01;
        double x1 = Math.toRadians(lat1);
        double y1 = Math.toRadians(lon1);
        double x2 = Math.toRadians(lat2);
        double y2 = Math.toRadians(lon2);
        double distance = radius_of_earth * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) *
                Math.cos(y1 - y2));
        System.out.println("The distance between those points is: " + distance + " km.");
    }

    //    Q37:Write a Java program to reverse a string.
    public static void question37(String string) {
        String[] strs = string.split("");
        String reversed = "";
        for (int i = strs.length - 1; i >= 0; i--) {
            reversed = reversed + strs[i];
        }
        System.out.println("Reverse string: "+reversed);
    }

    //    Q38: Write a Java program to count the letters, spaces, numbers and other characters of an input string.
    public static void question38(String s) {
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                letters += 1;
            }else  if (Character.isSpaceChar(chars[i])) {
                spaces += 1;
            }else  if (Character.isDigit(chars[i])) {
                numbers += 1;
            }else {
                others += 1;
            }
        }
        System.out.println("Letters: "+ letters);
        System.out.println("Spaces: "+spaces);
        System.out.println("Numbers: " +numbers);
        System.out.println("Others: "+ others);
    }
}
