<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset=UTF-8>
    <link rel="stylesheet" href="../css/reset.css"/>
    <link rel="stylesheet" href="../css/links.css"/>
    <link rel="stylesheet" href="../css/pages.css"/>
    <link rel="stylesheet" href="../css/tables.css"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet">
    <title>Editar Empresa</title>
</head>

<body>
    <header class="topNavBar">Editar empresa</header>
    <main>
        <form action="/gerenciador/company?action=update&id=${empresa.id}" method="POST" id="formulario">
            <section style="margin: 1.5rem;">
                <label for="nome">Nome: </label>
                <input value="${empresa.nome}" required name="nome" type="text"/>
            </section>
            <section style="margin: 1.5rem;">
                <label for="cmbTamanhoEmpresa">Tamanho da Empresa: </label>
                <select name="cmbTamanhoEmpresa" required>
                    <option value="Pequena">Pequena</option>
                    <option value="Media">Media</option>
                    <option value="Grande">Grande</option>
                </select>
            </section>
            <button style="margin-left: 1.5rem;">Editar</button>
        </form>
    </main>
</body>

</html>