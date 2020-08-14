package ds.array.subarraywithgivenelt;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int s = sc.nextInt();
			int arr[] = new int[a];
			for(int j=0;j<a;j++) {
				arr[j] = sc.nextInt();
			}
			findSolution(arr, s);	
		}
		
	}
	public static void findSolution(int[] arr, int s) {
		int st=0, sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			//reset here
			if(sum>s) {
				sum=0;
				i=(st++);
			}else if(sum==s) {
				System.out.println((st+1)+" "+(i+1));
				break;
			}
			//when it thru last index but not eq to s of sum so always -1
			if(i==(arr.length-1))
				System.out.println(-1); 
		}
	}
}
