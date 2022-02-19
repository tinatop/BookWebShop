package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"  crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"  crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/home.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"p-3 bg-dark text-white\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <ul class=\"nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0\">\n");
      out.write("                        <li><a href=\"#\" class=\"nav-link px-2 text-secondary\">Home</a></li>\n");
      out.write("                        <li class=\"nav-item dropdown \">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" id=\"dropdown\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" >Categories</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Contemporary</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Science Fiction </a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Fantasy</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\" class=\"nav-link px-2 text-white\">Cart</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <div class=\"text-end\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-outline-light me-2\">Login</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-warning\">Sign-up</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"position-relative overflow-hidden p-3 p-md-1 m-md-3 text-center bg-light\">\n");
      out.write("                <div class=\"col-md-5 p-lg-5 mx-auto my-5\">\n");
      out.write("                    <h1 class=\"display-4 fw-normal\">“Never trust anyone who has not brought a book with them.”</h1>\n");
      out.write("                    <p class=\"lead fw-normal\"> -Lemony Snicket, Horseradish</p>\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"26\" height=\"26\" fill=\"currentColor\" class=\"bi bi-book\" viewBox=\"0 0 16 16\">\n");
      out.write("                    <path d=\"M1 2.828c.885-.37 2.154-.769 3.388-.893 1.33-.134 2.458.063 3.112.752v9.746c-.935-.53-2.12-.603-3.213-.493-1.18.12-2.37.461-3.287.811V2.828zm7.5-.141c.654-.689 1.782-.886 3.112-.752 1.234.124 2.503.523 3.388.893v9.923c-.918-.35-2.107-.692-3.287-.81-1.094-.111-2.278-.039-3.213.492V2.687zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z\"/>\n");
      out.write("                    </svg>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"product-device shadow-sm d-none d-md-block\"></div>\n");
      out.write("                <div class=\"product-device product-device-2 shadow-sm d-none d-md-block\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <section class=\"container content-section\">\n");
      out.write("                <div class=\"shop-items\">\n");
      out.write("                    <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.Images}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <span class=\"shop-item-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        <p class=\"shop-item-price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" €</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <form class=\"form-add\" action=\"addBag\" method=\"post\">\n");
      out.write("                                <input type=\"hidden\" name=\"idProduct\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.IDProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-add\">Add to Cart</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                  <!--  <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"Images/HMwebS.jpg\">\n");
      out.write("                        <span class=\"shop-item-title\">Norwegian Wood</span>\n");
      out.write("                        <p class=\"shop-item-price\">$6.99</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <button class=\"btn btn-warning shop-item-button\" type=\"button\">Add to Cart</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"Images/VESwebS.jpg\">\n");
      out.write("                        <span class=\"shop-item-title\">Vicious</span>\n");
      out.write("                        <p class=\"shop-item-price\">$12.99</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <button class=\"btn btn-warning shop-item-button\" type=\"button\">Add to Cart</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"Images/JRRTwebS.jpg\">\n");
      out.write("                        <span class=\"shop-item-title\">The Hobbit</span>\n");
      out.write("                        <p class=\"shop-item-price\">$17.99</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <button class=\"btn btn-warning shop-item-button\" type=\"button\">Add to Cart</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"Images/MZwebS.jpg\">\n");
      out.write("                        <span class=\"shop-item-title\">The Book Thief</span>\n");
      out.write("                        <p class=\"shop-item-price\">$19.99</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <button class=\"btn btn-warning shop-item-button\" type=\"button\">Add to Cart</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"Images/SJMwebS.jpg\">\n");
      out.write("                        <span class=\"shop-item-title\">Throne of Glass</span>\n");
      out.write("                        <p class=\"shop-item-price\">$7.99</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <button class=\"btn btn-warning shop-item-button\" type=\"button\">Add to Cart</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"Images/SNwebS.jpg\">\n");
      out.write("                        <span class=\"shop-item-title\">Sleeping Giants</span>\n");
      out.write("                        <p class=\"shop-item-price\">$8.99</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <button class=\"btn btn-warning shop-item-button\" type=\"button\">Add to Cart</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"shop-item\">\n");
      out.write("\n");
      out.write("                        <img class=\"shop-item-image\" src=\"Images/MWwebS.jpg\">\n");
      out.write("                        <span class=\"shop-item-title\">All Systems Red</span>\n");
      out.write("                        <p class=\"shop-item-price\">$9.99</p>\n");
      out.write("                        <div class=\"shop-item-details\">\n");
      out.write("                            <button class=\"btn btn-warning shop-item-button\" type=\"button\">Add to Cart</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <footer class=\"d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top\">\n");
      out.write("                <div class=\"col-md-4 d-flex align-items-center\">\n");
      out.write("                    <a href=\"/\" class=\"mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1\">\n");
      out.write("                        <svg class=\"bi\" width=\"30\" height=\"24\"><use xlink:href=\"#bootstrap\"/></svg>\n");
      out.write("                    </a>\n");
      out.write("                    <span class=\"text-muted\">&copy; 2022 BookShopMT</span>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
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
