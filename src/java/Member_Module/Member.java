package Member_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Member extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            HttpSession session=request.getSession();
            String user=(String)session.getAttribute("user_id");
            String pswd=(String)session.getAttribute("pswd");
            if(user==null &&pswd==null)
            {
                response.sendRedirect("Login?msg=Please login first");
            }
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Skill Matrix</title>\n" +
"    <style type=\"text/css\">body {\n" +
"        font-family: Arial, sans-serif;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        background-color: #f4f4f4;\n" +
"    }\n" +
"    \n" +
"    .header {\n" +
"        background-color: #4CAF50;\n" +
"        color: white;\n" +
"        padding: 20px;\n" +
"        text-align: center;\n" +
"        border-bottom: 3px solid #388E3C;\n" +
"    }\n" +
"    \n" +
"    .header .logo {\n" +
"        width: 50px;\n" +
"        vertical-align: middle;\n" +
"        margin-right: 10px;\n" +
"    }\n" +
"    \n" +
"    .navbar {\n" +
"        background-color: #333;\n" +
"        overflow: hidden;\n" +
"        position: relative;\n" +
"    }\n" +
"    \n" +
"    .navbar ul {\n" +
"        list-style-type: none;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"    }\n" +
"    \n" +
"    .navbar ul li {\n" +
"        float: left;\n" +
"    }\n" +
"    \n" +
"    .navbar ul li a {\n" +
"        display: block;\n" +
"        color: white;\n" +
"        text-align: center;\n" +
"        padding: 14px 20px;\n" +
"        text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    .navbar ul li a:hover {\n" +
"        background-color: #ddd;\n" +
"        color: black;\n" +
"    }\n" +
"    \n" +
"    .navbar .welcome-text {\n" +
"        position: absolute;\n" +
"        right: 10px;\n" +
"        top: 10px;\n" +
"        color: white;\n" +
"    }\n" +
"    \n" +
"    .container {\n" +
"        display: flex;\n" +
"    }\n" +
"    \n" +
"    .sidebar {\n" +
"        width: 200px;\n" +
"        background-color: #a08c8cb4;\n" +
"        padding: 15px;\n" +
"        height: 400px;;\n" +
"        border-right: 2px solid #ccc;\n" +
"    }\n" +
"    \n" +
"    .sidebar h2 {\n" +
"        font-size: 18px;\n" +
"        margin-bottom: 10px;\n" +
"    }\n" +
"    \n" +
"    .sidebar ul {\n" +
"        list-style-type: none;\n" +
"        padding: 0;\n" +
"    }\n" +
"    \n" +
"    .sidebar ul li {\n" +
"        margin-bottom: 10px;\n" +
"    }\n" +
"    \n" +
"    .sidebar ul li a {\n" +
"        text-decoration: none;\n" +
"        color: #333;\n" +
"        font-size: 14px;\n" +
"    }\n" +
"    \n" +
"    .sidebar ul li a:hover {\n" +
"        color: #4CAF50;\n" +
"    }\n" +
"    \n" +
"    .main-content {\n" +
"        flex-grow: 1;\n" +
"        background-color: #e8f5e9;\n" +
"        padding: 20px;\n" +
"    }\n" +
"    </style>\n" +
"    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
"</head>\n" +
"<body>\n" +
"    <div class=\"header\">\n" +
"    \n" +
"        <h1>Skill Matrix</h1>\n" +
"    </div>\n" +
"    <div class=\"navbar\">\n" +
"        <ul>\n" +
"            <li><a href=\"Login\">Home</a></li>\n" +
"            <li><a href=\"Change_Password\">Change Password</a></li>\n" +
"            <li><a href=\"Logout\">Logout</a></li>\n" +
"        </ul>\n" +
"        \n" +
"    </div>\n" +
"   <center> <div class=\"welcome-text\">\n" +
"      <Strong> <p>Welcome Member</p></Strong>\n" +
"    </div></center>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"sidebar\">\n" +
"            <h2>Member Module</h2>\n" +
"            <ul>\n" +
"                <li><a href=\"Start_Exam\">Start Exam</a></li>\n" +
"                <li><a href=\"Feedback\">Feedback</a></li>\n" +
"            </ul>\n" +
"        </div>\n" +
"        <div class=\"main-content\">\n" +
"            <!-- Main content goes here -->\n" +
"             <img src=\"Images/skill.webp\" style=\"height: 400px; width: 70%%;\">\n" +
"        </div>\n" +
"    </div>\n" +
"</body>\n" +
"</html>"
                    );
        } finally {            
            out.close();
        }
    }
 }
