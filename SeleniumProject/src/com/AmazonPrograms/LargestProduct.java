package com.AmazonPrograms;

import java.util.ArrayList;

public class LargestProduct {

	public static void main(String[] args) {
	
		int[][] matrix = new int[][] {{3,8,10},{4,10,6}};
		System.out.println("The length of matrix is "+matrix.length);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<(matrix[i].length)-1;j++){
				result.add(matrix[i][j]*matrix[i][j+1]);
						
			}
		}
		System.out.println(result);	
		int lar = result.get(0);
		for(int i =0;i<result.size();i++){
			
			if(result.get(i)>lar){
				lar=result.get(i);
			}
			
	
		}
		System.out.println("The largest number is "+lar);
	}

}
