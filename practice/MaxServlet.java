import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MaxServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        int n1=Integer.parseInt(req.getParameter("num1"));
        int n2=Integer.parseInt(req.getParameter("num2"));
        out.println("<h2>Maximum = "+(n1>n2 ? n1+" is greater than "+n2: n2+" is greater than "+n1)+"</h2>");
    }
}
