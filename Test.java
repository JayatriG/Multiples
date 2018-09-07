package Check_multiples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/multiple")
public class Test extends HttpServlet{
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		String num1=req.getParameter("number");
		
		int num= Integer.parseInt(num1);
		
		for(int i=1;i<100;i++)
		{
			if(i%num == 0)
			{
				pw.println(i);
			}
		}
	}
	

}
