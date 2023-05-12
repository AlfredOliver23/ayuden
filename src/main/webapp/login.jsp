<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/05/2023
  Time: 02:35 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="./css/login.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Trispace:wght@300&display=swap" rel="stylesheet">
    <title>Login y registro</title>
</head>
<body>


<main>


    <div class="containerT">


        <div class="backbox">

            <div class="backbox-login">
                <h3>Ya tienes una cuenta?</h3>
                <p>Inicia sesion para entrar a la pagina</p>
                <button id="btn-login">Iniciar Sesion</button>
            </div>
            <div class="backbox-register cont">
                <h3>Aun no tienes una cuenta?</h3>
                <p>Registrate para iniciar sesion</p>
                <button id="btn-register">Registrarme</button>

            </div>
        </div>

        <div class="container-login-register">


            <form action="" class="formulario_login">

                <h2>Inciar Sesion</h2>
                <input type="text" placeholder="Correo Electronico">
                <input type="password" placeholder="Contrasena">
                <button>Entrar</button>

            </form>
            <form action="" class="formulario_register">
                <h2>Registrarse</h2>
                <input type="text" placeholder="Nombres">
                <input type="text" placeholder="Apellido Paterno">
                <input type="text" placeholder="Apellido Materno">
                <input type="number" placeholder="Telefono">
                <input type="text" placeholder="RFC">
                <input type="text" placeholder="Correo Electronico">
                <input type="text" placeholder="Contrasena">
                <br> <br>
                <a href="./formulario_adopcion_animal.html">||=> continuar ||</a>
            </form>
        </div>
    </div>
</main>

<footer>
    <h2>Contacto</h2>
    <br>
    <p>Si tienes alguna pregunta o duda sobre el proceso de adopción, no dudes en contactarnos. Estamos aquí para ayudarte a encontrar el compañero perfecto para ti y tu familia.</p>
    <br>
    <br>
    <a href="contacto.html" class="button">Contáctanos</a>
    <br>
    <br>
    <br>
    <p class="copy">&copy; 2023 Petland. Todos los derechos reservados</p>
</footer>

<script src="./js/menu.js"></script>
<script src="./js/form.js"></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>


<!--Necista validacion-->
