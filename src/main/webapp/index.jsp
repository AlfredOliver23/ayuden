<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario para recopilar datos</title>
</head>
<body>

<div class="mavegadorcit">
    <h1>Imaginate que aqui esta el menu de navegacion</h1>
</div>
<!--claramente puede ser asi o no el index, ya se vera mi loco-->
<div class="muchos_perros">

    <div class="flechasdice_elloco">
        <c:forEach var="p" items="${perros}">
            <div class="columnas_cuerdas">

                <div class="card">
                    <div class="card-header">
                        <label>${p.getCtp_id}</label>
                    </div>
                    <div class="card-body">
                        <i>${p.getPer_cum}</i>
                        <img src="ControladorIMG?id=${p.getPer_id}" alt="imagen de perro aki" width="200"height="180">
                    </div>
                    <div class="card-footer">
                        <label>${p.getPer_nom}</label>
                        <div class="botones">
                            <a href="">Conocelo</a>
                        </div>
                    </div>
                </div>

            </div>
        </c:forEach>

    </div>

</div>

<a href="Controlador?accion=home">oh</a>
</form>

</body>
</html>