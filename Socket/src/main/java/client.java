import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client
{

	public static void main(String[] args) throws IOException
	{
		Socket s = new Socket ("localhost",4999);
		PrintWriter pw = new PrintWriter (s.getOutputStream ());
		pw.println ("Its Working");
		pw.flush ();
		InputStreamReader in = new InputStreamReader (s.getInputStream ());
		BufferedReader br = new BufferedReader (in);
		String str = br.readLine ();
		System.out.println ("Client : "+str);



	}
}
