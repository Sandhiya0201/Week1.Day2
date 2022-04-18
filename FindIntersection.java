package week1.day2;

public class FindIntersection {
	public static void main(String[]args) {
		int arr1[]= {3,1,10,7,6,4};
		int arr2[]= {2,3,4,6,5,8};
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}