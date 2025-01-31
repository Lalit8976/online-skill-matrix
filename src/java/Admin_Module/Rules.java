package Admin_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author AJIT PATHAK-G
 */
public class Rules extends HttpServlet 
{
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
       {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try
        {
            
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Rules - Skill Matrix</title>\n" +
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
"        background-color: #f0f0f0;\n" +
"        padding: 15px;\n" +
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
"    \n" +
"    .main-content h2 {\n" +
"        color: #388E3C;\n" +
"        margin-bottom: 20px;\n" +
"    }\n" +
"    \n" +
"    .main-content h3 {\n" +
"        color: #4CAF50;\n" +
"        margin-top: 20px;\n" +
"    }\n" +
"    \n" +
"    .main-content p {\n" +
"        line-height: 1.6;\n" +
"        margin-bottom: 15px;\n" +
"    }\n" +
"    \n" +
"    .main-content a {\n" +
"        color: #388E3C;\n" +
"        text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    .main-content a:hover {\n" +
"        text-decoration: underline;\n" +
"    }\n" +
"    \n" +
"    /* Footer Styles */\n" +
"    footer {\n" +
"        background-color: #333;\n" +
"        color: white;\n" +
"        text-align: center;\n" +
"        padding: 15px 0;\n" +
"        border-top: 3px solid #4CAF50;\n" +
"        margin-top: 20px;\n" +
"    }\n" +
"    \n" +
"    footer p {\n" +
"        margin: 5px 0;\n" +
"    }\n" +
"    \n" +
"    footer a {\n" +
"        color: #4CAF50;\n" +
"        text-decoration: none;\n" +
"    }\n" +
"    \n" +
"    footer a:hover {\n" +
"        text-decoration: underline;\n" +
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
"            <li><a href=\"about\">About Us</a></li>\n" +
"            <li><a href=\"Rules\">Rules</a></li>\n" +
"            <li><a href=\"Contact_us\">Contact Us</a></li>\n" +
"            \n" +
"        </ul>\n" +
"        \n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"               <div class=\"main-content\">\n" +
"            <h2>Platform Rules and Guidelines</h2>\n" +
"            <p>Welcome to the Skill Matrix platform! Please read the following rules carefully to ensure a smooth and productive experience for everyone.</p>\n" +
"            \n" +
"            <h3>General Rules</h3>\n" +
"            <ul>\n" +
"                <li>Respect all members of the community. Harassment, bullying, and discriminatory language will not be tolerated.</li>\n" +
"                <li>Ensure that your contributions are relevant and helpful to others.</li>\n" +
"                <li>Maintain the integrity of exams by not sharing or distributing exam content.</li>\n" +
"                <li>Use your real identity when registering and participating in exams.</li>\n" +
"            </ul>\n" +
"            \n" +
"            <h3>Exam Rules</h3>\n" +
"            <ul>\n" +
"                <li>All exams must be taken by the registered user only. Impersonation is strictly prohibited.</li>\n" +
"                <li>Follow the exam instructions carefully. Violations may result in disqualification.</li>\n" +
"                <li>Any form of cheating or academic dishonesty will lead to serious consequences, including expulsion from the platform.</li>\n" +
"                <li>Ensure a stable internet connection before starting an exam.</li>\n" +
"            </ul>\n" +
"            \n" +
"            <h3>Account Management</h3>\n" +
"            <ul>\n" +
"                <li>Keep your account information secure and do not share your password with others.</li>\n" +
"                <li>Update your profile regularly to ensure that your information is accurate.</li>\n" +
"                <li>If you encounter any issues, contact support immediately for assistance.</li>\n" +
"            </ul>\n" +
"            \n" +
"            <h3>Privacy and Data Protection</h3>\n" +
"            <ul>\n" +
"                <li>Your personal information is protected by our privacy policy. We do not share your data with third parties without consent.</li>\n" +
"                <li>Be mindful of the information you share on the platform, especially in public forums or discussions.</li>\n" +
"                <li>Report any suspicious activity or privacy concerns to our support team.</li>\n" +
"            </ul>\n" +
"            \n" +
"            <h3>Consequences of Violations</h3>\n" +
"            <p>Violating the platform rules may result in warnings, temporary suspensions, or permanent bans, depending on the severity of the violation.</p>\n" +
"        </div>\n" +
"    </div>\n" +
"    <footer>\n" +
"        <p>&copy; 2024 Skill Matrix. All rights reserved.</p>\n" +
"        <p><a href=\"privacy.html\">Privacy Policy</a> | <a href=\"terms.html\">Terms of Service</a> | <a href=\"contact.html\">Contact Us</a></p>\n" +
"    </footer>\n" +
"</body>\n" +
"</html>"
                    );
         }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
