package Member_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Feedback extends HttpServlet 
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
"    <title>Skill Matrix Feedback</title>\n" +
"    <style type=\"text/css\">\n" +
"        body {\n" +
"    font-family: Arial, sans-serif;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"    background-color: #f4f4f4;\n" +
"}\n" +
"\n" +
".header {\n" +
"    background-color: #008cba;\n" +
"    color: white;\n" +
"    padding: 20px;\n" +
"    text-align: center;\n" +
"    border-bottom: 3px solid #006b8f;\n" +
"}\n" +
"\n" +
".header .logo {\n" +
"    width: 50px;\n" +
"    vertical-align: middle;\n" +
"    margin-right: 10px;\n" +
"}\n" +
"\n" +
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
".container {\n" +
"    display: flex;\n" +
"    justify-content: center;\n" +
"    padding: 20px;\n" +
"}\n" +
"\n" +
".feedback-form {\n" +
"    background-color: white;\n" +
"    padding: 20px;\n" +
"    border-radius: 8px;\n" +
"    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
"    width: 400px;\n" +
"}\n" +
"\n" +
".feedback-form h2 {\n" +
"    margin-bottom: 20px;\n" +
"}\n" +
"\n" +
".feedback-form label {\n" +
"    display: block;\n" +
"    margin-bottom: 8px;\n" +
"    font-weight: bold;\n" +
"}\n" +
"\n" +
".feedback-form input, \n" +
".feedback-form textarea {\n" +
"    width: 100%;\n" +
"    padding: 10px;\n" +
"    margin-bottom: 15px;\n" +
"    border: 1px solid #ccc;\n" +
"    border-radius: 4px;\n" +
"}\n" +
"\n" +
".feedback-form button {\n" +
"    width: 100%;\n" +
"    padding: 10px;\n" +
"    background-color: #008cba;\n" +
"    color: white;\n" +
"    border: none;\n" +
"    border-radius: 4px;\n" +
"    cursor: pointer;\n" +
"    font-size: 16px;\n" +
"}\n" +
"\n" +
".feedback-form button:hover {\n" +
"    background-color: #006b8f;\n" +
"}\n" +
"\n" +
"footer {\n" +
"    background-color: #333;\n" +
"    color: white;\n" +
"    text-align: center;\n" +
"    padding: 10px 0;\n" +
"    position: absolute;\n" +
"    bottom: 0;\n" +
"    width: 100%;\n" +
"}\n" +
"\n" +
"    </style>\n" +
"    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
"</head>\n" +
"<body>\n" +
"    <div class=\"header\">\n" +
"       \n" +
"        <h1>Skill Matrix</h1>\n" +
"    </div>\n" +
"    <div class=\"navbar\">\n" +
"        <ul>\n" +
"            <li><a href=\"Login\">Home</a></li>\n" +
"            <li><a href=\"#\">About Us</a></li>\n" +
"            <li><a href=\"Rules\">Rules</a></li>\n" +
"            <li><a href=\"Feedback\">Feedback</a></li>\n" +
"            <li><a href=\"Contact_Us\">Contact Us</a></li>\n" +
"        </ul>\n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"        <div class=\"feedback-form\">\n" +
"            <h2>Feedback</h2>\n" +
"            <form action=\"Feedback_Conf\">\n" +
"                <label for=\"studentName\">Student Name:</label>\n" +
"                <input type=\"text\" id=\"studentName\" name=\"studentName\" placeholder=\"Enter Your Name\" required>\n" +
"\n" +
"                <label for=\"emailId\">Email ID:</label>\n" +
"                <input type=\"email\" id=\"emailId\" name=\"emailId\" placeholder=\"Enter Email ID\" required>\n" +
"\n" +
"                <label for=\"questionNo\">Question No.:</label>\n" +
"                <input type=\"text\" id=\"questionNo\" name=\"questionNo\" placeholder=\"Enter Question No.\" required>\n" +
"\n" +
"                <label for=\"subject\">Subject:</label>\n" +
"                <input type=\"text\" id=\"subject\" name=\"subject\" placeholder=\"Enter Subject Name\" required>\n" +
"\n" +
"                <label for=\"query\">Query:</label>\n" +
"                <textarea id=\"query\" name=\"query\" placeholder=\"Enter Your Feedback\" required></textarea>\n" +
"\n" +
"                <button type=\"submit\">Submit Query</button>\n" +
"            </form>\n" +
"        </div>\n" +
"    </div>\n" +
"   ?</body>\n" +
"</html>"
                   );
        }
        finally
        {            
            out.close();
        }
    }
}
