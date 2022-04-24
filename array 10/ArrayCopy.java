public class ArrayCopy
{
	public static void main(String args[])
	{
		int[] a = {23,87,73,71,39,110};
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Elements in first array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nElements in copied array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}	
	