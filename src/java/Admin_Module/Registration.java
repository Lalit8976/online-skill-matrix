package Admin_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration1</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#CCCCCC>");
            out.println("<center><br><br><br>"
                    + "<form action=RegistrationConf>"
                    + "<fieldset style='width:560px;height:400px;border:3px solid blue;border-radius:8px;color:purple;font-size:30px;'>"
                    + "<legend>User Registration Panel</legend>"
                    + "<table width=550  border=0>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;User Name&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=text name=t1 style='font-size:18px;width:200px;height:30px;border:2px solid blue;"
                    + "border-radius:10px;font-family:serif;text-align:center;' placeholder='user name' Required></td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Password&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=password name=t2 style='font-size:18px;width:200px;height:30px;border:2px solid blue;"
                    + "border-radius:10px;font-family:serif;text-align:center;' placeholder='user password' Required></td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Date Of Birth&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=date name=t4 style='font-size:18px;width:200px;height:30px;border:2px solid blue;"
                    + "border-radius:10px;font-family:serif;text-align:center;'Required></td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gender&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=radio name=t5 value=Male>Male"
                    + "&nbsp;&nbsp;<input type=radio name=t5 value=Female>Female</td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Qualification&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=checkbox name=t6 value=MCA>MCA"
                    + "&nbsp;&nbsp;<input type=checkbox name=t7 value=BCA>BCA</td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Address&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=text name=t8 style='font-size:18px;width:200px;height:30px;border:2px solid blue;"
                    + "border-radius:10px;font-family:serif;text-align:center;' placeholder='address' Required></td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;City&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=text name=t9 style='font-size:18px;width:200px;height:30px;border:2px solid blue;"
                    + "border-radius:10px;font-family:serif;text-align:center;' placeholder='city name' Required></td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=number name=t10 style='font-size:18px;width:200px;height:30px;border:2px solid blue;"
                    + "border-radius:10px;font-family:serif;text-align:center;' placeholder='contact number' Required></td></tr>"
                    + "<tr><td style='font-size:18px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email_Id&nbsp;&nbsp;:</td>"
                    + "<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=email name=t11 style='font-size:18px;width:200px;height:30px;border:2px solid blue;"
                    + "border-radius:10px;font-family:serif;text-align:center;' placeholder='email id' Required></td></tr>"
                    + "<tr><td><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=submit value=SUBMIT "
                    + "style='background-color:blue;font-size:18px;border-radius:8px;"
                    + "border-color:cyan;color:white;width:100px;height:30px;'></td>"
                    + "<td><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                    + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=reset value=RESET "
                    + "style='background-color:blue;color:white;font-size:18px;border-radius:8px;border-color:cyan;"
                    + "width:100px;height:30px;'></td></tr>");
            out.println("</table></fieldset></form><center></body>");
            out.println("</html>");
        } 
        finally 
        {            
            out.close();
        }
    }

}
