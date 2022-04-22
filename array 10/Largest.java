public class Largest{
	public static void main(String args[]){
	int [] arr=new int[]{1,22,3,14,5};
	System.out.println("The elements are:");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
	int max=arr[0];
	for(int i=0;i<arr.length;i++){
		if (arr[i]>max)
		max=arr[i];
	}
	System.out.println("largest element is: "+max);
}
}
