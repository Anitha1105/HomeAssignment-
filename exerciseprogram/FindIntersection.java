package exerciseprogram;

public class FindIntersection {
	
	public static void main(String[] args) {
		int[] sample1 = {3,2,11,4,6,7};
		int[] sample2 = {1,2,8,4,9,7};
		
		for (int i = 0; i < sample1.length; i++)
		{
			for (int j = 0; j < sample2.length; j++) 
			
			{
				
				if(sample1[i]==sample2[j]) {
					System.out.println(sample1[i]);
					
				}
				
			}
			
		}
		
	}

}
