/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin_Module;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ayush
 */
public class about extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>About Us - Skill Matrix</title>\n" +
"    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
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
"</head>\n" +
"<body>\n" +
"    <div class=\"header\">\n" +
"\n" +
"        <h1>Skill Matrix</h1>\n" +
"    </div>\n" +
"    <div class=\"navbar\">\n" +
"        <ul>\n" +
"            <li><a href=\"Login\">Home</a></li>\n" +
"            <li><a href=\"about\">About Us</a></li>\n" +
"            <li><a href=\"Rules\">Rules</a></li>\n" +
"            <li><a href=\"Contact_us\">Contact Us</a></li>\n" +
"        </ul>\n" +
"       \n" +
"    </div>\n" +
"    <div class=\"container\">\n" +
"              <div class=\"main-content\">\n" +
"            <h2>About Us</h2>\n" +
"            <p>Welcome to Skill Matrix, your ultimate destination for online learning and examination management. Our platform is designed to help students enhance their skills through interactive exams and continuous learning modules.</p>\n" +
"            \n" +
"            <p>At Skill Matrix, we believe in empowering individuals through knowledge and skill development. Our mission is to provide a seamless and user-friendly platform that caters to the needs of both students and educators.</p>\n" +
"            \n" +
"            <h3>Our Vision</h3>\n" +
"            <p>Our vision is to create a global community of learners who can access quality education from anywhere in the world. We strive to make learning accessible, engaging, and effective for everyone.</p>\n" +
"            \n" +
"            <h3>Our Team</h3>\n" +
"            <p>Our team consists of experienced educators, developers, and support staff who are dedicated to delivering the best online learning experience. We are passionate about education and are committed to helping you achieve your learning goals.</p>\n" +
"            \n" +
"            <h3>Contact Us</h3>\n" +
"            <p>If you have any questions or feedback, feel free to <a href=\"contact.html\">contact us</a>. We are here to help you on your learning journey!</p>\n" +
"        </div>\n" +
"    </div>\n" +
"    <footer>\n" +
"        <p>&copy; 2024 Skill Matrix. All rights reserved.</p>\n" +
"        <p><a href=\"privacy.html\">Privacy Policy</a> | <a href=\"terms.html\">Terms of Service</a> | <a href=\"contact.html\">Contact Us</a></p>\n" +
"    </footer>\n" +
"</body>\n" +
"</html>");
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
