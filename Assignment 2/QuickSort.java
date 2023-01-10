package java_class;

public class QuickSort {

	
	static int partition(int[] arr,int low,int high) {
		int pivot = arr[high];
		int i=low-1;
		
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}
	
	static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int p=partition(arr,low,high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int	arr[] = {10,9,8,7,6,15,14,56,67,87,90};
	int n=arr.length;
	
	quickSort(arr, 0, n-1);
	System.out.println("Sortd array is");
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	
	}

}
