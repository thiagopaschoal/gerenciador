
<html>

<head>
    <meta charset=UTF-8>
    <link rel="stylesheet" href="./css/reset.css"/>
    <link rel="stylesheet" href="./css/links.css"/>
    <link rel="stylesheet" href="./css/pages.css"/>
    <link rel="stylesheet" href="./css/tables.css"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet"> 
    <title>Nova Empresa</title>
</head>

<body>
    <header class="topNavBar">Nova Empresa</header>
    <main>
        <section id="formulario">
            <form action="/gerenciador/novaEmpresa" method="POST">
                <section style="margin: 1.5rem;">
                    <label>Nome:</label>
                    <input name="nome" required type="text"/>
                </section>
                <section style="margin: 1.5rem;">
                    <label>Tamanho da Empresa:</label>
                    <select name="cmbTamanhoEmpresa" required>
                        <option value="Pequena">Pequena</option>
                        <option value="Media">Media</option>
                        <option value="Grande">Grande</option>
                    </select>
                </section>
                <button style="margin-left: 1.5rem;">Cadastrar</button>
            </form>
        </section>
    </main>
</body>

</html>