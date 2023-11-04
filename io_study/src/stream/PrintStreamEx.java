package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class PrintStreamEx {

	public static void main(String[] args) throws FileNotFoundException {
		
		OutputStream os = new FileOutputStream("C:/ex/data/test5.txt");
		try(os) {
//			PrintStream ps = new PrintStream(os);
			PrintWriter ps = new PrintWriter(os);
			ps.print("<html>");
			ps.print("<body>");
			ps.print("<p>hi</p>");
			ps.print("</body>");
			ps.print("</html>");
			ps.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
