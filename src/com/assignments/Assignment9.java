package com.assignments;

public class Assignment9 {

	public static void main(String[] args) {
		
		
		
		int[] array = {12,34,11,36,87,98,93};
		int temp;
		
			for(int i = 0; i<array.length; i++) {
				for(int j = 0; j < array.length-1; j++) {
					if (array[j] < array[j + 1]) {
						
	                    temp = array[j];  //12
	                    
	                    array[j] = array[j + 1];//34
	                    array[j + 1] = temp; //12
				
			}

			
				}
				System.out.println(array);

			}
	}
}
