const form = document.getElementById("formulario");
const resultado = document.getElementById("tipo-adoptante");

form.addEventListener("submit", function (event) {
    event.preventDefault();

    const p1 = +form.p1.value;
    const p2 = +form.p2.value;
    const p3 = +form.p3.value;
    const p4 = +form.p4.value;
    const p5 = +form.p5.value;
    const p6 = +form.p6.value;
    const p7 = +form.p7.value;
    const p8 = +form.p8.value;

    const puntaje = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8;

    if (puntaje >= 10) {
        resultado.textContent = "Tipo de adoptante: Excelente. Felicidades! hemos podido determinar que eres un adoptante ejemplar";
    } else if (puntaje >= 5) {
        resultado.textContent = "Tipo de adoptante: Bueno. Felicidades! determinamos que tienes las capacidades de adoptar";
    } else if (puntaje >= 4) {
        resultado.textContent = "Tipo de adoptante: Regular. Determinamos que cuentas con las capacidades minimas para poder adoptar, recuerda que el adoptar es un proceso muchisimo mas importante de lo que se cree";
    } else {
        resultado.textContent = "Tipo de adoptante: No apto. Lo sentimos, parece que no estas cerca de poder adoptar, te sugerimos que aprendas mas acerca de la adopcion y lo que conlleva el cuidar de una vida canina.";
    }
});
