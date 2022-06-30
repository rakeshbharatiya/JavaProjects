
public class CeasarCipher {

	public static void main(String args[])
	{
		
		String str = "hello";
		int key=5;
		int ctnum1=0;
		int ctnum2=0;
		int position=0;
		String ctstr="";
		for(int i = 0;i<str.length();i++)
		{
			position = ((int)Character.toLowerCase(str.charAt(i)))-96;
			System.out.println(position);
			ctnum1 = position+key;
			ctnum2 = ctnum1%26;
			ctstr = ctstr+(char)(ctnum2+96);
			
		}
		
		System.out.println(ctstr);
		
		
		
		
	}
	
	
	
	
	
	
}
