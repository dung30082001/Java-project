package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>EShopper</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\"\r\n");
      out.write("              rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/style_login.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--Login Register Form Start-->\r\n");
      out.write("        <h2></h2>\r\n");
      out.write("        <div class=\"container\" id=\"container\">\r\n");
      out.write("            <div class=\"form-container sign-up-container\">\r\n");
      out.write("                <form action=\"register\" method=\"post\">\r\n");
      out.write("                    <h1>Create Account</h1>\r\n");
      out.write("                    <div class=\"social-container\">\r\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a>\r\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span>or use your email for registration</span>\r\n");
      out.write("                    <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${err}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                    <input type=\"email\" placeholder=\"Email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\"/>\r\n");
      out.write("                    <input type=\"text\" pattern=\"[A-Za-z\\d\\.}]{6,12}\" title=\"Username must bettween 6-12 character,contains only letters,numbers\" placeholder=\"UserName\" name=\"username\" placeholder=\"UserName\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required=\"\" />\r\n");
      out.write("                    <input type=\"password\" pattern=\"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$\" title=\"Password must more than 8 character,at least one digit,at least one upper letter,not contain space\" placeholder=\"Password\" name=\"password\" required=\"\" />                  \r\n");
      out.write("                    <input type=\"password\" placeholder=\"rePassword\" name=\"repassword\" />\r\n");
      out.write("                    <button type=\"submit\">Sign Up</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-container sign-in-container\">\r\n");
      out.write("                <form action=\"login\" method=\"post\">\r\n");
      out.write("                    <h1>Sign in</h1>\r\n");
      out.write("                    <div class=\"social-container\">\r\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-google-plus-g\"></i></a>\r\n");
      out.write("                        <a href=\"#\" class=\"social\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${alert}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                    <input type=\"email\" placeholder=\"Email\" name=\"email\"/>\r\n");
      out.write("                    <input type=\"password\" placeholder=\"Password\" name=\"password\" />\r\n");
      out.write("                    <a href=\"#\">Forgot your password?</a>\r\n");
      out.write("                    <button type=\"submit\">Sign In</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"overlay-container\">\r\n");
      out.write("                <div class=\"overlay\">\r\n");
      out.write("                    <div class=\"overlay-panel overlay-left\">\r\n");
      out.write("                        <h1>Welcome Back!</h1>\r\n");
      out.write("                        <p>To keep connected with us please login with your personal info</p>\r\n");
      out.write("                        <button class=\"ghost\" id=\"signIn\">Sign In</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"overlay-panel overlay-right\">\r\n");
      out.write("                        <h1>Hello, Friend!</h1>\r\n");
      out.write("                        <p>Enter your personal details and start journey with us</p>\r\n");
      out.write("                        <button class=\"ghost\" id=\"signUp\">Sign Up</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--Login Register Form End-->\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            const signUpButton = document.getElementById('signUp');\r\n");
      out.write("            const signInButton = document.getElementById('signIn');\r\n");
      out.write("            const container = document.getElementById('container');\r\n");
      out.write("\r\n");
      out.write("            signUpButton.addEventListener('click', () => {\r\n");
      out.write("                container.classList.add(\"right-panel-active\");\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            signInButton.addEventListener('click', () => {\r\n");
      out.write("                container.classList.remove(\"right-panel-active\");\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
