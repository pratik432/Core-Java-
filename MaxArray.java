package Problems;

public class MaxArray {
	static int arr[]= {1,6,5,5,9,6,4,8,2,8};
	static void Max() {
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
			max=arr[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Max();

	}

}
