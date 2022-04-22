public class AscendingArray{
	public static void main(String args[]){
		int i;
		int []arr=new int[]{22,3,4,51};
		System.out.println("The elements are:");
	for(i=0;i<arr.length;i++){
		System.out.println(arr[i]+" ");
	}
	int temp=0;
	for(i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
		    if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
    System.out.println(" ascending order: ");    
        for ( i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");   
		}
	}
}
	
