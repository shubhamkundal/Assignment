package java_class;

import java.util.Iterator;

public class BubbleSort {
		public static void main(String[] args) {
				
			int arr[]= {7,8,4,5,456,2,6,2,182,1,3};
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i;j<arr.length;j++) {
					int temp;
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		}
}
