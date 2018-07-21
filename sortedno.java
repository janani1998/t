class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=3,temp=0;
		int a[]={2,3,1};
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]+" ");
	}
}
}
