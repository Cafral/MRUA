<%--
  Created by IntelliJ IDEA.
  User: CAFRAL SSJ
  Date: 27/11/2024
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="estilos/estilosresultado.css">
<head>
    <title>Muestra de resultados</title>
</head>
<body>

<h2>Resultados del Movimiento Rectilíneo Uniformemente Acelerado</h2>
<p>Tiempo en <%= request.getAttribute("velocidadFinal") %> m/s recorridos es igual a: <%= String.format("%.4f", request.getAttribute("tiempox")) %></p>
<p>Distancia recorrida: <%= String.format("%.4f", request.getAttribute("distancia")) %> metros</p>
<p>Velocidad final después de 5 segundos adicionales: <%= String.format("%.4f", request.getAttribute("velocidadFinalCon5Adi")) %> m/s</p>
<p>Distancia total recorrida en esos 5 segundos adicionales: <%= String.format("%.4f", request.getAttribute("distanciaTotalCon5Adi")) %> metros</p>

</body>
</html>
