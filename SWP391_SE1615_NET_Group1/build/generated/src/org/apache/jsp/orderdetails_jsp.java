package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/orderdetails.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"title\">Purchase Reciept</div>\n");
      out.write("            <div class=\"info\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-7\">\n");
      out.write("                        <span id=\"heading\">Date</span><br>\n");
      out.write("                        <span id=\"details\">10 October 2018</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-5 pull-right\">\n");
      out.write("                        <span id=\"heading\">Order No.</span><br>\n");
      out.write("                        <span id=\"details\">012j1gvs356c</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>      \n");
      out.write("            </div>      \n");
      out.write("            <div class=\"pricing\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-9\">\n");
      out.write("                        <span id=\"name\">BEATS Solo 3 Wireless Headphones</span>  \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <span id=\"price\">&pound;299.99</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-9\">\n");
      out.write("                        <span id=\"name\">Shipping</span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-3\">\n");
      out.write("                        <span id=\"price\">&pound;33.00</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"total\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-9\"></div>\n");
      out.write("                    <div class=\"col-3\"><big>&pound;262.99</big></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tracking\">\n");
      out.write("                <div class=\"title\">Tracking Order</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"progress-track\">\n");
      out.write("                <ul id=\"progressbar\">\n");
      out.write("                    <li class=\"step0 active \" id=\"step1\">Ordered</li>\n");
      out.write("                    <li class=\"step0 active text-center\" id=\"step2\">Shipped</li>\n");
      out.write("                    <li class=\"step0 active text-right\" id=\"step3\">On the way</li>\n");
      out.write("                    <li class=\"step0 text-right\" id=\"step4\">Delivered</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-2\"><img class=\"img-fluid\" src=\"https://i.imgur.com/YBWc55P.png\"></div>\n");
      out.write("                    <div class=\"col-10\">Want any help? Please &nbsp;<a> contact us</a></div>\n");
      out.write("                </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
