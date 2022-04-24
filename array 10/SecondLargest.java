public class SecondLargest
{
	public static void main(String args[])
	{
		int[] a ={45,89,91,31,69};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The second largest element in the array is:"+a[a.length-2]);
	}
}	
	