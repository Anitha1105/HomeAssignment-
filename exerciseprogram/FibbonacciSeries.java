package exerciseprogram;

public class FibbonacciSeries {
	
	public static void main(String[] args) {
		
		int num1=0,num2=1;
		System.out.println("Fibbonacci Series of 10 numbers: " );
		
		for (int i=1;i<=10;i++)
		{
			System.out.print(num1+" " );
			int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
		}
		
		
	}

}
