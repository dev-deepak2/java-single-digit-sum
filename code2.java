// Here

import java.util.Scanner;

public class SingleDigitSum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter term :");
		int n=s.nextInt();
		int a=n;
		
		int singleDigit=0;
		
		int smalldigit=9;
		
		while(n!=0)
		{
			int digit=n%10;
			singleDigit += digit;
			n=n/10;		
		}
		
		if(singleDigit<=smalldigit)
		{
			System.out.println("The single-digit sum of " +a+ " is "+singleDigit);
			  
		}
		while(singleDigit>smalldigit)
		{
			int sum=0;
			
			while(singleDigit!=0 )
			{
			int digit2=singleDigit%10;
			
			sum += digit2;
			singleDigit /= 10;
			
			}
			singleDigit=sum;
			
		}
		System.out.println("The single-digit sum of " +a+ " is "+singleDigit);
		
	}

}
