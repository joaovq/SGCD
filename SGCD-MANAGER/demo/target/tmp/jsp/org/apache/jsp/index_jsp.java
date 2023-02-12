/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.5.v20170502
 * Generated at: 2022-12-18 20:13:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- CSS only -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("    <title>Login</title>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"conteiner\">\n");
      out.write("        <section class=\"vh-100\" style=\"background-color: #00d9ff; \">\n");
      out.write("            <div class=\"container py-5 h-50\">\n");
      out.write("              <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                <div class=\"col col-xl-10\" >\n");
      out.write("                  <div class=\"card\" style=\"border-radius: 1rem;\">\n");
      out.write("                    <div class=\"row g-0\">\n");
      out.write("                      <div class=\"col-md-6 col-lg-5 d-none d-md-block\" style=\"height: 2cm;\">\n");
      out.write("                        <img src=\"images/img2.jpg\"\n");
      out.write("                          alt=\"login form\" class=\"img-fluid\" style=\"border-radius: 1rem 0 0 1rem; height:14.5cm;\" />\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-6 col-lg-7 d-flex align-items-center\">\n");
      out.write("                        <div class=\"card-body p-4 p-lg-5 text-black\">\n");
      out.write("          \n");
      out.write("                          <form method=\"post\" action=\"login\">\n");
      out.write("          \n");
      out.write("                            <div class=\"d-flex align-items-center mb-3 pb-1\">\n");
      out.write("                              <i class=\"fas fa-cubes fa-2x me-3\" style=\"color: #00d9ff;\"></i>\n");
      out.write("                              <span class=\"h1 fw-bold mb-0\">SGCD</span>\n");
      out.write("                            </div>\n");
      out.write("          \n");
      out.write("                            <h5 class=\"fw-normal mb-3 pb-3\" style=\"letter-spacing: 1px;\">Login Gestor</h5>\n");
      out.write("          \n");
      out.write("                            <div class=\"form-outline mb-4\">\n");
      out.write("                              <label class=\"form-label\" for=\"form2Example17\">Login:</label>\n");
      out.write("                              <input type=\"text\" name=\"login\" id=\"form2Example17\" class=\"form-control form-control-lg\" placeholder=\"Digite aqui...\"/>\n");
      out.write("                            </div>\n");
      out.write("          \n");
      out.write("                            <div class=\"form-outline mb-4\"> \n");
      out.write("                              <label class=\"form-label\" for=\"form2Example27\">Password:</label>\n");
      out.write("                              <input type=\"password\" id=\"form2Example27\" class=\"form-control form-control-lg\" name=\"password\"placeholder=\"Digite aqui...\"/>\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("          \n");
      out.write("                            <div class=\"pt-1 mb-4\">\n");
      out.write("                              <input class=\"btn btn-primary btn-lg btn-block\" type=\"submit\" value=\"Login\"></input>\n");
      out.write("                            </div>\n");
      out.write("          \n");
      out.write("                            <a href=\"#!\" class=\"small text-muted\" style=\"text-decoration: none; color: black; display: block;\">Terms of use</a>\n");
      out.write("                            \n");
      out.write("                            <a href=\"#!\" class=\"small text-muted\"style=\"text-decoration: none; color: black;\">Privacy policy</a>\n");
      out.write("                          </form>\n");
      out.write("          \n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </section>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- JavaScript Bundle with Popper -->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}