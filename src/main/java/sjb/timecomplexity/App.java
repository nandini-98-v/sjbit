package sjb.timecomplexity;

public class App
{
	public static void main(String[] args) 
	{
		Linearsearch l=new Linearsearch();
		int array[]= {10,20,30};
		int element=30;
		int res=l.linearsearch(array,element);
		System.out.println(res);
		
		
	}
}

