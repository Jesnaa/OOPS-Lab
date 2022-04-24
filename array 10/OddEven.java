public class OddEven
{
	public static void main(String args[])
	{
		int[] a ={45,89,91,31,69,12};
		System.out.println("Even numbers in array:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd numbers in array:");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}