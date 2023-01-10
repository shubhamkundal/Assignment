package java_class;

class MergeSort{
	public void merge(int a[],int lo,int m,int hi) {
		int n1 = m - lo + 1;
        int n2 = hi - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for (int i = 0; i < n1; ++i)
            L[i] = a[lo + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];
        
        int i = 0, j = 0;
        int k = lo;
		
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
	}
	
	
	
	public void sort(int a[],int lo,int hi){
		if(lo<hi) {
			int m=(lo+hi)/2;
			sort(a,lo,m);
			sort(a,m+1,hi);
			merge(a,lo,m,hi);
		}
	}
}

public class MergeSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {7,6,1,4,3,2,5};
		MergeSort MS=new MergeSort();
		MS.sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}

}





