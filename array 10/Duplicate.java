public class Duplicate
{
	public static void main(String args[])
	{
		int[] a = {98,45,21,21,10,82};
		System.out.println("Duplicated elements in an array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				  System.out.print(a[j]);	
				}
			}
		}
	}
}	