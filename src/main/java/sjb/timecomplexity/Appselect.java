package sjb.timecomplexity;

public class Appselect
{
	public static void main(String[] args) 
	{
		Selectionsort  s=new Selectionsort();
		int array[]= {90,40,30,60};
		System.out.println("sorted elements are");
		int[] a=s.selectionsort(array);
		for(int i:a)
		{
			System.out.println(i);
		}
		
		
		
		
	}
}
