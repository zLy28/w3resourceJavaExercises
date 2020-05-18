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


}
