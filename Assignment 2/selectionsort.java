package java_class;

public class selectionsort {

	public static void main(String[] args) {
		int arr[] = {7,8,5,4,6,3,2,1};
		for(int i=0;i<arr.length;i++) {
			int min_idx=i;
			int temp;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_idx]>arr[j]) {
					min_idx=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
