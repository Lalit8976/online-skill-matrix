package Admin_Module;
import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {                  
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Skill Matrix - Online Examination Platform</title>\n"
                    + "<style type='text/css' media='screen'>/* Reset some default styles */\n" +
"* {\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"    box-sizing: border-box;\n" +
"}\n" +
"\n" +
"/* Basic styling for the body */\n" +
"body {\n" +
"    font-family: 'Open Sans', Arial, sans-serif;\n" +
"    line-height: 1.6;\n" +
"    background-color: #f0f0f0;\n" +
"    margin: 0;\n" +
"    padding: 0;\n" +
"    color: #333;\n" +
"}\n" +
"\n" +
"/* Header styles */\n" +
"header {\n" +
"    background-color: #333;\n" +
"    color: #fff;\n" +
"    padding: 10px 0;\n" +
"}\n" +
"\n" +
"header nav ul {\n" +
"    list-style-type: none;\n" +
"    text-align: center;\n" +
"}\n" +
"\n" +
"header nav ul li {\n" +
"    display: inline;\n" +
"    margin-right: 20px;\n" +
"}\n" +
"\n" +
"header nav ul li a {\n" +
"    text-decoration: none;\n" +
"    color: #fff;\n" +
"    font-weight: bold;\n" +
"    font-size: 18px;\n" +
"    transition: color 0.3s ease;\n" +
"}\n" +
"\n" +
"header nav ul li a:hover {\n" +
"    color: #ffc107; /* Change navbar link hover color */\n" +
"}\n" +
"\n" +
"/* Main content section */\n" +
"main {\n" +
"    display: flex;\n" +
"    justify-content: space-between;\n" +
"    align-items: flex-start;\n" +
"    padding: 20px;\n" +
"}\n" +
"\n" +
".content {\n" +
"    flex: 1;\n" +
"    max-width: 60%;\n" +
"}\n" +
"\n" +
".content h1 {\n" +
"    font-family: 'Montserrat', Arial, sans-serif;\n" +
"    font-size: 42px;\n" +
"    font-weight: 500;\n" +
"    margin-bottom: 10px;\n" +
"}\n" +
"\n" +
".welcome-message {\n" +
"    font-family: 'Montserrat', Arial, sans-serif;\n" +
"    font-size: 28px;\n" +
"    font-weight: 500;\n" +
"    color: #ffc107; /* Custom color for welcome message */\n" +
"    margin-bottom: 20px;\n" +
"}\n" +
"\n" +
".description {\n" +
"    font-size: 18px;\n" +
"    line-height: 1.6;\n" +
"    color: #666;\n" +
"}\n" +
"\n" +
".content img {\n" +
"    max-width: 100%;\n" +
"    height: auto;\n" +
"    border: 1px solid #ccc;\n" +
"    border-radius: 5px;\n" +
"    margin-top: 20px;\n" +
"}\n" +
"\n" +
".login {\n" +
"    flex: 1;\n" +
"    display: flex;\n" +
"    justify-content: center;\n" +
"    align-items: center;\n" +
"    max-width: 35%;\n" +
"    margin-top: 20px;\n" +
"}\n" +
"\n" +
".login-container {\n" +
"    background-color: #fff;\n" +
"    padding: 20px;\n" +
"    border: 1px solid #ccc;\n" +
"    border-radius: 8px;\n" +
"    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Add box shadow for depth */\n" +
"    width: 100%;\n" +
"    max-width: 350px;\n" +
"}\n" +
"\n" +
".login h2 {\n" +
"    font-family: 'Montserrat', Arial, sans-serif;\n" +
"    font-size: 24px;\n" +
"    font-weight: 500;\n" +
"    margin-bottom: 15px;\n" +
"    text-align: center;\n" +
"    color: #333;\n" +
"}\n" +
"\n" +
".login form {\n" +
"    display: flex;\n" +
"    flex-direction: column;\n" +
"}\n" +
"\n" +
".input-container {\n" +
"    margin-bottom: 15px;\n" +
"}\n" +
"\n" +
".input-container label {\n" +
"    font-weight: bold;\n" +
"    margin-bottom: 5px;\n" +
"    color: #333;\n" +
"}\n" +
"\n" +
".input-container input[type=\"text\"],\n" +
".input-container input[type=\"password\"] {\n" +
"    padding: 12px;\n" +
"    font-size: 16px;\n" +
"    border: 1px solid #ccc;\n" +
"    border-radius: 5px;\n" +
"    outline: none;\n" +
"    transition: border-color 0.3s ease;\n" +
"}\n" +
"\n" +
".input-container input[type=\"text\"]:focus,\n" +
".input-container input[type=\"password\"]:focus {\n" +
"    border-color: #666; /* Change border color on focus */\n" +
"}\n" +
"\n" +
".input-container input[type=\"checkbox\"] {\n" +
"    margin-left: 5px;\n" +
"}\n" +
"\n" +
".input-container button {\n" +
"    padding: 12px 0;\n" +
"    font-size: 18px;\n" +
"    background-color: #333;\n" +
"    color: #fff;\n" +
"    border: none;\n" +
"    cursor: pointer;\n" +
"    border-radius: 5px;\n" +
"    transition: background-color 0.3s ease;\n" +
"}\n" +
"\n" +
".input-container button:hover {\n" +
"    background-color: #555; /* Change button background color on hover */\n" +
"}\n" +
"\n" +
".info {\n" +
"    font-size: 16px;\n" +
"    text-align: center;\n" +
"    margin-top: 10px;\n" +
"    color: #666;\n" +
"}\n" +
"\n" +
".info a {\n" +
"    color: #333;\n" +
"    text-decoration: none;\n" +
"    font-weight: bold;\n" +
"    transition: color 0.3s ease;\n" +
"}\n" +
"\n" +
".info a:hover {\n" +
"    color: #ffc107; /* Change link color on hover */\n" +
"}\n" +
"\n" +
"/* About section */\n" +
".about {\n" +
"    background-color: #f9f9f9;\n" +
"    padding: 40px 0;\n" +
"}\n" +
"\n" +
".container {\n" +
"    max-width: 800px;\n" +
"    margin: 0 auto;\n" +
"    text-align: center;\n" +
"}\n" +
"\n" +
".about h2 {\n" +
"    font-family: 'Montserrat', Arial, sans-serif;\n" +
"    font-size: 32px;\n" +
"    font-weight: 500;\n" +
"    margin-bottom: 20px;\n" +
"    color: #333;\n" +
"}\n" +
"\n" +
".about p {\n" +
"    font-size: 18px;\n" +
"    line-height: 1.6;\n" +
"    color: #555;\n" +
"}\n" +
"\n" +
".about ul {\n" +
"    margin-top: 20px;\n" +
"    text-align: left;\n" +
"}\n" +
"\n" +
".about ul li {\n" +
"    margin-bottom: 10px;\n" +
"}\n" +
"\n" +
"/* Footer styles */\n" +
"footer {\n" +
"    background-color: #333;\n" +
"    color: #fff;\n" +
"    text-align: center;\n" +
"    padding: 10px 0;\n" +
"}\n" +
"\n" +
".footer-container {\n" +
"    max-width: 800px;\n" +
"    margin: 0 auto;\n" +
"}</style>" +
"    <link rel=\"stylesheet\" href=\"style1.css\">\n" +
"    <!-- Google Fonts - Open Sans for body text and Montserrat for headings -->\n" +
"    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Montserrat:wght@500&display=swap\" rel=\"stylesheet\">\n" +
"</head>\n" +
"<body>\n" +
"    <header>\n" +
"        <nav>\n" +
"            <ul>\n" +
"                <li><a href=\"Login\">Home</a></li>\n" +
"                <li><a href=\"about\">About</a></li>\n" +
"                <li><a href=\"Rules\">Rules</a></li>\n" +
"                <li><a href=\"Contact_Us\">Contact Us</a></li>\n" +
"            </ul>\n" +
"        </nav>\n" +
"    </header>\n" +
"\n" +
"    <main>\n" +
"        <section class=\"content\">\n" +
"            <h1>Welcome to Skill Matrix</h1>\n" +
"            <p class=\"welcome-message\">Transforming Skills, Shaping Futures</p>\n" +
"            <p class=\"description\">Skill Matrix is your premier online examination platform designed to assess and enhance your skills across various domains. Join us to unlock your potential and achieve your career aspirations.</p>\n" +
"            <img src=\"Images/skill.webp\" alt=\"Skill Matrix Image\">\n" +
"        </section>\n" +
"\n" +
"        <section class=\"login\">\n" +
"            <div class=\"login-container\">\n" +
"                <h2>Login</h2>\n" +
"                <form action=Login_Authentication >\n" +
"                    <div class=\"input-container\">\n" +
"                        <label for=\"username\">Username:</label>\n" +
"                        <input type=\"text\" id=\"username\" name=\"t1\" required>\n" +
"                    </div>\n" +
"                    <div class=\"input-container\">\n" +
"                        <label for=\"password\">Password:</label>\n" +
"                        <input type=\"password\" id=\"password\" name=\"t2\" required>\n" +
"                    </div>\n" +
"                    <div class=\"input-container\">\n" +
"                        <label for=\"new-member\">New member?</label>\n" +
"                        <a href=\"Registration\"><input type=\"checkbox\" id=\"new-member\" name=\"new-member\" ></a>\n" +
"                    </div>\n" +
"                    <div class=\"input-container\">\n" +
"                        <button type=\"submit\" value=\"SUBMIT\">Login</button>\n" +
"                    </div>\n" +
"                </form>\n" +
"                <p class=\"info\">Not a member yet? <a href=\"Registration\">Sign up here</a>.</p>\n" +
"            </div>\n" +
"        </section>\n" +
"    </main>\n" +
"\n" +
"    <section class=\"about\">\n" +
"        <div class=\"container\">\n" +
"            <h2>About Skill Matrix</h2>\n" +
"            <p>Skill Matrix is an innovative online examination platform that offers comprehensive assessments across various disciplines. Whether you are a student preparing for exams, a professional seeking certification, or an organization evaluating employee skills, Skill Matrix provides a seamless and reliable testing environment.</p>\n" +
"            <p>Our platform is designed to:</p>\n" +
"            <ul>\n" +
"                <li>Facilitate flexible and secure online examinations.</li>\n" +
"                <li>Offer detailed performance analysis and feedback.</li>\n" +
"                <li>Support a wide range of assessment types and formats.</li>\n" +
"                <li>Promote continuous learning and professional development.</li>\n" +
"            </ul>\n" +
"            <p>Join Skill Matrix today and embark on a journey towards personal and professional excellence!</p>\n" +
"        </div>\n" +
"    </section>\n" +
"\n" +
"    <footer>\n" +
"        <div class=\"container\">\n" +
"            <p>&copy; 2024 Skill Matrix. All rights reserved.</p>\n" +
"        </div>\n" +
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
