/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-10-08 04:00:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/header.html", Long.valueOf(1475895148866L));
    _jspx_dependants.put("/views/barra_de_menus.html", Long.valueOf(1475895150406L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<html ng-app=\"appt\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("\t\t<script src=\"//ajax.googleapis.com/ajax/libs/angularjs/1.2.8/angular.min.js\"></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/angularjs/1.2.0rc1/angular-route.min.js\"></script>\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("\t\t<link href=\"lib/bootstrap/css/bootstrap.spacelab.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"lib/font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Para utlizar como base: https://bootswatch.com/spacelab/ -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Latest compiled and minified JavaScript -->\n");
      out.write("\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\t\t\tdiv.box { \n");
      out.write("\t\t\t    padding          : 10px;\n");
      out.write("\t\t\t    border-radius    : 6px;\n");
      out.write("\t\t\t    border           : 1px solid lightgray;\n");
      out.write("\t\t\t    background-color : #F5F5F5;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tdiv.box-white { \n");
      out.write("\t\t\t    padding          : 10px;\n");
      out.write("\t\t\t    border-radius    : 6px;\n");
      out.write("\t\t\t    border           : 1px solid lightgray;\n");
      out.write("\t\t\t    background-color : #FFF;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.oculto { \n");
      out.write("\t\t\t    display: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t</style>");
      out.write('\n');
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\" ng-class=\"{active: activetab == '/'}\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#/pedidosGarcom\">Pedidos</a>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#/pedidosGarcom\">Entregas</a>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#/pedidosGarcom\">Ajuda</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("<title>Restaurante</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div ng-view></div>  \n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"appt.js\"></script>\n");
      out.write("    <script src=\"controllers/controllersGarcom.js\"></script>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("\t\tvar numItens = 1;\n");
      out.write("    \n");
      out.write("\t\tfunction carroClientes() {\n");
      out.write("\t\t\tvar carroCliente = $(\"input:radio[name=carroCliente]:checked\").val();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(carroCliente == 1)\n");
      out.write("\t\t\t\t$(\"#dadosCarro\").removeClass(\"oculto\");\n");
      out.write("\t\t\telse \n");
      out.write("\t\t\t\t$(\"#dadosCarro\").addClass(\"oculto\");\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t \n");
      out.write("\t\tfunction AdicionaLinha() {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tvar quantidadeItem = $(\"#quantidadeItem\").val();\n");
      out.write("\t\t\t\tvar item           = $(\"#item\").val();\n");
      out.write("\n");
      out.write("\t\t\t    var newRow = $(\"<tr id='linha\"+numItens+\"'>\");\n");
      out.write("\t\t\t    var cols = \"\";\n");
      out.write("\t\t\t    \n");
      out.write("\t\t\t    cols += '<td><center>'+numItens+'</center></td>';\n");
      out.write("\t\t\t    cols += '<td><center>'+item+'</center></td>';\n");
      out.write("\t\t\t    cols += '<td>';\n");
      out.write("\t\t\t    cols += '\t<center>';\n");
      out.write("\t\t\t    cols += '\t\t<span class=\"\"><i class=\"fa fa-plus-square\" aria-hidden=\"true\"></i></span>';\n");
      out.write("\t\t\t    cols += '\t\t<span> '+quantidadeItem+'  </span>';\n");
      out.write("\t\t\t    cols += '\t\t<span class=\"\"><i class=\"fa fa-minus-square\" aria-hidden=\"true\"></i></span>';\n");
      out.write("\t\t\t    cols += '\t</center>';\n");
      out.write("\t\t\t    cols += '</td>';\n");
      out.write("\t\t\t    cols += '<td>';\n");
      out.write("\t\t\t    cols += '\t<center>'\n");
      out.write("\t\t\t    cols += '\t\t<a type=\"button\" class=\"btn btn-danger btn-xs\" onclick=\"removerItem(\\''+numItens+'\\');\"><i class=\"fa fa-trash-o\" aria-hidden=\"true\"></i> Remover</a>';\n");
      out.write("\t\t\t    cols += '\t</center>';\n");
      out.write("\t\t\t    cols += '</td>';\n");
      out.write("\t\t\t    \n");
      out.write("\t\t\t    $(\"#divItensPedido\").removeClass('oculto');\n");
      out.write("\n");
      out.write("\t\t\t    newRow.append(cols);\n");
      out.write("\t\t\t    $(\"#itensPedido\").append(newRow);\n");
      out.write("\t\t\t    \n");
      out.write("\t\t\t    numItens++;\n");
      out.write("\t\t\t    \n");
      out.write("\t\t\t    $(\"#quantidadeItem\").val('');\n");
      out.write("\t\t\t\t$(\"#item\").val('');\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t     }\n");
      out.write("\t\t\n");
      out.write("\t\t function removerItem(numItem) {\n");
      out.write("\t\t\t alert(numItem);\n");
      out.write("\t\t\t $(\"#linha\"+numItem).remove();\n");
      out.write("\t\t\t \n");
      out.write("\t\t }\n");
      out.write("\t\t \n");
      out.write("\t\t function controlaFormaPgto() {\n");
      out.write("\t\t\t \n");
      out.write("\t\t\tvar formaPgto = $(\"#selectFormaPgto\").val();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif (formaPgto == 1) {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(\"#divCheque\").addClass(\"oculto\");\n");
      out.write("\t\t\t\t$(\"#divCartao\").addClass(\"oculto\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(\"#divDinheiro\").removeClass(\"oculto\");\n");
      out.write("\t\t\t\t$(\"#formaPgtoCupom\").text(\"Pagamento em Dinheiro\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t} else if (formaPgto == 2) {\n");
      out.write("\t\t\t\t$(\"#divCheque\").addClass(\"oculto\");\n");
      out.write("\t\t\t\t$(\"#divDinheiro\").addClass(\"oculto\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(\"#divCartao\").removeClass(\"oculto\");\n");
      out.write("\t\t\t\t$(\"#formaPgtoCupom\").text(\"Pagamento no Cartão\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t$(\"#divCartao\").addClass(\"oculto\");\n");
      out.write("\t\t\t\t$(\"#divDinheiro\").addClass(\"oculto\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(\"#divCheque\").removeClass(\"oculto\");\n");
      out.write("\t\t\t\t$(\"#formaPgtoCupom\").text(\"Pagamento em Cheque\");\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t }\n");
      out.write("\t\t\n");
      out.write("\t\t function calculaTroco() {\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t var valorRecebido = $(\"#valorRecebido\").val();\n");
      out.write("\t\t\t $(\"#troco\").val(valorRecebido - 130.00);\n");
      out.write("\t\t }\n");
      out.write("\t\t \n");
      out.write("\t\t var map;\n");
      out.write("\t\t var infoWindow;\n");
      out.write("\n");
      out.write("\t\t function initMap() {\n");
      out.write("\t\t   map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("\t\t     zoom: 5,\n");
      out.write("\t\t     center: {lat: 24.886, lng: -70.268},\n");
      out.write("\t\t     mapTypeId: google.maps.MapTypeId.TERRAIN\n");
      out.write("\t\t   });\n");
      out.write("\n");
      out.write("\t\t   // Define the LatLng coordinates for the polygon.\n");
      out.write("\t\t   var triangleCoords = [\n");
      out.write("\t\t       {lat: 25.774, lng: -80.190},\n");
      out.write("\t\t       {lat: 18.466, lng: -66.118},\n");
      out.write("\t\t       {lat: 32.321, lng: -64.757}\n");
      out.write("\t\t   ];\n");
      out.write("\n");
      out.write("\t\t   // Construct the polygon.\n");
      out.write("\t\t   var bermudaTriangle = new google.maps.Polygon({\n");
      out.write("\t\t     paths: triangleCoords,\n");
      out.write("\t\t     strokeColor: '#FF0000',\n");
      out.write("\t\t     strokeOpacity: 0.8,\n");
      out.write("\t\t     strokeWeight: 3,\n");
      out.write("\t\t     fillColor: '#FF0000',\n");
      out.write("\t\t     fillOpacity: 0.35\n");
      out.write("\t\t   });\n");
      out.write("\t\t   bermudaTriangle.setMap(map);\n");
      out.write("\n");
      out.write("\t\t   // Add a listener for the click event.\n");
      out.write("\t\t   bermudaTriangle.addListener('click', showArrays);\n");
      out.write("\n");
      out.write("\t\t   infoWindow = new google.maps.InfoWindow;\n");
      out.write("\t\t }\n");
      out.write("\n");
      out.write("\t\t /** @this {google.maps.Polygon} */\n");
      out.write("\t\t function showArrays(event) {\n");
      out.write("\t\t   // Since this polygon has only one path, we can call getPath() to return the\n");
      out.write("\t\t   // MVCArray of LatLngs.\n");
      out.write("\t\t   var vertices = this.getPath();\n");
      out.write("\n");
      out.write("\t\t   var contentString = '<b>Bermuda Triangle polygon</b><br>' +\n");
      out.write("\t\t       'Clicked location: <br>' + event.latLng.lat() + ',' + event.latLng.lng() +\n");
      out.write("\t\t       '<br>';\n");
      out.write("\n");
      out.write("\t\t   // Iterate over the vertices.\n");
      out.write("\t\t   for (var i =0; i < vertices.getLength(); i++) {\n");
      out.write("\t\t     var xy = vertices.getAt(i);\n");
      out.write("\t\t     contentString += '<br>' + 'Coordinate ' + i + ':<br>' + xy.lat() + ',' +\n");
      out.write("\t\t         xy.lng();\n");
      out.write("\t\t   }\n");
      out.write("\n");
      out.write("\t\t   // Replace the info window's content and position.\n");
      out.write("\t\t   infoWindow.setContent(contentString);\n");
      out.write("\t\t   infoWindow.setPosition(event.latLng);\n");
      out.write("\n");
      out.write("\t\t   infoWindow.open(map);\n");
      out.write("\t\t }\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCPmpL5-SZkkVcnH1H1kVv0-AXt6sLFk0g&signed_in=true&callback=initMap\"\n");
      out.write("        async defer>\n");
      out.write("    \t\t</script>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
