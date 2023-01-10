package java_class;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = {6,5,4,3,2,1};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int n=sc.nextInt();
		int low=0;
		int high=arr.length;
		int mid=(arr.length/2);
		boolean flag = true;
		
		while(low<high) {
			if(arr[mid]==n){
				System.out.println("Given number found at index "+mid);
				flag=false;
				break;
			}
			else if(arr[mid]>n) {
				high=mid;
				mid=(high+low)/2;
			}
			else {
				low=mid+1;
				mid=(high+low)/2;
			}
		}
		if(flag) {
		System.out.println("Given number not found");
	}

  }
}
