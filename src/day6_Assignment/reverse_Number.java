package day6_Assignment;
import java.util.*;

public class reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter number:- ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int revers = 0, temp = 0;
        
        while (number != 0) {

            temp = number % 10;
            revers = revers * 10 + temp;
            number = number / 10;

        }
        System.out.println("Printing:-" + " " + revers);

	}

}
