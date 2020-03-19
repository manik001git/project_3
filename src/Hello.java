import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{
			PrintWriter pout = response.getWriter();
			pout.print("Success");
			pout.close();
		}catch(Exception e){
			
		}
	}
	
}
