<%@ page import="org.apache.jasper.tagplugins.jstl.core.Catch" %>
<%@ page import="ressources.Calculateur" %>
<%@ page import="ressources.CalculateurService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculateur</title>
</head>
<body>

<%
    // La récupération des valeurs saisies et de l’opération sélectionnée
    int a = Integer.parseInt(request.getParameter("a"));
    int b = Integer.parseInt(request.getParameter("b"));
    String operation = request.getParameter("operation");

    try {
        // Créer une instance du service web "CalculateurService"
        CalculateurService service = new CalculateurService();
        // Obtenir une référence à la souche (stub) du service web à partir du service
        Calculateur souche = service.getCalculateurPort();

        float result = 0;

        // L’appel de la méthode appropriée selon l’opération sélectionnée
        switch (operation) {
            case "add":
                result = souche.add(a, b);
                break;
            case "sous":
                result = souche.subtract(a, b);
                break;
            case "div":
                result = souche.divide(a, b);
                break;
            case "mult":
                result = souche.multiply(a, b);
                break;
        }
%>

    Résultat= <%= result %>

<%
    } catch (Exception e) {
        out.println(e.getMessage());
    }
%>

</body>
</html>
