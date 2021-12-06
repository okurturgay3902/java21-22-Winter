package day22_arrays;

import java.util.Arrays;

public class C06_MultiDimensionalArrays {

	public static void main(String[] args) {
		
				
		int arr[][]= {{1,2}, {3,4}, {5,6}};
		
		System.out.println(Arrays.toString(arr[0])); //[1, 2]
		System.out.println(Arrays.toString(arr[1])); //[3, 4]
		System.out.println(Arrays.toString(arr[2])); //[5, 6]
		
		System.out.println(arr[0][1]); //2
		System.out.println(arr[2][0]); //5
		
		System.out.println(Arrays.toString(arr)); //[[I@48cf768c, [I@59f95c5d, [I@5ccd43c2]
		
		
	}

}
