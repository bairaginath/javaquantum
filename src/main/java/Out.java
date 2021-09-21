import java.io.*;



public class Out {
	public static void main(String x[]) throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		System.out.println("Please enter your name");
		
		String name= b.readLine();
		System.out.println("Hello "+name+",Welcome to JAVA");
	
		
		
	}

}
		