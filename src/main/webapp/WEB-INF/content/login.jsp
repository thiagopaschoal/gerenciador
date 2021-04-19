<html>

<head>
    <meta charset="UTF-8"/>
    <title>Gerenciador de Empresas</title>
    <link rel="stylesheet" href="./css/reset.css"/>
    <link rel="stylesheet" href="./css/links.css"/>
    <link rel="stylesheet" href="./css/pages.css"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap" rel="stylesheet"> 
</head>

<body>
    <header class="topNavBar">Bem-Vindo ao Gerenciador de Empresas</header>
    <main>
        <section id="login">
            <form action="/gerenciador/company?action=login" method="POST">
                <section style="margin: 1.5rem;">
                    <label>Login:</label>
                    <input name="login" required type="text"/>
                </section>
                <section style="margin: 1.5rem;">
                    <label>Senha:</label>
                    <input name="password" required type="password"/>
                </section>
                <button style="margin-left: 1.5rem;">Entrar</button>
            </form>
        </section>
    </main>
</body>

</html>