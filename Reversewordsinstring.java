
public class Reversewordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Str= "Hello new world";
	String a[]=Str.split("");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i] + "");
	}
	//For reverse order
		System.out.println("");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i] + "");
		}
	}

}
