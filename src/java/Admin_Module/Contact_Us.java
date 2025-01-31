package Admin_Module;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Contact_Us extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Contact Us - Skill Matrix</title>\n" +
"    <style type=\"text/css\">* {\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        box-sizing: border-box;\n" +
"        font-family: Arial, sans-serif;\n" +
"    }\n" +
"    \n" +
"    html, body {\n" +
"        height: 100%;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        background-color: #f4f4f4;\n" +
"    }\n" +
"    \n" +
"    body {\n" +
"        display: flex;\n" +
"        flex-direction: column;\n" +
"    }\n" +
"    \n" +
"    .header {\n" +
"        background-color: #4CAF50;\n" +
"        color: white;\n" +
"        padding: 20px;\n" +
"        text-align: center;\n" +
"        border-bottom: 3px solid #388E3C;\n" +
"        flex-shrink: 0;\n" +
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
"        flex-shrink: 0;\n" +
"    }\n" +
"    \n" +
"    .navbar ul {\n" +
"        list-style-type: none;\n" +
"        margin: 0;\n" +
"        padding: 0;\n" +
"        display: flex;\n" +
"    }\n" +
"    \n" +
"    .navbar ul li {\n" +
"        flex: 1;\n" +
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
"        flex-grow: 1;\n" +
"    }\n" +
"    \n" +
"    .sidebar {\n" +
"        width: 200px;\n" +
"        background-color: #f0f0f0;\n" +
"        padding: 15px;\n" +
"        border-right: 2px solid #ccc;\n" +
"        flex-shrink: 0;\n" +
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
"        overflow-y: auto;\n" +
"    }\n" +
"    \n" +
"    .main-content h2 {\n" +
"        color: #388E3C;\n" +
"        margin-bottom: 20px;\n" +
"    }\n" +
"    \n" +
"    .main-content p {\n" +
"        line-height: 1.6;\n" +
"        margin-bottom: 15px;\n" +
"    }\n" +
"    \n" +
"    .contact-info p {\n" +
"        font-size: 1.1em;\n" +
"        margin: 10px 0;\n" +
"    }\n" +
"    \n" +
"    footer {\n" +
"        background-color: #333;\n" +
"        color: white;\n" +
"        text-align: center;\n" +
"        padding: 15px 0;\n" +
"        border-top: 3px solid #4CAF50;\n" +
"        margin-top: 20px;\n" +
"        flex-shrink: 0;\n" +
"    }\n" +
"    </style>\n" +
"\n" +
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
"       \n" +
"        <div class=\"main-content\">\n" +
"            <h2>Contact Us</h2>\n" +
"            <p>If you have any questions, concerns, or feedback, feel free to reach out to us. We are here to help you!</p>\n" +
"\n" +
"            <div class=\"contact-info\">\n" +
"                <p><strong>Mobile Number:</strong> +1 (123) 456-7890</p>\n" +
"                <p><strong>Email:</strong> support@skillmatrix.com</p>\n" +
"                <p><strong>Address:</strong> 123 Skill Matrix Ave, Suite 456, Learning City, Education State, 78901</p>\n" +
"            </div>\n" +
"\n" +
"            <p>If you have any inquiries or need further assistance, don't hesitate to contact us. Our team is dedicated to providing you with the best service possible.</p>\n" +
"        </div>\n" +
"    </div>\n" +
"    <footer>\n" +
"        <p>&copy; 2024 Skill Matrix. All rights reserved.</p>\n" +
"        <p><a href=\"privacy.html\">Privacy Policy</a> | <a href=\"terms.html\">Terms of Service</a> | <a href=\"contact.html\">Contact Us</a></p>\n" +
"    </footer>\n" +
"</body>\n" +
"</html>"
                   );
                    } finally {            
                        out.close();
                    }
                }
            }
