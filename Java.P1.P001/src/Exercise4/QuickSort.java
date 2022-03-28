package Exercise4;

public class QuickSort extends NumberList implements Sort{

	
	public QuickSort(int n) {
		super(n);
	}

	@Override
	public void sort(int[] numberList, int n, int m) {
		int low = 0;
		int high = n-1;
		if(low < high) {
			
			int pi = partition(numberList, low, high);
			
			sort(numberList,low, pi -1);
			sort(numberList, pi + 1, high);
		}
		
	}

	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i=(low-1); 
		
		for(int j = low; j< high; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i +1 ;
	}

}
