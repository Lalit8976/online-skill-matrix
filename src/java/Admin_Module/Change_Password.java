package Admin_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Change_Password extends HttpServlet 
{
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
      {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Change_Pwd1</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#CCBBAA><center><br><br><br>");
            out.println("<form action=Change_Pwd_Conf>"
                    + "<fieldset style='width:500px;height:230px;border:3px solid blue;border-radius:8px;color:purple;font-size:30px;'>"
                   + "<legend>Change Password</legend>"
                   + "<table width=550>"
                   + "<tr><td style='font-size:25px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;User name :</td>"
                   + "<td><input type=text name=t1 style='font-size:18px;text-align:center;width:250px;height:30px;"
                   + "border:1px solid blue;border-radius:5px;font-style:italic;font-family:serif;'placeholder='Enter Your Username' Required></td></tr>"
                   + "<tr><td style='font-size:25px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Old Password :</td>"
                   + "<td><input type=password name=t2 style='font-size:18px;text-align:center;width:250px;height:30px;"
                   + "border:1px solid blue;border-radius:7px;font-style:italic;font-family:serif;'placeholder='Enter your Old Password' Required>"
                   + "<a href=' ' title='Enter your old password which you provide at a time of registration' "
                   + " style='color:black;font-weight:bold;text-decoration:None;'>&nbsp;&nbsp;?</a></td></tr>"
                   + "<tr><td style='font-size:25px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;New Password :</td>"
                   + "<td><input type=password name=t3 style='font-size:18px;text-align:center;width:250px;height:30px;"
                   + "border:1px solid blue;border-radius:5px;font-style:italic;font-family:serif;'placeholder='Enter New Password' Required></td></tr>"
                   + "<tr><td style='font-size:25px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Re-Enter Password :</td>"
                   + "<td><input type=password name=t4 style='font-size:18px;text-align:center;width:250px;height:30px;"
                   + "border:1px solid blue;border-radius:7px;font-style:italic;font-family:serif;'placeholder='Confirm Your Password ' Required></td></tr>"
                   + "<tr><td><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "<input type=submit value=SUBMIT style='background-color:blue;font-size:18px;border-radius:8px;border-color:cyan;"
                   + "color:white;width:100px;height:35px;'></td>"
                   + "<td><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=reset value=RESET "
                   + "style='background-color:blue;color:white;font-size:18px;border-radius:8px;border-color:cyan;"
                   + "width:100px;height:35px;'></td></tr></table>");
             String str=request.getParameter("msg");
            if(str!=null)
            {
                out.println("<h6 style='color:red;'>&raquo;&raquo;&nbsp;"+str+"&nbsp;&laquo;&laquo;</h6>");
            }
            out.println("</feildset>");
            out.println("</form></center></body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }
}
