import java.io.*;
 public class Buffer
{
	public static void main(String[] args)
		throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		System.out.println(i);
		String j=br.readLine();
		System.out.println(j);
	}
}