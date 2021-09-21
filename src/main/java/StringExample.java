import java.io.*;


public class StringExample {
	public static void main(String[] arg) throws Exception
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		
		
		System.out.println("please entre the first number:");
		int firstNum=Integer.parseInt(b.readLine());
		
		System.out.println("please entre the second number:");
		int secondNum=Integer.parseInt(b.readLine());
		
		int result=Integer.valueOf(firstNum)+Integer.valueOf(secondNum);
		System.out.println("result is:"+result);
	}

}
