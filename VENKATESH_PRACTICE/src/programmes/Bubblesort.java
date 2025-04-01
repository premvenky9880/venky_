package programmes;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
	int a[] = {4,5,6,3,1};
	
	 System.out.println("Arrays before sorting:"+ Arrays.toString(a));//this method will print everything in list
	 
	int n=a.length;//first  we should find length of an array
	 
	for(int i=0;i<n-1;i++) //n-1 because 5 numbers(4passes)
	{
		for(int j=0;j<n-1;j++)//iteration in each pass
		{
			if(a[j]<a[j+1])//like(4,3)it will swap
			{
			 int temp=a[j];//temporary variable stores a(j)
				a[j]=a[j+1]	;
				a[j+1]=temp;
	}
	}
}
	 System.out.println("Arrays after sorting:"+ Arrays.toString(a));
}
}
	