package java_class;

public class SubsetArray {

	public static void main(String[] args) {
		int[] arr =  {10, 5, 2, 23, 19};
		int[] arr2={19, 5, 3} ;
		boolean flag = false;
		loop:for(int i=0;i<arr2.length;i++) {
			for(int k=0;k<arr.length;k++) {
				if(arr2[i]==arr[k]) {
					if(i==arr2.length-1) {
						flag=true;
					}
					continue loop;
				}
				if(k==arr.length-1 && arr2[i]!=arr[k]) {
					break loop;
				}
					
			}
			
		}
		if(flag) {
			System.out.println("Given set is a subset of arr");
		}
		else {
			System.out.println("Given set is not subset of arr");
		}
	}
}
