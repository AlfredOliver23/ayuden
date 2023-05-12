<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/05/2023
  Time: 02:53 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="Petland - Plataforma de adopción de mascotas">
  <meta name="keywords" content="adopción, mascotas, animales, refugios, Ciudad de México">
  <meta name="author" content="Fundación Petland A.C.">
  <title>Petland</title>
  <!-- Enlaces a Bootstrap CSS y JS -->
  <link rel="stylesheet" href="./css/logindom.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <title>Petland</title>
  <link rel="icon" type="image/x-icon" href="./images/logo.ico">
</head>
  
<body>

<form action="" class="formulario" id="formulario">
  <div class="formulario_grupo" id="grupo_usuario">
    <label for="usuario" class="formulario__label">Calle</label>
    <div class="formulario__grupo-input">
      <input type="text" class="formulario__input" name="usuario" id="usuario" placeholder=" ej. Mar Mediterrano ">
      <i class="formulario__validacion-estado fa-thin fa-circle-xmark"></i>
    </div>
    <p class="formulario_input-error">"ingresa la direccion completa"</p>
  </div>


  <div class="formulario_grupo" id="grupo_nombre">
    <label for="nombre" class="formulario__label">codigo postal del Domicilio</label>
    <div class="formulario__grupo-input">
      <input type="text" class="formulario__input" name="nombre" id="nombre" placeholder="ej. 06010"
    </div>
    <p class=" formulario__input-error"="">Ingresa codigo postal valido, recuerda que tienen 5 digitos <p></p>

  </div>



  <div class="formulario_grupo" id="grupo_password">
    <label for="password" class="formulario__label">Numero exterior</label>
    <div class="formulario__grupo-input">
      <input type="password" class="formulario__input" name="password" id="password" placeholder="ej. NO.910">
      <i class="formulario__validacion-estado fa-thin fa-circle-xmark"></i>
    </div>

    <p class="formulario__input-error">Recuerda que no hay numeros de mas e 10 cifras</p>

    <div class="formulario_grupo" id="grupo_password2">
      <label for="password2" class="formulario__label">Numero de pisos de la vivienda </label>
      <div class="formulario__grupo-input">
        <input type="password" class="formulario__input" name="password2" id="password2" placeholder="ej. 3">
        <i class="formulario__validacion-estado fa-thin fa-circle-xmark"></i>
      </div>
      <p class="formulario__input-error">No deberia dar error no existen limite de pisos</p>

    </div>
    <div class="formulario_grupo" id="grupo_usuario">
      <label for="usuario" class="formulario__label">Metros cuadrados de la vivienda</label>
      <div class="formulario__grupo-input">
        <input type="text" class="formulario__input" name="usuario" id="usuario" placeholder=" ej. 35m2">
        <i class="formulario__validacion-estado fa-thin fa-circle-xmark"></i>
      </div>
      <p class="formulario_input-error">"no debe de existir limite en los metros cuadrados de tu vivienda asegurate de haberlos ingresado bien"</p>
    </div>

    <div>
      <div class="formulario_grupo" id="grupo_usuario">
        <label for="usuario" class="formulario__label">Temperatura de la vivienda</label>
        <div class="formulario__grupo-input">
          <input type="text" class="formulario__input" name="usuario" id="usuario" placeholder="ej. calido - frio - templado - caliente ">
          <i class="formulario__validacion-estado fa-thin fa-circle-xmark"></i>
        </div>
        <p class="formulario_input-error">"ingresa un termino de temperatura valida"</p>

      </div>
      <div>



        <div>

          <div class="formulario_grupo" id="grupo_usuario">

            <label for="usuario" class="formulario__label">Tipo de piso</label>

            <div class="formulario__grupo-input">

              <select name="tipo de piso" size="5" id="">

                <option value="">concreto</option>
                <option value="">madera</option>
                <option value="">resina</option>
                <option value="">tierra</option>
                <option value="">azulejo</option>

                <       </select>

            </div>


</form>


<br> <br>
<a href="./repertolio_perfiles.html">||=> continua ||</a>
<h1></h1>


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
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>




<!--necesita validacion de datos -->












