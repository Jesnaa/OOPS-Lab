public class SumArray{
	public static void main(String args[]){
		int []arr=new int[]{22,3,4,51};
		System.out.println("The elements are:");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
	int sum=0;
	for(int i=0;i<arr.length;i++){
	sum=sum+arr[i];
	}
	System.out.println(" sum is:"+sum);
	
}	
}