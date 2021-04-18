<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset=UTF-8>
    <link rel="stylesheet" href="./css/reset.css"/>
    <link rel="stylesheet" href="./css/links.css"/>
    <link rel="stylesheet" href="./css/pages.css"/>
    <link rel="stylesheet" href="./css/tables.css"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet"> 
    <title>Listar Empresa</title>
</head>

<body>
    <header class="topNavBar">Empresas Cadastradas</header>
    <main>
        <section>
            <c:choose>
                <c:when test="${empresas.size() == 0}">
                    <h3>Vc nao possui ainda empresas cadastradas?</h3>
                </c:when>
                <c:otherwise>
                    <table id="empresas">
                        <tr>
                            <th>Empresa</th>
                            <th>Tamanho</th>
                            <th style="text-align: center;">Ações</th>
                        </tr>
                        <c:forEach items="${empresas}" var="empresa">
                            <tr>
                                <td>${empresa.nome}</td>
                                <td>${empresa.tamanho}</td>
                                <td style="text-align: center;">
                                    <span><a href="/gerenciador/deletarEmpresa?id=${empresa.id}">Deletar</a></span>
                                    <span><a href="/gerenciador/empresa?id=${empresa.id}">Editar</a></span>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:otherwise>
            </c:choose>
            <section style="margin-top: 1.5rem;">
                <a href="/gerenciador/novaEmpresa.jsp">Nova empresa</a>
            </section>
        </section>
    </main>
</body>

</html>