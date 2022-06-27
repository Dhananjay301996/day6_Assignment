package day6_Assignment;

import java.util.*;

public class prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.print(" Please Enter n number :-");
	        int j=0;
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        for(int i=1;i<=n/2;i++){
	        	
	            if(n%i==0){
	                j++;
	                if(j==2)
	                    break;
	            }
	        }
	        if(j==1)
	            System.out.println(n+" This a prime number");
	        else
	            System.out.println(n+" is not a prime number");

		
		 
	}

}
