package java_DSA.arrays.medium;

public class ReorderAccToIndex {

	
	public static void reorderArray(int[] arr,int[] index) {
		
		int i=0;
		
		while(i < arr.length) {
			
			if(index[i] ==i) {
				i++;
			}
			else {
				
				int temp1=arr[i];
				arr[i]=arr[index[i]];
				arr[index[i]]=temp1;
				
				
				int temp2=index[i];
				index[i]=index[temp2];
				index[temp2]=temp2;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 11, 12};
        int[] index = {1, 0, 2};

        reorderArray(arr, index);

        // Print the updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
