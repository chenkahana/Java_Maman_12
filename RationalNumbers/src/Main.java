import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the RATIONAL NUMBERS CALCULATES");
            System.out.println("Enter the Following:");
            System.out.print("\tfirst rational number's numerator: ");
            int numerator = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\tfirst rational number's denominator: ");
            int denominator = scanner.nextInt();
            scanner.nextLine();

            Rational firstRationalNum = new Rational(numerator, denominator);
            System.out.println("Great, we got " + firstRationalNum);
            System.out.println("Let's move on to the second number:");
            System.out.println("Enter the Following:");
            System.out.print("\tsecond rational number's numerator: ");
            numerator = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\tsecond rational number's denominator: ");
            denominator = scanner.nextInt();
            scanner.nextLine();

            Rational secondRationalNum = new Rational(numerator, denominator);
            System.out.println("Lets do some math: ");
            System.out.println("\t " + firstRationalNum + " is " + (firstRationalNum.greaterThan(secondRationalNum) ? "grater than " : "lesser than ") + secondRationalNum);
            System.out.println("\t " + firstRationalNum + " - " + secondRationalNum + " = " + firstRationalNum.minus(secondRationalNum).reduce());
            System.out.println("\t " + firstRationalNum + " + " + secondRationalNum + " = " + firstRationalNum.plus(secondRationalNum).reduce());
            System.out.println("\t " + firstRationalNum + " * " + secondRationalNum + " = " + firstRationalNum.multiply(secondRationalNum).reduce());
            System.out.println("\t " + firstRationalNum + " : " + secondRationalNum + " = " + firstRationalNum.divide(secondRationalNum).reduce());

        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal argument given, " + ex.getMessage() + " try again.");
        } catch (ArithmeticException ex) {
            System.out.println("An Arithmetic Exception occurred, " + ex.getMessage() + " try again.");
        } catch (InputMismatchException ex) {
            System.out.println("There was a mismatch issue. Only insert whole numbers as numerator/ denominator");
        } catch (Exception ex) {
            System.out.println("Something went wrong. try again.");
        }
    }
}
