package Admin_Module;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJIT PATHAK-G
 */
public class Add_Ques extends HttpServlet 
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
"    <style type=\"text/css\">\n" +
"        body {\n" +
"    font-family: Arial, sans-serif;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"}\n" +
"\n" +
".header {\n" +
"    background-color: #f0f0f0;\n" +
"    padding: 10px;\n" +
"    text-align: center;\n" +
"    border-bottom: 2px solid #ccc;\n" +
"}\n" +
"\n" +
".header .logo {\n" +
"    width: 50px;\n" +
" align-items: left;\n" +
"    margin-right: 10px;\n" +
"}\n" +
".navbar {\n" +
"    background-color: #333;\n" +
"    overflow: hidden;\n" +
"}\n" +
"\n" +
".navbar ul {\n" +
"    list-style-type: none;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"}\n" +
"\n" +
".navbar ul li {\n" +
"    float: left;\n" +
"}\n" +
"\n" +
".navbar ul li a {\n" +
"    display: block;\n" +
"    color: white;\n" +
"    text-align: center;\n" +
"    padding: 14px 20px;\n" +
"    text-decoration: none;\n" +
"}\n" +
"\n" +
".navbar ul li a:hover {\n" +
"    background-color: #ddd;\n" +
"    color: black;\n" +
"}\n" +
"\n" +
"\n" +
".container {\n" +
"    display: flex;\n" +
"}\n" +
"\n" +
".sidebar {\n" +
"    width: 400px;\n" +
"    background-color: #e0e0e0;\n" +
"    padding: 13px;\n" +
"    border-right: 2px solid #ccc;\n" +
"}\n" +
"\n" +
".sidebar h2 {\n" +
"    font-size: 22px;\n" +
"    margin-bottom: 15px;\n" +
"}\n" +
"\n" +
".sidebar ul {\n" +
"    list-style-type: none;\n" +
"    padding: 0;\n" +
"}\n" +
"\n" +
".sidebar ul li {\n" +
"    margin-bottom: 18px;\n" +
"}\n" +
"\n" +
".sidebar ul li a {\n" +
"    text-decoration: none;\n" +
"    color: #333;\n" +
"    font-size: 20px;\n" +
"    \n" +
"}\n" +
".sidebar ul li :hover {\n" +
"    font-size: 22px;\n" +
"\n" +
"    color: red;\n" +
"}\n" +
"\n" +
"\n" +
".main {\n" +
"    flex-grow: 1;\n" +
"    padding: 20px;\n" +
"}\n" +
"\n" +
".main h2 {\n" +
"    font-size: 24px;\n" +
"    margin-bottom: 20px;\n" +
"}\n" +
"\n" +
"form {\n" +
"    display: flex;\n" +
"    flex-direction: column;\n" +
"    padding:0px 100px 0px 100px;\n" +
"}\n" +
"\n" +
"form label {\n" +
"    font-size: 14px;\n" +
"    margin-bottom: 5px;\n" +
"}\n" +
"\n" +
"form input[type=\"text\"],\n" +
"form textarea {\n" +
"    font-size: 14px;\n" +
"    padding: 8px;\n" +
"    margin-bottom: 15px;\n" +
"    border: 1px solid #ccc;\n" +
"    border-radius: 4px;\n" +
"}\n" +
"\n" +
"form textarea {\n" +
"    height: 100px;\n" +
"    resize: none;\n" +
"}\n" +
"\n" +
"form .buttons {\n" +
"    display: flex;\n" +
"    gap: 10px;\n" +
"}\n" +
"\n" +
"form .buttons button {\n" +
"    padding: 10px 15px;\n" +
"    border: none;\n" +
"    border-radius: 4px;\n" +
"    cursor: pointer;\n" +
"    font-size: 14px;\n" +
"}\n" +
"\n" +
"form .buttons button[type=\"submit\"] {\n" +
"    background-color: #4CAF50;\n" +
"    color: white;\n" +
"}\n" +
"\n" +
"form .buttons button[type=\"reset\"] {\n" +
"    background-color: #f44336;\n" +
"    color: white;\n" +
"}\n" +
"\n" +
"    </style>\n" +
"    <link rel=\"stylesheet\" href=\"style1.css\">\n" +
"</head>\n" +
"<body>\n" +
"    <div class=\"header\">\n" +
"        \n" +
"        <h1>Skill Matrix</h1>\n" +
"    </div>\n" +
"    <div class=\"navbar\">\n" +
"        <ul>\n" +
"            <li><a href=\"Login\">Home</a></li>\n" +
"            <li><a href=\"Change_Password\">Change Password</a></li>\n" +
"            <li><a href=\"Logout\">Logout</a></li>\n" +
"        </ul>\n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"sidebar\">\n" +
"            <h2>Admin Module</h2>\n" +
"            <ul>\n" +
"                <li><a href=\"View_User_Detail\">View Student Information</a></li>\n" +
"                <li><a href=\"Search_User\">Search Student</a></li>\n" +
"                <li><a href=\"Add_Ques\">Add Question</a></li>\n" +
"                <li><a href=\"Update_Ques\">Update Question</a></li>\n" +
"                <li><a href=\"Delete_Ques\">Delete Question</a></li>\n" +
"                <li><a href=\"View_All_Ques\">View Question List</a></li>\n" +
"                <li><a href=\"View_Feedback\">View Feedback</a></li>\n" +
"            </ul>\n" +
"        </div>\n" +
"        <div class=\"main\">\n" +
"            <h2>Add Question</h2>\n" +
"            <form action=\"Add_Ques_Conf\">\n" +
"                <label for=\"questionId\">Question Id</label>\n" +
"                <input type=\"text\" id=\"questionId\" name=\"questionId\" required>\n" +
"                \n" +
"                <label for=\"question\">Question</label>\n" +
"                <textarea id=\"question\" name=\"question\" required></textarea>\n" +
"                \n" +
"                <label for=\"option1\">Option-1</label>\n" +
"                <input type=\"text\" id=\"option1\" name=\"option1\" required>\n" +
"                \n" +
"                <label for=\"option2\">Option-2</label>\n" +
"                <input type=\"text\" id=\"option2\" name=\"option2\" required>\n" +
"                \n" +
"                <label for=\"option3\">Option-3</label>\n" +
"                <input type=\"text\" id=\"option3\" name=\"option3\" required>\n" +
"                \n" +
"                <label for=\"option4\">Option-4</label>\n" +
"                <input type=\"text\" id=\"option4\" name=\"option4\" required>\n" +
"                \n" +
"                <label for=\"answer\">Answer</label>\n" +
"                <input type=\"text\" id=\"answer\" name=\"answer\" required>\n" +
"                \n" +
"                <div class=\"buttons\">\n" +
"                    <button type=\"submit\">Add</button>\n" +
"                    <button type=\"reset\">Clear</button>\n" +
"                </div>\n" +
"            </form>\n" +
"        </div>\n" +
"    </div>\n" +
"</body>\n" +
"</html>");
                   
                    String str = request.getParameter("msg");
                    if (str != null) 
                    {
                        out.println("<tr height=20px><th colspan=3><span style='color:red;'>" + str + "</span><th></tr>");
                    }
                    out.println("<tr height=30px><th colspan=3><input type=submit value=ADD>&nbsp;&nbsp;&nbsp;&nbsp;"
                            + "<input type=reset value=CLEAR></th></tr>"
                    + "</table>"
                    + "</div></form>"
                    + "</div>");
            out.println("</center></body></html>");
         }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
