package Sorting;

public class SelectionSort {
	public static void main(String args[]) {
		int arr[]= {12,56,1,32,21,54,9};
		int n=arr.length;
		System.out.println("Un-Sorted Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
		selection_sort(arr, n);
	}
	
	public static void selection_sort(int arr[],int n) {
		for(int i=0;i<n-1;i++) { 
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			//swap
			int temp= arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println("\nSorted Array : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
