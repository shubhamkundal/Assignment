package java_class;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
		int[] arr ={5,6,7,8,5,6,5,4,2,5,6,7,9,5,2,3};
		int[] arr2= new int[10];
		int index=0;
		loop:for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int k=0;k<arr2.length;k++) {
				if (arr2[k]==arr[i]) {
					continue loop;
				}
			}
			index++;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			System.out.println("no. of "+arr[i]+" in string is "+count);
			arr2[index]=arr[i];
		}
	}
}
