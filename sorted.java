public class Main {
	public static boolean checkArrSorted(int arr[],int idx) {
		if(idx == arr.length -1){
			return true;
		}
		if(arr[idx] < arr[idx+1]) {
	  	return	checkArrSorted(arr,idx+1);
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,9,1};
		System.out.println(checkArrSorted(arr,0));
	}
}